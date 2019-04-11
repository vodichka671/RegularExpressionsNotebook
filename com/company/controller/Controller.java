package com.company.controller;

import com.company.model.Model;
import com.company.view.View;

import javax.management.modelmbean.ModelMBean;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private Model model;
    private View view;
    private ResourceBundle bundle;
    private Scanner sc = new Scanner(System.in);

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public String inputValidation(String regex, Locale locale){
        //String result;


        Pattern pattern = Pattern.compile(regex);
        String input = "";
        while (!(sc.hasNext()&&((input = sc.nextLine()).matches(regex)))){
            //input = sc.nextLine();
            System.out.println("Error");

        }
        return input;

    }
    public Locale chooseLocale(Scanner sc){
        Locale locale = new Locale("en","US");
        bundle = ResourceBundle.getBundle("com.company.messages",locale);
        System.out.println(bundle.getLocale());

        view.showMessage(bundle.getString("choose.locale"));
        int index =3;

        while (!(sc.hasNextInt()&&((index==0)||(index==1)))){
            view.showMessage(bundle.getString("error.input"));

        }
        index = sc.nextInt();
        switch (index){
            case 0: locale = new Locale("en","US") ;
            break;
            case 1: locale = new Locale("ru","RU");
            break;
        }
        return locale;
    }
}
