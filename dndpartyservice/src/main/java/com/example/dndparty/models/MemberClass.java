package com.example.dndparty.models;

public class MemberClass {
    private String memberID;
    private String memberClass;

    public MemberClass(){

    }

    public MemberClass(String memberID, String memberClass) {
        this.memberID = memberID;
        this.memberClass = memberClass;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberClass() {
        return memberClass;
    }

    public void setMemberClass(String memberClass) {
        this.memberClass = memberClass;
    }

}
