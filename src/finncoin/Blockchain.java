
package finncoin;

import java.util.ArrayList;


public class Blockchain {
    
    private ArrayList<Block> Chain;

    public Blockchain(ArrayList<Block> Chain) {
        this.Chain = Chain;
    }
    
    public Block getLastBlock(ArrayList<Block> Chain){
        return Chain.get(Chain.size()-1);
    }
    
    public void addBlock(Block Block){
        if(Chain.size()>0){
            Block.setPrevHash(getLastBlock(Chain).getHash());
        }
        else{
            Block.setPrevHash("none");
        }
        Chain.add(Block);
    }

    public ArrayList<Block> getChain() {
        return Chain;
    }

    public void setChain(ArrayList<Block> Chain) {
        this.Chain = Chain;
    }
    
    
}
