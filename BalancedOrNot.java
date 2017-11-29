package com.practice;

public class BalancedOrNot {
	
	static int[] balancedOrNot(String[] expressions, int[]
			maxReplacements) {
		char leftPattern='<';
		char rightPattern='>';
		int result[]= new int[maxReplacements.length];
		
		if(expressions.length==maxReplacements.length){
		for(int i=0;i<expressions.length;i++){
			int maxVal=0;
			char[] inputStringPattern = expressions[i].toCharArray();
			int patternLength=inputStringPattern.length;
			while(patternLength>0){
				int j=0;
				if((inputStringPattern[j]==leftPattern && inputStringPattern[j+1]!=rightPattern) || (inputStringPattern[j]==rightPattern && inputStringPattern[j+1]==rightPattern)){
						maxVal=maxVal+1;
				}
				patternLength--;
				j++;
				
			}
			
			if(maxReplacements[i]==maxVal){
				result[i]=1;
			}else{
				result[i]=0;
			}
			
		}
		
		}
		return result;
		
	}

	public static void main(String[] args) {
		String pattern[]={"<>>>","<>>>>"};
		int maxReplacements[]={2,2};
		int result[]=balancedOrNot(pattern,maxReplacements);
		for(int i:result){
			System.out.println(i);
		}
		
		

	}

}
