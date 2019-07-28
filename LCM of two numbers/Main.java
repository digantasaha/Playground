#include<stdio.h>
int main()
{
  int a,b,c,i;scanf("%d%d",&a,&b);
  if(a>b) c=a; else c=b;
  for(i=c;i<=a*b;i++){
  if(i%a==0 && i%b==0)
  break;}
  printf("%d",i);
  
  
  
  
  return 0;
}