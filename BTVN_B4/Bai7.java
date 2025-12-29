public class Bai7 {
    public static void main(String[] args) {
        String s1="t3h";
        String s2=new String("t3h");
        if (s1==s2) 
            System.out.println("Day la so sanh =");
        if(s1.equals(s2)) System.out.println("Day la so sanh equal");
        if ("JAVA".equalsIgnoreCase("java")) {
            System.out.println("Thực hiện so sánh không phân biệt hoa thường giữa \"JAVA\" và \"java\"");
        }
        
    }
}
//== so sánh tham chiesu còn equal so sanh gia tri