package com.company;


import com.company.controller.Controller;
import com.company.model.Model;
import com.company.view.PropertiesConstants;
import com.company.view.View;


import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Scanner sc = new Scanner(System.in);
       // Locale ruLocal = new Locale("ru","RU");
       // Locale enLocal = new Locale("en","US");

       // ResourceBundle resourceBundle = ResourceBundle.getBundle("com.company.messages",ruLocal);

       // System.out.println(resourceBundle.getString(PropertiesConstants.GREETINGS));

       // String regex = "a*b";
        Controller cont = new Controller(new Model(),new View());
        //String res= cont.inputValidation(regex);
        cont.run();


    }
}
