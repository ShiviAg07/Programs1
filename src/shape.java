import java.util.Scanner;

public class shape {
    String d;
    String e;
    shape(String d,String e){
        this.d=d;
        this.e=e;
    }
    public void draw() {
        System.out.println(d);
    }

    public void erase() {
        System.out.println(e);
    }

}
class den{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String d;
        d=obj.nextLine();
        shape obj1=new shape(d,obj.nextLine());
        obj1.draw();
        obj1.erase();

    }
}