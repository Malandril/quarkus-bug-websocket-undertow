package foo;

import io.quarkus.logging.Log;
import io.quarkus.websockets.next.OnOpen;
import io.quarkus.websockets.next.WebSocket;
import jakarta.enterprise.context.SessionScoped;

@SessionScoped
@WebSocket(path = "/ws")
public class WebsocketController {

    @OnOpen
    void open(){
        Log.info("Connected");
    }
    
}
