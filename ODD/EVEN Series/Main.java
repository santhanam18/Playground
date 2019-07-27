#include<stdio.h>
int main()
{
	//type your code here
  int n,a,d,ts1,ts2,temp;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    ts1=(n+1)/2;
    temp=a+(ts1-1)*d;
    printf("%d",temp);
  }	
  else
  {
    a=0,d=1;
    ts2=n/2;
    temp=a+(ts2-1)*d;
    printf("%d",temp);
  }
}