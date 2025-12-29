public class bai5 {
public static void main(String[] args) {
    String data = "Javajshfjdsj,Python,C++,PHP,JavaScript"; 
    String arr[]=data.split(",");
    boolean check=false;
    for (String s: arr) {
        if(s.startsWith("Java"))
            {
                check=true;
                    break;
            }
        System.out.println("Khong co phan tu nao bat dau bang Java");
    }
   if (check) 
     System.out.println("Co phan tu bat dau bang Java");
    else  System.out.println("Khong co phan tu nao bat dau bang Java");
    System.out.println("vi tri dau tien cua ki tu P la: "+data.indexOf('P'));
   
}
}
