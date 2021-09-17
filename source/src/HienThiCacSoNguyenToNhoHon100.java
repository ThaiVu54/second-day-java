
import java.util.Scanner;

public class HienThiCacSoNguyenToNhoHon100 {
    public static boolean checkNguyenTo(int n) {
        if (n <= 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void inputNguyenTo(int n) {
        for (int i = 1; i < n; i++) {
            if (checkNguyenTo(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n = ");
        n = sc.nextInt();
        inputNguyenTo(n);
    }
}