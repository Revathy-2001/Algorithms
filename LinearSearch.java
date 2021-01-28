public static int LinearSearch(int a[],int v){
    for(int i = 0;i < a.length;i++)
      if(a[i] == v)
        return i;
    return -1;
  }