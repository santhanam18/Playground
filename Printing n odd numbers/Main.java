#include <stdio.h>
int main() {
	//Type your code
  int a,count=0;
  scanf("%d",&a);
  for(int i=0;i<20;i++)
  {
    if(count==a)
      break;
    else if(i%2==1)
    {
      printf("%d\n",i);
      count =count+1;
    }
  }
	return 0;
}