package com.company;

import com.company.controller.InputController;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
	// write your code here
      //  Locale ruLocal = new Locale("ru","RU");
      //  Locale enLocal = new Locale("en","US");

      //  ResourceBundle resourceBundle = ResourceBundle.getBundle("com.company.messages",enLocal);

      //  System.out.println(resourceBundle.getString("hello"));

        String regex = "a*b";
        InputController cont = new InputController();
        String res= cont.inputValidation(regex);
        System.out.println(res);

    }
}
