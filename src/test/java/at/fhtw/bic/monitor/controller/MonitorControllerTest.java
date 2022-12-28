package at.fhtw.bic.monitor.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonitorControllerTest {

    @Test
    void setMessage() {
        MonitorController controller = new MonitorController();
        String result = controller.setMessage("Service"+"checks:"+"No"+"power"+"until"+"5:00"+"pm");
        assertEquals("ok", result);
    }
}