package onlineShopingSystem;
import java.util.UUID;

interface PaymentMethod{
void processPayment(double amount);
}
class CreditCardPayment implements PaymentMethod{
    private String cardNumber;
    private  String cardHolderName;
    public CreditCardPayment(String cardNumber,String cardHolderName){
        this.cardNumber=cardNumber;
        this.cardHolderName=cardHolderName;
    }
    @Override
    public void processPayment(double amount){
        System.out.println("Processing credit card payment"+amount);
    }
}
class DebitCardPayment implements PaymentMethod{
    private String cardNumber;
    private  String cardHolderName;
    public DebitCardPayment(String cardNumber,String cardHolderName){
        this.cardNumber=cardNumber;
        this.cardHolderName=cardHolderName;
    }
    @Override
    public void processPayment(double amount){
        System.out.println("Processing debit card payment"+amount);
    }
}
class NetBankingPayment implements PaymentMethod{
    private String bankName;
    private  String accountNumber;
    public NetBankingPayment(String bankName,String accountNumber){
        this.bankName=bankName;
        this.accountNumber=accountNumber;
    }
    @Override
    public void processPayment(double amount){
        System.out.println("Processing net banking payment"+amount);
    }
}
class Payment {
    private UUID paymentID;
    private double amount;
    private String paymentMethod;
    public Payment(){}
        public Payment(double amount,String paymentMethod){
        this.amount=amount;
        this.paymentMethod=paymentMethod;
        }

    public UUID getPaymentID() {
        return paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public  void makePayment(){

    }
}
