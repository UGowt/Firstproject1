package practice2;

public class UseLaptop {
	public static void main(String[] args) {
		Camera c = new Camera();
		c.setMagaPixel("21mb");
		c.setIsQuality(true);
		Laptop l = new Laptop();
		l.setBrand("dell");
		l.setPrice(45000);
		l.setCamera(c);
		System.out.println("BRAND::" + l.getBrand() + ", PRICE::" + l.getPrice() + ", CMAERAPIXELSIZE::"
				+ l.getCamera().getMagaPixel());
		System.out.println(l.getCamera().getIsQuality());
	}

}
