package Functional_Interface;




public class AnnonymusInnerClass {

    public static void main(String[] args) {

        Annonomus obj=new Annonomus() {
            @Override
            public void show() {
                System.out.println("this is done...");
            }
        };
        obj.show();

    }
}
