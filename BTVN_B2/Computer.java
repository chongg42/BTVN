public class Computer {
  public static int totalComputersCreated = 0;

    String name;
    public Computer(String name) {
        this.name = name;
        totalComputersCreated++;
    }
    public static void changeDeviceName(Computer computer, String newName) {
        computer.name = newName;
    }
    public static void main(String[] args) {

        Computer c1 = new Computer("Laptop Dell");
        Computer c2 = new Computer("PC Asus");
        System.out.println("Tên ban đầu c1: " + c1.name);
        changeDeviceName(c1, "Laptop MacBook");
        System.out.println("Tên sau khi đổi c1: " + c1.name);

        System.out.println("Tổng số Computer đã tạo: " + Computer.totalComputersCreated);
}}
/*
đối tượng được truyền vào hàm dưới dạng tham chiếu.
Biến computer trong hàm trỏ tới cùng vùng nhớ với c1 nên khi thay đổi thuộc tính cuả obj gốc cũng thay đổi */