/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;

public class apps {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("What is the first number? ");
        String firstNum=in.nextLine();

        System.out.print("What is the second number? ");
        String secondNum=in.nextLine();

        int first=Integer.parseInt(firstNum);
        int second=Integer.parseInt(secondNum);
        int addOutput=first+second;

        int subOutput=first-second;

        int multOutput=first*second;

        int divOutput=first/second;

        String addEquation=firstNum+" + "+secondNum+" = "+addOutput;
        String subEquation=firstNum+" - "+secondNum+" = "+subOutput;
        String multEquation=firstNum+" * "+secondNum+" = "+multOutput;
        String divEquation=firstNum+" / "+secondNum+" = "+divOutput;
        System.out.print(addEquation+"\n"+subEquation+"\n"+multEquation+"\n"+divEquation);
        in.close();

    }
}
