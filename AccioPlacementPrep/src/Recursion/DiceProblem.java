package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
//        int face = s.nextInt();
        diceProblem("",target);
//        System.out.print("\n" + diceProblemReturn("",target));
//        System.out.println();
//        diceProblemFace("",target,face);
    }
    public static void diceProblem(String ans,int target){
        if (target == 0){
            System.out.print(ans + "  ");
            return;
        }
        for (int i = 1; i <=6 && i <= target ; i++) {
            diceProblem(ans+i,target-i);
        }
    }
    public static ArrayList<String> diceProblemReturn(String ans, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <=6 && i <= target ; i++) {
            list.addAll(diceProblemReturn(ans+i,target-i));
        }
        return list;
    }
    //For Dice with custom number of faces
    public static void diceProblemFace(String ans,int target,int face){
        if (target == 0){
            System.out.print(ans + "  ");
            return;
        }
        for (int i = 1; i <=face && i <= target ; i++) {
            diceProblemFace(ans+i,target-i,face);
        }
    }
}
