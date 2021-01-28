public static int[] BubbleSort(int a[],int n){
   int temp;
   boolean sort;
   for(int i = 0;i < n-1;i++){
     sort = false;
     for(int j = 0;j < n-1-i;j++){
       if(a[j] > a[j+1]){
         temp = a[j];
         a[j]= a[j+1];
         a[j+1]= temp;
         sort = true;
       }
     }
     if(sort == false)
       break;
   }
   return a;
 }