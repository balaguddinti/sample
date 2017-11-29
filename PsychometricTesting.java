package com.practice;

public class PsychometricTesting {
	
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[]
			upperLimits) {
		int jobOffers[] = new int[lowerLimits.length];
		int count=0;
		int secondCount=0;
		
		for(int i=0;i<scores.length;i++){
			if(lowerLimits[0]<=scores[i] && upperLimits[0]>=scores[i]){
				count++;
			}
			if(lowerLimits.length>1){
			if(lowerLimits[1]<=scores[i] && upperLimits[1]>=scores[i]){
				secondCount++;
			}
			}
			
		}
		if(count>0){
		jobOffers[0]=count;
		}
		if(secondCount>0){
		jobOffers[1]=secondCount;
		}
		
		
		
		return jobOffers;
	}

	public static void main(String[] args) {
		int scores[]= {4,8,7};
		int lower[]={2,4};
		int upper[]={8,4};
		int result[] = jobOffers(scores,lower,upper);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}

	}

}
