package application;


import person.Gender;
import person.Person;

public class MyApplication {

    public static void main(String[] args) {

        Person marcPerson = new Person("Marc", Gender.MALE);
        System.out.println(marcPerson);
    }
}
