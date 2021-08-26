package Hash;

import java.util.ArrayList;

public class HashMap {
    ArrayList<Data> bucket[];
    int size=1000;
    public HashMap(){
        bucket=new ArrayList[size];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i]=new ArrayList<>();
        }
    }
    public int hashFunction(int key){
        int hashValue=key%1000;
        return hashValue;
    }
    public void put(int key,int value){
        int hashValueIndex=hashFunction(key);
        ArrayList<Data> myBucket=bucket[hashValueIndex];
        Data newData=new Data(key,value);
        int keyIndex=myBucket.indexOf(newData);
        if (keyIndex>=0) {
            myBucket.get(keyIndex).value=value;
            
        }else{myBucket.add(newData);}
    }
    public void remove(int key){
        int hashValueIndex=hashFunction(key);
        ArrayList<Data> myBucket=bucket[hashValueIndex];
        Data newData=new Data(key,1);
        int keyIndex=myBucket.indexOf(newData);
        if (keyIndex>=0) {
            myBucket.remove(keyIndex);
        }
    }
    public int get(int key){
        int hashValueIndex=hashFunction(key);
        ArrayList<Data> myBucket=bucket[hashValueIndex];
        Data newData=new Data(key,1);
        int keyIndex=myBucket.indexOf(newData);
        return keyIndex+1;
    }
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(1, 1);
        map.put(2, 2);
        map.put(1, 2);
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}
