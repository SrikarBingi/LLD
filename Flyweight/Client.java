package Flyweight;

public class Client {
    public static void main(String[] args) {

        TreeType mango =
            TreeRegistry.getTreeType(
                "Mango",
                "Green",
                "MangoTexture"
            );

        Tree tree1 = new Tree(10, 20, mango);
        Tree tree2 = new Tree(50, 80, mango);
        Tree tree3 = new Tree(100, 200, mango);

        tree1.draw();
        tree2.draw();
        tree3.draw();
    }
}
