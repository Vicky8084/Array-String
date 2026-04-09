package OwnHashMap;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K , V> { //here K and V are generic type
    private List<MapNode<K,V>> bucket; //this one is the bucket where we can store key and values in the form of linkedlist
    private int capacity;  //this will be the initial capacity of bucket
    private int size; //this is the size which means how many pairs are in the bucket
    private final int INITIAL_CAPACITY = 5; //here I have fixed the initial capacity which is unchangeable to increase and decrease the size of map
    public MyHashMap(){
        bucket=new ArrayList<>();
        capacity=INITIAL_CAPACITY;
        for(int i=0;i<capacity;i++){
            bucket.add(null);
        }
    }
    private int getBucketIndex(K key){
        int hashCode=key.hashCode();
        return hashCode % capacity;
    }

    public V get(K key){
        int bucketIndex=getBucketIndex(key);
        MapNode<K, V> head=bucket.get(bucketIndex);
        while (head!=null){
            if(head.key.equals(key)) {
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    public void put(K key, V value){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head=bucket.get(bucketIndex);
        while (head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
        size++;
         MapNode<K,V> newEntry=new MapNode<K,V>(key,value);
         head=bucket.get(bucketIndex);
         newEntry.next=head;
         bucket.set(bucketIndex,newEntry);

         double loadFactor=(1.0*size)/capacity;
        System.out.println("Inserting Key :- "+key);
        System.out.println("LoadFactor :- "+loadFactor);
        if(loadFactor>0.7){
            rehash();
        }

    }
    private void rehash(){
        System.out.println("Rehashing Buckets");
        List<MapNode<K,V>> temp=bucket;
        bucket=new ArrayList<>();
        capacity *=2;
        for(int i=0;i<capacity;i++){
            bucket.add(null);
        }
        size=0;
        for(int i=0;i<temp.size();i++){
            MapNode<K,V> head=temp.get(i);
            while (head!=null){
                put(head.key,head.value);
                head=head.next;
            }
        }
    }
    public void remove(K key){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head=bucket.get(bucketIndex);
        MapNode<K,V> prev=null;
        while (head!=null){
            if(head.key.equals(key)){
                if(prev==null){
                    bucket.set(bucketIndex,head.next);
                }else{
                    prev.next=head.next;
                }
                head.next=null;
                size--;
                break;
            }
            prev=head;
            head=head.next;
        }
    }

    private static class MapNode<K ,V>{
        K key;
        V value;
        MapNode<K, V> next;
        public MapNode(K key, V value){
            this.key=key;
            this.value=value;
        }

    }


}
