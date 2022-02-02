package Lecture11;

public class Plant {
	private int size;
	private Color color;
	private Type type;

	public enum Color {
		white, pink, violet
	};

	public enum Type {
		rose, tulip, peony
	}

	public int getSize() {
		return size;
	}

	public Plant(int size, String color, String type) throws ColorException, TypeException {
		Color c = colorStrToEnum(color);
		Type t = typeStrToEnum(type);
		this.color = c;
		this.type = t;
		this.size = size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	private Color colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "pink":
			return Color.pink;
		case "violet":
			return Color.violet;
		case "white":
			return Color.white;
		default:
			throw new ColorException("Input only color pink, violet or white");
		}
	}
	
	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "tulip":
			return Type.tulip;
		case "rose":
			return Type.rose;
		case "peony":
			return Type.peony;
			default:
				throw new TypeException("Input only tulip, rose, or peony");
		}
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	};
	
	public static void main(String[] args) {
		
		try {
			Plant pl = new Plant(7, "white", "peony");
			System.out.println(pl);
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());
		}
		try {
			Plant pl = new Plant(3, "blue", "hydrangea");
			System.out.println(pl);
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());
		}
		try {
			Plant pl = new Plant(15, "violet", "rose");
			System.out.println(pl);
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());
		}
		try {
			Plant pl = new Plant(25, "pink", "tulip");
			System.out.println(pl);
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());
		}
		try {
			Plant pl = new Plant(12, "white", "freesia");
			System.out.println(pl);
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
