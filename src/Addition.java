public class Addition extends Calculator implements Arithmetic {
    private double add;

    public Addition(double n1, double n2){
        super(n1,n2);
    }

    public void computeArithmetic(){

        System.out.println("Addition result is: "+ (getN1()+getN2()));
    }


}
