package datastructure.collection.set.map;

import java.util.*;

public class MapMain1 {
    public MapMain1() {
    }

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<String, Integer>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println("studentMap = " + studentMap); //순서 보장 안함

        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        System.out.println("keySet() 활용");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
    }
}
