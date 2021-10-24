/*Code to find the factorial of numbers whose factorial value might exceed the digit holding capacity of double also
 and count the number if zeros*/


import java.util.*;

public class BigFactorial {

    public static void main(String args[]){

        int i,j,n,d=1,carry=0,p,g=0,c=0,a[];
        a=new int[500000];
        a[0]=1;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number, you want to find the factorial of");
        p=sc.nextInt();

     //   if(p>=500)
       //     a=new int[1000000];  //depending upon the config of machine one may prefer to use an array of [1000000]

        for(i=2;i<=p;i++)
        {
            for(j=0;j<d;j++)
            {
                n=(a[j]*i)+carry;
                a[j]=n%10;
                carry=n/10;
            }

            while(carry>0)
            {
                a[d++]=carry%10;
                carry/=10;
            }
        }
        for(i=d;i>=0;i--)
        {
            if(a[i]==0)
                c++;
            else if(a[i]!=0)
                c=0;
            System.out.print(a[i]);
        }
        System.out.println("\n\nzero=\n"+c);
    }
}
