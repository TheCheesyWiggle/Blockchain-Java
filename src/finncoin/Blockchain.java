
package finncoin;

import java.util.ArrayList;
import java.util.Date;

public class Blockchain {
    
    private ArrayList<Block> Blockchain;
    private ArrayList<Transaction> pendingTransactions;
    private int difficulty;
    private int minerReward;
    private int blockSize;
    
    // <editor-fold defaultstate="collapsed" desc="Constructors"> 
    public Blockchain(ArrayList<Block> Blockchain, ArrayList<Transaction> pendingTransactions) {
        this.Blockchain = Blockchain;
        this.pendingTransactions = pendingTransactions;
        this.difficulty = 3;
        this.minerReward = 50;
        this.blockSize = 10;
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Getters & Setters"> 
    public ArrayList<Block> getBlockchain() {
        return Blockchain;
    }

    public void setBlockchain(ArrayList<Block> Blockchain) {
        this.Blockchain = Blockchain;
    }

    public ArrayList<Transaction> getPendingTransactions() {
        return pendingTransactions;
    }

    public void setPendingTransactions(ArrayList<Transaction> pendingTransactions) {
        this.pendingTransactions = pendingTransactions;
    }
// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Get Last Block"> 
    public static Block getLastBlock(ArrayList<Block> Chain){
        return Chain.get(Chain.size()-1);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Add Block"> 
    public static void addBlock(Block Block,Blockchain Blockchain){
        if(Blockchain.getBlockchain().size()>0){
            Block.setPrevHash(getLastBlock(Blockchain.getBlockchain()).getHash());
        }
        else{
            Block.setPrevHash("none");
        }
        Blockchain.getBlockchain().add(Block);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Alpha Block"> 
    public static void genesisBlock(Blockchain Blockchain){
        ArrayList<Transaction> Transaction = new ArrayList<Transaction>();
        Date Time = new Date();
        Transaction Setup = new Transaction("","",100);
        Transaction.add(Setup);
                
        Block genesis = new Block(0,Transaction);
        Blockchain.addBlock(genesis,Blockchain);
    }
    // </editor-fold>
}
