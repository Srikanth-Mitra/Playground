#include<stdio.h>
int main()
{
  int n,i,ser;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&ser);
  for(i=0;i<n;i++)
  {
    if(arr[i]==ser)
    {
      printf("%d",i+1);
      return 0;
    }
  }
  printf("%d isn't present in the array.",ser);
  return 0;
}