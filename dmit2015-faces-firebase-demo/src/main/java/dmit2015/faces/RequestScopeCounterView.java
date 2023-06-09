package dmit2015.faces;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import org.omnifaces.util.Messages;

@Named  // allows you to access an object of this class with the name requestScopeCounterView using EL
@RequestScoped  // create this object for one HTTP request and destroy after the HTTP response has been sent
public class RequestScopeCounterView {

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public String submit() {
        counter += 1;
        Messages.addInfo(null,"RequestScoped Counter = {0}", counter);
        Messages.addInfo("counterResult", "RequestScoped Count Result = {0}", counter);
        return "";
    }
}