package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    public void amountOfDays(int month) {
        if(month> 0 && month < 13){
            System.out.println(days[month-1]);
        }else {
            System.out.println("wrong number!");
        }
    }
}
