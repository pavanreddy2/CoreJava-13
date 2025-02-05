package com.ar.inputAndOutputStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) throws IOException {
        //Writing to a file.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\DRIVER E\\JavaBatch-13\\streams\\file_example.txt"))){
            writer.write("This an example for File I?O in java...");
            writer.newLine();
            writer.write("File I/O aloows you to read and write files.");
            System.out.println("Data added successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

       //Reading from a file.
    }
}
