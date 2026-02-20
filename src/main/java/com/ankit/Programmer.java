package com.ankit;

public class Programmer {
    private int age;
    private Laptop laptop;

    public Programmer() {
        System.out.println("Programmer class constructor");
    }

    public void code(){
        System.out.println("Coding..." + age);
        laptop.compile();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
