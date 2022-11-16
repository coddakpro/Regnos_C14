package chapterNine;

public class CommissionEmployee extends Object {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSale;         //gross weekly sales
    private double commissionRate;      //commission percentage

      // five-argument constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate) throws IllegalAccessException {
        //implicit call to object's default constructor occurs here

        //if grossSale is invalid throw exception
        if (grossSale < 0.0){
            throw new IllegalArgumentException("Gross sale must be >= 0.0");
        }

        //if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    //return first name
    public  String getFirstName()
    {return  firstName;}

//    return lastName
    public String getLastName()
    {return  lastName;}

//    return socialSecurityNumber
    public String getSocialSecurityNumber()
    {return  socialSecurityNumber;}

//    set grossSale Amount
    public void setGrossSale(double grossSales){
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sale must be >= 0.0");
        }
        this.grossSale = grossSales;
    }

//    return gross sales amount
    public double getGrossSale() {
        return grossSale;
    }

//    set commission rate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }
     //     return commission rate
    public double getCommissionRate()
        {return commissionRate;}

//        calculate earnings
        public double earnings()
        {return  commissionRate * grossSale;}

//    return String representation of commissionEmployee object
    @Override     //  indicates that this method overrides a superclass method
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
               "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sale", grossSale,
                "commission rate", commissionRate);
    }
}
