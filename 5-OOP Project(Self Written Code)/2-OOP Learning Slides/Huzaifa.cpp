#include<stdio.h>
int main()
{
	char a[15];
	int i,j;
	printf("Plz Enter DNA SEQUENCE");
    scanf("%s",&a);
	for(j=0;j<15;j++)
	{
		if(a[j]=='A')
		{
			a[j]='U';
		}
		else if(a[j]=='C')
		{
			a[j]='G';
		}
		else if(a[j]=='T')
		{
			a[j]='A';
		}
		else if(a[j]=='G')
		{
			a[j]='C';
		}
		
	}
	for(i=0;i<15;i++)
	{
		printf("%c",a[i]);
	}
}
