package school;

public enum No {
    BYE("Bye", "Пока("),
    GOODBYE("Goodbye", "Досвиданья"),
    SEE_YOU_SOON("See you soon", "Увидимся");

    private final String ang;
    private final String rus;


    private No(String ang, String rus) {
        this.ang = ang;
        this.rus = rus;

    }

    public String getAng(){ return ang;}
    public String getRus(){ return rus;}





}
