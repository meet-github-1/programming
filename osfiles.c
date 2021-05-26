#include<stdio.h>
#include<unistd.h>
#include<string.h>
#include<fcntl.h>
int main(){
	int fd[2];
	char buf1[25]="just a test\n";
	char buf2[25];
	fd[0]=open("E:/sublime/file1.txt",O_RDWR);
	fd[1]=open("E:/sublime/file2.txt",O_RDWR);
	write(fd[0],buf1,strlen(buf1));
	scanf("%[^\n]%*c",buf1);
	printf("line is %s",buf1);
	write(fd[0],buf1,strlen(buf1));
	lseek(fd[0],SEEK_SET,0);
	read(fd[0],buf2,strlen(buf1));
	write(fd[1],buf2,strlen(buf2));
	close(fd[0]);
	close(fd[1]);
}