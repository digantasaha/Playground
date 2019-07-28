#include <stdio.h>
int main() {
int n;scanf("%d",&n);	
  int o=n;
  int r,s=0;
  while(o!=0){
  r=o%10;
  s=s+r*r*r;
  o=o/10;;}
  if(s==n)
  printf("Armstrong Number");
  else
  printf("Not an Armstrong Number");
    
	return 0;
}