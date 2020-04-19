import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int N=sc.nextInt();
            int arr[]=new int[N];
            for(int j=0;j<N;j++)
                arr[j]=sc.nextInt();
            int count=0;
            for(int j=0;j<N-2;j++){
                if(arr[j+1]>arr[j] && arr[j+1]>arr[j+2]){
                    count++;
                }
            }
            System.out.println("Case #"+i+": "+count);
        }
    }
}
