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
    fl(T,1,t+1)
    {
       int n;
       cin>>n;
       int A[n];
       fl(i,0,n)
        cin>>A[i];
       int trend = 0,count=0;
        for (int i=0;i<n-1;i++){
            int diff = A[i+1] - A[i];
            if (diff > 0)
                trend++;
            if (diff < 0)
                trend--;
            if(trend < -3 || trend > 3){
                count++;
                trend=0;
            }
        }
        cout <<"Case #"<<T<<": "<<count<<endl;
    }
	return 0;
}
