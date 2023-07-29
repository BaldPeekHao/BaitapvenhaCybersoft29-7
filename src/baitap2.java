import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hãy nhập vào một số để biết tính chẵn lẻ: ");
    int input = scanner.nextInt();
    soChanLe(input);
    }
    public static void soChanLe (int input) {
        if (input % 2 ==0) {
            System.out.println("Đây là một số chẵn! ");
        }else {
            System.out.println("Đây là số lẻ! ");
        }
    }
}
