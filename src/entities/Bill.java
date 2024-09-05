package entities;

public class Bill {

	public char gender;
	public int beer, barbecue, softDrink;
	
	public static double CERVEJA = 5.0;
	public static double REFRI = 3.0;
	public static double CHURRAS = 7.0;
	
	public  double feeding() {
		return beer * CERVEJA + softDrink * REFRI + barbecue * CHURRAS ;
	}
	
	public double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		}
		else {
			return 4.0;
		}
		
	}
	
	public double ticket() {
		if(gender == 'F') {
			return 8.0;
		}
		else {
			return 10.0;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}
	
}
