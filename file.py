def check_for_inv(arr,y):
    count=0
    i,j=(0,0)
    while(i!=y and j!=y):
        for k in range(i,y):
            for m in range(j,y):
                if arr[i][j] > arr[k][m]:
                    count=count+1
        if i==y-1 and j==y-1:
            break
        elif i==y-1:
            i=0
            j=j+1
        else:
            i=i+1
    return count
if __name__=="__main__":
    x=int(input())
    for i in range(x):
        y=int(input())
        arr=[]
        for j in range(y):
            arr.append(list(map(int,input().split())))
        print(check_for_inv(arr,y))
