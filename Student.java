package com.ArryListDemo.BaodouHan;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Student {
    private String name;
    private String sex;
    private String age;
    private String ID;
    public  Student(String name,String sex,String age,String ID){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.ID=ID;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setAge(String age){
        this.age=age;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public void setSex(String sex){
        this.sex=sex;
    }

    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getID(){
        return ID;
    }
    public String getSex(){
        return sex;
    }
}
