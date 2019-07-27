#include<stdio.h>
int main()
{
  int arr[100],i,n,c;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  scanf("%d",&arr[i]);
  scanf("%d",&c);
  for(i=0;i<n;i++)
  {
    if(arr[i]==c)
    {
      printf("%d",i+1);
      break;
    }
  }
  if(i==n)
    printf("%d isn't present in the array.",c);
    return 0;
}