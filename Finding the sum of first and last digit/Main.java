#include <stdio.h>
int main() {
	//Type your code
  int a,b;
  scanf("%d",&a);
  b=a%10;
  while(a>9)
  {
    a=a/10;
  }
  printf("%d",a+b);
  
	return 0;
}