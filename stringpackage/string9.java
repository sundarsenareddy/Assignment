package stringpackage1;
//t.sundar sena reddy
//210303125085
//22 division
public class string9 {
    //StringGetBytesExample
    public static void main(String args[]) {
        String s1 = "ABCDEFG";
        byte[] barr = s1.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.println(barr[i]);
        }
    }
}