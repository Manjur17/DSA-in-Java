package Fundamentals;
import java.util.Scanner;
public class TotalSalary {
    public static void main(String[] args) {
        int basicSalary, totalSalary,allow;
        char grade;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Base Salary:");
        basicSalary=s.nextInt();
        System.out.println("Enter The Grade:");
        grade=s.next().charAt(0);
        double hra= (0.2 * basicSalary);
        double da= (0.5 * basicSalary);
        double pf= (0.11 * basicSalary);
        if (grade == 'A')
        {
            allow=1700;
            totalSalary = (int) (basicSalary+ hra + da + allow - pf);
            System.out.print("Total Salary is: " + totalSalary + "\n");
        }
        else if(grade == 'B')
        {
            allow=1500;
            totalSalary = (int) (basicSalary+ hra + da + allow - pf);
            System.out.print("Total Salary is: " + totalSalary + "\n");
        }
        else if (grade == 'C')
        {
            allow=1300;
            totalSalary = (int) (basicSalary+ hra + da + allow - pf);
            System.out.print("Total Salary is: " + totalSalary + "\n");
        }
        else {
            return;
        }
    }
}
