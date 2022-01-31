package lesson_11.ClassWork;

import java.util.Locale;

public class Plant {
    private int size;
    Color color;
    Type type;

    public enum Color {
        Red, Yellow, White
    }

    private Color ColorToEnum (String color) throws ColorException{
        switch (color.toLowerCase()) {
            case "red" : return Color.Red;
            case "yellow" : return Color.Yellow;
            case "white" : return Color.White;
            default: throw new ColorException ("There are next values: Red, Yellow, White");
        }
    }

    public enum Type {
        Short, Medium, Long
    }

  private Type TypeToEnum (String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "short" : return Type.Short;
            case "medium" : return Type.Medium;
            case "long" : return Type.Long;
            default:throw new TypeException("There are next values: Short, Medium, Long");
        }
  }

    public Plant(String color, String type, int size) throws ColorException, TypeException{
        Color color1 = ColorToEnum(color);
        Type type1 = TypeToEnum(type);
        this.color = color1;
        this.type = type1;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Plant:" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type;
    }

    public int getSize() {
        return size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
