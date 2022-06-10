package com.inheritance;

public class Dog extends Animal { // extends mean it inherited the data from animal class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    // above are the specific to dog class


    public Dog(String name,   int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        // here 1 means we are not forcing the data to be declared repeatedly it's true for all dogs
        // like every dog has body and brain so 1 means it's true for all
        // here in super the constructor called to inherit the data from the animal class
        // animal is a class where every animal has the things in common are defined but in the case of dog it has some specific files that are defined here in dog class

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
