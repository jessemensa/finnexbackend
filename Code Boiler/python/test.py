from signup import SignUp 
import unittest 

class Testing(unittest.TestCase): 
    def test_register(self): 
        user = SignUp() 
        account_number = user.register()
        self.assertIsNotNone(account_number) 

if __name__ == '__main__': 
    unittest.main()