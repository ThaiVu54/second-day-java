import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h;
        System.out.print("enter width: ");
        h = sc.nextInt();
        System.out.println("rectangle");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h + 4; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.print("triangle");
        for (int a = 0; a <= h; a++) {
            for (int b = 0; b < a; b++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("triangle top-left");
        for (int b = h; b >= 1; b--) {
            for (int a = 1; a <= b; a++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
