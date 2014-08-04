public class P7{
  public static void main(String args[]){
    long tenThousandPrime = 104729;
    long num = tenThousandPrime;
    boolean prime = false;
    
    while(!prime){
      num++;
      if(isPrime(num)){
        prime = true;
      }
    }
    
    System.out.println(num);
    
  }
  public static boolean isPrime(long num){
    for(int i = 2; i < num; i++){
      if(num % i == 0){
        return false;
      }
    }
    
    return true;
  }
}
