package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while( true ) {

			System.out.print( ">> " );
			String expression = scanner.nextLine();

			if( "quit".equals( expression ) ) {
				break;
			}

			String[] tokens = expression.split(" ");


			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			int left, right;
			left=Integer.parseInt(tokens[0]);
			right=Integer.parseInt(tokens[2]);
			

			switch(tokens[1].toString()) {
			case "+" : 
				Add add=new Add();
				add.setValue(left, right);
				System.out.println(">> "+add.calculate()); 
				break;
			case "-" : 
				Sub sub=new Sub();
				sub.setValue(left, right);
				System.out.println(">> "+sub.calculate());
				break;
			case "*" :
				Mul mul=new Mul();
				mul.setValue(left, right);
				System.out.println(">> "+mul.calculate());
				break;
			case "/" :
				Div div=new Div();
				div.setValue(left, right);
				System.out.println(">> "+div.calculate());
				break;
			case "default" : 
				System.out.println("잘못된 입력입니다.");
			}



		}

		scanner.close();

	}

}

