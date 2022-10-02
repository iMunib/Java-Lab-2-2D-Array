/**
 * File Name: Lab2.java
 * Course: CST8284-OOP
 * Assignment: Lab 2
 * Date: 26th September 2022
 * Professor: Sandra
 * Purpose: Program will display table using 2d arrays in a certain format using nested for loops and printf function to display the values provided in array.
 * @author Rehman
 * @version JavaSE17
 */

public class Lab2 {
	
		final int ROWS = 7;
	    final int COLUMNS = 8;

	   int[][] patients = 
	      { 
	         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
	         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
	         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
	         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
	         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
	         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
		     {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
	         
	      };

	   String[] provinces = 
	      { 
	         "Ontario", 
	         "Quebec", 
	         "Nova Scotia",
	         "New Brunswick", 
	         "Manitoba", 
	         "British Columbia",
		     "Prince Edward Island"         
	      };
	   
	  

	   /** This will output the 2D arrays of the provinces and patients.
	   * 
	   */
	 
	   // TO DO: WRITE YOUR CODE FOR THIS SECTION HERE!!!! Check the sample output file (SpiceOutput) to see the expected pattern to print out these details using printf.
	  public void printTable() {
	   for (int i = 0; i < ROWS; i++){
		   System.out.printf("%20s",provinces[i]);
		   for (int j = 0; j < COLUMNS; j++)
		   {
		      System.out.printf("%8d", patients[i][j]);
		   }
		   System.out.println();
		}
	   }
	   
	   /** This will output the calculation of total of all the column cell values using nested for loop from 2d array.
	    * 
	   */ 
		 public void printSum() {
		   System.out.println();
		   System.out.printf("   Recovered Patients" );
		   for(int i =0; i < COLUMNS; i++) {
			  int sum = 0;
			   	for(int j = 0; j < ROWS; j++) {
			   	sum = sum + patients[j][i];
		   }
		   System.out.printf("  %6d", sum);
	   }

	   
	   System.out.println(); 
	   System.out.println(); 
	   System.out.println("               Vaccinate and maintain good health practices!" );
	   
	}
}
