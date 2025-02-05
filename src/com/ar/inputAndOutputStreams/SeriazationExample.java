package com.ar.inputAndOutputStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeriazationExample {
    public static void main(String[] args) throws FileNotFoundException {

        Employee employee = new Employee(101, "Nikhil", 24);

        //Serialize the object

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\DRIVER E\\JavaBatch-13\\streams\\emp.ser"))) {
            oos.writeObject(employee);
            System.out.println("Serialized: "+ employee);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
