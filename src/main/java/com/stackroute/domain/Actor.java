package com.stackroute.domain;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Actor{
    private  String gender;
    private  String Name;

    private int age;

    public void setName(String name) {
        Name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display()
    {
        System.out.println("name is : "+Name + " gender is : " +gender + " age is : " +age );
    }
}
