package chapterNine;

public class CommissionEmployeeTest {
    public static void main(String[] args) throws IllegalAccessException {

//        instantiate commissionEmployee object
        CommissionEmployee employee = new CommissionEmployee("Eric", "cole", "222-22-2222", 10000, .06);

//        get commission employee africa.semicolon.sendAm.data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is",
                employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",
                employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",
                employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sale is",
                employee.getGrossSale());
        System.out.printf("%s %.2f%n", "commission rate is",
                employee.getCommissionRate());

        employee.setGrossSale(5000);
        employee.setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString", employee);


    }
}
