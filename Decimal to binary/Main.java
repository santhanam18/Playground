#include<stdio.h>
int main()
{
  //Type your code here
  int n,arr[128],i,remcount=0;
  scanf("%d",&n);
  while(n!=0)
  {
    arr[remcount++]=n%2;
    n=n/2;
  }
  for(i=remcount-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}