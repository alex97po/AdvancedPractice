package com.pogorelov.practiceSerialization;

public class NonSerializable {
    private transient String myData = "test";

    public String getMyData() {
        return myData;
    }

    public void setMyData(String myData) {
        this.myData = myData;
    }
}
