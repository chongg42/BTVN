import java.util.Scanner;

public class Bai14 {
    static class keyValue {
        String key;
        int value = 0;
    }

    public static void main(String[] args) {
        System.out.println("Nhap vao 1 chuoi");
        String s = new Scanner(System.in).nextLine();
        String arr[] = s.split("");
      
        
        int n = 0;
        keyValue arrObj[] = new keyValue[arr.length];

        for (String a : arr) {
            boolean check = false;

            for (int i = 0; i < n; i++) {
                if (arrObj[i].key.equals(a)) {
                    check = true;
                    arrObj[i].value++;
                    break;
                }

            }
            if (!check)
                 {
                keyValue k = new keyValue();
                k.key = a;
                k.value++;
                arrObj[n] = k;
                n++;

            }
        }
        for (keyValue keyValue : arrObj) {
            System.out.printf("ki tu %s: %d lan\n", keyValue.key, keyValue.value);
        }

    }
}