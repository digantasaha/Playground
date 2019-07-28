#include<stdio.h>
#include<string.h>
int main()
{char a[50],b[50],c[50];
  scanf("%s %s %s",a,b,c);
  int i,l1=strlen(a),l2=strlen(b),l3=strlen(c);
  for(i=0;i<l1;i++){
  if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
  a[i]='$';}
for(i=0;i<l2;i++){  
if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U')
continue;  
  else b[i]='#';}
 for(i=0;i<l3;i++){ 
 if(c[i]>=97 && c[i]<=123) c[i]=c[i]-32;}
 strcat(a,b);strcat(a,c);
  printf("%s",a);
}