package com.company;
public class Main {
    public static void main(String[] args) {
        // create object here
        Dog Dog10bject = new Dog();
        Dog Dog20bject = new Dog();
        Dog Dog30bject = new Dog();

        // Data input for Dog Object
        Dog10bject.breed = "Beagle";
        Dog10bject.size  = "Large";
        Dog10bject.color = "Orange";
        Dog10bject.age   = 5;

        // Data input for dog abject 2
        Dog20bject.breed = "Beagle";
        Dog20bject.size  = "Large";
        Dog20bject.color = "Orange";
        Dog20bject.age   = 6;

        // Data input for dog abject 3
        Dog30bject.breed = "German Shepherd";
        Dog30bject.size  = "large";
        Dog30bject.color = "white and Orange";
        Dog30bject.age   = 6;

        // print all data from objects
        System.out.println("Dog Object 1: \n Breed: "+Dog10bject.breed+"\n Size: "+Dog10bject.size+"\n Color: "+Dog10bject.color+"\n Age: "+Dog10bject.age);
        System.out.println("Dog Object 2: \n Breed: "+Dog20bject.breed+"\n Size: "+Dog20bject.size+"\n Color: "+Dog20bject.color+"\n Age: "+Dog20bject.age);
        System.out.println("Dog Object 3: \n Breed: "+Dog30bject.breed+"\n Size: "+Dog30bject.size+"\n Color: "+Dog30bject.color+"\n Age: "+Dog30bject.age);
    }
}