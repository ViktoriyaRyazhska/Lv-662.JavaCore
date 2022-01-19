package Schema;

public class Boat extends WaterVehicle {

	private int volume = 585;

	public Boat() {

	}

	@Override
	public void isSailing() {

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Boat [volume=" + volume + "]";
	}

}
