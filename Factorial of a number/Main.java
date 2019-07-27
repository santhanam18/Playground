#include <stdio.h>
int main() {
	//Type your code
  int a,sum=1;
  scanf("%d",&a);
  for(int i=1;i<=a;i++)
  {
    sum*=i;
  }
  printf("%d",sum);
	return 0;
}