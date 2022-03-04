package behavioural.template;

import java.nio.charset.StandardCharsets;

public abstract class Network {

    String userName;
    String password;

    Network() {}


    public boolean post(String message) {
        if(logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes(StandardCharsets.UTF_8));
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);

    public abstract void logOut();
}
