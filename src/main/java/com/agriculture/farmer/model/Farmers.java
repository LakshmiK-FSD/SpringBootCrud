package com.agriculture.farmer.model;
import lombok.Data;
@Data
public class Farmers{
    private int id;
    private int age;
    private String farmerName;
    private String workField;
    public Farmers(int id, int age, String name, String work){
        this.age=age;
        this.id=id;
        this.farmerName=name;
        this.workField=work;
    }
}