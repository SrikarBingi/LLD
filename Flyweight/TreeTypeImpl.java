package Flyweight;

public class TreeTypeImpl implements TreeType{
    private String name;
    private String color;
    private String texture;

    public TreeTypeImpl(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(
            "Tree: " + name +
            ", Color: " + color +
            ", Texture: " + texture +
            ", Position: (" + x + ", " + y + ")"
        );
    }
}
