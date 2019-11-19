import java.util.Scanner;

public class workerDemo {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        FullTime f = new FullTime("Jack", 1234, 40000);
        PartTime p = new PartTime("Dan", 5678, 20000);
        f.displayF();
        p.displayP();

    }
}
