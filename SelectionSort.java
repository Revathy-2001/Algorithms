public static int[] SelectionSort(int a[],int n){
   int min_index,temp;
   for(int i = 0;i < n;i++){
     min_index = i;
     for(int j = i+1;j < n;j++){
       if(a[j] < a[min_index])
         min_index = j;
     }
     temp = a[min_index];
     a[min_index]=a[i];
     a[i]=temp;
   }
  return a;
 }