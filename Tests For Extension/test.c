#include <stdio.h>
#include <stdlib.h>

int main()
{
char buff[2];
fgets(buff,1, stdin);
char in;
in = buff[0];
printf("%c", in);
}