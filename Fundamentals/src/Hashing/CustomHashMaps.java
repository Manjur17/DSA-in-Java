package Hashing;

import java.util.ArrayList;

public class CustomHashMaps<K, V> {
    ArrayList<MapNode<K, V>> buckets;
    int countSize = 0;
    int numBuckets;

    //Creating a bucket array of default size numBuckets
    public CustomHashMaps() {
        buckets = new ArrayList<>();
        numBuckets = 5;
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hc = key.hashCode();
        return hc % numBuckets;
    }

    //Insert in hashmap
    public void insert(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        //Element is already there.Just update the value
        while (head != null) {
            if (head.key.equals(key)) {
                //just update the value and return
                head.value = value;
                return;
            }
            head = head.next;
        }
        //Inserting at first position
        head = buckets.get(bucketIndex);
        MapNode<K, V> newNode = new MapNode<>(key, value);
        newNode.next = head;
        buckets.set(bucketIndex, newNode);
        countSize++;
        double loadFactor = (1.0 * countSize)/numBuckets;
        if (loadFactor > 0.7){
            reHash();
        }
    }

    private void reHash() {
        ArrayList<MapNode<K,V>> temp = buckets;
        buckets = new ArrayList<>();
        numBuckets = numBuckets*2;
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
        }
        countSize = 0;
        for (MapNode<K, V> head : temp) {
            //Traverse over the original array and add it to newly arraylist
            while (head != null) {
//                K key = head.key;
//                V val = head.value;
                insert(head.key, head.value);
                head = head.next;
            }
        }
    }

    //get size
    public int size(){
        return countSize;
    }
    //get value
    public V get(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    //delete
    public V remove(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev != null){
                    prev.next = head.next;
                }else {
                    buckets.set(bucketIndex,head.next);
                }
            }
            prev =head;
            head = head.next;
        }
        return null;
    }
    public double loadFactor(){
        return  (1.0 * countSize)/numBuckets;
    }
}
