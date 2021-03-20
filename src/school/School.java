package school;

import java.util.ArrayList;

public abstract class School {
    int amount_of_children;
    private int amount_of_subjects;


    public School(int amount_of_children, int amount_of_subjects) {
        this.amount_of_children = amount_of_children;
        this.amount_of_subjects = amount_of_subjects;
    }

    public School() {

        this.amount_of_subjects = amount_of_subjects;
    }

    public void setAmount_of_subjects(int amount_of_subjects) {
        if (amount_of_subjects < 30) {
            this.amount_of_subjects = amount_of_subjects;


        } else {
            this.amount_of_subjects = 30;
        }
    }


    public abstract double semestr1();

    public static void hours() {
        int leraningweeks_highschool = 37;
        int learningweeks_middleschool = 34;
        int thelessonsminutes = 45;
        int minutes_for_middle_school = thelessonsminutes * learningweeks_middleschool;
        int minutes_for_high_school = leraningweeks_highschool * thelessonsminutes;
        int compare = minutes_for_high_school - minutes_for_middle_school;
        System.out.println("The amount of working minutes for High School is bigger that the Middle school`s one on" + "  " + compare);
    }

    private double amount_of_homework() {
        double homework_for_middle = 0.3 * 45 * 34;
        return homework_for_middle;
    }

    private double amount_of_homework1() {
        double homework_for_high = amount_of_homework();
        return homework_for_high;
    }

    public void compare() {
        double l = amount_of_homework1() - 0.3 * 45 * 34;
        if (l > 0) {
            System.out.println("High school`s children spend more time on homework than Middle school`s");
        } else {
            System.out.println("Middle school`s children spend more time on homework than High school`s");
        }


    }

    public final static  void dinner() {
        String bakery[] = {"bun", "bun with poppy seeds", "cupcake"};
        String first_dish[] = {"sup", "borsh", "milk porridge"};
        String second_dish[] = {"kasha", "potato", "meat"};
        String drink[] = {"juice", "tea", "compote"};
        System.out.println(" ");
        System.out.println("Acessable  bakery:");
        for (int i = 0; i < bakery.length; i++) {
            System.out.print(bakery[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Acessable first dishes:");
        for (int i = 0; i < first_dish.length; i++) {
            System.out.print(first_dish[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Acessable second dishes :");

        for (int i = 0; i < second_dish.length; i++) {
            System.out.print(second_dish[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Acessable drinks :");

        for (int i = 0; i < drink.length; i++) {
            System.out.print(drink[i] + " ");
        }
        System.out.println(" ");

    }

    public final void method(){
        System.out.println("This the method:)");
    }



}
