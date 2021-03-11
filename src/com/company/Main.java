package com.company;

import school.*;

public class Main {

    public static void main(String[] args) {
        Middle_school example = new Middle_school ();
        example.setAmount_of_subjects(13);

        Middle_school school1 = new Middle_school (100, 13, 50, 10);
        school1.hours();
        school1.semestr1();
        school1.rating();





        High_school subjects = new High_school();
        subjects.setAmount_of_subjects(17);

        High_school school1_sameschool = new High_school(85, 17, 30, 3);
        school1_sameschool. hours();
        school1_sameschool.semestr1();
        school1_sameschool.rating();

        School damn[] = {school1,school1_sameschool };
        for (final School i : damn) {

        }
        University unik = new University(1000, 600, 400);
        unik.okay();

        Education yes[] = {(Education)school1,(Education)school1_sameschool,(Education)unik };
        for (final Education i : yes) {

        }



        















    }
}

