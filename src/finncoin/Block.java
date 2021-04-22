
package finncoin;

import java.util.ArrayList;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;


public class Block {
    
    private int Index; //block number
    private ArrayList<Transaction> Transcation; //transaction data
    private double time; //time block was created
    private String prevHash;//previous hash
    private String Hash;//hash
    
    
    public Block(int Index, ArrayList<Transaction> Transcation, double time, String prevHash, String Hash) {
        this.Index = Index;
        this.Transcation = Transcation;
        this.time = time;
        this.prevHash = prevHash;
        this.Hash = calculateHash(this);
    }
    
        public static String calculateHash(Block Block){
        String hashTransactions = "";
        
        //loops through the transaction arraylist int the block
        for(int i = 0; i<(Block.getTranscation()).size();i++){
            
            //gets the transaction its on in the list
            Transaction Transaction = Block.getTranscation().get(i);
            //gets the transaction hash
            hashTransactions = hashTransactions + Transaction.getHash();
        }
        
        //gets all the data in the object and converts it to a string
        String hashString = Double.toString(Block.getTime())+hashTransactions+Block.getPrevHash()+Integer.toString(Block.getIndex());
        //encodes it
        SHA256InJava hash = new SHA256InJava();
        String hashEncoded = hash.getSHA256Hash(hashString);
        //returns encoded block
        return hashEncoded;
    }

    public int getIndex() {
        return Index;
    }

    public void setIndex(int Index) {
        this.Index = Index;
    }

    public ArrayList<Transaction> getTranscation() {
        return Transcation;
    }

    public void setTranscation(ArrayList<Transaction> Transcation) {
        this.Transcation = Transcation;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(String prevHash) {
        this.prevHash = prevHash;
    }

    public String getHash() {
        return Hash;
    }

    public void setHash(String Hash) {
        this.Hash = Hash;
    }
    
    
    
}
