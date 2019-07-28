#include <stdio.h>
int main() {
int n;scanf("%d",&n);	
  int o=n,r,s=0,p=1;
  while(n!=0){
 r=n%10; p=1;
  for(int i=1;i<=r;i++)
  p=p*i;
  s=s+p;
  n=n/10;}
  if(s==o)
  printf("Yes");
  else
  printf("No");
	return 0;
}