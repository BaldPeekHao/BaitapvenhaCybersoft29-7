import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tenCanBo;
        String tenCanBoTreNhat = "";
        String gioiTinh;
        //        Cái dòng lệnh Integer.MAX_VALUE này em cũng chưa hiểu chỉ là hỏi chị google cách trích số nhỏ trong for loop ra giống như bài 5 vậy! hehe
        int tuoiCanBoTreNhat = Integer.MAX_VALUE ;
        int tuoiCanBo;
        for (int i = 1; i < 4; i++) {
            System.out.println("Vui lòng nhập tên của cán bộ thứ "+ i+ ": ");
            tenCanBo = scanner.nextLine();
            System.out.println("Vui lòng nhập tuổi của cán bộ thứ "+ i+ ": ");
            tuoiCanBo = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Vui lòng nhập giới tính của cán bộ thứ "+ i+ ": ");
            gioiTinh = scanner.nextLine();
            scanner.nextLine();

            if (tuoiCanBo < tuoiCanBoTreNhat ) {
                tenCanBoTreNhat = tenCanBo;
                tuoiCanBoTreNhat = tuoiCanBo;
            }
        }
        System.out.println("Sinh viên trẻ nhất trong đám là: "+ tenCanBoTreNhat);
        System.out.println("Tuổi sinh viên trẻ nhất trong đám là: " + tuoiCanBoTreNhat);
    }
}
