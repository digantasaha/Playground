#include<stdio.h>
int main()
{int n;scanf("%d",&n);
  int a=1,b=2,c;
  for(int i=0;i<n-2;i++){
  c=a+b;a=b;b=c;}
  printf("%d",c);
  
  
  
  
  
  
  
}