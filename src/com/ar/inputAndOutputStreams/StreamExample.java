package com.ar.inputAndOutputStreams;

import java.io.*;

public class StreamExample {
    public static void main(String[] args) throws IOException {
        //Writing to a file using Writer.
     try (Writer writer = new FileWriter("F:\\DRIVER E\\JavaBatch-13\\streams\\example.txt")) {
            writer.write("Hi....Nikhil..");
            writer.write("This is a test of Streams & Writers.");
            System.out.println("Data is added successfully in the text file....");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading from a file using Reader
        try (Reader reader = new FileReader("F:\\DRIVER E\\JavaBatch-13\\streams\\example.txt")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
