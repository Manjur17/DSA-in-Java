package OOPS.Generics;

public class PairUse {
    public static void main(String[] args) {
        Pair<String, String> p = new Pair<>("ab", "bc");
        p.setFirst("Def");
        String s = p.getFirst();
        Pair<Integer,String> p1 = new Pair<>(12,"ab");
        Pair<Character,Character> p2 = new Pair<>('a','o');
        Pair<Integer,Integer> p3 = new Pair<>(11,12);
        int a = 10,b= 23,c =77;
        Pair<Integer,Integer> integerPair = new Pair<>(a,b);

        Pair<Pair<Integer,Integer>,Integer> p4 = new Pair<>(integerPair,c);
        System.out.println(p4.getSecond());
        System.out.println(p4.getFirst().getFirst());
        System.out.println(p4.getFirst().getSecond());

    }
}
