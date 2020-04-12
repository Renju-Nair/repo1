package qsp;

import java.util.Scanner;

public class P1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string word");
		String word = sc.nextLine();
		char[] a = word.toCharArray();
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					
					count++;
				}
			} 
			System.out.println(a[i]+" has repeated "+count+"times");
		}
	}
}
