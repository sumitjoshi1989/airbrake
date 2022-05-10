package com.airbreak.demo.demo;

import io.airbrake.javabrake.Airbrake;
import io.airbrake.javabrake.Config;
import io.airbrake.javabrake.Notice;
import io.airbrake.javabrake.Notifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("api/")
public class DemoController {


    String json = "\"user\": {\n" +
            "      \"id\": \"12345\",\n" +
            "      \"name\": \"root\",\n" +
            "      \"email\": \"root@root.com\"\n" +
            "    }";


    @GetMapping("getData")
    public void getData()
    {


       // try {
           int a = 12/0;

//        } catch (Exception e) {
//           // notifier.report(e);
//
//            Notice notice = Airbrake.buildNotice(e);
//            notice.setContext("component", "mycomponent");
//            notice.setParam("param1", "value1");
//            notice.setContext("User",user);
//            Airbrake.send(notice);
//        }

    }
}
