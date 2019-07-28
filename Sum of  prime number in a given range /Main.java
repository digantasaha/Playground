#include<stdio.h>
int main()
{int n; scanf("%d",&n);
  int j,i,s=0,z=0;
  for(i=2;i<=n;i++){z=0;
  for(j=2;j<i;j++){
  if(i%j==0)z++;}
  if(z==0){s=s+i;}
   // printf("%d ",i);                   
  }
  printf("%d",s);
  
  
  return 0;
}