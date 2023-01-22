package main

import (
	"crypto/rand"
	"encoding/hex"
	"fmt"
	"os"
	"strings"
)

type SignUp struct {
	firstName     string
	lastName      string
	email         string
	password      string
	accountNumber string
}

func (s *SignUp) validateInput() bool {
	if !strings.HasSuffix(s.email, "@example.com") {
		fmt.Println("Invalid email address")
		return false
	}
	if len(s.password) < 8 {
		fmt.Println("Password too short")
		return false
	}
	return true
}

func (s *SignUp) register() {
	if !s.validateInput() {
		return
	}
	randomBytes := make([]byte, 4)
	_, err := rand.Read(randomBytes)
	if err != nil {
		fmt.Println("Error generating random bytes:", err)
		os.Exit(1)
	}
	accountNumber := s.firstName[0:1] + s.lastName[0:1] + hex.EncodeToString(randomBytes)
	fmt.Println("Registration successful! Your account number is: ", accountNumber)
	os.Exit(0)
}

func main() {
	user := SignUp{
		firstName: input("Enter your first name: "),
		lastName:  input("Enter your last name: "),
		password:  input("Enter your password: "),
	}
	user.register()
}

func input(prompt string) string {
	fmt.Print(prompt)
	var input string
	fmt.Scanln(&input)
	return input

}
