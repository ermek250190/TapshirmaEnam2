package com.company;

public enum Kundor {
    MONDAY("понедельник"," +25 ","java 5 "),
    TUESDAY("вторник"," +35 ","java session"),
    WEDNESDAY("среда"," +38 ","English"),
    THURSDAY("четверг"," +45 ","java 5 "),
    FRIDAY("пятница"," +40","soft skills"),
    SATURDAY("суббота"," +36","java session"),
    SUNDAY("воскресенье"," 30","vixodnoi"),
    ;

    String nameRus;
    String pogoda;
    String namecours;

    Kundor(String nameRus, String pogoda, String namecours) {
        this.nameRus = nameRus;
        this.pogoda = pogoda;
        this.namecours = namecours;
    }
    public void info(){
        System.out.println("sabak aldin jakshi dayardanuu");
    }

    @Override
    public String toString() {
        return "Kundor{" +
                "nameRus='" + nameRus + '\'' +
                ", pogoda='" + pogoda + '\'' +
                ", namecours='" + namecours + '\'' +
                '}';
    }
}
