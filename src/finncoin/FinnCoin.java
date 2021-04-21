
package finncoin;

import java.util.ArrayList;


public class FinnCoin {

    
    public static void main(String[] args) {
        
    }
    
    public static void calculateHashTransaction(Transaction Transaction){
        String hashTransactions = "";
    }
    
    public static void calculateHashBlock(Block Block){
        String hashTransactions = "";
        
        //loops through the transaction arraylist int the block
        for(int i = 0; i<(Block.getTranscation()).size();i++){
            
            //gets the transaction its on in the list
            Transaction Transaction = Block.getTranscation().get(i);
            //gets the transaction hash
            hashTransactions = hashTransactions + Transaction.getHash();
        }
        
        //String hashString = hashTransactions + other data in obj converted to string
        //encode hash
        //return it
    }
    
}
