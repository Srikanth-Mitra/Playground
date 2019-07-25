#include<stdio.h>
int main()
{
  //Type your code here
  char str[100];
  int i,count=0;
  gets(str);
  for(i=0;str[i]!='\0';i++)
  {
     count  = count+1;
  }
  printf("%d",count);
  return 0;
}