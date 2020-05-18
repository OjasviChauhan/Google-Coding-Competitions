import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n]; 
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            int j=0,z=0;
            int count=0;
            for(j=0;j<n;j++){
                if(arr[j] == k){
                    z=j;
                    int x=0;
                    for(x=k-1;x>=1;x--){
                        if(x == arr[z+1]){
                            z++;
                            continue;
                        }
                        else {
                            j=z;
                            break;
                        }
                    }
                    if(x==0) count++;
                }
            }
            System.out.println("Case #"+i+": "+count);
        }
    }
}
