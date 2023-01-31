import java.util.Scanner;

public class CurrencyExchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose  one from the following option");
		System.out.println("1) USD to {");
		System.out.println("2) { to USD ");
		System.out.println("3) { to USD ");
		int exchange = sc.nextInt();
		switch (exchange) {
		case 1: {
				System.out.println("Enter  the number of USD ");
				
				double usd = sc.nextDouble();
				
				if(usd>=0) {
					System.out.println(usd  +" USD is " + usd*0.908 +"{ ");
					
					
				}
				else {
					System.out.println("Please put in positive number of USD");
				}
		}
		break;
		case 2:{
			System.out.println("Enter the number  of { ");
			double euro =sc.nextDouble();
			
			if(euro>=0) {
				System.out.println(euro + "{ is " + euro *1.101 +" USD. ");
				
			}
			else {
				System.out.println("Please put in positive number  of { .");
			}
		}
		break;
		case 3:{
			System.out.println("Enter the number of { ");
			double pounds =sc.nextDouble();
			if(pounds>=0) {
				System.out.println(pounds + "{ is " + pounds*1.28 + "USD" );
			}
			else {
				System.out.println("Please put in positive number of { ");
			}
			
		}
		break;
		}
		sc.close();
		
	}

}
