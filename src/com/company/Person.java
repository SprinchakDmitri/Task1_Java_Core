package com.company;

public class Person {
    String name;
    int age;
    String gender;

    Person(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    public static String personArrayToString(Person[] personArray){

        StringBuilder sb = new StringBuilder();

        for (Person person: personArray
        ) {
            if(person != null)
            { sb.append(person.toString());
            sb.append("\n");}
        }

        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}
