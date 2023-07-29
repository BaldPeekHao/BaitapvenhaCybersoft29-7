import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số A: ");
        int soA = scanner.nextInt();
        System.out.println("Hãy nhập số B: ");
        int soB = scanner.nextInt();
        System.out.println("Hãy nhập số C: ");
        int soC = scanner.nextInt();
        tong3So(soA,soB,soC);
    }
    public static int tong3So (int soA, int soB, int soC) {
        int tong = soA + soB + soC;
        System.out.println("Tổng của 3 số là: " + tong);
        return tong;
    }
}
