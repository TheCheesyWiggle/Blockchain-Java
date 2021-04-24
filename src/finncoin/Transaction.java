
package finncoin;

import java.util.Date;


public class Transaction {
    
    private String sender;
    private String reciever;
    private double amount;
    private double time;
    private String Hash;
    
    // <editor-fold defaultstate="collapsed" desc="Constructors"> 
    public Transaction(String sender, String reciever, double amount) {
        this.sender = sender;
        this.reciever = reciever;
        this.amount = amount;
        Date Time = new Date();
        this.time = Time.getTime();
        this.Hash = calculateHash(this);
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Calculate hash"> 
    public static String calculateHash(Transaction Transaction){
        //gets all the data in the object and converts it to a string
        String hashString = Transaction.getSender()+ Transaction.getReciever()+ Double.toString(Transaction.getAmount())+ Double.toString(Transaction.getTime());
        //encodes it
        SHA256InJava hash = new SHA256InJava();
        String hashEncoded = hash.getSHA256Hash(hashString);
        //returns encoded block
        return hashEncoded;
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Getters & Setters"> 
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
    // </editor-fold>
    
}
