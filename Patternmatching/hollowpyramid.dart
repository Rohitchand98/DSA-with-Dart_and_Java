import 'dart:io';
void main() {
  int rows = 5;

  for (int i = 1; i <= rows; i++) {
    // print leading spaces to center the triangle
    for (int j = i; j < rows; j++) {
      stdout.write(' ');
    }

    // print stars and spaces inside
    for (int k = 1; k <= (2 * i - 1); k++) {
      if (k == 1 || k == (2 * i - 1) || i == rows) {
        stdout.write('*'); // edges and last row
      } else {
        stdout.write(' '); // hollow space
      }
    }
    print('');
  }
}