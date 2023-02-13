package List_Interface;

import STREAM_API.users;

import java.util.*;
import java.util.stream.Collectors;

public class Basic_ArrayList {

    public static void main(String[] args) {

        List obj1= new ArrayList();
        obj1.add("arrow");
        obj1.add("ball");
        obj1.add("cat");
        obj1.add(0, 11);

        //System.out.println(obj1);
        Iterator itr= obj1.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //size method
        System.out.println("the size of arrayList is =="+obj1.size());

        //index of
        int s= obj1.indexOf("ball");
        System.out.println(s);

        //get method
        Object o= obj1.get(1);
        System.out.println(o);

        //lastIndexOf
        Object o6=obj1.lastIndexOf("cat");
        System.out.println(o6);

        //is empty method
        List obj2=new ArrayList();
        //
        if(obj2.isEmpty())
        {
            obj2.add("new element");
        }
        else {
            System.out.println("list is not empty");
        }

        for (Object ob:obj2) {
            System.out.println(ob);
        }


        //list to set
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set=new HashSet<>(list);
        System.out.println(set);


        //list to map
        List<users> usersList=new ArrayList<>();
        usersList.add(new users("dutdl", 77, "bbs", 565657));
        usersList.add(new users("ddl", 66, "ctc", 165657));

        Map map= usersList.stream().collect(Collectors.toMap(users::getName, users::getId, (a,b)->a));
        System.out.println(map);


        //List to queue
        List<String> stringList=new LinkedList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("cc");

        Queue<String> queue=new ArrayDeque<>(stringList)
        {
        };
        System.out.println(queue);


        //stack
        Stack<Integer> list1= new Stack<>();
        list1.push(1);
        list1.push(2);
        list1.push(33);

        System.out.println(list1);

        Iterator itr1= list1.iterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

        System.out.println("the peak element is  ="+list1.peek());

        System.out.println("after deleting the peek element");
        list1.pop();
        System.out.println(list1);







    }


}
