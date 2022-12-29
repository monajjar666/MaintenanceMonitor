package at.fhtw.bic.monitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {
    private String message = "";
    
    @GetMapping("/api/message/reset")
    public String resetMessage(){
        return "Everything works as expected";
    }
    
    @GetMapping("api/message")
    @ResponseBody
    public String setMessage(@RequestParam String message){
        this.message = message;

        if(this.message.equals(message)){
            return "ok";
        }
        return "not ok";
    }

    //A comment just to test push
    //this is just a second line after we were added to the collaborateurs list
}
