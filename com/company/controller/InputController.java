package com.company.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputController {
    public String inputValidation(String regex){
        //String result;
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile(regex);
        String input = "";
        while (!(sc.hasNext()&&((input = sc.nextLine()).matches(regex)))){
            //input = sc.nextLine();
            System.out.println("Error");

        }
        return input;

    }
}
