import java.util.Scanner;

public class bai2 {
public static void main(String[] args) {
    System.out.print("nhap chuoi: ");
    String a=new Scanner(System.in).nextLine();
    System.out.println(a.toLowerCase());
    System.out.println(a.toUpperCase());
    System.out.println(a.trim().length());
}
}
