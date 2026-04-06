int missingnumber(List<int> lst) {
  int n = lst.length;
  int totalsum = (n * (n + 1)) ~/ 2;
  int currentsum = 0;
  for (int i = 0; i < lst.length; i++) {
    currentsum += lst[i];
  }
  int ans = totalsum - currentsum;
  return ans;
}

void main() {
  List<int> lst = [0, 1, 2, 4];
  print(missingnumber(lst));
}
