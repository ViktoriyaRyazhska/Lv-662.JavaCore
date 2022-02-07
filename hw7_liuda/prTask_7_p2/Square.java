package prTask_7_p2;

public class Square implements Shape{
    private int lengthOfLine;
    private String color;

    public Square(int lengthOfLine, String color){
        this.lengthOfLine = lengthOfLine;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Square has length of line " + lengthOfLine + " and " + color + " color.";
    }
}
