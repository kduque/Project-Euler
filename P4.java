import java.util.*;

public class P4{
  public static void main(String args[]){
    List<Long> palindrome = palindrome(100,999);
    System.out.println(palindrome.get(palindrome.size() - 1));
  }
  public static List<Long> palindrome(int start, int end){
    List<Long> listPalindrome = new ArrayList<Long>();
    
    for(int i = start; i <= end; i++){
      for(int j = start; j <= end; j++){
        long product = i*j;
        long palindrome = reverse(product);
      
        if(product == palindrome){
          listPalindrome.add(product);
        }
      }      
    }
    
    Collections.sort(listPalindrome);
    return listPalindrome;
  }
  public static long reverse(long num){
    long reverse = 0;
    long remainder;
    
    while(num > 0){
      remainder = num % 10;
      num /= 10;
      reverse = reverse * 10 + remainder;
    }
    
    return reverse;
  }
}
