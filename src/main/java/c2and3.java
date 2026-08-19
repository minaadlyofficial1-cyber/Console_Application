public class c2and3 {
   public static void main(String[] args) {

            int EmployeeID = 1234;
            String EmployeeName = "mina" ;
            String Department = "IT";
            double BasicSalary =30000 ;
            double Bonus = 5000;
            double TaxPercentage =10 ;
            boolean Married = false;
            double GrossSalary = BasicSalary + Bonus ;
            double TaxAmount = GrossSalary * TaxPercentage /100.0 ;
            double NetSalary = GrossSalary - TaxAmount;
            System.out.println( "========= Employee Report ==========");
            System.out.printf(" EmployeeID: %d %n EmployeeName: %s %n Department: %s %n%n BasicSalary: %s %n Bonus: %s %n%n GrossSalary: %s %n TaxAmount: %s %n NetSalary: %s %n%n Married: %s  %n"
                    , EmployeeID , EmployeeName , Department , BasicSalary , Bonus  , GrossSalary , TaxAmount , NetSalary , Married  );

            if (NetSalary>=30000){
                System.out.println(" Income Level : High Income");
            }else if (NetSalary >=15000 && NetSalary<30000){
                System.out.println(" Income Level : Medium Income");
            }else if (NetSalary< 15000)
                System.out.println(" Income Level : Low Income");


            if (!Married ){
                System.out.println(" Family Insurance : Not Eligible");
            }else {
                System.out.println(" Family Insurance : Eligible");
            }

      int DepartmentCode =1;

switch (DepartmentCode){
    case 1 :
        System.out.println(" IT");
                break;
    case 2 :
        System.out.println(" HR");
                    break;
    case 3 :
        System.out.println(" Finance");
        break;
    case  4 :
        System.out.println(" Sales");
                break;
    case 5 :
        System.out.println(" Marketing");
        break;
    default:
        System.out.println(" Department : UnknownDepartment");
}


        }
}
