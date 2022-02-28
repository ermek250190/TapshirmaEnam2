package com.company;

public class Prezident {
    private String name;
    private int age;
    private Kyrgyzstan gorod;

    public Prezident(String name, int age, Kyrgyzstan gorod) {
        this.name = name;
        this.age = age;
        this.gorod = gorod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Kyrgyzstan getGorod() {
        return gorod;
    }

    public void setGorod(Kyrgyzstan gorod) {
        this.gorod = gorod;
    }
    public void info(){
        System.out.println("oblasta bardik  joldorun ondosh kerek");
    }

    @Override
    public String toString() {
        return "Prezident{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ",lovly gorod=" + gorod +
                '}';
    }
}
