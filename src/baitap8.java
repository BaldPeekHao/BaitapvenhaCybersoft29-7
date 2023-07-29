// ÔI! cái bài nãy khó qua1aaaaaaa!! Em vừa nhìn công thức vừa nhìn chị google gợi ý vừa làm nhe
import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      Tọa độ đại học
        int universityX = 0;
        int universityY = 0;

        String farthestStudentName = "";
        double farthestDistance = 0.0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Nhập tên sinh viên " + i + ": ");
            String name = scanner.nextLine();

            System.out.print("Nhập tọa độ x của nhà của anh sinh viên " + i + ": ");
            int studentX = scanner.nextInt();

            System.out.print("Nhập tọa độ y của nhà của anh sinh viên " + i + ": ");
            int studentY = scanner.nextInt();

            scanner.nextLine(); // Fix lỗi nhắc lệnh input

            double distance = calculateDistance(studentX, studentY, universityX, universityY);

            if (distance > farthestDistance) {
                farthestStudentName = name;
                farthestDistance = distance;
            }
        }

        System.out.println("Sinh viên ở xa trường đại học nhất đó là: " + farthestStudentName);

        scanner.close();
    }
// Công thức !
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

