public class demoStudent {
    public static void main(String[] args){
        Student s=new Student();
        s.setName("Maria");
        System.out.println("Name: "+ s.getName());
        //call setter method to set value to marks
        s.setMarks(45);

        // print the value of marks by calling getter method for marks

        System.out.println("Marks: "+s.getMarks());
    }
}
