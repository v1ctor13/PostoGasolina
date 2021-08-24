package Classes;

import Interfaces.PgnMsg;

public class Msg {
    PgnMsg pe = new PgnMsg();
    
    public Msg(){}
    
    public void msg(String msgString){
        PgnMsg pe = new PgnMsg(msgString);
        pe.setVisible(true);
    }
}
