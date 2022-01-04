package hw3;

public enum DayOfWeek {

	MONDAY("Понеділок", "Monday", "Lunas"), 
	TUESDAY("Вівторок", "Tuesday", "Martes"), 
	WEDNESDAY("Середа", "Wednesday", "Miércoles"), 
	THURSDAY("Четвер", "Thursday", "Jueves"), 
	FRIDAY("П'ятниця", "Friday", "Viernes"), 
	SATURDAY("Субота", "Saturday", "Sábado"), 
	SUNDAY("Неділя", "Sunday", "Domingo");
	
	private final String ua;
	private final String en;
	private final String es;

	private DayOfWeek(String ua, String en, String es) {
		this.ua = ua;
		this.en = en;
		this.es = es;
	}

	public String getUa() {
		return ua;
	}

	public String getEn() {
		return en;
	}

	public String getEs() {
		return es;
	}
	
}
