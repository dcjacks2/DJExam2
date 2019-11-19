import java.util.Scanner;

public class DemoPoly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape s;
        System.out.println("Enter Width and Height");
        System.out.println("Enter width:");
        double w = input.nextDouble();
        System.out.println("Enter height:");
        double h = input.nextDouble();
        int choice;
        char repeat = 'y';
        while (repeat != 'n') {
            System.out.println("Enter your coice 1. Rectangle 2. Triangle 3. Parallelogram 4. Pentagon");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    s = new Rectangle(w,h);
                    System.out.println("Rectangle: " + s.Area());
                    break;
                case 2:
                    s= new Triangle(w,h);
                    System.out.println("Triangle: " + s.Area());
                    break;
                case 3:
                    s= new Parallelogram(w,h);
                    System.out.println("Parallelogram: " + s.Area());
                    break;
                case 4:
                    s= new Pentagon(w,h);
                    System.out.println("Pentagon: " + s.Area());
                    break;
                default:
                    System.out.println("Invalid Shape");
            }
            input.nextLine();
            System.out.println("Do you want to compute more area of shapes");
            repeat = input.nextLine().charAt(0);

        }
    }

}
