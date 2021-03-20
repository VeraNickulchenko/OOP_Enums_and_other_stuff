package school;

public class High_school extends School implements Education {
    int amount_of_children;
    private int amount_of_subjects;
    int pecrcent_did_ZNO_succes;
    int Olympia_take_parts;
   public static int math_hours = 2;
   double x =10;



    public High_school(int amount_of_children, int amount_of_subjects, int pecrcent_did_ZNO_succes, int Olympia_take_parts){
        this.amount_of_children = amount_of_children;
        this.amount_of_subjects = amount_of_subjects;
        this.pecrcent_did_ZNO_succes = pecrcent_did_ZNO_succes;
        this.Olympia_take_parts = Olympia_take_parts;
    }
    public High_school(){
        this.amount_of_subjects = amount_of_subjects;

    }


    public void setAmount_of_subjects(int amount_of_subjects){
        if(amount_of_subjects == 17 || amount_of_subjects == 19){
            this.amount_of_subjects = amount_of_subjects;


        }
        else{
            System.out.println("Error!");
        }
    }

    public int getAmount_of_subjects(int amount_of_subjects){
        return amount_of_subjects;
    }

    public  double semestr1(){
        int children_with_low_gpa = 32;
        int children_wuth_middle_gpa =  56;
        int children_with_high_gpa = 12;
        return(children_with_high_gpa);



    }
    public void rating(){
        int ZNO = amount_of_children*100/pecrcent_did_ZNO_succes;
        int rating = ZNO +  Olympia_take_parts;
        System.out.println("The raiting of High school");
        System.out.println(rating);

    }


    public static void hours(){
        int leraningweeks_highschool = 37;
        int thelessonsminutes = 45;
        int minutes_for_high_school = leraningweeks_highschool*thelessonsminutes;

        System.out.println("The amount of working minutes for High School is " +  "  " + minutes_for_high_school);
    }

    public void sayHello(){
        System.out.println("Welcome to High school!");
    }

    public void why(){
        this.amount_of_children = 192;
        this.amount_of_subjects= 16;
        this.pecrcent_did_ZNO_succes  = 30;
        this.Olympia_take_parts = 10;






    }

    public final void method(double x ){
        x =10;
        System.out.println("This the method:)" + x);
    }

    public static void hello(){
        System.out.println("System says hello!:)");
    }

    public final void method(String s ){
        s = "love you!)";
        System.out.println("This the method:)" + s);
    }




}

