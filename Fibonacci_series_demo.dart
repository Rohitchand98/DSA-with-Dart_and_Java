//Fibonacci series
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
    for (int i = 2; i <= n; i++) {
      int thirdNum = firstNum + secondNum;
      firstNum = secondNum;
      secondNum = thirdNum;
    }
    return secondNum;
  }
  print(fib(4));
}
