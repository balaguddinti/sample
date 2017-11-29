package com.practice;

public class InTheFuture {
	
	static int minimun(int A, int K, int P){
		//A -Asha solves A problems per day -3
		//K - Kelly solves K problems per day -5
		//P - Asha P prblems ahead Kelly -1
		
		int minDays=1;
		int ashaTotalPrograms;
		int kellyTotalPrograms;
		
		while(minDays>0){
			if(A>K){
				return -1;
			}
			ashaTotalPrograms=A*minDays+P;
			kellyTotalPrograms=K*minDays;
			if(kellyTotalPrograms>ashaTotalPrograms){
				return minDays;
			}
			minDays++;
		
		}
		
		return minDays;
		
	}

	public static void main(String[] args) {
		System.out.println(minimun(3,5,1));
	}

}
