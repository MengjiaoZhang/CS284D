package edu.stevens;

interface A{
        void showA();
        }
interface B{
    void showB();
}
interface C{
    void showC();
}
public class MultipleInterfaceImplement implements A, B, C{
    public static void main(String[] args){
        MultipleInterfaceImplement st = new MultipleInterfaceImplement();
        st.showA();
        st.showB();
        st.showC();
    }

    public void showA() {
        System.out.println("Interface A");
    }

    public void showB() {
        System.out.println("Interface B");
    }

    public void showC() {
        System.out.println("Interface C");
    }
}
