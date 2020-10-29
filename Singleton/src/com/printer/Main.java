package com.printer;

public class Main {
    public static void main(String[] args) {
        PrinterSingleton printer1 = PrinterSingleton.getPrinter();
        printer1.showStatus();

        PrinterSingleton printer2 = PrinterSingleton.getPrinter();
        printer2.showStatus();
    }
}
