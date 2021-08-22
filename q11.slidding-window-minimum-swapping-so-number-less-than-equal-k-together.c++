nt minSwap(int *arr, int n, int k) {
    // Complet the function
    int count=0,ans=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]<=k)
        {
            if(arr[count]>k)ans++;
            count++;
        }
    }
        int tracker=ans;
       for(int i=0;i+count<n;i++)
       {
           if(arr[i]>k)tracker--;
           if(arr[i+count]>k)tracker++;
           ans=min(ans,tracker);
       }
       return ans;
    
}