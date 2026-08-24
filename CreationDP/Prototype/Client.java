package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        
         BirdRegistery registry = new BirdRegistery();

        List<Bird> birds = new ArrayList<>();

        birds.add(new Sparrow());
        birds.add(new Sparrow());
        birds.add(new Peacock());

        List<Bird> birdsClone = new ArrayList<>();

        for(Bird b: birds){
            birdsClone.add(b.cloneBird());
        }
        //set bird copy

        birdsClone.get(0).setColor("White");

        System.out.println("Original Birds");
        for (Bird bird : birds) {
            System.out.println(bird);
        }

        System.out.println();

        System.out.println("Cloned Birds");
        for (Bird bird : birdsClone) {
            System.out.println(bird);
        }
        
    }
}
