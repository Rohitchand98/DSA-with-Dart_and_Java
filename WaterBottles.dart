//Water Bottles
void main() {
  int waterbottle(int numBottles, int numExchange) {
    int toDrink = numBottles;
    while(numBottles >=numExchange){
        int newBottles = numBottles ~/ numExchange;
        int remBottles = numBottles % numExchange;
        toDrink += newBottles;
        numBottles = newBottles + remBottles;
    }
    return (toDrink);
  }
  print(waterbottle(15, 4));
}
