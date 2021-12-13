// 1 1 2 3 5 8 13
//get the first two numbers 0 and 1 then print the first number then make the num1 value = num2 and num2 = num1+num2 which makes
//num 2 be the third num. So now num1 and num2 are moved up one spot. Then to make sure that it stops doing this we make a
//counter
class practice {
  static void fib(int N) {

    int num1 = 0, num2 = 1;
    int counter = 0;
    while (counter < N){

      System.out.print(num1 +" ");
      int num3 = num2+ num1;
      num1 = num2;
      num2 = num3;
      counter += 1;
    }



}
  public static void main(String[] args) {
      fib(10);
    }
}
