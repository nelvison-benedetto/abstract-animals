package org.lessons.java.animals;

public abstract class AbstractAnimal {   //name abstract class as AbstractXXX !
    public AbstractAnimal(){
        System.out.println("New animal created!");
    }

    public void sleep(){ System.out.println("Zzz...");};  //method common to all children classes
    public abstract void verse();  //public!
    public abstract void eat();
    
}
