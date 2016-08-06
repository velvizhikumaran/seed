# seed
import java.util.Scanner;


public class Seed {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int e=a;
	    int c=1;
		String s1=Integer.toString(a);
		int b=s1.length();
		while(a>0){
            int d=a%10;
			c=c*d;
			a=a/10;
		}int f=e*c;
		System.out.println(f);
		
	}

}
