package com.util.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap=new HashMap<>();
        hashMap.put(1, "java");
        hashMap.put(15, "css");
        hashMap.put(17, "html");
        hashMap.put(19, "java script");
        hashMap.put(11, "react");
        hashMap.put(14, "angular");
        hashMap.put(9, null);
        hashMap.put(6, null);
        System.out.println(hashMap);
        System.out.println(hashMap.get(90));
        System.out.println(hashMap.get(121));
        System.out.println(hashMap.getOrDefault(102,"java"));
        System.out.println(hashMap.containsKey(1));
        hashMap.values();
        System.out.println();
        Set<Integer> keys= hashMap.keySet();
        for (Integer key:keys){
            System.out.println(key+""+hashMap.get(key));
        }
        System.out.println();
        System.out.println("using entry set");
        Set<Map.Entry<Integer, String>> entries =hashMap.entrySet();
        for (Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}
