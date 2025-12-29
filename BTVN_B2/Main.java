
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Nhập dữ liệu
        System.out.print("Nhập dung lượng RAM (GB): ");
        int ram = sc.nextInt();

        System.out.print("Máy có SSD không? (true/false): ");
        boolean hasSSD = sc.nextBoolean();

        // 2. Phân loại hiệu suất
        if (ram >= 16 && hasSSD) {
            System.out.println("Loại VIP");

        } else if ((ram >= 8 && ram < 16) && hasSSD) {
            System.out.println("Loại Khá");

        } else if (ram >= 8 && !hasSSD) {
            System.out.println("Loại Trung bình");

        } else {
            System.out.println("Loại Yếu");
        }

        sc.close();
    }
}

