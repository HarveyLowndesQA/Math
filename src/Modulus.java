
public class Modulus {

	public static void main(String[] args) {
		/*int third, second, first;
		int num = 993;
		
		third = num % 10;
		second = (num / 10) % 10;
		first = (num / 100);
		
		int oneLine = (num % 10) + ((num / 10) % 10) + ((num / 100));
		
		System.out.println(first + second + third);
		System.out.println(oneLine);*/
		
		int bill, paid;
		bill = 1287;
		paid = 2000;
		
		int change = paid-bill;
		
		System.out.printf("Change to pay: %.2f \n", (double) change / 100);
		
		int[] noteArray = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		
		for(int i = 0; i < noteArray.length; i++) {
			int amount = (int) (change / noteArray[i]);
			print(amount, noteArray[i]);
			
			change = change % noteArray[i];
			if(change == 0) {
				break;
			}
		}
		
		/*int fiftyAmount = (int) change / 50;
		print(fiftyAmount, "£50");
		change = change - (fiftyAmount * 50);
		
		int twenty = (int) ((change / 20));
		print(twenty, "£20");
		change = change - (twenty * 20);
		
		int ten = (int) ((change / 10));
		print(ten, "£10");
		change = change - (ten * 10);
		
		int five = (int) ((change / 5));
		print(five, "£5");
		change = change - (five * 5);
		
		int two = (int) ((change / 2));
		print(two, "£2");
		change = change - (two * 2);
		
		int one = (int) ((change / 1));
		print(one, "£1");
		change = change - (one * 1);
		
		int fifP = (int) ((change / 0.5));
		print(fifP, "50p");
		change = (float) (change - (fifP * 0.5));
		
		int twenP = (int) ((change / 0.2));
		print(twenP, "20p");
		change = (float) (change - (twenP * 0.2));
		
		int tenP = (int) ((change / 0.1));
		print(tenP, "10p");
		change = (float) (change - (tenP * 0.1));
		
		int fiveP = (int) ((change / 0.05));
		print(fiveP, "5p");
		change = (float) (change - (fiveP * 0.05));
		
		int twoP = (int) ((change / 0.02));
		print(twoP, "2p");
		change = (float) (change - (twoP * 0.02));
		
		int oneP = (int) ((change / 0.01));
		print(oneP, "1p");
		change = (float) (change - (oneP * 0.01)); */
	} 
	
	public static void print(int amount, int coin) {
		if(amount > 0) {
			System.out.printf("£%.2f: " + amount + "\n", (double) coin / 100);
		}
	}
}
