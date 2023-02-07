package stringpackage1;
//t.sundar sena reddy
//210303125085
//22 division
public class string8 {
    // FormatExample
    public static void main(String args[]){
        String name="sundar";
        String sf1=String.format("name is %s",name);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }
}
