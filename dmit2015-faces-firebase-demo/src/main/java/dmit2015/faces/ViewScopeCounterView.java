package dmit2015.faces;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import org.omnifaces.util.Messages;

import java.io.Serializable;

@Named      // allows you to access an object of this class with the name viewScopeCounterView using EL
@ViewScoped // create this object for one HTTP request and keep in memory if the next is for the same page
            // class must implement Serializable
public class ViewScopeCounterView implements Serializable {

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public String submit() {
        counter += 1;
        Messages.addInfo(null,"ViewScoped Counter = {0}", counter);
        Messages.addInfo("counterResult", "ViewScoped Count Result = {0}", counter);
        return "";
    }
}