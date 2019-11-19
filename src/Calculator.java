public class Calculator {
    double n1;
    double n2;
    Calculator(double n1, double n2){
        this.n1=n1;
        this.n2=n2;
    }
    public double getN1(){
        return n1;
    }
    public double getN2(){
        return n2;
    }
    public void display(){
        System.out.println("Number1: "+n1);
        System.out.println("Number2: "+n2);
    }

}
