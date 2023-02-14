package Custom_Exception;


import Optional_Class.Basic_optional;

import java.util.Optional;

public class ArrayClass {

    public static void main(String[] args) throws NumberCheckingException {
        int[] a ={1,2,3,4,5};
        int i;

        for(i=a.length; i>=0; i--)
        {
            try {
                System.out.println(a[i]+" ");


            }
            catch (Exception e){
                throw new NumberCheckingException("kindly check the array index");
            }


        }


    }

}
