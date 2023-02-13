package Set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Basic_set {
    public static void main(String[] args) {

        Integer [] a= {1,2,3,4,5};
        Integer [] b= {10,20,4,1,50};

        Set<Integer> set1=new HashSet<>();
        set1.addAll(Arrays.asList(a));

        Set<Integer> set2=new HashSet<>();
        set2.addAll(Arrays.asList(b));

        Set<Integer> union=new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        Set<Integer> intersection= new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        Set<Integer> difference=new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);

    }
}
