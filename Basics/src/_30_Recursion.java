public class _30_Recursion {
    public static void main(String[] args) {
        int value = factorial(5);
        System.out.println(value);
        System.out.println(5*4*3*2*1);

        System.out.println(factorial());
    }

    static int factorial(int number){
        if(number == 1){
            return 1;
        }else{
            return number * factorial(number - 1);
        }
    }

    static int factorial(){
        int num = 5;
        int factorialInit = 1;
        for(int i = 1; i <= num; i++){
            factorialInit *= i;
        }
        return factorialInit;
    }
}
