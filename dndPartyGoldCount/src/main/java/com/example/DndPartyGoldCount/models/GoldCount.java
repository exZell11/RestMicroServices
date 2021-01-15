package com.example.dndpartynames.models;

public class GoldCount {

    private String memberID;
    private int goldCount;

    public GoldCount(String memberID, int goldCount) {
        this.memberID = memberID;
        this.goldCount = goldCount;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public int getGoldCount() {
        return goldCount;
    }

    public void setGoldCount(int goldCount) {
        this.goldCount = goldCount;
    }
}
