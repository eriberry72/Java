public class HomeworkFive {

	public static void main(String[] args) {
		// calculate total money
                double pennyValue = 0.01, nickleValue = 0.05, dimeValue = 0.1, quarterValue = 0.25, loonieValue = 1, toonieValue = 2;
                double totalMoney;
                
                int numPennies = 10;
                int numNickles = 15;
                int numDimes = 32;
                int numQuarters = 45;
                int numLoonies = 1;
                int numToonies = 12;
                
                totalMoney = (pennyValue * numPennies) + (nickleValue * numNickles) + (dimeValue * numDimes) + (quarterValue * numQuarters) + (loonieValue * numLoonies) + (toonieValue * numToonies);
                
                System.out.print("Given that you have " + numPennies + " pennies, " + numNickles + " nickles, " + numDimes + " dimes, " + numQuarters + " quarters, " + numLoonies + " loonies, and " + numToonies + " toonies, you have a total of $" + totalMoney);
               
		
	}
}
