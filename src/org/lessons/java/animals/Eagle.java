package org.lessons.java.animals;

public class Eagle extends Animal implements IFlyable{
    public Eagle(){
        super();
    }
    
    //abstract class methods
    @Override
    public void verse(){System.out.println("Eagle verse Heek Heek.");}
    @Override
    public void eat(){System.out.println("Eagle eat.");}

    //interface classes
    @Override
    public void fly(){
        System.out.println("Eagle is flying.");
    }
}
