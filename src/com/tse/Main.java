package com.tse;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 1. Create a TreeSet
        Set<Person> personSetComparedByAge = new TreeSet<>(new AgeComparator());
        personSetComparedByAge.add(new Student("John Doe1", 25));
        personSetComparedByAge.add(new Student("John Doe2", 24));
        personSetComparedByAge.add(new Employee("John Doe3", 35));
        personSetComparedByAge.add(new Unemployed("John Doe4", 37));
        personSetComparedByAge.add(new Employee("John Doe5", 27));
        System.out.println("TreeSet for Person compared by age: \n");
        System.out.println();
        for(Person p: personSetComparedByAge){
            System.out.println(p.toString());
        }
        System.out.println("----------------------------------");

        Set<Person> personSetComparedByName = new TreeSet<>(new NameComparator());
        personSetComparedByName.add(new Student("John Doe5", 25));
        personSetComparedByName.add(new Student("John Doe2", 24));
        personSetComparedByName.add(new Employee("John Doe3", 35));
        personSetComparedByName.add(new Unemployed("John Doe4", 37));
        personSetComparedByName.add(new Employee("John Doe1", 27));
        System.out.println("TreeSet for Person compared by name: \n");
        for(Person p: personSetComparedByName){
            System.out.println(p.toString());
        }

        System.out.println("---------------------Ex: 2");

        //2.
        Map<Person, List<Hobby>> personsAndHobbies = new HashMap<>();
        Person person1 = new Student("John Doe 1", 29);
        Person person2 = new Employee("John Doe 2", 33);
        Person person3 = new Unemployed("John Doe 3", 37);
        Person person4 = new Student("John Doe 4", 24);

        Hobby hobby1 = new Hobby("cycling", 2);
        hobby1.addAdressForHobby("Strada Bucegi");
        hobby1.addCountryForHobby("Romania");
        hobby1.addAdressForHobby("Rue de Paris");
        hobby1.addCountryForHobby("France");
        person1.addHobby(hobby1);


        Hobby hobby2 = new Hobby("swimming", 3);
        hobby2.addCountryForHobby("Romania");
        hobby2.addCountryForHobby("Switzerland");
        hobby2.addAdressForHobby("Str. Avram Iancu 2");
        hobby2.addAdressForHobby("Str detunata 3");
        person2.addHobby(hobby2);
        person2.addHobby(hobby1);

        Hobby hobby3 = new Hobby("driving", 2);
        hobby3.addAdressForHobby("Str. Ciucea");
        hobby3.addAdressForHobby("Str Izlazului nr. 2");
        hobby3.addCountryForHobby("Spania");
        hobby3.addCountryForHobby("ROmania");
        person3.addHobby(hobby3);

        person4.addHobby(hobby1);
        person4.addHobby(hobby3);


        personsAndHobbies.put(person1,person1.getHobbyList());
        personsAndHobbies.put(person2, person2.getHobbyList());
        personsAndHobbies.put(person3, person3.getHobbyList());
        personsAndHobbies.put(person4, person4.getHobbyList());
        personsAndHobbies.put(person1, person1.getHobbyList()); // This won`t work since we
        // overriden the equals and hashcode methods in Person.

        for(Map.Entry<Person, List<Hobby>> entry: personsAndHobbies.entrySet()){
            System.out.println("Person: " + entry.getKey().getName());
            entry.getKey().listInformations();
        }


    }
}
