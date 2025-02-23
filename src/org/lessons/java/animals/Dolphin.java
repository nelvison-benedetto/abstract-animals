package org.lessons.java.animals;

public class Dolphin extends AbstractAnimal implements ISwimmable{
    public Dolphin(){
        super();
    }
    
    //abbstract class methods
    @Override
    public void verse(){System.out.println("Dolphin verse Quaw Quaw.");}
    @Override
    public void eat(){System.out.println("Dolphin eat.");}

    //interface methods
    @Override
    public void swim(){
        System.out.println("Dolphin is swimming.");
    }
}
