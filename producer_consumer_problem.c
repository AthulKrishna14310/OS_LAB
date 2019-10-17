#include<stdio.h>

void main(){

            int ch=0;
            int value;
            int buffer=0;
            int semaphore=1;
            int MAX_SIZE=6;
            int MIN_SIZE=0;

         while(ch!=4)
          {
            printf("\n\t1.Producer\n\t2.Consumer\n\t3.Display\n\t4.Exit");
            printf("Choice ? ");
            scanf("%d",&ch);

            switch(ch){
                    case 1:
                              if((buffer+1)<=MAX_SIZE&&semaphore==1){
                                        wait(&semaphore);
                                        buffer=buffer+1;
                                        printf("\n\t Producer::Produced %d units",buffer);
                                        signal(&semaphore);
                                 }else{
                                 printf("\t Buffer full");

                                  }
                              break;
                    case 2:
                              if((buffer-1)>=MIN_SIZE&&semaphore==1){
                                        wait(&semaphore);
                                        buffer=buffer-1;
                                        printf("\n\tConsumer::Consumed 1 unit ");
                                        signal(&semaphore);
                                       }
                              else
                              {
                              printf("\tBuffer empty ");

                              }

                              break;
                    case 3:
                              printf("\n\tTotal units =  %d",buffer);
                              break;
                    default:
                             printf("Wrong choice ");
                             break;
                    }

          }


}
                           void wait(int *S){

                                  *S--;
                           }

                           void signal(int *S){
                           *S++;
                           }
