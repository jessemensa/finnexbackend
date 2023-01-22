package main

import "fmt"

type Wallet struct {
	balance int
}

func (w *Wallet) ViewBalance() {
	fmt.Println("Your balance is: ", w.balance)
}

func (w *Wallet) Deposit(amount int) {
	w.balance += amount
	fmt.Printf("%d has been added to your account. Your new balance is: %d\n", amount, w.balance)
}

func main() {
	wallet := Wallet{}
	wallet.ViewBalance()
	wallet.Deposit(50)
	wallet.ViewBalance()
}
