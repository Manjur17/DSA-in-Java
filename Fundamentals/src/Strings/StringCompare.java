package Strings;

public class StringCompare {
    public static void main(String[] args) {
        //Approach 1- by equals() method
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";
        String s5="SACHIN";
        System.out.println(s1.equals(s5));//false
        System.out.println(s1.equalsIgnoreCase(s5));//true
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //false

        //Approach 2-  by == operator
        System.out.println(s1==s2); //true (because both refer to same instance)
        System.out.println(s1==s3); //false(because s3 refers to instance created in nonpool)

        //Approach 3- by compareTo() method
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//0
        System.out.println(s3.compareTo(s4));//-18(because s3 < s4 )
        System.out.println(s4.compareTo(s3));// 18(because s4 > s3 )
    }
}
