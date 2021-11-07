#include <stdio.h>
#include <stdlib.h>


struct stack{
    int st[10];
    int top;
}s1;


void push(int element){

    if (s1.top>=10){
        printf("\nOverFlow");
        return ;
    }
    else{
        s1.top+=1;
        s1.st[s1.top]=element;
        printf("\nItem Pushed\n");
    }
    
}

void pop(){
    if (s1.top==0){
        printf("\nUnderFlow");
        return ;
    }
    else{
        s1.top-=1;
        printf("\nItem Popped\n");
    }
}

void traverse(){
    if (s1.top==0){
        printf("\nEmpty Stack");
        return ;
    }
    else{
        printf("\nThe Stack is  : \n");
        for (int i=1;i<=s1.top;i++){
            printf("%d\t",s1.st[i]);
        }
        printf("\n");
    }
}

void main(){
    int choice=0;
    int el;

    while(choice!=4){
        printf("\nYour options are  : \n");
        printf("\n1.Pop \n2.Push \n3.Traversal\n");
        scanf("%d",&choice);

        switch (choice) {
            case 1 :       

                pop();
                break;

            case 2:
                printf("\nEnter your element : \n");
                scanf("%d",&el);
                push(el);
                break;

            case 3:
                traverse();
                break;

            case 4:
                exit(0);         




        }
    }

}
