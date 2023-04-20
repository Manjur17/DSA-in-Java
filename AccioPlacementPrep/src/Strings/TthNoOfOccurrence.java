package Strings;

public class TthNoOfOccurrence {
    public static void main(String[] args) {
        // th occurrence of a character in a string
        String res = "Hello how are you. What are you doing?";
        // find the t th occurrence of 'e'
        int t = 5;
        boolean flag = false;
        int lastoccurence=0;
        for(int i=0;i<t;i++){
            lastoccurence = res.indexOf('e',lastoccurence);
            if(lastoccurence==-1)
            {
                flag =true;
                break;
            }
            lastoccurence++;
        }
        if(flag){
            System.out.println(-1);
        }
        System.out.println(lastoccurence-1);
    }
}
