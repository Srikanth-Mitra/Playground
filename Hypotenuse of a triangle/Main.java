#include<stdio.h>
int main()
{
   float s1,s2,hyp;
  scanf("%f%f",&s1,&s2);
  hyp = sqrt((s1*s1)+(s2*s2));
  printf("%0.2f",hyp);
  return 0;
}