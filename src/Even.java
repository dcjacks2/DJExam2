import java.util.Scanner;
public class Even {
    int num;

    public void setNum(int n){
        num=n;
    }
    public int getNum(){
        return num;}

    public boolean isEven(){
        boolean f = false;
        boolean t = true;
        float even;
        //define this function here to check num is even
        even = num/2;
        if (even==0){
            return f;
        }
        else{
            return t;
        }


    }

}
