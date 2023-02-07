package stringpackage1;
//t.sundar sena reddy
//210303125085
//22 division
public class string6 {
    //EqualsExample
    public static void main(String args[]){
        String s1="sundar";
        String s2="sundar";
        String s3="SUNDAR";
        String s4="python";
        System.out.println(s1.equals(s2));//true because content and case is same
        System.out.println(s1.equals(s3));//false because case is not same
        System.out.println(s1.equals(s4));//false because content is not same
    }
}