package com.oktaliem.qark;

import java.io.IOException;

public class QarkScan {
    public static void main(String[] args) {
        QarkScanner scanner = new QarkScanner();
        String type = args[0];
        String path = args[1];
        try {
            scanner.qarkScan(type, path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
