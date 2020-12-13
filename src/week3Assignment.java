import java.util.Arrays;

public class week3Assignment {

	public static void main(String[] args) {
		
		//STEP 1
			//a
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int arrayLength = ages.length;
		
		int arrayDifference = Math.abs(ages[arrayLength - arrayLength] - ages[arrayLength - 1]);
			System.out.println("First element subtracted from last element: 93 - 3 = " + arrayDifference);
			
			//b
		
		int[] newAge = new int[ages.length];
			System.arraycopy(ages,  0, newAge, 0, ages.length);
		
		arrayLength = newAge.length;
		
		newAge[arrayLength - 1] = 666;
		
		arrayDifference = Math.abs(newAge[arrayLength - arrayLength] - newAge[arrayLength - 1]);
			System.out.println("First element subtracted from last element: 666 - 3 = " + arrayDifference);
			
			//c
		
		int sum = 0;
		
		for (int i = 0; i < newAge.length; i++) {
			sum += newAge[i];
		}
		
		double average = sum / arrayLength;
			System.out.println("Average age in newAge array: " + average);
			
			
			
			//STEP 2
			//a
			
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
		double sumOfNames = 0;
			
		for (int i = 0; i < names.length; i++) {
			sumOfNames += names[i].length();
		}
		
		double average1 = sumOfNames / names.length;
			System.out.println("Average number of letters per name in names array = " + average1);
			
			//b
			
			String allNames = "";
			
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
			System.out.println(allNames);
			
			
		//Step 3
			
			System.out.println("array.length is used when you want to access the last element of your array");
			
		
		//Step 4
			
			System.out.println("array[0] is used when you want to access the first element of the array");
			
			
		//Step 5	

		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
			sum = 0;
			}


		//Step 6

		for (int i = 0; i < nameLengths.length; i++) {
		sum += nameLengths[i];
			}
			System.out.println("Sum for all lengths in nameLengths array = " + sum);

			
		//Step 7
		
			System.out.println(stepSeven("Salute", 6));
			
			
		//Step 8
			
			System.out.println(stepEightFullName("Gustavo", "Escobar"));
			
		
		//Step 9
			
		int[] stepNine = {5, 7, 14, 23, 36, 45, 85, 86, 98};
			
			System.out.println(isSumGreaterThan100(stepNine));
			
			
		//Step 10
			
		double[] stepTen = {0.35, 2.6, 142.23, 4254.2305};
			System.out.println(doubleArrayAverage(stepTen));


		//Step 11
			
			double[] firstDoubleArray = {23.45, 234.5474, 75.23, 765.29};
			double[] secondDoubleArray = { 23.53, 3.6564, 15.5, 24.65};
			System.out.println(isFirstArrAvgGreater(firstDoubleArray, secondDoubleArray));
			
	}
	
	
		public static String isFirstArrAvgGreater(double[] firstDoubleArray, double[] secondDoubleArray) {
		
		return null;
	}
		
		
		//Step7 Method
		
		public static String stepSeven(String word, int n) {
		
		String stepSeven = "";
		
		for (int i = 0; i < n; i++) {
			stepSeven += word;
		}
		return stepSeven;
		}
		
		//Step 8 method
	
	public static String stepEightFullName(String firstName, String lastName) {
		
		return firstName + " " + lastName;
	}
	
	
	//Step 9 method
	
	public static Boolean isSumGreaterThan100(int[] arrayOfNumbers) {
		
		return Arrays.stream(arrayOfNumbers).sum() > 100;
	}
	
	
	//Step 10 method

	public static double doubleArrayAverage(double[] sellstepTenArray) {
		
		return Arrays.stream(sellstepTenArray).average().orElse(Double.NaN);
	}
	
	//Step 11
	
	public static Boolean checkIfFirstAverageIsGreater(double[] firstArray, double[] secondArray) {

		return getAverageOfDoubleArr(firstArray) > getAverageOfDoubleArr(secondArray); 
	}
	
	public static int getAverageOfDoubleArr(double[] firstArr) {
		
		return 0;
	}
	
	
	//Step 12
	
	
	

}
