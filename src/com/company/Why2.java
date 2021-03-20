package com.company;



import school.No;
import school.Yes;

public class Why2 {
    String l;


    public Why2(String l){
        this.l = "Hi";
    }

    public void yeah(){
        System.out.println("YEEEEEAH");
    }

    public void hey(No BYE){
        for(No hey: No.values()){
            System.out.println("Printing" +  ": " + hey.getAng() + ", " +  hey.getRus());
        }

    }



}
