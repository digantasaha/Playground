#include <stdio.h>
int main()
{
int a,b;scanf("%d%d",&a,&b);
  int i,p=1;
  if (b<0) printf("Wrong input");
  else{
  for(i=1;i<=b;i++)
  p=a*p;
  printf("%d",p);
  }
    return 0;
}