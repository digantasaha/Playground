// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{int n;scanf("%d",&n);
  int i,c=0;
 if(n==0) printf("neither");
 else{
 for(i=2;i<=n/2;i++){
 if(n%i==0)
 c++;}
  if(c==0) printf("prime");
    else printf("composite");}
   return 0;
}