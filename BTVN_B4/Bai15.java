import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        System.out.print("n= ");
        int n = new Scanner(System.in).nextInt();
        int arr[][] = new int[n][n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac gia tri cua mang");
        for (int row = 0; row < n; row++)
            for (int colum = 0; colum < n; colum++) {
                arr[row][colum] = sc.nextInt();
                sc.nextLine();
            }
        int chinh = 0;
        int phu = 0;
        for (int row = 0; row < n; row++)
            for (int colum = 0; colum < n; colum++) {
                if (row == colum) {
                    chinh += arr[row][colum];
                    phu += arr[row][n - 1 - colum];
                }
            }
        System.out.println(chinh);
        System.out.println(phu);
        sc.close();
    }
}
