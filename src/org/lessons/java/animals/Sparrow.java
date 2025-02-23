package org.lessons.java.animals;

public class Sparrow extends Animal implements IFlyable{
    public Sparrow(){
        super();
    }
    
    //abstract class methods
    @Override
    public void verse(){System.out.println("Sparrow verse Cra Cra.");}
    @Override
    public void eat(){System.out.println("Sparrow eat worms.");}

    //interface methods
    @Override
    public void fly(){
        System.out.println("Sparrow is flying.");
    }
}
