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

			switch(tokens[1].toString()) {
			case "+" : 
				Add add=new Add();
				add.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				System.out.println(">> "+add.calculate()); 
				break;
			case "-" : 
				Sub sub=new Sub();
				sub.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				System.out.println(">> "+sub.calculate());
				break;
			case "*" :
				Mul mul=new Mul();
				mul.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				System.out.println(">> "+mul.calculate());
				break;
			case "/" :
				Div div=new Div();
				div.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				System.out.println(">> "+div.calculate());
				break;
			case "default" : 
				System.out.println("잘못된 입력입니다.");
			}



		}

		scanner.close();

	}

}

