public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    public void calculateNetSalary(double grossSalary) {
        if (grossSalary < 0) {
            System.out.println("Lương không được là số âm!");
            return; 
        }

        double taxRate = 0;
        double taxAmount;

        if (grossSalary > 20_000_000) {
            taxRate = 0.20;
        } else if (grossSalary >= 10_000_000) {
            taxRate = 0.10;
        } else {
            taxRate = 0.0;
        }

        taxAmount = grossSalary * taxRate;

        grossSalary -= taxAmount; 
        System.out.println("===== BẢNG LƯƠNG =====");
        System.out.println("Nhân viên: " + name);
        System.out.println("Lương gộp: " + (grossSalary + taxAmount));
        System.out.println("Thuế phải đóng: " + taxAmount);
        System.out.println("Lương thực nhận: " + grossSalary);
    }

    public static void main(String[] args) {

        Employee emp = new Employee("Nguyễn Văn A");
        emp.calculateNetSalary(25_000_000);
    }
}
