package school;

public class University implements Education {
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
}
