package OOPS.Generics;

public class Pair<T,V> {
    private T first;
    private V second;
    public  Pair(T first,V second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return this.first;
    }
    public void setFirst(T first){
        this.first = first;
    }
    public V getSecond(){
        return this.second;
    }
    public void  setSecond(V second){
        this.second = second;
    }
}
