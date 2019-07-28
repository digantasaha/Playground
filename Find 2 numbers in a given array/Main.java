#include<stdio.h>
int main()
{int n;scanf("%d",&n);
  int i,a[n];int x,y,c1=-1,c2=-1;
  for(i=0;i<n;i++) scanf("%d",&a[i]);
  scanf("%d%d",&x,&y);
  for(i=0;i<n;i++){
  if(a[i]==x)
  c1=i;
  if(a[i]==y)
  c2=i;}
  printf("Element 1 index = %d\nElement 2 index = %d",c1,c2);
  
  
}