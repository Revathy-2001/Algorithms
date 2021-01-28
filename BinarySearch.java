
  public static int BinarySearch(int a[],int v,int n){
    int l = 0;
    int r = n - 1;
    int mid;
    while(l <= r){
      mid = (l+r)/2;
      if(a[mid] == v)
        return mid;
      else if(a[mid] < v)
        l = mid + 1;
      else
        r = mid - 1;
    }
    return -1;
  }