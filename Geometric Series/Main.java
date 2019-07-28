#include<stdio.h>
int main()
{int n;scanf("%d",&n);
  if(n%2!=0){
  int a=1,z=(n/2)+1;
  for(int i=1;i<z;i++)
  a=a*2;
  printf("%d",a);}
  else{
  int a1=1,z1=n/2;
  for(int i=1;i<z1;i++)
  a1=a1*3;
  printf("%d",a1);}
  return 0;
}