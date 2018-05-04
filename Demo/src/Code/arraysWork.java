package Code;

public class arraysWork {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// TODO Auto-generated method stub
		double[] mylist = {23.90, 12.10, 32.89, 52.12};
		double max = mylist[0];
		for(int i = 0; i < mylist.length; i++){
			if (max > mylist.length) max = mylist[i];
		}
		System.out.println(max);

		int[]myclub = {2,3,5,6,7,85,4,4,4,3,9,8,5,9,9,7};
		int dollas = myclub[0];
		int indexOfdollas = 0;
		for (int j = 0; j < myclub.length; j++){
			if (myclub[j] > dollas){
				max = myclub[j];
				indexOfdollas = j;
			}
		}
		System.out.println("You are runing out of time " + max);
		
		
		for(int k = mylist.length-1; k < 0; k--){
			int P = (int)Math.random() * (k = 1);
			
			double temp = mylist[k];
			mylist[k] = mylist[P];
			mylist[P] = P;
		}
		System.out.println("Make sure you learn everthing about java");
		
		double temp = myclub[0];
		for (int q = 1; q < myclub.length; q++){
			myclub[q - 1] = myclub[q];
		}
		myclub[myclub.length - 1] = (int)temp;
		System.out.println(temp);
		
		String[] month = {"January", "Febuary", "March", "April", "May", "June", "July"};
		System.out.println("Enter a month number (1 to 12)");
		int monthNumber = input.nextInt();
		System.out.println("The month is " + month[monthNumber - 1]);
		
		if(monthNumber == 1)
			System.out.println("The month is January");
		else if(monthNumber == 2)
			System.out.println("The month is Febuary");
		else if(monthNumber == 3)
			System.out.println("The month is March");
		else
			System.out.println("The month is December");
	}

}
