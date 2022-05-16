package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Abdimalik", "student", "Peaksoft");
        System.out.println("\n" + programmer);
        System.out.println("Action: ");
        programmer.learn();
        programmer.eat();
        programmer.codding();

        Dancer dancer = new Dancer("Alex", "dancer", "Bigdance");
        System.out.println(dancer);
        System.out.println("Action: ");
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancing();

        Singer singer = new Singer("Aman", "Singer", "Egizder");
        System.out.println(singer);
        System.out.println("Action: ");
        singer.learn();
        singer.eat();
        singer.walk();
        singer.singing();
        singer.playGuitar();
    }


}
