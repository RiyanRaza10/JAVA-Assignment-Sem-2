import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic, hra, da, pf, netSalary;
        System.out.print("Enter basic salary: ");
        basic = sc.nextDouble();

        if (basic >= 30000) {
            hra = basic * 0.20;   
            da  = basic * 0.15;   
        } else {
            hra = basic * 0.10;   
            da  = basic * 0.08;   
        }

        pf = basic * 0.12;  

        netSalary = basic + hra + da - pf;

        System.out.println("\nBasic Salary = " + basic);
        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("PF = " + pf);
        System.out.println("Net Salary = " + netSalary);

        sc.close();
    }
}