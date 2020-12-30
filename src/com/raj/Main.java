package com.raj;

public class Main {

    public static void main(String[] args) {
        FactoryClass ob = new FactoryClass();
        Configuration vechile = ob.getObj("electric");
        vechile.config();
    }
}
