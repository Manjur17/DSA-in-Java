package Strings;

public class StringBufferBasics {
        public static void main(String args[]){
            StringBuffer sb=new StringBuffer("Hello");
            sb.append("Java");//now original string is changed
            System.out.println(sb);//prints HelloJava
            sb.setCharAt(0,'d');
            System.out.println(sb);
            sb.insert(1,"Java");//now original string is changed
            System.out.println(sb);//prints HJavaelloJava
            sb.replace(1,3,"Java");
            System.out.println(sb);//prints HJavavaelloJava
            sb.delete(1,3);
            System.out.println(sb);//prints HvavaelloJava
        }
}
