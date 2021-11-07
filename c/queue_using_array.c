#include <stdio.h>
#include <stdlib.h>

struct queue{
    int q[5];
    int front;
    int rear;

}q1;


void enqueue(int element){
    
    if (q1.rear==5){
        printf("\nOverFlow\n");
        return ;
    }
    else{
        if (q1.front==-1 && q1.rear==-1){
            q1.front=1;
            q1.q[q1.front]=element;
            q1.rear=1;
            printf("\nItem enqueued\n");
            return ;
        }
        else{
            q1.rear+=1;
            q1.q[q1.rear]=element;
            printf("\nItem enqueued\n");
            return ;

        }
        
    }
    
}

void dequeue(){
    int element=0;
    if (q1.front==-1 && q1.rear==-1){
        printf("\nUnderFlow\n");
        return ;
    }
    else{
        if (q1.front==q1.rear){
            element=q1.q[q1.front];
            q1.front=-1;
            q1.rear=-1;
            printf("\nElement Dequeued : %d \n",element);
            return ;
        }
        else{
            element=q1.q[q1.front];
            q1.front+=1;
            printf("\nElement Dequeued : %d \n",element);
            return ;
        }
    }
    
    
}


void traverse(){
    if (q1.front==-1 && q1.rear==-1){
        printf("\nQueue is empty\n");
        return ;
    }
    else{
        printf("\nThe queue is  : \n");
        for (int i=q1.front;i<=q1.rear;i++){ // Changed int i=1 to int i=q1.front
            printf("%d\t",q1.q[i]);
        }
        printf("\n");
    }
}


void main(){
    int choice=0;
    int el;
    q1.front=-1; //initially we have to initialize front and rear as -1
    q1.rear=-1; // read above comment ^

    while(choice!=4){
        printf("\nYour options are  : \n");
        printf("\n1.Enqueue \n2.Dequeue \n3.Traversal\n\n");
        scanf("%d",&choice);

        switch (choice) {
            case 1 : 
                printf("\nEnter your element : \n");
                scanf("%d",&el);      

                enqueue(el);
                break;

            case 2:
                
                dequeue();
                break;

            case 3:
                traverse();
                break;

            case 4:
                exit(0);         

        }
    }

}
