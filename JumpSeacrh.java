 public static int JumpSearch(int a[],int v,int n){
    int step = (int)Math.sqrt(n);
    int start = 0;
    while(a[step] <= v && step < n){
      start = step;
      step+=(int)Math.sqrt(n);
      if(step > n)
       return -1;
      for(int i = start;i < step;i++){
        if(a[i]==v)
          return i;
      }
    }
    return -1;
 }
