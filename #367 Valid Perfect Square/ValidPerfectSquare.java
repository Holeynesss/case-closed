package com.practice;
/*
 * Binary-Search?
 */
public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
		if(num<=0){
			return false;
		}
		if(num == 1){
			return true;
		}
		int up = num, down = 0;
		while(0==0){
			int flag = (up+down)/2;
			if(flag==down||flag==up){
				break;
			}
			if(num/flag==flag&&flag*flag==num){
				return true;
			}else if(num/flag>flag){
				down = flag;
			}else{
				up = flag;
			}
		}	
		return false;
	}
	public static void main(String[] args){
		ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
		System.out.println(validPerfectSquare.isPerfectSquare(1));
	}
}
