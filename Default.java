package Functional_Interface;

public interface Default {
    void disp1();

    default void disp2()
    {
        System.out.println("default method....");
    }
}
