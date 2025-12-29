    public class Bai10 {
        public static void main(String[] args) {
            String s="";
            for(int i=1;i<=10000;i++)
                s+='A';
            System.out.println(s);

            StringBuilder sb=new StringBuilder(" ");
             for(int i=1;i<=10000;i++)
                sb.append("A");
        }
}
// String chỉ tạo nội dung lúc khởi tạo và không thể thay đổi được.khi nối A vào chuỗi thì sẽ tạo ra 1 đối tượng khác