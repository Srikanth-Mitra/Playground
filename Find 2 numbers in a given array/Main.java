#include<stdio.h>
int main()
{
  	//type your code here
  	int n,i,e1,e2,e1_p=-1,e2_p=-1;
  	scanf("%d",&n);
  	int a[n];
  	for(i=0;i<n;i++)
    {
      scanf("%d",&a[i]);
    }
  	scanf("%d%d",&e1,&e2);
  	for(i=0;i<n;i++)
    {
      if(e1==a[i] && e1_p==-1)
      {
        e1_p=i;
      }
      if(e2==a[i] && e2_p==-1)
      {
        e2_p=i;
      }
    }
  printf("Element 1 index = %d\nElement 2 index = %d",e1_p,e2_p);
  return 0;
}