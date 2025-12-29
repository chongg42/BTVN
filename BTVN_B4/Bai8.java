    import java.util.Scanner;

    public class Bai8 {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap cac gia tri cua mang");
            for(int row=0;row<3;row++)
                for(int colum=0;colum<3;colum++)
                    {
                        arr[row][colum]=sc.nextInt();
                        sc.nextLine();
                    }
                    
        int sum=0;
        for(int row=0;row<3;row++)
            for(int colum=0;colum<3;colum++)
                sum+=arr[row][colum];
        System.out.println("Tong cac phan tu trong ma tran: "+sum);
        sc.close();
    }
    }
