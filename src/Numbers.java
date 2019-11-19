public class Numbers {
    private int a;
    private double b;
    Numbers( int a, double b ){
        this.a= a;
        this.b=b;
    }
    public void display(){
        System.out.println("No argument display");
    }
    public void display(String s, int x)
    {
        System.out.println("Display with String "+s+" and Number "+ x);
    }
    public void display(int x, double y){
        System.out.println("Display with two numbers "+ x + " and "+ y);
    }
}




