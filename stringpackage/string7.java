package stringpackage1;
//t.sundar sena reddy
//210303125085
//22 division
public class string7 {
    //EqualsIgnoreCaseExample{

    public static void main(String args[]){
        String s1="sundar";
        String s2="sundar";
        String s3="Sundar";
        String s4="python";
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
    }
}

