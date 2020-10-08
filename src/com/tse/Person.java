package com.tse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person  {
    private String name;
    private int age;
    private List<Hobby> hobbyList;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.hobbyList = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void addHobby(Hobby hobby){
        hobbyList.add(hobby);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(hobbyList, person.hobbyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hobbyList);
    }


    public void listInformations(){
        for(Hobby h: hobbyList){
            System.out.println("Name of hobby: " + h.getName() + "\nFrequncy: " + h.getFrequency() + " times/month" +
                    " \ncountries: ");
            for(Country c: h.getCountries()){
                System.out.println(c.getNameOfCountry());
            }
            for(Adress a: h.getAdressList()){
                System.out.println("adress: " + a.getAdress());
            }
        }
    }

    public List<Hobby> getHobbyList() {
        return hobbyList;
    }
}
