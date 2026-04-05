void main() {
  int n = 10, m = 0;
  while (m <= n) {
    String bin = m.toRadixString(2).padLeft(5, "0");
    print("$m -> $bin");
    m++;
  }
}
