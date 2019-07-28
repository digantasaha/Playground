#include<stdio.h>
int main()
{
  long long int n;scanf("%lld",&n);
  long long int a[n],i;
  for(i=0;i<n;i++)
  scanf("%lld",&a[i]);
  long long int t=a[0];
  for(i=0;i<n;i++){
  if(a[i]>=t)
  t=a[i];}
  printf("%lld",t);
  
  
}