package prob03;

public class CurrencyConverter {
	private static double rate;
	
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKRW(double dollar) {
		return rate*dollar;
	}
	public static void setRate(double rate) {
		CurrencyConverter.rate=rate;			//클래스 이름으로 접근해야함
	}
	
}
