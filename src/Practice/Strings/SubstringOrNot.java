package Practice.Strings;

public class SubstringOrNot {
    public static void main(String[] args) {

    }
    static boolean subString(String str1, String str2){
        String newStr = str1+str1;
        char[] arr = newStr.toCharArray();
        if(newStr.contains(str2)){
            return true;
        }
        return false;
    }
}
