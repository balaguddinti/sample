package com.practice;

public class ConsecutiveSum {
	
	 static int countConsecutive(int N)
	    {
	        // constraint on values of L gives us the 
	        // time Complexity as O(N^0.5)
	        int count = 0;
	        for (int L = 1; L * (L + 1) < 2 * N; L++)
	        {
	            System.out.println("value of L is::::"+L);
	            float a = (float) ((1.0 * N-(L * (L + 1)) / 2) / (L + 1));
	            System.out.println("value of a is::::"+a);
	            System.out.println("Converted val"+(int)a);
	            if (a-(int)a == 0.0) 
	                count++;        
	        }
	        return count;
	    }

	public static void main(String[] args) {
		int N = 25;
        System.out.println(countConsecutive(N));
	}

}
