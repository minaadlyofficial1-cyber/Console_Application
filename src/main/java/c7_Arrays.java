import java.util.Scanner;

public class c7_Arrays {

    static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("How many employees?");

        int numberOfEmployees = Scanner.nextInt();

        double TaxPercentage;
        String[] EmployeeNames = new String[numberOfEmployees];
        int[] EmployeeIDs = new int[numberOfEmployees];
        int[] DepartmentCodes = new int[numberOfEmployees];
        double[] BasicSalaries = new double[numberOfEmployees];
        double[] Bonuses = new double[numberOfEmployees];
        double[] GrossSalaries = new double[numberOfEmployees];
        double[] TaxAmounts = new double[numberOfEmployees];
        double[] NetSalaries = new double[numberOfEmployees];
        boolean[] MarriedStatuses = new boolean[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {

            System.out.println("Employee #" + (i + 1));

            System.out.println("Hi! Please enter your name:");
            Scanner.nextLine();
            EmployeeNames[i] = Scanner.nextLine();

            System.out.println("Hello " + EmployeeNames[i] + ", enter your ID:");
            EmployeeIDs[i] = Scanner.nextInt();

            System.out.println("What is your Department Code?");
            DepartmentCodes[i] = Scanner.nextInt();

            System.out.println("Enter your Basic Salary:");
            BasicSalaries[i] = Scanner.nextDouble();

            System.out.println("And Bonus?");
            Bonuses[i] = Scanner.nextDouble();

            System.out.println("What about Tax Percentage?");
            TaxPercentage = Scanner.nextDouble();

            GrossSalaries[i] = BasicSalaries[i] + Bonuses[i];

            TaxAmounts[i] = GrossSalaries[i] * TaxPercentage / 100.0;

            NetSalaries[i] = GrossSalaries[i] - TaxAmounts[i];

            System.out.println("Last one.. Are you Married? (true/false)");
            MarriedStatuses[i] = Scanner.nextBoolean();
        }

        // Printing all employees
        for (int i = 0; i < numberOfEmployees; i++) {

            System.out.println("\n========= Employee Report ==========");

            System.out.println("Employee ID : " + EmployeeIDs[i]);
            System.out.println("Employee Name : " + EmployeeNames[i]);

            switch (DepartmentCodes[i]) {
                case 1:
                    System.out.println("Department : IT");
                    break;
                case 2:
                    System.out.println("Department : HR");
                    break;
                case 3:
                    System.out.println("Department : Finance");
                    break;
                case 4:
                    System.out.println("Department : Sales");
                    break;
                case 5:
                    System.out.println("Department : Marketing");
                    break;
                default:
                    System.out.println("Department : Unknown Department");
                    break;
            }

            System.out.println("Basic Salary : " + BasicSalaries[i]);
            System.out.println("Bonus : " + Bonuses[i]);
            System.out.println("Gross Salary : " + GrossSalaries[i]);
            System.out.println("Tax Amount : " + TaxAmounts[i]);
            System.out.println("Net Salary : " + NetSalaries[i]);
            System.out.println("Married : " + MarriedStatuses[i]);

            if (MarriedStatuses[i]) {
                System.out.println("Family Insurance : Eligible");
            } else {
                System.out.println("Family Insurance : Not Eligible");
            }

            if (NetSalaries[i] >= 30000) {
                System.out.println("Income Level : High Income");
            } else if (NetSalaries[i] >= 15000) {
                System.out.println("Income Level : Medium Income");
            } else {
                System.out.println("Income Level : Low Income");
            }

            System.out.println("====================================");
        }
    }
}