#include<stdio.h>
int main()
{int n;scanf("%d",&n);
	if(n%2==0){
  int z=n/2,a=0;
  for(int i=1;i<z;i++)
  a=a+1;
  printf("%d",a);}
  else{
  int z1=n/2+1,a1=0;
  for(int i=1;i<z1;i++)
  a1=a1+2;
  printf("%d",a1);
  }
}