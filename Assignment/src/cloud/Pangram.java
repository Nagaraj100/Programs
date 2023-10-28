package cloud;
import java.util.*;
public class Pangram {
	public static void main(String []args) {
	String let ="abcdefghijklmnopqrstuvwxyZ";
	String le=let.toLowerCase();
	char a[] = le.toCharArray();	
	int []countTheLetter = new int[26];
	for(char c: a) {
	if('a'<=c && c<='z') {
		countTheLetter[c-'a']++;
	}}
	boolean isPangram=true;
	for(int count:countTheLetter) {
		if(count ==0) {
			isPangram=false;
			break;
		}
	}
	if(isPangram) {
		System.out.println("It is pangram");
	}else {
		System.out.println("It is not Pangram");
	}
	}
	}
		
		
