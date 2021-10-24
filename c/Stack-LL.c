#include<stdio.h>
#include<stdlib.h>
typedef struct List{
    int data;
    struct List *next;
}Node;
Node *head=NULL;
void push(int ele){
    Node *x=(Node*)malloc(sizeof(Node));
    x->data=ele;
    x->next=head;
    head=x;
}
int pop(){
    int n;
    Node *x;
    if(head==NULL){
        printf("\n UNDERFLOW CONDITION");
        return -1;
    }
    n=head->data;
    x=head;
    head=head->next;
    x->next=NULL;
    free(x);
    return n;
}
void display(){
    Node *temp=head;
     if(head==NULL){
        printf("\n UNDERFLOW CONDITION");
        return;
    }
    printf("\n");
    while(temp!=NULL){
        printf("%d --> ",temp->data);
        temp=temp->next;
    }
    printf("NULL");
}
int main(){
    push(1);
    display();
    push(2);
    display();
    push(3);
    display();
    printf("\n Element Deleted is: %d",pop());
    display();
    return 0;
}