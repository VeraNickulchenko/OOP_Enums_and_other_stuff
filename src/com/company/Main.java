package com.company;

import school.*;

import static school.No.BYE;


public class Main {

    public static void main(String[] args) {
        Middle_school example = new Middle_school();
        example.setAmount_of_subjects(13);

        Middle_school school1 = new Middle_school(100, 13, 50, 10);
        school1.hours();
        school1.semestr1();
        school1.rating();
        school1.dinner();


        School school2 = new Middle_school(100, 13, 50, 10);
        school2.dinner();
        school2.method();


        High_school subjects = new High_school();
        subjects.setAmount_of_subjects(17);

        High_school school1_sameschool = new High_school(85, 17, 30, 3);
        school1_sameschool.hours();
        school1_sameschool.semestr1();
        school1_sameschool.rating();
        school1_sameschool.method();


        School damn[] = {school1, school1_sameschool};
        for (final School i : damn) {

        }
        University unik = new University(1000, 600, 400);
        unik.okay();
        unik.method1();

        Education yes[] = {(Education) school1, (Education) school1_sameschool, (Education) unik};
        for (final Education i : yes) {

        }

        High_school hello = new High_school(140, 16, 30, 30);


        High_school.hours();
        System.out.println(High_school.math_hours);
        High_school.hello();
        Why2 why = new Why2("bye");
        Why why1 = new Why("Bye");
        why1.howdy(why);


        University.Secondinner.faculties();
        System.out.println(" ");

        Tets b1 = new Tets(Yes.Howdy);
        System.out.println("Java says" + " " + b1.sayinghi);

        switch (b1.sayinghi) {
            case Howdy:
                System.out.println("howdy");
                break;
            case Hi:
                System.out.println("hi");
                break;
            case Hello:
                System.out.println("hello");
                break;

        }

        Why2 heyal = new Why2("damn");
        heyal.hey(BYE);























        















    }
}

