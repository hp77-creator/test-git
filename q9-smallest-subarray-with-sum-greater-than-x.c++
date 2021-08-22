  int sb(int arr[], int n, int x)
    {
      int i=0,j=0,minimum=INT_MAX;
      int sum=0;
      while(j<n)
      {
         if(sum+arr[j]<=x)
          sum=sum+arr[j],j++;
         else if(sum+arr[j]>x)
             {
                 minimum=min(minimum,j-i+1);
                 sum=sum-arr[i];
                 i++;
             }
      }
      return minimum;
    }