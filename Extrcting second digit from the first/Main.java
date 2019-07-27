#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  while(a>99)
  {
    a=a/10;
  }
  a=a%10;
  printf("%d",a);
	return 0;
}