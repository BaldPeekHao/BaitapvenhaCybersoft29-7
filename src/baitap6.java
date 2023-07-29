import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int demSoLe = 0;
        int demSoChan = 0;
        for (int i = 1; i < 4 ; i++) {
            System.out.print("Hãy nhập số nguyên thứ " +i+ ": ");
            int number = scanner.nextInt();
            if (number % 2 == 0){
             demSoChan++;
            }else if (number % 2 !=0){
                demSoLe++;
            }
        }
        System.out.println("Có " + demSoChan + " số chẵn");
        System.out.println("Có " + demSoLe + " số lẻ");
    }
}



