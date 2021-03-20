package school;

public final class University implements Education {
    int amount_of_students;
    int how_many_got_budjet;
    int how_many_got_money;


    public University(int amount_of_students, int how_many_got_budjet, int how_many_got_money){
        this.amount_of_students = amount_of_students;
        this.how_many_got_budjet = how_many_got_budjet;
        this.how_many_got_money = how_many_got_money;
    }

    public void okay(){
        System.out.println("Percent of students that got budjet places");
        System.out.println(((double)how_many_got_budjet/(double)amount_of_students)*100 + "%");
        System.out.println("Percent of students that got money for good marks");
        System.out.println(((double)how_many_got_money/(double)amount_of_students)*100 + "%");







    }
    public void sayHello(){
        System.out.println("Welcome to University!");
    }

    public class Firstinner {
        int how_many_dont_get_money;
        public Firstinner(){

        }
        public Firstinner(int how_many_dont_get_money){
            this.how_many_dont_get_money = how_many_dont_get_money;

        }
        public void test_for_inner() {
            int how_many = amount_of_students - how_many_got_money;
            if (how_many != how_many_dont_get_money) {
                System.out.println("What did you even typed");
                System.out.println(how_many_dont_get_money + "of" + amount_of_students + "don`t get money for good marks");
            }

        }




    }
    static public class Secondinner{
        public static void faculties(){
             String faculty[] = {"Computer Science", "Economy","Biotechlogy", "Chemistry"};
             System.out.println("Available faculties:");
             for (int i =0; i < faculty.length; i++){
                 System.out.print(faculty[i] + " ");
             }
        }
        public double computerscience(){
            double how_many_computer = 30/100;
            return how_many_computer;
        }
        public double economy(){
            double how_many_economy = 50/100;
            return how_many_economy;
        }
        public double bio(){
            double how_many_bio = 15/100;
            return how_many_bio;
        }
        public double chem(){
            double how_many_chem = 5/100;
            return how_many_chem;
        }

    }
    public void method1(){
        Firstinner damn = new Firstinner(50);
        damn.test_for_inner();

    }

}
