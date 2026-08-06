package Prototype.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    
        NotebookRegistry registry = new NotebookRegistry();

        registry.addPrototype(
                "A4-120-R",
                new Notebook("A4", 120, "Ruled",
                        "Blue Cover", "Hard Back", 80));

        registry.addPrototype(
                "A4-240-R",
                new Notebook("A4", 240, "Ruled",
                        "Green Cover", "Hard Back", 100));

        registry.addPrototype(
                "A3-180-U",
                new Notebook("A3", 180, "Unruled",
                        "Black Cover", "Soft Back", 100));

        List<Notebook> books = new ArrayList<>();

        // 100 copies of first notebook
        for (int i = 0; i < 100; i++) {
            books.add(registry.getClone("A4-120-R"));
        }

        // 50 copies of second notebook
        for (int i = 0; i < 50; i++) {
            books.add(registry.getClone("A4-240-R"));
        }

        // 100 copies of third notebook
        for (int i = 0; i < 100; i++) {
            books.add(registry.getClone("A3-180-U"));
        }

        System.out.println("Total notebooks = " + books.size());

        System.out.println(books.get(0));
        System.out.println(books.get(120));
        System.out.println(books.get(200));

    }

}
