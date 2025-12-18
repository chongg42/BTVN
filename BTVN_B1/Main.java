class Car {
    String model;
    double price;

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("VinFast VF8", 1000000000);

        Car car2 = new Car("Toyota Vios", 500000000);

        car1 = car2; 

        car1.model = "Mazda 3";

        System.out.println("Model của car2 là: " + car2.model); 
    }
}
/*
Tại sao khi in car2.model lại ra kết quả là "Mazda 3"?
- car1 và car2 không lưu trữ giá trị của đối tượng mà lưu trữ địa chỉ của đối tượng đó
  nên khi car1=car2 thì car1 sẽ lưu trữ địa chỉ của car2  và khi car1.model = "Mazda 3 thì cũng làm thay đổi giá trị model của car2
Vẽ sơ đồ tư duy (hoặc mô tả bằng lời) sự thay đổi trong vùng nhớ Stack và Heap khi lệnh car1 = car2 được thực thi.
-Stack:chứa car1 lưu trữ địa chỉ của đối tượng có model VinFas(xxx) và car2 lưu trữ địa chỉ của đối tượng có model toyota(yyy)
-Heap:tại địa chỉ xxx là đối tượng có model VinFas, tại yyy là đối tượng có model toyota
+ Khi thực hiện lệnh car1 = car2
    -Giá trị địa chỉ trong car2 được copy và ghi đè vào car1 nên cả 2 đều chứa địa chỉ yyy
+Sau lệnh car1.model = "Mazda 3"
-Chương trình tìm đến địa chỉ yyy trên Heap và sửa tên model tại đó.
*/