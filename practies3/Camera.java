package practies3;

public class Camera {
	private String megaPixel;
	private boolean isQuality;
	public String getMegaPixel() {
		return megaPixel;
	}
	public void setMegaPixel(String megaPixel) {
		this.megaPixel = megaPixel;
	}
	public boolean isQuality() {
		return isQuality;
	}
	public void setQuality(boolean isQuality) {
		this.isQuality = isQuality;
	}
	public Camera(String megaPixel, boolean isQuality) {
		this.megaPixel = megaPixel;
		this.isQuality = isQuality;
	}
	public String toString() {
		return "Camera ::megaPixel=" + megaPixel + ", isQuality=" + isQuality;
	}
}
