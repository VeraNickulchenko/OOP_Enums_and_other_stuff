package school;

public abstract class School {
    int amount_of_children;
    private int amount_of_subjects;

public School(int amount_of_children, int amount_of_subjects){
    this.amount_of_children = amount_of_children;
    this.amount_of_subjects = amount_of_subjects;
}
    public School(){

        this.amount_of_subjects = amount_of_subjects;
    }

    public void setAmount_of_subjects(int amount_of_subjects){
        if(amount_of_subjects < 30){
            this.amount_of_subjects = amount_of_subjects;


        }
        else{
            this.amount_of_subjects = 30;
        }
    }


    public  abstract double semestr1();
    public static void hours(){
        int leraningweeks_highschool = 37;
        int learningweeks_middleschool = 34;
        int thelessonsminutes = 45;
        int minutes_for_middle_school = thelessonsminutes *learningweeks_middleschool;
        int minutes_for_high_school = leraningweeks_highschool*thelessonsminutes ;
        int compare = minutes_for_high_school  - minutes_for_middle_school;
        System.out.println("The amount of working minutes for High School is bigger that the Middle school`s one on" +  "  " + compare);
    }

    private double amount_of_homework() {
        double homework_for_middle = 0.3*45*34;
        return homework_for_middle;
    }

    private double amount_of_homework1() {
        double homework_for_high = 0.5*45*37;
        return homework_for_high;
    }

    public void compare(){
        double l = amount_of_homework1() -  amount_of_homework();
        if(l >0){
            System.out.println("High school`s children spend more time on homework than Middle school`s");
        }
        else{
            System.out.println("Middle school`s children spend more time on homework than High school`s");
        }



    }



}
