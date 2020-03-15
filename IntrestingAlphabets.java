import java.util.*;
public class IntrestingAlphabets {
	public static78r sc=new Scanner(System.in);
        int m=65,i,j;
        int n=sc.nextInt();
        int p=m+n;
        for(i=0;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print((char)p);
                p++;
            }
            p=p-j-1;
            System.out.println();
        }
		//Your code goes here
        /* Print the following pattern for the given number of rows.
            Pattern for N = 5
            E
            DE
            CDE
            BCDE
            ABCDE
            */
	}
}
