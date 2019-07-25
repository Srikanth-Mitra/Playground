#include<stdio.h>
int main()
{
  //Type your code here
  	int n1,n2,min,a;
  	scanf("%d %d",&n1,&n2);
  	min = (n1>n2)?n1:n2;
  	while(1)
    {
      if(min%n1==0 && min%n2==0)
      {
        a = min;
        break;
      }
      ++min;
    }
  	printf("%d",a);
  return 0;
}