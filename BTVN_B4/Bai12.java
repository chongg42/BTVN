import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        System.out.println("Nhap vao 1 chuoi");
        String s = "madam";
        String ss[] = s.trim().split("");

        int n = ss.length / 2;
        if (ss.length % 2 == 0)
            n = (ss.length) / 2 - 1;
        boolean check = true;
        for (int i = 0; i < n; i++)
            if (!ss[i].equals(ss[ss.length - 1 - i])) {
                check = false;
                break;
            }

        if (check)
            System.out.println("la chuoi doi xung");
        else
            System.out.println("khong la chuoi doi xung");
    }

}
