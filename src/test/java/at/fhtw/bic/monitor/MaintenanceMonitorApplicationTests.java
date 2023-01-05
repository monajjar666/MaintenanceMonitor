package at.fhtw.bic.monitor;

import at.fhtw.bic.monitor.controller.MonitorController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaintenanceMonitorApplicationTests {

    @Test
    void checkResetMessage (){
    var controller = new MonitorController();
    String result = controller.resetMessage();
    assertEquals ("Everything works as expected" ,result);
    }
}
