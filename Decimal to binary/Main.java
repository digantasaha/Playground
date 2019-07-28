#include<stdio.h>
int main()
{int n;scanf("%d",&n);
  int r,j,a[10],i=0,c=0;
  while(n!=0){
  r=n%2;
  a[i]=r;
  i++;
  n=n/2;c++;}
  for(j=c-1;j>=0;j--)
  printf("%d",a[j]);
  
  
  
  return 0;
}