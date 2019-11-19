import java.util.Scanner;

public class EvenDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Even e = new Even();
        System.out.println("Enter a number");
        int n= input.nextInt();
        e.setNum(n);
        boolean f = e.isEven();
        if (f)
            System.out.println("The number " + e.getNum() + " is an Even Number");
        else
            System.out.println("The number " + e.getNum() + " is an Odd Number");
    }

}
