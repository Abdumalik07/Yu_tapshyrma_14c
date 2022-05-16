package com.company;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String name,String designation,String groupName){
        super(name,designation);
        this.groupName=groupName;
    }

    @Override
    public String toString() {
        return "\nDancer name: "+getName()+"\nDancer designation: "+getDesignation()+"\nDancer company name: "+getGroupName();
    }
    @Override
    public void learn(){
        System.out.println("dancer is learning");
    }
    @Override
    public void walk(){
        System.out.println("dancer is walking");
    }
    @Override
    public void eat(){
        System.out.println("dancer is eating");
    }
    public void dancing(){
        System.out.println("dancer is dancing");
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
