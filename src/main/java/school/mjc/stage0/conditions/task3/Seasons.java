package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month >= 13 || month == 0) {
            System.out.println("wrong number!");
        } else if (month == 1 || month == 12 || month == 2) {
                System.out.println("Winter");
        } else if (month == 4 || month == 3 || month == 5 ) {
            System.out.println("Spring");
        }else if (month == 6 || month == 7 || month == 8 ) {
            System.out.println("Summer");
        }else if (month == 9 || month == 10 || month == 11 ) {
            System.out.println("Autumn");
        }


    }
}
