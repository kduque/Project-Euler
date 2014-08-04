public class P6{
  public static void main(String args[]){
    double sumSquares = 0, squareSum = 0;
    
    for(int i = 1; i <= 100; i++){
      sumSquares += Math.pow(i,2);;
      squareSum += i;
    }
    
    squareSum = Math.pow(squareSum, 2);
    
    System.out.println(squareSum - sumSquares);
  }
}
