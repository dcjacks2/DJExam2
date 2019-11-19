public class PartTime extends Worker implements Bonus {
    private double salary;
    public PartTime(String N, int i, double s){
        super(N, i);
        salary=s;
    }
    public double computeBonus(){
        double sb=salary+500;
        return sb;
    }
    public void displayP(){
        display();
        System.out.println("Salary: "+salary);
        System.out.println("Net Salary: "+computeBonus());
    }

}
