#include<stdio.h>
int main()
{int n;scanf("%d",&n);
  int a[100],i=0,j,c=0;
  while(n!=0){
  a[i]=n%8;
  n=n/8;
  i++;c++;
  }
  for(j=c-1;j>=0;j--)
  printf("%d",a[j]);
  
  
  return 0;
}