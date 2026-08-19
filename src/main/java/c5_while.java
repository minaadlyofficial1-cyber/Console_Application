import java.util.Scanner;

public class c5_while {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        int choice= 0;
        while (choice!=2){
            System.out.println("========== MENU ==========\n" +
                    "choose:\n" +
                    "1 - Add Employee\n" +
                    "2 – Exit\n");
             choice = Scanner.nextInt();
            if (choice==1) {
                        System.out.println(" Hi! pleas enter your name .. \n");
                Scanner.nextLine();
                String EmployeeName = Scanner.nextLine();

                System.out.println(" hello! " + EmployeeName + " enter your ID ");
                int EmployeeID = Scanner.nextInt();
                System.out.println(" what is your Department Code ");
                int DepartmentCode = Scanner.nextInt();
                //  System.out.println();


                System.out.println(" enter your Basic Salary");
                int BasicSalary = Scanner.nextInt();
                System.out.println(" And Bonus??");
                int Bonus = Scanner.nextInt();
                System.out.println(" what about Tax Percentage?");
                int TaxPercentage = Scanner.nextInt();
                double GrossSalary = BasicSalary + Bonus ;
                double TaxAmount = GrossSalary * TaxPercentage /100.0 ;
                double NetSalary = GrossSalary - TaxAmount;


                System.out.println(" Last one .. Are you Married?? (true/false) ");
                boolean Married = Scanner.nextBoolean();

                System.out.println( "========= Employee Report ==========");
                System.out.printf(" EmployeeID: %d %n EmployeeName: %s %n%n BasicSalary: %s %n Bonus: %s %n GrossSalary: %s %n TaxAmount: %s %n NetSalary: %s %n%n"
                        , EmployeeID , EmployeeName , BasicSalary , Bonus  , GrossSalary , TaxAmount , NetSalary   );


                switch (DepartmentCode) {
                    case 1:
                        System.out.println(" your department: ID");
                        break;
                    case 2:
                        System.out.println(" your department: HR ");
                        break;
                    case 3:
                        System.out.println(" your department: Finance");
                        break;
                    case 4:
                        System.out.println(" your department: Sales");
                        break;
                    case 5:
                        System.out.println(" your department: Marketing");
                        break;
                    default:
                        System.out.println(" Department : UnknownDepartment\n" );
                        break;
                }
                System.out.println(" Married: "+ Married);

                if (!Married ){
                    System.out.println(" Family Insurance : Not Eligible");
                }else {
                    System.out.println(" Family Insurance : Eligible");
                }


                if (NetSalary>=30000){
                    System.out.println(" Income Level : High Income");
                }else if (NetSalary >=15000 && NetSalary<30000){
                    System.out.println(" Income Level : Medium Income");
                }else if (NetSalary< 15000)
                    System.out.println(" Income Level : Low Income");
            }else if (choice==2){
                System.out.println("program exit");
            }else {
                System.out.println("invalid choice");
            } break;






    }
        }

















    }

