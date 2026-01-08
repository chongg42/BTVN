package BTVN_B5;

import java.util.Scanner;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(String id, String name, double price, int quantity) {

        this.id = id;
        this.name = DataCleaner.formatName(name);
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = DataCleaner.formatName(name);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity;
    }

    public static void showInfo(Product[] storage) {
        for (Product product : storage) {
            System.err.println(product);
        }
    }

    public static Product findCheapest(Product[] list) {
        Product priceMin = list[0];
        for (Product product : list) {
            if (product.price < priceMin.price)
                priceMin = product;
        }
        return priceMin;
    }

    public static double calculateTotalValue(Product[] list) {
        double tong = 0;
        for (Product product : list) {
            tong += (product.price * product.quantity);
        }
        return tong;
    }

    public static void update(String id, Product[] list) {
        boolean check = false;
        for (Product product : list) {
            if (product.id.equals(id)) {
                System.out.println("Nhap id sp");
                String idNew = new Scanner(System.in).nextLine();
                product.setId(idNew);
                System.out.println("Nhập ten sp");
                String name = new Scanner(System.in).nextLine();
                product.setName(name);
                System.out.println("Nhập gia sp");
                Double price = new Scanner(System.in).nextDouble();
                product.setPrice(price);
                System.out.println("Nhập so luong sp");
                int quantity = new Scanner(System.in).nextInt();
                product.setQuantity(quantity);
                System.out.println("Cap nhat thong tin thanh cong");
                check = true;
                break;
            }

        }
        if (!check) {
            System.out.println("San pham khong ton tai");
        }
    }

    public static void delete(String id, Product[] list, int count) {
        boolean check = false;
        for (int i = 0; i < count; i++) {
            if (list[i].id.equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    list[j] = list[j + 1];
                }
                check = true;
                count--;
                System.out.println("Xoa san pham thanh cong");
                break;
            }
        }
        if (!check)
            System.out.println("San pham khong ton tai");

    }
    public static void sapXep(Product []list){
        for(int i=0;i<list.length;i++){
            for(int j=i+1;j<list.length;j++){
                if (list[i].price>list[j].price) {
                    Product tg=list[i];
                    list[i]=list[j];
                    list[j]=tg;
                }
            }
        }
        System.out.println("Mang sau khi sap xep la: ");
        showInfo(list);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product[] storage = new Product[100];
        int count = 0;
        int choice;
        do {

            System.out.println("====Menu====");
            System.out.println("Chức năng 1: Thêm sản phẩm mới");
            System.out.println("Chức năng 2: Hiển thị danh sách và Thống kê");
            System.out.println("Chức năng 3: Tìm kiếm sản phẩm rẻ nhất");
            System.out.println("Chức năng 4: Cập nhật số lượng (Sửa)");
            System.out.println("Chức năng 5: Xóa sản phẩm");
            System.out.println("Chức năng 6: Sắp xếp ");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Product pr = new Product();
                    System.out.println("Nhap id sp");
                    String id = sc.nextLine();
                    pr.setId(id);
                    System.out.println("Nhập ten sp");
                    String name = sc.nextLine();
                    pr.setName(name);
                    System.out.println("Nhập gia sp");
                    Double price = sc.nextDouble();
                    pr.setPrice(price);
                    sc.nextLine();
                    System.out.println("Nhập so luong sp");
                    int quantity = sc.nextInt();
                    pr.setQuantity(quantity);
                    sc.nextLine();
                    boolean check = false;
                    if (count > 0) {
                        for (int i = 0; i < count; i++)
                            if (storage[i].getId().equals(pr.getId()))
                                check = true;
                    }

                    if (!check) {
                        if (count == 100) {
                            System.out.println("Da day");
                            break;
                        }
                        storage[count++] = pr;
                        System.out.println("Them thanh cong");
                    } else
                        System.out.println("id da ton tai");

                    break;

                case 2:
                    Product.showInfo(storage);
                    System.out.println("tổng giá trị của toàn bộ kho hàng: " + calculateTotalValue(storage));
                    break;
                case 3:
                    System.out.println("Sản phẩm có giá thấp nhất: " + findCheapest(storage));
                    break;
                case 4:
                    System.out.println("nhap id: ");
                    String idSearch = sc.nextLine();
                    update(idSearch, storage);
                    break;
                case 5:
                    System.out.println("nhap id: ");
                    String idDelete = sc.nextLine();
                    delete(idDelete, storage, count);
                    break;
                case 6:
                    sapXep(storage);
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        } while (choice != 0);
    }
}
