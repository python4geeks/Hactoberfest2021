class Solution {
    public boolean isPowerOfTwo(int num, int x) {
        return power(num, x);
    }
    public static boolean power(int num, x){
        if(num==0) return false;
        if(num==1) return true;
        if(num%x!=0) return false;
        return power(num/x, x);
    }
}
