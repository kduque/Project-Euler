public class P2{
  public static void main(String args[]){
    System.out.print(fib(4000000));
  }
  
  public static long fib(int n){
    int a = 1, b = 2, c=0;
    long sum = 0;
    
    while(c <= n){
       if(b % 2 == 0){
         sum += b;
       }
       
       c = a + b;
       a = b;
       b = c;
    }
    
    return sum;
  }
}
