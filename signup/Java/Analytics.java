package signup.Java;


import java.util.HashMap;
import java.util.Map;

public class Analytics{
    private Map<String, Double> paymentTransactions;

    public Analytics() {
        paymentTransactions = new HashMap<>();
    }

    public void addPaymentTransaction(String item, double amount) {
        paymentTransactions.put(item, amount);
    }

    public Map<String, Double> getPaymentTransactions() {
        return paymentTransactions;
    }
}
