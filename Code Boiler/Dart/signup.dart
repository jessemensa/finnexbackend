import 'dart:convert';
import 'dart:io';
import 'dart:math';

class SignUp {
  String? firstName;
  String? lastName;
  String? email;
  String? password;
  String? accountNumber;

  SignUp() {
    print("Enter your first name: ");
    firstName = stdin.readLineSync();
    print("Enter your last name: ");
    lastName = stdin.readLineSync();
    print("Enter your email: ");
    email = stdin.readLineSync();
    print("Enter your password: ");
    password = stdin.readLineSync();
    accountNumber = firstName![0] +
        lastName![0] +
        Random().nextInt(1 << 32).toRadixString(16);
  }

  bool validateInput() {
    if (!email!.endsWith("@example.com")) {
      print("Invalid email address");
      return false;
    }
    if (password!.length < 8) {
      print("Password too short");
      return false;
    }
    return true;
  }

  void register() {
    if (!validateInput()) {
      return;
    }
    print("Registration successful! Your account number is: $accountNumber");
    exit(0);
  }
}

void main() {
  SignUp user = SignUp();
  user.register();
}
