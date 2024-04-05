package practies;

public class UseLaptop {
	public static void main(String[]args) {
		Camera c = new Camera();
		c.isQuality=true;
		c.magaPixel="21mb";
		
		Laptop l = new Laptop();
		l.brand="dell";
		l.price=20000;
		l.camera=c;
		
		System.out.println("brand::"+l.brand+",PRice::"+l.price+", MEGAPIXEL:"+l.camera.magaPixel+", ISQUALITY::"+l.camera.isQuality);
		
	}

}
