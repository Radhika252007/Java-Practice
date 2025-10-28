package Practice.BasicQuestions;

public class leapYear {
    public static void main(String[] args) {
        int year = 2014;
        boolean res = ((year%4==0 && year%100!=0) || (year%400==0));
        System.out.println(res);
    }
}
