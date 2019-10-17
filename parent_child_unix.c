#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

void  main(int argc, char const *argv[])
{
	int pid0,pid1,pid2;
//HI
	pid0=fork();

		if(pid0==0){

          printf("This is first child process id = %d, parent id= %d\n", getpid(),getppid());

         }

        else {
        	pid1=fork();

        	if(pid1==0)
         printf("This is second child process id = %d, parent id= %d\n", getpid(),getppid());

            else{
            pid2=fork();

                    if(pid2==0)
                 printf("This is third child process id = %d, parent id= %d\n", getpid(),getppid());
             else
                printf("This is parent process id = %d, parent id= %d\n", getpid(),getppid());


             }
        }

 }
