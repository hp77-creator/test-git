  int findLongestConseqSubseq(int arr[], int n)
    {
     set<int>s;
     int maximum=0;
     for(int i=0;i<n;i++)
      s.insert(arr[i]);
      for(int i=0;i<n;i++)
      {
          if(s.find(arr[i]-1)==s.end())
          {
              int j=arr[i];
              while(s.find(j)!=s.end())
              j++;
               maximum=max(maximum,j-arr[i]);
          }
      }
      return maximum;
       
    }