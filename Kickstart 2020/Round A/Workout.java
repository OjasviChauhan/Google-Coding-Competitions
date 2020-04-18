import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> li = new ArrayList<Integer>(N);
            int arr[]=new int[N];
            for(int j=0;j<N;j++)
                arr[j]=sc.nextInt();
            for(int j=0;j<N-1;j++)
                li.add(arr[j+1]-arr[j]);
            while(K>0){
                Collections.sort(li,Collections.reverseOrder());
                int a = li.get(0);
                int z1 = a/2;
                int z2 = a-z1;
                li.set(li.indexOf(a),z1);
                li.add(li.indexOf(z1),z2);
                K--;
            }
            Collections.sort(li,Collections.reverseOrder());
            System.out.println("Case #"+i+": "+li.get(0));
        }
    }
}
