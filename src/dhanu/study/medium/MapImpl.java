package dhanu.study.medium;

import java.util.LinkedList;
import java.util.List;

public class MapImpl<K, V> {

    List<List<Entry<K, V>>> entries;
    private static final int CAPACITY = 16;
    int size;

    public MapImpl() {

        entries = new LinkedList<>();
        for (int i = 0; i < CAPACITY; i++) {
            entries.add(new LinkedList<>());
        }
        size = 0;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % entries.size());
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        List<Entry<K, V>> list = entries.get(index);

        for (Entry<K, V> entry : list) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        list.add(new Entry<>(key, value));
        size ++;

        if (size > entries.size() * .75){
            resize();
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        List<Entry<K, V>> list = entries.get(index);
        for (Entry<K, V> entry : list) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void remove(K key){
        int index = getIndex(key);
        for( Entry<K, V> entry : entries.get(index)) {
            if(entry.key .equals(key)) {
                entries.get(index).remove(entry);
                size --;
                return;
            }
        }
    }

    private void resize() {
        List<List<Entry<K, V>>> old = entries;
        entries = new LinkedList<>();
        for (int i = 0; i < CAPACITY * 2; i++) {
            entries.add(new LinkedList<>());
        }
        size = 0;

        for (List<Entry<K, V>> node : old){
            for (Entry<K, V> entry : node){
                put(entry.key, entry.value);
            }
        }

    }

    public static void main(String[] args) {
        MapImpl<String, Integer> map = new MapImpl<>();
        map.put("Developer", 5);
        map.put("Tester", 3);
        map.put("Manager", 1);

        System.out.println(map.get("Developer"));
        System.out.println(map.get("Tester"));
        System.out.println(map.get("Manager"));
    }


    public static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
