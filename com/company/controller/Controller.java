package com.company.controller;

import com.company.model.Model;
import com.company.view.PropertiesConstants;
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

    public String inputValidation(String regex, Locale locale, String msg){
        //String result;
        bundle = ResourceBundle.getBundle("com.company.messages",locale);
        view.showMessage(bundle.getString(msg));

        //Pattern pattern = Pattern.compile(regex);

        String input;
        while (!(sc.hasNext()&&(input = sc.nextLine()).matches(regex))){
            //input = sc.nextLine();
            view.showMessage(bundle.getString(PropertiesConstants.ERROR_INPUT));

        }
        return input;

    }

    public Locale chooseLocale(){
        Locale locale = new Locale("en","US");
        bundle = ResourceBundle.getBundle("com.company.messages",locale);
      //  System.out.println(bundle.getLocale());


        boolean flag = false;
        do{
            view.showMessage(bundle.getString(PropertiesConstants.CHOOSE_LOCALE));
            while (!sc.hasNextInt()){
                view.showMessage(bundle.getString(PropertiesConstants.ERROR_INPUT));
                sc.next();
            }
            int index = sc.nextInt();
            switch (index){
                case 0: locale = new Locale("en","US") ;
                    flag = true;
                    break;
                case 1: locale = new Locale("ru","RU");
                    flag = true;
                    break;
                case 2: flag = true;
                        locale = Locale.getDefault();
                    break;
                default:
                    //flag = true;
                    view.showMessage(bundle.getString(PropertiesConstants.ERROR_INPUT));
                    break;
            }
        }while (!flag);

      //  index = sc.nextInt();

        return locale;
    }

    public void run(){
        Locale locale = chooseLocale();
        //System.out.println(locale);
        //System.out.println(Locale.getDefault());
        if (locale.equals(Locale.getDefault())){
            model.setName(inputValidation(RegexPatterns.NAME_RU,locale,PropertiesConstants.NAME));
            model.setLogin(inputValidation(RegexPatterns.LOGIN,locale,PropertiesConstants.LOGIN));
            model.setPhone(inputValidation(RegexPatterns.PHONE,locale,PropertiesConstants.PHONE));
        }
        else {
            model.setName(inputValidation(RegexPatterns.NAME_EN,locale,PropertiesConstants.NAME));
            model.setLogin(inputValidation(RegexPatterns.LOGIN,locale,PropertiesConstants.LOGIN));
            model.setPhone(inputValidation(RegexPatterns.PHONE,locale,PropertiesConstants.PHONE));

        }
        view.showMessage(model.toString());


    }

}
