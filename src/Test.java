public class Test {

    public static void main(String[] args) {

        System.out.println(" result = "+new Test().tail(3,0,1));

        System.out.println(" result = "+new Test().fibWithItr(3));

        System.out.println(" result = "+new Test().gcd(25,92));
    }


    public int tail(int n, int a, int b) {

        if(n==0) return a;
        if(n==1) return b;
        System.out.println("n = " + n + " a="+a + " b="+b);
        return tail(n-1,b,a+b);
    }

    public int fibWithItr(int n) {

        int i = 0,j= 1, res = 0;
        if(n==0) return i;
        if(n==1) return j;

        for(int k = 2; k<=n ;k++)
        {
            System.out.println("in loop " );
            res = i + j;
            i = j;
            j = res;
        }

        System.out.println("result = " + j);

        return j;//return tail(n-1,b,a+b);
    }


    public int gcd(int a,int b){

        if(b > a)
            return 1;

        if(a%b == 0)
            return b;

        return gcd(b,a%b);
    }
}
