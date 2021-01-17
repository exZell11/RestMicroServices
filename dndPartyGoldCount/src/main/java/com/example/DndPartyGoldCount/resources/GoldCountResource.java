package com.example.DndPartyGoldCount.resources;

import com.example.DndPartyGoldCount.models.GoldCount;
import com.example.DndPartyGoldCount.models.UserGoldCount;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/goldcount")
public class GoldCountResource {

    @RequestMapping("/{memberID}")
    public GoldCount getGoldCount(@PathVariable("memberID") String memberID){
        return new GoldCount(memberID, 500);
    }

    @RequestMapping("users/")
    public UserGoldCount getUserGoldCount(){
        List<GoldCount> goldCounts = Arrays.asList(
                new GoldCount("Egolas", 500),
                new GoldCount("Illphelkiir", 150)
        );
       UserGoldCount userGoldCount = new UserGoldCount();
       userGoldCount.setUserGoldCount(goldCounts);
       return userGoldCount;
    }
}
