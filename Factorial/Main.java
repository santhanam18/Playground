#include<stdio.h>
int main()
{
	//your code here
  long a,i;
  long sum=1;
  scanf("%d",&a);
  if(a==0)
  printf("1");
  else
  {
  for(i=1;i<=a;i++)
  {
    sum*=i;
  }
  printf("%ld",sum);
  }
}