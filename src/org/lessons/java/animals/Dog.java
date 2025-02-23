package org.lessons.java.animals;

public class Dog extends AbstractAnimal{
    public Dog(){
        super();
    }

    //abstract class methods
    @Override
    public void verse(){System.out.println("Dog verse Woff Woff.");}
    @Override
    public void eat(){System.out.println("Dog eat Snacks.");}

    //no interfaces, dog can't fly or swim
}
