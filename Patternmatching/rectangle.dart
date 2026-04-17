import 'dart:io';

void main() {
  int n = 5; // size of the square

  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
        stdout.write(" * ");
      } else {
        stdout.write("   ");
      }
    }
    print(" "); // move to next line
  }
}
