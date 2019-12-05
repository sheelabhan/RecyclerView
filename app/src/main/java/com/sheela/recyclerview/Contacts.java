package com.sheela.recyclerview;

public class Contacts {
    private String  name;
    private String phoneNo;
    private int imageId;

    public Contacts(String name, String phoneNo, int imageId){
        this.name=name;
        this.phoneNo=phoneNo;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public void PhoneNo(String PhoneNo){
        this.phoneNo=phoneNo;
    }
    public int getimageId(){
        return imageId;
    }
    public void imageId(int imageId){
        this.imageId=imageId;
    }

}
