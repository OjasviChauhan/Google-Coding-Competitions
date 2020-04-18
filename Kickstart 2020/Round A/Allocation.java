import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int j=1;j<=T;j++){
            int N = sc.nextInt();
            int B = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int sum=0,count=0;
            for(int i=0;i<N;i++){
                sum += arr[i];
                if(sum <= B) count++;
                else break;
            }
            System.out.println("Case #"+j+": "+count);
        }
    }
}
