import java.util.Scanner;

public class ReverseArray {
	
	public static void reverse(int[] a){
	        int i = 0;
	        int j = a.length-1;
	        while(i<j){
	        	int temp = a[i];
	        	a[i] = a[j];
	        	a[j] = temp;
	            i++;
	            j--;
	        }	    
	  }
	
	private static void Display(int arr[])
	{
		for (int val : arr) {
			
			System.out.println(val);
			 
		}	
	}
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		int tc = scn.nextInt();
		
		int arr[] = new int[tc];
	
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scn.nextInt();
			 
		}	
		Display(arr);
		reverse(arr);
		Display(arr);
	}

}
