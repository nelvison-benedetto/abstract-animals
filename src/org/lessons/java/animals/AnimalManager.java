package org.lessons.java.animals;

public class AnimalManager {  //recommended to always use a manager to manage interfaces!
    public static void makeItFly(IFlyable animal){
        animal.fly();
    }
    public static void makeItSwim(ISwimmable animal){
        animal.swim();
    }
}
