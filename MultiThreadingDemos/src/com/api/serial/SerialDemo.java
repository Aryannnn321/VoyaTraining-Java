package com.api.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialDemo {
    public static void main(String[] args) {
        Student student=new Student("hari", 10, "Ece");
        try (FileOutputStream fileOutputStream = new FileOutputStream("stud.ser")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            System.out.println("completed");
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
