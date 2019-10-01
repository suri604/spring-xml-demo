package com.stackroute.domain;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Actor{
    private  String Name;
    private  String Gender;
    private int Age;

    public Actor(String Name, String Gender, int Age) {
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
    }

    public void display()
    {
        System.out.println("name is : "+Name + " gender is : " +Gender + " age is : " +Age );
    }
}
