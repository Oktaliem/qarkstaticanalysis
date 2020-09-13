package com.oktaliem.qark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QarkScanner {

    public void qarkScan(String path) throws IOException {
        Process process = null;
        if (System.getProperty("type") != null) {
            if (System.getProperty("type").equals("java")) {
                System.out.println("Java static analysis started...");
                System.out.println("qark --java " + path + "--report-path " + System.getProperty("user.dir") + "/");
                process = Runtime.getRuntime().exec("qark --java " + path + "  --report-path " + System.getProperty("user.dir") + "/target/");
            } else if (System.getProperty("type").equals("apk")) {
                System.out.println("Apk static analysis started...");
                System.out.println("qark --apk " + path + "  --report-path " + System.getProperty("user.dir") + "/target/");
                process = Runtime.getRuntime().exec("qark --apk " + path + "  --report-path " + System.getProperty("user.dir") + "/target/");
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
