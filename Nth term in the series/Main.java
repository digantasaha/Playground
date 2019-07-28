#include<stdio.h>

int main()
{int i,n;scanf("%d",&n);
  if(n==1||n==2) printf("0");
  else if(n%2==0){
  int a=0,z=n/2;
  for(i=1;i<z;i++)
  a=a+1;printf("%d",a);}
  else{
  int a1=0,z1=n/2+1;
  for(i=1;i<z1;i++)
  a1=a1+2;
  printf("%d",a1);}
}