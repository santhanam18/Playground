#include <stdio.h>

int main()
{ 
    // type your code here
  int i;
  int a[3];
  for(i=0;i<3;i++)
  {
  scanf("%d,",&a[i]);
  }
  if((a[0]>a[1])&&(a[0]>a[2]))
    printf("%d",a[0]);
  else if(a[1]>a[2])
    printf("%d",a[1]);
  else
    printf("%d",a[2]);
}