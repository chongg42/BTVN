import java.util.Scanner;

public class Account {
    public static final int SODU=0;
    String ten;
    String STK;
    int soDu;
    public Account(String ten, String STK) {
        this.ten = ten;
        this.STK = STK;
        this.soDu = SODU;
    }
    void napTien(int soTien){
        while (true) {
            if(soTien<=0)
                {
                    System.out.print("So tien khong hop le. Vui long nhap lai");
                    soTien=new Scanner(System.in).nextInt();
                }
            else{
                this.soDu+=soTien;
                System.out.println("Nap thanh cong. So du moi: "+this.soDu);
                break;

            }
        }
    }
    void rutTien(int soTien){
         while (true) {
            if(soTien>this.soDu)
                {
                    System.out.print("So du khong du. Vui long nhap lai");
                    soTien=new Scanner(System.in).nextInt();
                }
            else{
                this.soDu-=soTien;
                System.out.println("Rut thanh cong. So du moi: "+this.soDu);
                break;

            }
        }
    }
    void xuat(){
        System.out.printf("Ho va ten: %s\nSo tai khoan: %s\nSo Du: %d",this.ten,this.STK,this.soDu);
    }
    public static void main(String[] args) {
        Account ac1=new Account("Nguyen Dinh Trong","27062005");
        do {
            System.out.println("Dua ra lua chon: \n 1:Nap tien\n 2:Rut tien\n 3:Xem thong tin\n 4:Thoat");
            int luaChon=new Scanner(System.in).nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhap so tien can nap");
                    int soTien=new Scanner(System.in).nextInt();
                    ac1.napTien(soTien);
                    break;
                case 2:
                    System.out.println("Nhap so tien can rut");
                    int soTienR=new Scanner(System.in).nextInt();
                    ac1.rutTien(soTienR);
                    break;
                case 3:
                    ac1.xuat();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Nhap khong hop le");
                    break;
            }
        } while (true);
    }
}
