import java.util.Random;

public class quicksort{
    static int a[] = new int[1000];
    public static void main(String args[]){
        Scanner in = new Scanner(System.in); //for taking input values;
        long start ,end ;
        System.out.println("****Quick Sort****");
		System.out.println("Enter the number of elements to be sorted:");
		int n = in.nextInt();
        Random rand = new Random();  // this will generate random input values
		for(int i=0;i<n;i++) 
			a[i]=rand.nextInt(100);
        
        System.out.println("Array elements to be sorted are: ");
		for(int i=0;i<n;i++)
			System.out.println(a[i]+"");
        int low=0,high = n-1;
		a[n]=999;
        start =System.nanoTime();
        quicksort(a,low,high);
		end = System.nanoTime();
		System.out.println("Sorted elements are:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]+"");
		System.out.println("\n\nThe time taken to sort is "+(end-start)+"ns");
		System.out.println("*************\n\n");
		in.close();

    }

    static void quicksort(int a[],int low,int high){
        int mid;
        if(low<high){
            mid = partition(a,low,high);
            quicksort(a,low,mid-1);
            quicksort(a,mid+1,high);
        }
    }

    static void partition(int a[],int low,int high){
        int pivot = a[low];
		int i = low+1;
		int j = high;
		while(i<=j) {
			while(a[i]<=pivot) {
				i++;
			}
			while(a[j]>pivot) {
				j--;
			}
			
			if(i<j) {
				swap(a,i,j);
			}
		}
		swap(a,low,j);
		return j;
    }

    void static swap(int a[],int i,int j){
        int temp;
        temp = a[i];
        a[i]= a[j];
        a[j] = temp;
    }
}