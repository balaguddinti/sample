package com.practice;

public class FindTheWinner {
	
	static String winner(int[] andrea, int[] maria, String s) {
		int andreaCount=0;
		int mariaCount=1;
				
		if(andrea.length==maria.length){
			for(int i=0;i<andrea.length;i++){
				if(s.equalsIgnoreCase("even")){
					if(i==0 || i%2==0){
					andreaCount+=andrea[i]-maria[i];
					mariaCount+=maria[i]-andrea[i];
					}
					if(i==1 || i%2==1){
						andreaCount+=andrea[i]-maria[i];
						mariaCount+=maria[i]-andrea[i];
					}
					
				}
			}
			
			
		}
		
		if(andreaCount>mariaCount){
			return "Andrea";
		}else{
			return "Maria";
		}
		
	}

	public static void main(String[] args) {
		int andrea[] = {1,2,3};
		int maria[] = {2,1,3};
		System.out.println(winner(andrea,andrea,"even"));

	}

}
