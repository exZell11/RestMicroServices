package com.example.dndmemberhistory.resources;


import com.example.dndmemberhistory.models.MemberClass;
import com.example.dndmemberhistory.models.UserMemberClass;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/class")
public class MemberResource {

    @RequestMapping("/{memberId}")
    public MemberClass getMemberHistory(@PathVariable("memberId") String memberId){
        return new MemberClass(memberId, "Rogue");
    }
    @RequestMapping("users/{userId}")
    public UserMemberClass getUserMemberClass(@PathVariable("userId") String userId){
        List<MemberClass> memberClasses = Arrays.asList(
                new MemberClass("Egolas", "Rogue"),
                new MemberClass("Illphelkiir", "Druid")
        );
        UserMemberClass userMemberClass = new UserMemberClass();
        userMemberClass.setUserMemberClass(memberClasses);
        return userMemberClass;
    }

}
