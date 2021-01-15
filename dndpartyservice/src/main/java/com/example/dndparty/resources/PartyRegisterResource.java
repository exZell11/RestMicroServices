package com.example.dndparty.resources;

import com.example.dndparty.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/register")
public class PartyRegisterResource {

    @Autowired
    private RestTemplate restTemplate;

    private RegisterItem registerItem;

    @RequestMapping("/{userId}")
    public List <RegisterItem> getRegister(@PathVariable("userId") String userId) {
            UserGoldCount goldCounts = restTemplate.getForObject("http://member-gold-count/goldcount/users/" + userId, UserGoldCount.class);

            return goldCounts.getUserGoldCount().stream().map(goldcount -> {
               MemberClass memberClass = restTemplate.getForObject("http://dnd-member-history/class/" + goldcount.getMemberID(), MemberClass.class);
                    return new RegisterItem(memberClass.getMemberID(), "classname", goldcount.getGoldCount());
            })
                    .collect(Collectors.toList());

        }
}



/*

    RegisterItem registerItem = new RegisterItem();
            registerItem.setName(memberClass.getMemberID());
                    registerItem.setMemberClass(memberClass.getMemberClass());
                    registerItem.setGoldCount(goldCount.getGoldCount());
            */
