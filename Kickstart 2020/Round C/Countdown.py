t = int(input())
for z in range(t):
    n,k = map(int,input().split())
    A = list(map(int,input().split()))
    l = []
    for i in range(k,0,-1):
        l.append(i)
    s1 = ''.join(str(i) for i in A)
    s2 = ''.join(str(i) for i in l)
    c = s1.count(s2)
    print("Case #"+str(z+1)+": "+str(c))
