public class Main {
    public static void main(String[] args) {
        System.out.println(NextPerfectSquare(36));
    }

    public static int  NextPerfectSquare(int n) {
        if (n<0)return 0;
        int sqrt=(int)Math.sqrt(n);
        int nextnumber=sqrt+1;
        int NextperfectSqrt=nextnumber*nextnumber;
        return NextperfectSqrt;


    }
}