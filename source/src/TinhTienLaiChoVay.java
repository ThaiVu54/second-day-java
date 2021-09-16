import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number money: ");
        money = sc.nextDouble();
        int month;
        System.out.print("Enter month: ");
        month = sc.nextInt();
        double interest;
        System.out.print("enter interest: ");
        interest = sc.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money *(interest/100)/12 * month;
        }
        System.out.println("total of interest: "+totalInterest);
    }
}
