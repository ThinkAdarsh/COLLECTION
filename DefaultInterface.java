package Functional_Interface;

public class DefaultInterface implements Default{

    @Override
    public void disp1() {
        System.out.println("abstract method...");

    }
    public static void main(String[] args) {
        DefaultInterface ob=new DefaultInterface();
        ob.disp1();
        ob.disp2();



    }


    public void maths(){
    }



}
