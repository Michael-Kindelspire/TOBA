package TOBA.Business;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long balance;
    private User userID;
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public long getBalance() {
        return balance;
    }

    public User getUserID() {
        return userID;
    }
  

    public Account(long balance, User userID) {
        this.balance = balance;
        this.userID = userID;
    }
    
    public void Credit(double amount) {
        this.balance += amount;
    }

    public void Debit(double amount) {
        this.balance -= amount;
    }
    
}
