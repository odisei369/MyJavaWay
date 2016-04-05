package com.piatr;


public class Automobile {

    enum CarSize {SMALL, MEDIUM, LARGE}
    private CarSize size;
    
     public static void main(String[] args){
         Automobile car = new Automobile();
         car.size = CarSize.LARGE;
         System.err.println("Size of car: " + car.size);
         System.err.println("commit in second branch");
     }
}
