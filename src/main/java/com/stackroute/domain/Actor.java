package com.stackroute.domain;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Actor{
    private  String Name;
    private  String Gender;
    private int Age;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "Gender='" + Gender + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
