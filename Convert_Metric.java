/*
###Convert###

Type	   Metric	            English equivalent
Weight	   1.000 kilogram	    2.2046 pounds
           0.4536 kilograms	    1.0000 pound
Volume	   1.000 liter	            0.2642 gallons
           3.7854 liters	    1.000 gallon

#Input
The first line of input contains a single integer N, (1 ≤ N ≤ 1000) which is the number of datasets that follow.
Each dataset consists of a single line of input containing a floating point (double precision) number, a space and the unit specification for the measurement to be converted. The unit specification is one of kg, lb, l, or g referring to kilograms, pounds, liters and gallons respectively.

#Output
For each dataset, you should generate one line of output with the following values: The dataset
number as a decimal integer (start counting at one), a space, and the appropriately converted value rounded to 4 decimal places, a space and the unit specification for the converted value.

EX input
5
1 kg
2 l
7 lb
3.5 g
0 l

EX output
1 2.2046 lb
2 0.5284 g
3 3.1752 kg
4 13.2489 l
5 0.0000 g
*/


import java.util.Scanner;

public class Convert {
	public static void main(String[] args){
		
		//Range of integer N  1 <= N <= 1000
		int N;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		
		if(N<1 || N>1000 ){
			System.out.println("Error N range");
			System.exit(1);
		}
		
		String[] input= new String[N];
		
    //Input
		for(int i = 0; i < N; i++){
			scan = new Scanner(System.in);
			input[i] = scan.nextLine();
		}
		System.out.println(N);
		
    //N times Convert
		for(int i =0; i < N; i++){
			String output;
			String[] words = input[i].split(" ");
			
			switch(words[1]){
				case "kg" : 
					System.out.printf("%d %.4f lb\n", i,Double.parseDouble(words[0]) * 2.2046);
					break;
				case "lb" : 
					System.out.printf("%d %.4f kg\n", i,Double.parseDouble(words[0]) * 0.4536);
					break;
				case "l" : 
					System.out.printf("%d %.4f g\n", i,Double.parseDouble(words[0]) * 0.2642);
					break;
				case "g" : 
					System.out.printf("%d %.4f l\n", i,Double.parseDouble(words[0]) * 3.7854);
					break;
				default : output = "Error"; break;
			}
		}
	}
}

