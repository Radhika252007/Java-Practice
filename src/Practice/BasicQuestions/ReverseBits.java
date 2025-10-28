package Practice.BasicQuestions;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits((byte)01010101));
    }
    public static byte reverseBits(byte b){
        byte res = 0;
        for(int i=0;i<8;i++){
            res = (byte)((res<<1)|(b&1));
            b = (byte)(b>>1);
        }
        return res;
    }
}
