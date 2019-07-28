#include<stdio.h>
#include<string.h>
int main(){
char a[20],b[20],c[20];
scanf("%s %s %s",a,b,c);
int i;
for(i=0;i<strlen(a);i++){
if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
a[i]='$';}
for(i=0;i<strlen(b);i++){
if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U')
continue;
else b[i]='#';}
for(i=0;i<strlen(c);i++){
  if(c[i]>=97 && c[i]<=123)
  c[i]=c[i]-32;}
printf("%s%s%s",a,b,c);
  return 0;}