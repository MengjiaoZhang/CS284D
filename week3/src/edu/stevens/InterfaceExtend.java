package edu.stevens;

interface A1{
    void showA1();
}
interface B1{
    void showB1();
}
interface C1{
    void showC1();
}
interface D extends A1,B1,C1{
    void showD();
}
public class InterfaceExtend implements D{
    public static void main(String[] args){
        InterfaceExtend st = new InterfaceExtend();
        st.showA1();
        st.showB1();
        st.showC1();
        st.showD();
    }
    public void showA1() {
        System.out.println("Interface A");
    }

    public void showB1() {
        System.out.println("Interface B");
    }

    public void showC1() {
        System.out.println("Interface C");
    }

    public void showD() {
        System.out.println("Interface D");
    }
}