package gov.adlnet.xapi.model;

public class Score {
	public float getScaled() {
		return scaled;
	}
	public void setScaled(float scaled) {
		this.scaled = scaled;
	}
	public float getRaw() {
		return raw;
	}
	public void setRaw(float raw) {
		this.raw = raw;
	}
	public float getMin() {
		return min;
	}
	public void setMin(float min) {
		this.min = min;
	}
	public float getMax() {
		return max;
	}
	public void setMax(float max) {
		this.max = max;
	}
	private float scaled;
	private float raw;
	private float min;
	private float max;
}