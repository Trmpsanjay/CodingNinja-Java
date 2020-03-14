
import java.util.*;
class functions{
    int change(int x){
        int ans=(x-32)*5/9;
        return ans;
    }
}
public class FarenheitToCelcius {


	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        functions f=new functions();
        int start=sc.nextInt();
        int end=sc.nextInt();
        int step=sc.nextInt();
        int sol;
        for(int i=start;i<=end;i=i+step){
            sol=f.change(i);
            System.out.println(i+"\t"+sol);
            
        }
        
		
		/* Given three values - Start Fahrenheit Value (S),
		End Fahrenheit value (E) and Step Size (W), 
		you need to convert all Fahrenheit values from 
		Start to End at the gap of W,
		into their corresponding Celsius values and print the table.
		*/

		
	}

}
