public class INTEREST {
    int age;
    String gender;
    double pi;

    public double percentage(double pi) {
        this.pi = pi;
        if (gender.equals("Male") && (age > 1 && age < 58)) {
            pi = 8.4;
        }
        if (gender.equals("Female") && (age > 1 && age < 58)) {
            pi = 8.2;
        }
        if (gender.equals("Male") && (age > 59 && age < 100)) {
            pi = 10.5;
        }
        if (gender.equals("Female") && (age > 59 && age < 100)) {
            pi = 9.2;
        }
        return pi;
    }

}
class interest{
    public static void main(String[] args) {
        String gender= args[1];
        int age= Integer.parseInt(args[0]);
        // double a= obj.percentage((double pi));
       // System.out.println(a+"%");
    }
}