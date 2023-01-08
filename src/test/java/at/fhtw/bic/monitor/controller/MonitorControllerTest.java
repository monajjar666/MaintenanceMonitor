package at.fhtw.bic.monitor.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonitorControllerTest {
    @Test
    void checkResetMessage (){
        var controller = new MonitorController();
        String result = controller.resetMessage();
        assertEquals ("Everything works as expected" ,result);
    }

    @Test
    void setMessage() {
        MonitorController controller = new MonitorController();
        String result = controller.setMessage("Service"+"checks:"+"No"+"power"+"until"+"5:00"+"pm");
        assertEquals("ok", result);
    }

    @Test
    void checkMessage() { //Happy Path --> Inital message has not been changed
        MonitorController controller = new MonitorController();
        String result = controller.retrieveMessage();
        assertEquals("", result);
    }
}
