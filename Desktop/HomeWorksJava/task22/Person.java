package ru.mingazov.task22;



public class Person implements Comparable<Person>{

    public Person(String name, int age)  {
        this.name = name;
        this.age = age;
    }

    private String name;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }









    @Override
    public String toString() {
        return "Person " +
                "name " + name +
                ", age " + age;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
