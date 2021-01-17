package com.example.dndparty.models;




public class RegisterItem {


    private String MemberId;

    private String memberClass;
    private int goldCount;

    public RegisterItem() {
    }

    public RegisterItem(String MemberId, String memberClass, int goldCount) {
        this.MemberId = MemberId;
        this.memberClass = memberClass;
        this.goldCount = goldCount;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String name) {
        this.MemberId = name;
    }

    public String getMemberClass() {
        return memberClass;
    }

    public void setMemberClass(String memberClass) {
        this.memberClass = memberClass;
    }

    public int getGoldCount() {
        return goldCount;
    }

    public void setGoldCount(int goldCount) {
        this.goldCount = goldCount;
    }
}
