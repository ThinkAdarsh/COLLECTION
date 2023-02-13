package List_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenNumber {

    public static void main(String[] args) {

        List<Integer> num= new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);

        for (Number number:num
             ) {
            System.out.println(number);
        }

        Iterator itr= num.iterator();

        System.out.println("even numbers are=====");
        while (itr.hasNext())
        {
            Integer even=(Integer) itr.next();
            if (even%2==0)
            {
                System.out.println(even);
            }
            else {
                itr.remove();
            }
        }
    }
}
