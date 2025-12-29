public class Bai9{


public static void main(String[] args) {
     int[] a = {5, 1, 9, 3, 9, 7};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int x : a) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x < max1 && x > max2) {
                max2 = x;
            }
        }
          if (max2 == Integer.MIN_VALUE)
            System.out.println("Khong co gia tri lon thu hai");
        else
            System.out.println("Gia tri lon thu hai: " + max2);
       
}
}
