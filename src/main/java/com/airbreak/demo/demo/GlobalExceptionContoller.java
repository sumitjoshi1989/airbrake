package com.airbreak.demo.demo;

import io.airbrake.javabrake.Airbrake;
import io.airbrake.javabrake.Config;
import io.airbrake.javabrake.Notice;
import io.airbrake.javabrake.Notifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionContoller {
    Config config = new Config();
    @ExceptionHandler(ArithmeticException.class)
    public void ArithmaticExceptionHandling(Exception e)
    {
        config.projectId = 413949;
        config.projectKey = "eb00a7969cc43e48cbbfeeb085640264";
        Notifier notifier = new Notifier(config);
        User user = new User();
        user.id = 12345;
        user.name = "Root";
        user.email = "root@root.com";

//        Notice notice = Airbrake.buildNotice(e);
//            notice.setContext("component", "mycomponent");
//            notice.setParam("param1", "value1");
//            notice.setContext("User",user);
//            Airbrake.send(notice);
        notifier.addFilter(
                (Notice notice) -> {
                    notice.setContext("environment", "dev");
                    notice.setContext("User",user);
                    return notice;
                });

        notifier.report(e);

        //return new ResponseEntity<String>("Exception", HttpStatus.BAD_REQUEST);
    }
}
