package dmit2015.faces;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import org.omnifaces.util.Messages;

import java.io.Serializable;

@Named      // allows you to access an object of this class with the name sessionScopeCounterView using EL
@SessionScoped  // create this object for one HTTP session and destory after the HTTP session expires
                // class must implement Serializable
public class SessionScopeCounterView implements Serializable {

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public String submit() {
        counter += 1;
        Messages.addInfo(null,"SessionScoped Counter = {0}", counter);
        Messages.addInfo("counterResult", "SessionScoped Count Result = {0}", counter);
        return "";
    }
}