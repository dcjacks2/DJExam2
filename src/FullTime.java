public class FullTime extends Worker implements Bonus  {
    private double salary;
    public FullTime(String N, int i, double s){
        super(N, i);
        salary=s;
    }
    public double computeBonus(){
        double sb=salary+1000;
        return sb;
    }
    public void displayF(){
        display();
        System.out.println("Salary: "+salary);
        System.out.println("Net Salary: "+computeBonus());
    }

}
