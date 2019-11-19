public class Division extends Calculator implements Arithmetic {
    private double divide;

    public Division(double n1, double n2){
        super(n1,n2);
    }

    public void computeArithmetic(){

        System.out.println("Division result is: "+ (getN1()/getN2()));

    }
}
