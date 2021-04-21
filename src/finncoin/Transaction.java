
package finncoin;


public class Transaction {
    
    private String sender;
    private String reciever;
    private double amount;
    private double time;
    private String Hash;

    public Transaction(String sender, String reciever, double amount, double time, String Hash) {
        this.sender = sender;
        this.reciever = reciever;
        this.amount = amount;
        this.time = time;
        this.Hash = Hash;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getHash() {
        return Hash;
    }

    public void setHash(String Hash) {
        this.Hash = Hash;
    }
    
    
}
