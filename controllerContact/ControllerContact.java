package exceptFinal.controllerContact;

import java.text.SimpleDateFormat;

public class ControllerContact {
    String[] stringContact;
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public ControllerContact(String[] stringContact) {
        this.stringContact = stringContact;
    }
}
