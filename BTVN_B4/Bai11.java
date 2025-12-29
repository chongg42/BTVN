public class Bai11 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
           if(n>i) {
                int tg = arr[i];
                arr[i] = arr[n];
                arr[n] = tg;
                n--;
            }
            else break;
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
