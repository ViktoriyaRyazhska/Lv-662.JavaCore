package hw10.practical2;

public class Plant {
    private int size;
    private Field.Color color;
    private Field.Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        Field.Color c = colorToEnum(color);
        Field.Type t = typeToEnum(type);
        this.size = size;
        this.color = c;
        this.type = t;
    }

    private Field.Color colorToEnum(String color) throws ColorException {
        return switch (color.toLowerCase()) {
            case "red" -> Field.Color.RED;
            case "yellow" -> Field.Color.YELLOW;
            case "green" -> Field.Color.GREEN;
            case "blue" -> Field.Color.BLUE;
            default -> throw new ColorException("Input only red, yellow, green or blue");
        };
    }

    private Field.Type typeToEnum(String type) throws TypeException {
        return switch (type.toLowerCase()) {
            case "fruit" -> Field.Type.FRUIT;
            case "tree" -> Field.Type.TREE;
            case "herb" -> Field.Type.HERB;
            case "flower" -> Field.Type.FLOWER;
            default -> throw new TypeException("Input only fruit, tree, herb, flower");
        };
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
