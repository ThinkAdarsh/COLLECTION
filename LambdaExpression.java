package Functional_Interface;

public class LambdaExpression {

    public static void main(String[] args) {

        Lambda d=(a,b)->{
            System.out.println("the addition is :");
            return a+b;
        };

        System.out.println(d.add(10, 30));
    }



}
