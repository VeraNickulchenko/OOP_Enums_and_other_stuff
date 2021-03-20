package school;

public class Middle_school extends School implements Education {
    int amount_of_children = 195;
    private  int amount_of_subjects;
    int DPA_rating;
    int Olympia_take_parts;
    int percent_passed_DPA_successfully;
    final int aga = 10;
    final double xaga = 10;



    public Middle_school(int amount_of_children, int amount_of_subjects, int percent_passed_DPA_successfully, int Olympia_take_parts){
        this.amount_of_children = amount_of_children;
        this.amount_of_subjects = amount_of_subjects;
        this.percent_passed_DPA_successfully = percent_passed_DPA_successfully;
        this.Olympia_take_parts = Olympia_take_parts;
    }
    public Middle_school(){

        this.amount_of_subjects = amount_of_subjects;
    }
    public void setAmount_of_subjects(int amount_of_subjects){
        if(amount_of_subjects == 13 || amount_of_subjects == 16){
            this.amount_of_subjects = amount_of_subjects;


        }
        else{
            System.out.println("Error!");
        }
    }

    public int getAmount_of_subjects(int amount_of_subjects){
        return amount_of_subjects;
    }

    public void rating(){
        int DPA = amount_of_children*100/percent_passed_DPA_successfully;
        int rating = DPA +  Olympia_take_parts;
        System.out.println("The raiting of Middle school");
        System.out.println(rating);

    }
    public void sayHello(){
        System.out.println("Welcome to Middle school!");
    }

    public  double semestr1(){
        double children_with_low_gpa = 0.32 * amount_of_children;
        double children_with_high = 0.4 * amount_of_children;
        return children_with_high;
    }
    public static void hours(){
        int learningweeks_middleschool = 34;
        int thelessonsminutes = 45;
        int minutes_for_middle_school = thelessonsminutes *learningweeks_middleschool;
        System.out.println("The amount of working minutes for Middle School is " +  "  " + minutes_for_middle_school);
    }




}
