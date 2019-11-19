public class Employee {
    private String Name;
    private int hoursWorked;
    private double hourlyWages;
/*define a Constructor method to assign values the variables Name,
    hoursWorked, and hourlyWages*/

    public Employee(String n, int wo, double wa ){
        Name = n;
        hoursWorked = wo;
        hourlyWages = wa;
    }
    //define a method double computeGrossSalary() given salary per hour and number of hours worked.
    public double computeGrossSalary(){
        double Gross;
        Gross= hourlyWages*hoursWorked;
        return Gross;
    }
    public void display(){
        System.out.println("Name: "+ Name);
        System.out.println("Hourly Wages: "+ hourlyWages);
        System.out.println("Hours worked: "+hoursWorked);
        System.out.println("Gross Salary: "+computeGrossSalary());

    }


}
