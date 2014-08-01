import java.util.*;

public class P3{
  public static void main(String args[]){
    List<Integer> primeFactors= prime(600851475143L);
    System.out.print(primeFactors.get(primeFactors.size()-1));
  }
  public static List<Integer> prime(long num){
    List<Integer> primeFactors = new ArrayList<Integer>();
    long temp = num;
    
    for(int i = 2; i <= temp; i++){
      if( temp % i == 0 ){
        primeFactors.add(i);
        temp /= i;
      }
    }
    
    Collections.sort(primeFactors);
    
    return primeFactors;
  }
}
