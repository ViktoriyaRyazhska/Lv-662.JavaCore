package hw10.practice_2;

public class Plant {
	
	private int size;
	private Color color;
	private Type type;
	
	public Plant(int size, String color, String type) throws ColorException, TypeException {
		this.size = size;
		this.color = colorStrToEnum(color);
		this.type = typeStrToEnum(type);
	}

	private Color colorStrToEnum(String color) throws ColorException {
		for (Color c : Color.values()) {
			if (color.toUpperCase().equals(c.toString())) return c;
		}
		throw new ColorException("Invalid color. Use rainbow colors only.");
	}
	
	private Type typeStrToEnum(String type) throws TypeException {
		for (Type t : Type.values()) {
			if (type.toUpperCase().equals(t.toString())) return t;
		}
		throw new TypeException("Invalid type. Allowed types are: DAISY, ORCHID, TULIP, ROSE and GLADIOLUS.");
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}
}
