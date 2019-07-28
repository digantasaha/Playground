#include <stdio.h>
#include <math.h>
int main() {
int n;scanf("%d",&n);
  int o=n,n1,r;
  while(o!=0){
   r=o%10;  
  o=o/10;
  n1++;}
  int p1=pow(10,(n1-2));
  int f=n/p1;
  int s=f%10;
  printf("%d",s);
  
	return 0;
}