#include<stdio.h>
#include<conio.h>
void main()
{
    int n;
    printf("\n Enter the no. of element :");
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        printf("\n %d \t : \t",i+1);
        scanf("%d",&a[i]);
    }
     insertion_sort(a,n);//call to function of insertion sort
     printf("\n** SORTED ARRAY **");
     //sorted array
     for(int i=0;i<n;i++)
    {
        printf("\n %d \t : \t %d",i+1,a[i]);
    }
     getch();

}
//insertion sort logic
insertion_sort(int a[],int n)
{
    int i,j,temp;
    for(i=1;i<n;i++)
    {
        temp=a[i];
        j=i-1;
        while(temp<a[j]&&j>=0)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=temp;
    }
}
