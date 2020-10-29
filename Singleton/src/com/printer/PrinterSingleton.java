package com.printer;

public class PrinterSingleton {
    private static PrinterSingleton instance = null;

    private PrinterSingleton() {
    }

    public static PrinterSingleton getPrinter(){
        if(instance == null){
            instance = new PrinterSingleton();
        }
        return instance;
    }

    public void showStatus(){
        System.out.println(this);
    }
}
