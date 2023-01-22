class Wallet {
  int balance = 0;

  void viewBalance() {
    print("Your balance is: $balance");
  }

  void deposit(int amount) {
    balance += amount;
    print("$amount has been added to your account. Your balance is: $balance");
  }

  static void main() {
    Wallet wallet = Wallet();
    wallet.viewBalance();
    wallet.deposit(100);
    wallet.viewBalance();
  }
}
