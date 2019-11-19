public class Subtraction extends Calculator implements Arithmetic {
    private double subtract;

    public Subtraction(double n1, double n2){
        super(n1,n2);
    }

    public void computeArithmetic(){

        System.out.println("Subtraction result is: "+ (getN1()-getN2()));

    }
}
