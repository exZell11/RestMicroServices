package com.example.dndparty.resources;

import com.example.dndparty.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/register")
public class PartyRegisterResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public List<RegisterItem> getRegister() {
        List<RegisterItem> registerItems = new ArrayList<>();

            List<GoldCount> goldCounts = restTemplate.getForObject("http://member-gold-count/goldcount/users/", UserGoldCount.class).getUserGoldCount();
            List<MemberClass> memberClass = restTemplate.getForObject("http://dnd-member-history/class/users/", UserMemberClass.class).getUserMemberClass();

            for (int i = 0; i < goldCounts.size(); i++) {
            registerItems.add(new RegisterItem(memberClass.get(i).getMemberID(), memberClass.get(i).getMemberClass(), goldCounts.get(i).getGoldCount()));
            }

        return registerItems;
    }
}

