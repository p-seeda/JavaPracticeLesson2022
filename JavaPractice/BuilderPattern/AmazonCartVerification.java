package BuilderPattern;

public class AmazonCartVerification {

	public static void main(String[] args) {
Amazoncart amz = new Amazoncart();
amz.search("eye glass").search("eye glass", "red", 103.46, 'M').doPayment("M-35332", 788);
	}

}
