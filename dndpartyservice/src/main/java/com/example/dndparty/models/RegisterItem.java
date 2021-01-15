package com.example.dndparty.models;

public class RegisterItem {

    private String name;
    private String memberClass;
    private int goldCount;

    public RegisterItem() {
    }

    public RegisterItem(String name, String memberClass, int goldCount) {
        this.name = name;
        this.memberClass = memberClass;
        this.goldCount = goldCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
