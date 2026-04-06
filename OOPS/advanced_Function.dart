
// Complete the TravelPlanner function below
String TravelPlanner({
  required String destination,
  required int durationInDays,
  int budget = 1000,
  int travelers = 1,
  bool includeInsurance = false,
}) {
  // Calculate budget per person
  int budgetPerPerson = (budget / travelers).round();

  // Return formatted trip details using multi-line string
  return '''
Trip to $destination planned:
  - Duration: $durationInDays days
  - Travelers: $travelers
  - Budget per person: \$$budgetPerPerson
  - Insurance: ${includeInsurance ? "Yes" : "No"}
''';
}

void main() {
  // Test with only required parameters
  print(TravelPlanner(destination: 'Paris', durationInDays: 7));
  
  // Test with all parameters
  print(TravelPlanner(
    destination: 'Tokyo',
    durationInDays: 10,
    budget: 5000,
    travelers: 3,
    includeInsurance: true,
  ));
}
