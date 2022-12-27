package at.fhtw.bic.monitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {
    @GetMapping("/api/message/reset")
    public String resetMessage(){
    return "Everything works as expected";
    }
}
