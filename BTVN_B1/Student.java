import java.util.Scanner;

public class Student {
    String MSV;
    String ten;
    float diemToan;
    float diemVan;
    void xuat(){
        System.out.println(this.MSV+'\n'+this.ten+'\n'+this.diemToan+'\n'+this.diemVan);
    }
    void nhapThongTin(){
        System.out.print("Nhap ma sinh vien: ");
        this.MSV=new Scanner(System.in).nextLine();
        System.out.print("Nhap ten:");
        this.ten=new Scanner(System.in).nextLine();
        System.out.print("Nhap diem toan: ");
        this.diemToan=new Scanner(System.in).nextFloat();
        System.out.print("Nhap diem van: ");
        this.diemVan=new Scanner(System.in).nextFloat();
    }
    float tinhDiemTrungBinh(){
        return (this.diemToan+this.diemVan)/2;
    }
    void xepLoai(){
        float diemTB=this.tinhDiemTrungBinh();
        if(diemTB>=8)
            System.out.println("Giỏi");
        else if(diemTB>=6.5)
            System.out.println("Khá");
        else System.out.println("Trung Bình");
    }
public static void main(String[] args) {
    Student st1=new Student();
    st1.nhapThongTin();
    Student st2=new Student();
    st2.nhapThongTin();

    if(st1.tinhDiemTrungBinh()>st2.tinhDiemTrungBinh())
    st1.xuat();
    else
    st2.xuat();
}
}




