#include<stdio.h>
int main()
{
  //Type your code here
  float a,b,c,d,e,f,g,h,i;
  scanf("%f%f%f",&a,&b,&c);
  c=(b*b)-4*a*c;
  if(c>0)
  {
    d=((-b+sqrt(c))/(2*a));
    e=((-b-sqrt(c))/(2*a));
    printf("root1 = %.2f  root2 = %.2f",d,e);
  }
  else if(c==0)
  {
    f=g=(-b/(2*a));
    printf("root1 = %.2f  root2 = %.2f",f,g);
  }
  else
  {
    h=(-b/(2*a));
    i=sqrt(-c)/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",h,i,h,i);
  }
}