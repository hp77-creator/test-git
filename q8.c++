	long long maxProduct(int *arr, int n) {
	   
	   int maxxi=arr[i];
	   int minni=arr[i];
	   int maxproduct=arr[i];
	   for(int i=1;i<n;i++)
	   {
	       if(arr[i]<0)
	       swap(maxxi,minni);
	       maxxi=max((long long) arr[i],maxxi*arr[i]);
	       minni=min((long long) arr[i],minni*arr[i]);
	       maxpoduct=max(maxproduct,maxxi);
	   }

	    return maxProduct;     
	}