package org.fasttrack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from Maven");

        Person person = new Person("Bu", 19);
        Person emptyPerson = new Person();
        person.setAge(21);
        person.setName("ALABALA");
        System.out.println(person.getAge());
        System.out.println(person.getName());

        System.out.println(person);
        System.out.println(emptyPerson);
    }
}
