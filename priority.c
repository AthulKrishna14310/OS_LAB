// SJF Non pre-emptive
// Input should have a minimum rrival time of 0
#include <stdio.h>
struct Process {
    int id;
    int at;
    int bt;
    int ct;
    int tat;
    int wt;
    int priority;
};

void main(){
     
     struct Process P[5];
     struct Process t;
     
     int    fwt=0;
     int    ftat=0;
     int    temp=0;

     for(int i=0;i<5;i++){
      P[i].id=i+1;   
      printf("\n AT of P[%d] ?",i+1);
      scanf("%d",&P[i].at);
      printf("\n BT of P[%d] ?",i+1);
      scanf("%d",&P[i].bt);
      printf("\n Priority of P[%d] ?",i+1);
      scanf("%d",&P[i].priority);
   
    }

     
     
     for(int i=0;i<5;i++){
      
      if(P[i].at==0){
          
        t=P[0];
        P[0]=P[i];
        P[i]=t;
        
        P[0].ct=P[0].bt;
        P[0].tat=P[0].ct-P[0].at;
        P[0].wt=P[0].tat-P[0].bt;
        temp+=P[0].ct;
        ftat+=P[0].tat;
        fwt+=P[0].wt;
         }
     }   
     
        for (int i = 1; i < 5; i++)
        {
            for (int j = 1; j < 5-i; j++)
            {
                /* code */
                if(P[j].priority<P[j+1].priority){
                       t=P[j];
                       P[j]=P[j+1];
                       P[j+1]=t;
                }
            }
            
        }

         for(int i=1;i<5;i++){
             temp+=P[i].bt;
             P[i].ct=temp;
             P[i].tat=P[i].ct-P[i].at;
             P[i].wt=P[i].tat-P[i].bt;
             fwt+=P[i].wt;
             ftat+=P[i].tat;
         }


        for (int i = 0; i < 5; i++)
        {
            /* code */
            printf("\n");
            printf("%d-- AT= %d -- BT= %d --Priority %d --CT= %d --TAT = %d --WT = %d "
            ,P[i].id,P[i].at,P[i].bt,P[i].priority,P[i].ct,P[i].tat,P[i].wt);
        }
        float awt=fwt/5;
        float atat=ftat/5;
        printf("Average wt= %f",awt);
        printf("Average tat= %f",atat);
        
     


}