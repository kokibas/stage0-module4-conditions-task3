package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month == 0 && month >=13){
            System.out.println("wrong number!");
        }else if (month == 2 ){
            month = 28;
            System.out.println(month);
        } else if (month == 4 && month == 6 && month == 9 && month == 11) {
            month = 30;
            System.out.println(month);
            }else {
            month = 31;
            System.out.println(month);
        }
    }
}
