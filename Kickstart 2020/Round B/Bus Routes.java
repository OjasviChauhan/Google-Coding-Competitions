import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int N=sc.nextInt();
            long D=sc.nextLong();
            long arr[]=new long[N];
            for(int j=0;j<N;j++)
                arr[j]=sc.nextLong();
            long max = D;
            for(int j=arr.length-1;j>=0;j--){
                  max = (max/arr[j])*arr[j];
            }
            System.out.println("Case #"+i+": "+max);
        }
    }
}
