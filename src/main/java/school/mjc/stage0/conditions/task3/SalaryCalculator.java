package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
       double answer;
        if(salary < 0){
            System.out.println("wrong input!");
        }else if (salary <= 10_000){
            answer = salary-(salary * 15.0 /100);
            System.out.println(answer);
        }else if (salary <=20_000){
            answer = salary-(salary * 18.0 /100);
            System.out.println(answer);
        }else if (salary > 20_000)
        {
            answer = salary-(salary * 20.0 /100);
            System.out.println(answer);
        }
    }
}
