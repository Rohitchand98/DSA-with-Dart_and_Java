void main() {
  // List of calculation results
  List<Map<String, dynamic>> calculationResults = [
    {'type': 'Addition', 'num1': 10, 'num2': 5, 'result': 15},
    {'type': 'Subtraction', 'num1': 20, 'num2': 7, 'result': 13},
    {'type': 'Multiplication', 'num1': 4, 'num2': 6, 'result': 24},
  ];

  // Call the function to display results
  displayResults(calculationResults);
}

// Complete this function to display all calculation results
void displayResults(List<Map<String, dynamic>> results) {
  print('Calculation Results:');
  print('-------------------');
  for (int i = 0; i < results.length; i++) {
    var calc = results[i];
    print("${calc["type"]}: ${calc["num1"]} and ${calc["num2"]} = ${calc["result"]}");
  }

  // in the format: "[Type]: [num1] and [num2] = [result]"
}
