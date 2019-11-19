public class DemoInterface {
    public static void main(String[] args){
        Addition a = new Addition(10,20);
        Multiplication m = new Multiplication(10,20);
        Subtraction s = new Subtraction(10,20);
        Division d = new Division(10,20);

        a.computeArithmetic();
        m.computeArithmetic();
        s.computeArithmetic();
        d.computeArithmetic();
    }
}
