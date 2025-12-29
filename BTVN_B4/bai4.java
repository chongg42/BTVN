import java.util.Scanner;

public class bai4 {
public static void main(String[] args) {
    int arr[]=new int[9];
    Scanner nhap=new Scanner(System.in);
    System.out.print("Nhap vao cac phan tu cua mang");
    for(int i=0;i<arr.length;i++)
        arr[i]=nhap.nextInt();
    int Max=arr[0];
    int Min=arr[0];
   for(int i=0;i<arr.length;i++)
      {
        if(arr[i]>Max)
        Max=arr[i];
        if(arr[i]<Min)
        Min=arr[i];
      } 
    System.out.println("Max la:"+Max+" Min la: "+Min);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++)
            if(arr[i]<arr[j])
            {
                int tam=arr[i];
                arr[i]=arr[j];
                arr[j]=tam;
            }

    }
    System.out.println("Cac gia tri cua mang la: ");
    for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]+" ");
}
}
