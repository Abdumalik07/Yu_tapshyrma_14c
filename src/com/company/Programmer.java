package com.company;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }
    @Override
    public String toString() {
        return "Programmer name: "+getName()+"\nProgrammer designation: "+getDesignation()+"\nProgrammer company name: "+getCompanyName();
    }
    @Override
    public void learn(){
        System.out.println("programmer is learning");
    }
    @Override
    public void walk(){
        System.out.println("programmer is walking");
    }
    @Override
    public void eat(){
        System.out.println("programmer is eating");
    }

    public void codding(){
        System.out.println("programmer is codding ");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
