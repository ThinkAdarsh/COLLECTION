package Map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basic_map {

    public static void main(String[] args) {

        Map<String, Integer> values=new HashMap<String, Integer>();
        values.put("aj", 1);
        values.put("dj", 2);
        values.put("rj", 3);
        values.put("pj", 4);
        values.put(null, 8);

        System.out.println(values);

        //keyset
        Set<String> str=values.keySet();
        for (String s: str
             ) {
            System.out.println(s+" : "+values.get(s));
        }

        //entryset method
        System.out.println("map entryset");
        Set<Map.Entry<String, Integer>> entrySet=values.entrySet();
        for (Map.Entry<String, Integer> e: entrySet
             ) {
            System.out.println(e.getKey()+"  "+e.getValue());
        }

        //containskey
        if(values.containsKey("aj"))
        {
            System.out.println("available");
        }
        else {
            System.out.println("unavailable");
        }

        //containsvalue
        if(values.containsValue(1))
        {
            System.out.println("value is present");
        }
        else {
            System.out.println("value is not available");
        }

        //isEmpty
        if(values.isEmpty())
        {
            values.put("tj", 5);
        }
        else{
            System.out.println("it is not empty");
        }

        //Replace
        values.replace("aj", 7);
        System.out.println(values);

        //size
        System.out.println(values.size());

        //merge
        values.merge("lj", 6,(oldvalue, newvalue)->oldvalue+newvalue);
        System.out.println(values);

        //remove
        values.remove("lj");
        System.out.println(values);


    }
}
