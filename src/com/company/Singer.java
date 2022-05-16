package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name,String designation,String bandName){
        super(name,designation);
        this.bandName=bandName;
    }
    @Override
    public String toString() {
        return "\nSinger name: "+getName()+"\nSinger designation: "+getDesignation()+"\nSinger company name: "+getBandName();
    }
    @Override
    public void learn(){
        System.out.println("singer is learning");

    }
    @Override
    public void walk(){
        System.out.println("singer is walking");
    }
    @Override
    public void eat(){
        System.out.println("singer is eating");
    }

    public void singing(){
        System.out.println("singer is singing");

    }
    public void playGuitar(){
        System.out.println("and playing a guitar ");

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

}
