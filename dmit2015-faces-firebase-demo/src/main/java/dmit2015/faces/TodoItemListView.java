package dmit2015.faces;

import dmit2015.restclient.TodoItem;
import dmit2015.restclient.TodoItemMpRestClient;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.omnifaces.cdi.ViewScoped;
import org.omnifaces.util.Messages;

import java.io.Serial;
import java.io.Serializable;
import java.util.Map;


@Named("currentTodoItemListView")
@ViewScoped
public class TodoItemListView implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Inject
    @RestClient
    private TodoItemMpRestClient _todoitemMpRestClient;

    @Inject
    private FirebaseLoginSession _firebaseLoginSession;

    @Getter
    private Map<String, TodoItem> todoitemMap;

    @PostConstruct  // After @Inject is complete
    public void init() {
        try {
            String token = _firebaseLoginSession.getToken();
            String userUID = _firebaseLoginSession.getUserUID();
            todoitemMap = _todoitemMpRestClient.findAll(userUID, token);
        } catch (Exception ex) {
            Messages.addGlobalError(ex.getMessage());
        }
    }
}