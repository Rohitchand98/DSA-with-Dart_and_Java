//Tribonacci series
void main() {
  int fib(int n) {
    if (n > 0) {
      if (n == 0) {
        return 0;
      } else if (n == 1) {
        return 1;
      }
    }
    int firstNum = 0;
    int secondNum = 1;
    int thirdNum = 1;
    for (int i = 0; i < n; i++) {
      int forthNum = firstNum + secondNum + thirdNum;
      firstNum = secondNum;
      secondNum = thirdNum;
      thirdNum = forthNum;  
    }
    return firstNum;
  }

  print(fib(25));
}
