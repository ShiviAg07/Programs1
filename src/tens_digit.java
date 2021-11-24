import java.util.Scanner;

public class tens_digit  {
     int N;
     int tens;
public void m2(){
    N= N%100;
    int r= N%10;
    tens= (N-r)/10;
    System.out.println(tens);
}}
 class no{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        tens_digit obj1= new tens_digit();
        obj1.N= obj.nextInt();
        obj1.m2();

    }
}
