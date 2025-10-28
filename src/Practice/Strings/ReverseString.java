package Practice.Strings;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(rev("hello"));
    }
    static String rev(String s){
        if(s.length()<=1){
            return s;
        }
        return rev(s.substring(1) )+ s.charAt(0);
    }
}
