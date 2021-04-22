
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
        this.Hash = calculateHash(this);
    }
    
    
    public static String calculateHash(Transaction Transaction){
        //gets all the data in the object and converts it to a string
        String hashString = Transaction.getSender()+ Transaction.getReciever()+ Double.toString(Transaction.getAmount())+ Double.toString(Transaction.getTime());
        //encodes it
        SHA256InJava hash = new SHA256InJava();
        String hashEncoded = hash.getSHA256Hash(hashString);
        //returns encoded block
        return hashEncoded;
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
