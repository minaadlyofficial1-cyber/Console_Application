import java.util.Scanner;

public class c8_Methods {

    static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("How many employees?");
        int numberOfEmployees = Scanner.nextInt();

        String[] EmployeeNames = new String[numberOfEmployees];
        int[] EmployeeIDs = new int[numberOfEmployees];
        int[] DepartmentCodes = new int[numberOfEmployees];
        double[] BasicSalaries = new double[numberOfEmployees];
        double[] Bonuses = new double[numberOfEmployees];
        double[] GrossSalaries = new double[numberOfEmployees];
        double[] TaxAmounts = new double[numberOfEmployees];
        double[] NetSalaries = new double[numberOfEmployees];
        boolean[] MarriedStatuses = new boolean[numberOfEmployees];

        readEmployeeData(
                Scanner,
                EmployeeNames,
                EmployeeIDs,
                DepartmentCodes,
                BasicSalaries,
                Bonuses,
                GrossSalaries,
                TaxAmounts,
                NetSalaries,
                MarriedStatuses
        );




        printAllEmployees(
                EmployeeNames,
                EmployeeIDs,
                DepartmentCodes,
                BasicSalaries,
                Bonuses,
                GrossSalaries,
                TaxAmounts,
                NetSalaries,
                MarriedStatuses
        );
    }


    static void readEmployeeData(
            Scanner Scanner,
            String[] EmployeeNames,
            int[] EmployeeIDs,
            int[] DepartmentCodes,
            double[] BasicSalaries,
            double[] Bonuses,
            double[] GrossSalaries,
            double[] TaxAmounts,
            double[] NetSalaries,
            boolean[] MarriedStatuses) {

        for (int i = 0; i < EmployeeIDs.length; i++) {

            System.out.println("\nEmployee #" + (i + 1));

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
            double TaxPercentage = Scanner.nextDouble();

            GrossSalaries[i] = calculateGrossSalary(
                    BasicSalaries[i],
                    Bonuses[i]
            );

            TaxAmounts[i] = calculateTax(
                    GrossSalaries[i],
                    TaxPercentage
            );

            NetSalaries[i] = calculateNetSalary(
                    GrossSalaries[i],
                    TaxAmounts[i]
            );

            System.out.println("Last one.. Are you Married? (true/false)");
            MarriedStatuses[i] = Scanner.nextBoolean();
        }
    }


    static double calculateGrossSalary(double basicSalary, double bonus) {

        return basicSalary + bonus;
    }


    static double calculateTax(double grossSalary, double taxPercentage) {

        return grossSalary * taxPercentage / 100.0;
    }


    static double calculateNetSalary(double grossSalary, double taxAmount) {

        return grossSalary - taxAmount;
    }


    static String getDepartmentName(int departmentCode) {

        switch (departmentCode) {

            case 1:
                return "IT";


            case 2:
                return "HR";

            case 3:
                return "Finance";

            case 4:
                return "Sales";

            case 5:
                return "Marketing";

            default:
                return "Unknown Department";
        }
    }


    static void printEmployee(
            String employeeName,
            int employeeID,
            int departmentCode,
            double basicSalary,
            double bonus,
            double grossSalary,
            double taxAmount,
            double netSalary,
            boolean married) {

        System.out.println("\n========= Employee Report ==========");

        System.out.println("Employee ID : " + employeeID);

        System.out.println("Employee Name : " + employeeName);

        System.out.println(
                "Department : " + getDepartmentName(departmentCode)
        );

        System.out.println("Basic Salary : " + basicSalary);

        System.out.println("Bonus : " + bonus);

        System.out.println("Gross Salary : " + grossSalary);

        System.out.println("Tax Amount : " + taxAmount);

        System.out.println("Net Salary : " + netSalary);

        System.out.println("Married : " + married);


        if (married) {

            System.out.println("Family Insurance : Eligible");

        } else {

            System.out.println("Family Insurance : Not Eligible");
        }


        if (netSalary >= 30000) {

            System.out.println("Income Level : High Income");

        } else if (netSalary >= 15000) {

            System.out.println("Income Level : Medium Income");

        } else {

            System.out.println("Income Level : Low Income");
        }

        System.out.println("====================================");
    }


    static void printAllEmployees(
            String[] EmployeeNames,
            int[] EmployeeIDs,
            int[] DepartmentCodes,
            double[] BasicSalaries,
            double[] Bonuses,
            double[] GrossSalaries,
            double[] TaxAmounts,
            double[] NetSalaries,
            boolean[] MarriedStatuses) {

        for (int i = 0; i < EmployeeIDs.length; i++) {

            printEmployee(
                    EmployeeNames[i],
                    EmployeeIDs[i],
                    DepartmentCodes[i],
                    BasicSalaries[i],
                    Bonuses[i],
                    GrossSalaries[i],
                    TaxAmounts[i],
                    NetSalaries[i],
                    MarriedStatuses[i]
            );
        }
    }
}