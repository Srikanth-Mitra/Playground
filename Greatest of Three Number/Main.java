#include <stdio.h>

int main()
{ 
    // type your code here
  int a=0,b=0,c=0;
    scanf("%d,%d,%d",&a,&b,&c);
  	if(a>b && a>c)
    {
      	printf("%d",a);
    }
    else if(b>c)
    {
      printf("%d",b);
    }
  else
  {
    printf("%d",c);
  }
  return 0;
}