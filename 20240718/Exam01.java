
import java.util.AbstractMap;
import java.util.Set;
import java.util.HashSet;

public class Exam01 {
    public static class SimpleMap<K, V> extends AbstractMap<K,V>{
        private Set<Entry<K, V>> entries = new HashSet<>();

        @Override
        public Set<Entry<K, V>> entrySet(){
            return entries;
        }

        @Override
        public V put(K key, V value){
            for(Entry<K, V> entry : entries){
                if(entry.getKey().equals(key)){
                    V oldValue = entry.getValue();
                    entry.setValue(value);
                    return oldValue;
                }
            }
            entries.add(new SimpleEntry<>(key, value));
            return null;
        }
        
        private static class SimpleEntry<K, V> implements Entry<K,V>{
            private K key;
            private V value;

            public SimpleEntry(K key, V value) {
                this.key = key;
                this.value = value;
            }
            @Override
            public K getKey(){
                return key;
            }
            @Override
            public V getValue(){
                return value;
            }
            @Override
            public V setValue(V value){
                V oldValue = this.value;
                this.value = value;
                return oldValue;
            }

        }
        public static void main(String[] args) {
            SimpleMap<String, String> map = new SimpleMap<>();

            map.put("one" , "1");
            map.put("two" , "2");
            map.put("three", "3");

            Set<Entry<String, String>> entrySet = map.entrySet();
            for(Entry<String, String> entry : entrySet){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

    }


}
