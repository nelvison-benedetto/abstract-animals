package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        //AnimalManager manager1 = new AnimalManager();
        
        Animal dog1 = new Dog();  //good practise polymorphic dichiaration
        Animal sparrow1 = new Sparrow();  
        Animal eagle1 = new Eagle();
        Animal dolphin1 = new Dolphin();
        
        dog1.sleep();  //use mthod of father abstract class
        sparrow1.verse();
        eagle1.eat();
        dolphin1.verse();

        Sparrow sparrow2 = (Sparrow) sparrow1;  //downcasting
        AnimalManager.makeItFly((IFlyable)sparrow1);  //(IFlyable)sparrow1 tratta SOLO sparrow come iflyable(ma rimane uno Sparrow!)  
                //IFlyable sparrow2 = (IFlyable) sparrow1;  //CASTING normale, qua ora su sparrow2 puoi solo chiamare i methods of iflyable
         //not obligatory create manager1 x call makeitfly(), thanks to STATIC of the method!!
    }
}
