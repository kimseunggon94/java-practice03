package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] g= new Goods[3];
		for(int i=0;i<COUNT_GOODS;i++) {
			String info=scanner.nextLine();
			String[] data = info.split(" ");
			
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			int amount = Integer.parseInt(data[2]);
			g[i]= new Goods(name, price, amount);
		}
		
		for(int j=0;j<g.length;j++) {
			g[j].report();
		}



		scanner.close();
	}
}