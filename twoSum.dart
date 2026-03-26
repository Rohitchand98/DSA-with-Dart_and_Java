import 'dart:io';

void main() {
  stdout.write("Enter the Target number: ");
  int numintp = int.parse(stdin.readLineSync()!);

  List<int> lst = [1, 2, 3, 4, 5];
  List<int> ans = [];

  for (int i = 0; i < lst.length; i++) {
    for (int j = i + 1; j < lst.length; j++) {
      if (lst[i] + lst[j] == numintp) {
        ans.add(i);
        ans.add(j);
        break; // stop after finding the first pair
      }
    }
    if (ans.isNotEmpty) break;
  }

  if (ans.isEmpty) {
    print("No pair found.");
  } else {
    print("Indices: $ans");
    print("Values: ${lst[ans[0]]}, ${lst[ans[1]]}");
  }
}
