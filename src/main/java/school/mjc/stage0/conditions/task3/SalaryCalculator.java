package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000 ){
            int tax = salary * 15 / 100;
            salary = salary - tax;
            System.out.println((double)salary);
        } else if (10000 < salary && salary <= 20000 ) {
            int tax = (salary * 18) / 100;
            salary = salary - tax;
            System.out.println((double)salary);
        }else if (salary > 20000){
            int tax = (salary * 20) / 100;
            salary = salary - tax;
            System.out.println((double)salary);
        }
        else if (salary == 0){
            System.out.println("wrong input!");


        }
    }
}
