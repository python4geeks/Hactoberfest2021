class armstrong{
    public static void main(String[] arg){
        int n = 155;
        int temp  = n;
        int r,sum=0;

        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum + r*r*r;
        }

        if(temp==sum){
            System.out.println("it is an Armstrong number");
        }
        else{
            System.out.println("it is not an Armstrong number");
        }
        
    }
}
