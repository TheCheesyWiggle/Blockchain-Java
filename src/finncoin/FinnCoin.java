
package finncoin;

import java.util.ArrayList;
import java.util.Date;


public class FinnCoin {
    public static ArrayList<Block> Blockchain = new ArrayList<Block>();
    
    public static void main(String[] args) {
        
        ArrayList<Transaction> Transaction = new ArrayList<Transaction>();
        
        Date Time = new Date();
        
        Block Block0 = new Block(0,Transaction,Time.getTime());
        addBlock(Block0);
        
        Block Block1 = new Block(1,Transaction, Time.getTime());
        addBlock(Block1);
        
        Block Block2 = new Block(2,Transaction, Time.getTime());
        addBlock(Block2);
        
        for(int i = 0; i<Blockchain.size();i++){
            System.out.println(Blockchain.get(i).toString());
        }
    }
        
    public static Block getLastBlock(ArrayList<Block> Chain){
        return Chain.get(Chain.size()-1);
    }
    
    public static void addBlock(Block Block){
        if(Blockchain.size()>0){
            Block.setPrevHash(getLastBlock(Blockchain).getHash());
        }
        else{
            Block.setPrevHash("none");
        }
        Blockchain.add(Block);
    }
    
    
}
