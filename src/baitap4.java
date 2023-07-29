import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào số a: ");
        int a = scanner.nextInt();
        System.out.println("Hãy nhập vào số b: ");
        int b = scanner.nextInt();
        System.out.println("Chọn phép tính:");
        System.out.println("Nhập 1 nếu Cộng (+)");
        System.out.println("Nhập 2 nếu Trừ (-)");
        System.out.println("Nhập 3 nếu Nhân (*)");
        System.out.println("Nhập 4 nếu Chia (/)");

        
        System.out.println("Xin hãy cho tui biết lựa chọn của bạn: ");
        int choice = scanner.nextInt();
        int result = 0;
        switch (choice){
            case 1:
                result = add(a,b);
                break;
            case 2:
                result = sub(a,b);
                break;
            case 3:
                result = mul(a,b);
                break;
            case 4:
                result = div(a,b);
                break;
            default:
                System.out.println("Vui lòng nhập đúng số theo chỉ ở định trên!");
        }
        System.out.println("Kết quả là: " + result);
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mul(int a, int b){
        return a * b;
    }
    public static int div(int a, int b){
        if ((a == 0) || (b ==0 )){
            System.out.println("Không thể thực thi phép tính này! ");
        }
        return a / b;
    }
}
