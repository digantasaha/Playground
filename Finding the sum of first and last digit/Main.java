#include <stdio.h>
int main() {
int n,n1;scanf("%d",&n);	
  int o=n,r;
  while(o!=0){
     r=o%10;
  o=o/10;
  n1++;}
  int p1=pow(10,(n1-1));
  int f=n/p1;
  int l=n%10;
  int s=f+l;
  printf("%d",s);
	return 0;
}