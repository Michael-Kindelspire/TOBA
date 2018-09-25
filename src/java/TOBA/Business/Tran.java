package TOBA.Business;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Tran implements Serializable {
    private long transNum;
@ManyToOne
    private Account account;
    public Tran(long transNum, Account account) {
        this.transNum = transNum;
        this.account = account;
    }

    public long getTransNum() {
        return transNum;
    }

    public void setTransNum(long transNum) {
        this.transNum = transNum;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
  
    
    
}
