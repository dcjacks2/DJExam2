public class Multiplication extends Calculator implements Arithmetic {
    private double multiply;

    public Multiplication(double n1, double n2){
        super(n1,n2);
    }

    public void computeArithmetic(){

        System.out.println("Multiplication result is: "+(getN1()*getN2()));

    }
}
