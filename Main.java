import java.util.*;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int value=(int)c;
        if(c>=65 && c<=90)
            System.out.print("1");
        else if(c>=97 && c<=122)
            System.out.print("0");
        else
            System.out.print("-1");
        
		// Write your code here

	}
}
