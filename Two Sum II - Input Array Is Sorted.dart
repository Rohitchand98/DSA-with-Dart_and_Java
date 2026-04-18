List<int> twosumII(List<int> lst, int targ) {
  List<int> newlst = [];
  int start = 0;
  int end = lst.length - 1;
  int sum = 0;
  while (start < end) {
    sum = lst[start] + lst[end];
    if (sum == targ) {
      newlst.add(start + 1);
      newlst.add(end + 1);
      return newlst;
    } else if (sum > targ) {
      end--;
    } else {
      start++;
    }
  }
  return newlst;
}

void main() {
  List<int> lst = [2, 7, 11, 15];
  int targ = 9;
  print(twosumII(lst, targ));
}
