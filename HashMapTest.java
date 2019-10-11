import java.util.*;

/**
 * @author: liumch
 * @create: 2019/7/18 15:00
 **/

public class HashMapTest {

    private static void testCompare(){
        TreeMap<String,Integer> keywordMap = new TreeMap<>();
        keywordMap.put("a",1);
        keywordMap.put("f",3);
        keywordMap.put("b",2);
        keywordMap.put("c",6);
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(keywordMap.entrySet());
        Collections.sort(list,
                (Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2)->o2.getValue().compareTo(o1.getValue()));
        list.forEach(v -> System.out.println("k:" + v.getKey() +",v"+v.getValue()));

    }
    public static void main(String[] args) {
        testCompare();
        Map<String,Integer> cntMap = new HashMap<>(10);
        List<String> tags = Arrays.asList("a","b","a","c","a","b","d","c","a");
        tags.stream().forEach(tag->{
            cntMap.putIfAbsent(tag,0);
            cntMap.computeIfPresent(tag,(k,v)->v+1);
        });

        cntMap.forEach((k,v)-> System.out.println("k:" + k + ",v:" + v));
        System.out.println("------------------");
//        Map<String, Integer> mergedMap = new HashMap<>(cntMap);
        Map<String, Integer> toMap = new HashMap<>();
        toMap.put("a",3);
        toMap.put("e",3);
        toMap.forEach((k,v)->cntMap.merge(k,v,(v1,v2)->v1+v2));
        cntMap.forEach((k,v)-> System.out.println("k:" + k + ",v:" + v));


    }
}
