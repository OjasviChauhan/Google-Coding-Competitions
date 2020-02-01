import java.util.*;
class More_Pizza{
	public static void main(String []args){
		Scanner	sc = new Scanner(System.in);
		int max = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		pizzaSlices(max,arr);
	}
    static void pizzaSlices(int max,int arr[]){
    	int i,n=0,count=0;
    	int a[] = new int[arr.length];
    	for(i=arr.length-1;i>=0;i--){
    		count+=arr[i];
    		if(count<=max){
    			n++;
    			a[n-1]=i;
    		}
    		else count-=arr[i];
    	}
    	System.out.println(n);
    	for(i=n-1;i>=0;i--)
    		System.out.printf("%d ",a[i]);
    }
}
