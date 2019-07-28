#include<stdio.h>
int main()
{int n;scanf("%d",&n);
  int i,c,a=0,b=1;printf("0 1 ");
  for(i=0;i<n-2;i++){
  c=a+b;
  a=b;b=c;printf("%d ",c);}
  
  
  
  
  
  return 0;
}