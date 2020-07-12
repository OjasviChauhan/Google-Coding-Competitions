#include <bits/stdc++.h>
using namespace std;
#define fl(i, a, b) for (long long int i = (a); i < (b); i++)
#define flr(i, a, b) for(long long int i = (a); i >=(b); i--)
#define itr(i, A) for(auto i=A.begin(); i != A.end(); ++i)
#define pb push_back
#define mp make_pair
#define endl '\n'
typedef long long int ll;
typedef vector<int> VI;
ll mod1=1000000007;
ll mod2=67280421310721;
ll mod3=998244353;
ll INF=1e18;
 
int main(){
ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
    ll t;
    cin>>t;
    fl(j,1,t+1)
    {
       int n;
       cin>>n;
       int A[n];
       int count=0;
       fl(i,0,n)
        cin >> A[i];
        
       if(n==1)
        count = 1;
       else{
           int max = A[0];
           if(A[0] > A[1])
                count++;
           fl(i,1,n-1){
               if(A[i] > max && A[i] > A[i+1]){
                    count++;
                    max = A[i];
                    i++;
               }
           }
           if(A[n-1] > max)
                count++;
       }
        cout <<"Case #"<<j<<": "<<count<<endl;
    }
	return 0;
}
