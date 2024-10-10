package com.homework2;

import java.util.Map;
import java.util.ArrayList;

public class SeparateChainingHashTable {

    public static class HashTable<K, V> {
        static class Node<K, V> implements Map.Entry<K, V> {
            K key;
            V value;
          

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

            @Override
            public K getKey() {
                return key;
            }

            @Override
            public V getValue() {
                return value;
            }

            @Override
            public V setValue(V value) {
                V oldValue = this.value;
                this.value = value;

                return oldValue;
            }

            @Override
            public String toString(){
                return "(" + this.key + ", " + this.value + ")";
            }
        }

        private ArrayList<ArrayList<Node<K,V>>> table;
        private int size;

        public HashTable(int capacity){
            table = new ArrayList<>(capacity);
            for(int i = 0; i < capacity; i++){
                table.add(new ArrayList<>());
            }
            size = 0;
        }

        private int hash(K key){
            return (key.hashCode() & 0x7fffffff) % table.size();
        }

        public V put(K key, V value){
            int index = hash(key);
            ArrayList<Node<K,V>> bucket = table.get(index);
            for(Node<K,V> node : bucket){
                if(node.getKey().equals(key)){
                    return node.setValue(value);
                }
            }
            bucket.add(new Node<>(key, value));
            size++;
            return null;
        }


        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();

        
            for (int i = 0; i < table.size(); i++) {
                stringBuilder.append(i);
                stringBuilder.append(" : ");
                stringBuilder.append(table.get(i));
                stringBuilder.append("\n");
            }
            if(stringBuilder.length() > 0) {
                stringBuilder.setLength(stringBuilder.length() - 2);
            }
      
            return stringBuilder.toString();


        }
    }
    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>(7);

        hashTable.put("January", "1월");
        hashTable.put("February", "2월");
        hashTable.put("March", "3월");
        hashTable.put("April", "4월");
        hashTable.put("May", "5월");
        hashTable.put("June", "6월");
        hashTable.put("July", "7월");
        hashTable.put("August", "8월");
        hashTable.put("September", "9월");
        hashTable.put("October", "10월");
        hashTable.put("November", "11월");
        hashTable.put("December", "12월");

        System.out.println(hashTable);
    }
}
