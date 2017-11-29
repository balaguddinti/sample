package com.practice;

public class TwoCircles {
	
	static String circles(String[] info) {
		Double X1=Double.valueOf(info[0]);
		Double X2=Double.valueOf(info[1]);
		Double R1=Double.valueOf(info[2]);
		Double Y1=Double.valueOf(info[0]);
		Double Y2=Double.valueOf(info[1]);
		Double R2=Double.valueOf(info[2]);
		String result;
	    double distance = Math.pow((X1 - X2) * (X1 - X2) + (Y1 - Y2) * (Y1 - Y2), 0.5);
	    if (R2 >= R1 && distance <= (R2 - R1)){
	    	result="Touching";
	    }
	    else if (R1 >= R2 && distance <= (R1 - R2) ) {
	    	result="Insider";
	    }
	    else if (distance > (R1 + R2)){
	    	result="Disjoint outside";
	    }
	    else {
	    	result="Intersecting";
	    }
		return result;
		
	}

	public static void main(String[] args) {
		String info[]={"12","0","21","14","0","23"};
		String result = circles(info);

	}

}
