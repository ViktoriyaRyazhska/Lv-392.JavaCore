package ua.edu.softserve.homework.hw5.task1;

public abstract class Bird {

	private boolean layEggs;
	private boolean feathers;

	public abstract void fly();

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	public boolean isFeathers() {
		return feathers;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

}
