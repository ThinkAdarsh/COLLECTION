package Optional_Class;

import java.util.Optional;

public class BasicOptional {


    public Optional<String> name()
    {
        return Optional.of("adarsh");
    }

    public Optional<Integer> number()
    {
        Integer i= null;
        return Optional.ofNullable(i);
    }

    public static void main(String[] args) {

        BasicOptional obj=new BasicOptional();


        String s=null;
        Optional<String> str= Optional.ofNullable(s);

        if(str.isPresent())
        {
            System.out.println("value is present");
        }
        else {
            System.out.println("not present");
        }


        Optional<String> ob= obj.name();
        System.out.println(ob.get());

        Optional<Integer> opt=obj.number();
        System.out.println(opt.orElse(2));


    }



}
