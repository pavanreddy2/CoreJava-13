package com.ar.exception;

import java.io.IOException;

class Parent {
    void add () throws Exception{
        concat();
    }

    void concat () throws IOException{
        throw new RuntimeException("My IO Exception...");
    }
}
public class ThrowsKeywordEx {
    public static void main(String[] args) throws Exception {

        Parent parent = new Parent();
        parent.add();
    }
}
