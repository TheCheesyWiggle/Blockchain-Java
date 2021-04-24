
package finncoin;

import java.util.ArrayList;

public class FinnCoin {
    
    public static void main(String[] args) {
        
        ArrayList<Block> chain = new ArrayList<Block>();
        ArrayList<Transaction> pendingTransactions = new ArrayList<Transaction> ();
        
        Blockchain Blockchain = new Blockchain(chain,pendingTransactions);
        
        Blockchain.genesisBlock(Blockchain);
        
        Transaction test = new Transaction("","",100);
        pendingTransactions.add(test);
        
        Blockchain.setPendingTransactions(pendingTransactions);
        
        Blockchain.minePendingTransactions(Blockchain,"Finn");
                
        for(int i = 0; i<Blockchain.getBlockchain().size();i++){
            System.out.println(Blockchain.getBlockchain().get(i).toString());
        }
        System.out.println("Length: "+Blockchain.getBlockchain().size());
    }
        
    
    
}
