import 'dart:io';

void main() {
  int n = 5;
  for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
      stdout.write(' ');
      if (i == 0 || i == n - 1|| j == 0 || j == n - 1) {
      for (int k = 1; k <= (2 * i -1); k++) {
        stdout.write("*");
      }
    }
    }
    

    print(' ');
  }
}
