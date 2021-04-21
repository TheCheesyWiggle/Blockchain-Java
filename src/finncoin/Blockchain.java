
package finncoin;

import java.util.ArrayList;


public class Blockchain {
    
    private ArrayList<Block> Chain;

    public Blockchain(ArrayList<Block> Chain) {
        this.Chain = Chain;
    }

    public ArrayList<Block> getChain() {
        return Chain;
    }

    public void setChain(ArrayList<Block> Chain) {
        this.Chain = Chain;
    }
    
    
}
