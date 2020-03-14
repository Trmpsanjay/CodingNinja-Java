import java.util.*;
class functions{
	int duplicate(int arr[]){
		 int count=0,i,j,p=0;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count=count+1;
                }
            }
            if(count>=2){
                p=arr[i];
                break;
            }
            else
                count=0;
        }
        return p;

	}
}

class Duplicatearray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		functions f=new functions();
		System.out.println("enter size");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter the element");
			arr1[i]=sc.nextInt();
		}
		int k=f.duplicate(arr1);
		System.out.println(k);
	}
}
