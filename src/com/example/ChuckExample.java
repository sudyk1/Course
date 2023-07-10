package com.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ChuckExample {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream is =  url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line = null;
            while ( (line = br.readLine()) != null ) {
//                System.out.println(line);
                String str = "\"value\":";
                int i = line.indexOf(str);
                int beginIndex = i + str.length();
                int endIndex = line.lastIndexOf("\"") + 1;
                System.out.println(line.substring(beginIndex, endIndex));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
