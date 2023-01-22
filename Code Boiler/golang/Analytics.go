package main

import "fmt"

type Analytics struct {
	paymentTransactions map[string]float64
}

func (a *Analytics) AddPaymentTransaction(item string, amount float64) {
	a.paymentTransactions[item] = amount
}

func (a *Analytics) GetPaymentTransactions() map[string]float64 {
	return a.paymentTransactions
}

func main() {
	analytics := &Analytics{paymentTransactions: make(map[string]float64)}
	analytics.AddPaymentTransaction("item1", 10.50)
	analytics.AddPaymentTransaction("item2", 15.25)
	fmt.Println(analytics.GetPaymentTransactions())
}
