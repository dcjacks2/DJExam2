public class Worker {
    private String Name;
    private int ID;
    public  Worker(String Name, int ID){
        this.Name=Name;
        this.ID=ID;
    }
    public void display(){
        System.out.println("Name: "+Name);
        System.out.println("ID: "+ID);

    }

}
