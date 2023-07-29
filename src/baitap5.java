import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tenSinhVien ;
        String tenSinhVienTreNhat = "";
//        Cái dòng lệnh Integer.MAX_VALUE này em hỏi chị google cách xuất ra giá trị nhỏ nhất trong 3 giá trị nhập vào trong vòng lập for cái bà chị google chỉ em cái này em cũng hong hiểu hhuhu, mong anh giải thích cho em ! hehe
        int tuoiSinhVienTreNhat = Integer.MAX_VALUE ;
        int tuoiSinhVien;
        for (int i = 1; i < 4; i++) {
            System.out.println("Vui lòng nhập tên của sinh viên thứ "+ i+ ": ");
            tenSinhVien = scanner.nextLine();
            System.out.println("Vui lòng nhập tuổi của sinh viên thứ "+ i+ ": ");
            tuoiSinhVien = scanner.nextInt();
            scanner.nextLine();
//            Vậy mà trích ra được hay thật anh!
            if (tuoiSinhVien < tuoiSinhVienTreNhat ) {
                tenSinhVienTreNhat = tenSinhVien;
                tuoiSinhVienTreNhat = tuoiSinhVien;
            }
        }
        System.out.println("Sinh viên trẻ nhất trong đám là: "+ tenSinhVienTreNhat);
        System.out.println("Tuổi sinh viên trẻ nhất trong đám là: " + tuoiSinhVienTreNhat);
    }
}
