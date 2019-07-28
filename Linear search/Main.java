#include<stdio.h>
int main()
{int n;scanf("%d",&n);
  int a[n],i,c=0,t;
  for(i=0;i<n;i++)
  scanf("%d",&a[i]);
  scanf("%d",&t);
  for(i=0;i<n;i++){
  if(t==a[i]){
  c=i+1;break;}}
 if(c==0)printf("%d isn't present in the array.",t);
 else
  printf("%d",c);
  return 0;
}