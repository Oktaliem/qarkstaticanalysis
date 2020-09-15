package com.oktaliem.qark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QarkScanner {

    public void qarkScan(String type, String path) throws IOException {
        Process process = null;
        if (type!= null) {
            if (type.equals("java")) {
                System.out.println("Java source code static analysis started...");
                String commandLine = "qark --java " + path + "  --report-path " + System.getProperty("user.dir") + "/";
                System.out.println(commandLine);
                process = Runtime.getRuntime().exec(commandLine);
            } else if (type.equals("apk")) {
                System.out.println("Android Apk static analysis started...");
                String commandLine = "qark --apk " + path + "  --report-path " + System.getProperty("user.dir") + "/";
                System.out.println(commandLine);
                process = Runtime.getRuntime().exec("qark --apk " + path + "  --report-path " + System.getProperty("user.dir") + "/");
            } else {
                System.out.println("Incorrect file type parameter");
            }
        } else {
            System.out.println("Please set file type");
        }
        assert process != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
