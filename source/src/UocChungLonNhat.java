import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        a = sc.nextInt();
        System.out.print("enter second number: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("no greatest common factor");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
