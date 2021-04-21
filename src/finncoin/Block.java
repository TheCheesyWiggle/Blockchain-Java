
package finncoin;

import java.util.ArrayList;


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
        this.Hash = Hash;
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
