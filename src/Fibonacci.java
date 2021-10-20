public class Fibonacci {


    public static String fibonacci(int num){

        int a=1;
        int b=1;
        int c=0;
        for(int i=1 ;i<= num ; i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;


        }
        return "finish";
    }


}
