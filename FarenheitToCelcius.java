
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
        
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
