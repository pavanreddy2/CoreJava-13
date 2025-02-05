package com.ar.inputAndOutputStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeseriazationEx {
    public static void main(String[] args) throws FileNotFoundException {

        try (ObjectInputStream iop = new ObjectInputStream(new FileInputStream("F:\\DRIVER E\\JavaBatch-13\\streams\\emp.ser"))){
                Employee employee = (Employee) iop.readObject();
            System.out.println("Deserialized: "+ employee);
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }
    }
}
