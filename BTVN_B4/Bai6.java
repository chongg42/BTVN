public class Bai6 {
public static void main(String[] args) {
 String sentence = "Học viện công nghệ thông tin T3H";
 int index=sentence.indexOf("T3H");
 System.out.println("vi tri cua tu T3H la: "+index);
 System.out.println(sentence.substring(index,index+3));
 System.out.println("Ki tu tai vi tri t5: "+ sentence.charAt(5));
}
}
