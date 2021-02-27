package io;

import classexample.Person;

import java.io.*;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.setName("Testing");
        person.setAge(20);
        person.setSalary(33333);
        person.setSsn("3333344444");
        // extra functionality...

        FileOutputStream fileOutputStream = new FileOutputStream(new File("person.dat"));
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(person);
        // reading...
        FileInputStream fileInputStream = new FileInputStream("person.dat");
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        person = (Person)ois.readObject();

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getSsn());

    }
}
