
package ru.ipbalashov.ru.lesson1;

public class Main {

    public static void main(String[] args) {
        Participant catBarsik = new Cat("Барсик", 11, 12);
        Participant catMyrzik = new Cat("Мурзик", 8, 15);

        Participant humanMaxim = new Human("Максим", 9, 6);
        Participant humanAlex = new Human("Алексей", 16, 17);

        Participant robotR2D2 = new Robot("R2D2", 10, 10);
        Participant robotC3PO = new Robot("C3PO", 15, 15);

        Participant[] participants = {catBarsik, catMyrzik, humanAlex, humanMaxim, robotR2D2, robotC3PO};


        Hurdles wall1 = new Wall(12);
        Hurdles wall2 = new Wall(14);

        Hurdles racecourse1 = new Racecourse(5);
        Hurdles racecourse2 = new Racecourse(14);

        Hurdles[] hurdles = {wall1, wall2, racecourse1, racecourse2};

        for (int i = 0; i < hurdles.length; i++) {

            for (Participant participant : participants) {
                if (participant.getSuccess()) {
                    System.out.println(hurdles[i].check(participant));
                }


            }
        }
    }

}
