public class P5{
  public static void main(String args[]){
    int num = 2520;
    
    for(int i = 1; i <= 20; i++){
      if(num % i != 0){
        num++;
        i = 0;
      }
    }
    
    System.out.println(num);
  }
}
