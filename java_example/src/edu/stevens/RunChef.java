package edu.stevens;


class Chef{

    public String name;
    public int age;

    public Chef(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeChicken(){
        System.out.println("The chef makes chicken");
    }

    public void makeSalad(){
        System.out.println("The chef makes salad");
    }

    public void makeSpecialDish(){
        System.out.println("The chef makes a special dish");
    }


}

class ItalianChef {
    public static  String countryOfOrigin = "The US";
    public void makeSomethingSpecial() {
        System.out.println(countryOfOrigin + "the inner class can do");
    }
}

//class ItalianChef extends Chef{
//
//    public String countryOfOrigin;
//
//    public ItalianChef(String name, int age, String countryOfOrigin){
//        super(name, age);
//        this.countryOfOrigin = countryOfOrigin;
//    }
//
//    public void makePasta(){
//        System.out.println("The chef makes pasta");
//    }
//
//    @Override
//    public void makeSpecialDish(){
//        System.out.println("The chef makes chicken parm");
//    }
//
//}

public class RunChef {
    public static void main(String[] args) {

//        Chef myChef = new Chef();
//        myChef.makeChicken();
//        myChef.makeSpecialDish();

//        ItalianChef myItalianChef= new ItalianChef();
//        myItalianChef.makeChicken();
//        myItalianChef.makeSpecialDish();

        Chef myChef = new Chef("Gordon Ramsay", 50);
        myChef.makeChicken();

//        ItalianChef myItalianChef = new ItalianChef("Massimo Bottura", 55, "Italy");
//        myItalianChef.makeChicken();
//        System.out.println(myItalianChef.age);
    }
}






