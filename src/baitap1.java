import java.util.Scanner;
public class baitap1 {
    public static void main(String[] args) {
        System.out.print("Nhập số a: ");
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();

        double maxNumber = timMax(a, b, c);
        System.out.println("Số lớn nhất là: " + maxNumber);

        scanner.close();
    }

    public static double timMax(double a, double b, double c) {
        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}