package cloud;
import java.util.*;


public class Shuffle {
	public static void main(String[]args) {
int a[]= {1,2,3,4,5,6,7,8};
int n =a.length;
Random r = new Random();
for(int i=n-1;i>0;i--) {
	int j =r.nextInt(i);
	int temp =a[i];
	a[i] =a[j];
	a[j] =temp;
	
}
System.out.println(Arrays.toString(a));
	}
}
