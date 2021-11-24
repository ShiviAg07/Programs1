import java.util.Scanner;

public class Patient {
     String patientName;
     double height;
     double weight;
     double BMI;
public double computeBMI(double height,double weight){
    this.weight=weight;
    this.height=height;
    this.BMI= BMI;
    BMI= weight/ (height*height);
        return BMI;
}
}
class test{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        String patientName = obj.nextLine();
        double height = obj.nextDouble();
        double weight = obj.nextDouble();
        Patient obj1= new Patient();
        double a= obj1.computeBMI(height,weight);
        System.out.println("BMI = "+a);
    }
}
