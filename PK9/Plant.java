package hw10;

public class Plant {
public enum Color{Red,Yellow,White}
public enum Type{Short,Medium,Long}
private int size;
Color color;
Type type;

public Plant(int size,String type,String color) throws ColorException ,TypeException{
	Color color1=C(color);
	Type type1=T(type);
	this.size=size;
	this.type=type1;
	this.color=color1;
}


private Color C(String color) throws ColorException{
	switch (color.toLowerCase()) {
	case "red":return Color.Red;
	case "yellow":return Color.Yellow;
	case "white":return Color.White;
	default: throw new ColorException("wrong color");
	}}
	private Type T(String type) throws TypeException{
		switch (type.toLowerCase()) {
		case "medium":return Type.Medium;
		case "short":return Type.Short;
		case "long":return Type.Long;
		default: throw new TypeException("wrong type");
		
		}
		}

	@Override
	public String toString() {
	return "Plant:"+"size="+size+" type="+type+" color="+color; 
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
}


