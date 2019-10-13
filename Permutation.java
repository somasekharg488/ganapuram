package javaprograms;

import java.util.Scanner;

public class Permutation {

	static int count=0;
	
	public static void permutations(String perm,String input) {
		if(input.length()==0) {
			count++;
			System.out.println(count+"  "+perm);
		}for(int i=0;i<input.length();i++) {
			permutations(perm+input.charAt(i), input.substring(0,i)+input.substring(i+1));
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of string");
		
		String input=sc.next();
		permutations(" ", input);
		
	}
	
}
        
