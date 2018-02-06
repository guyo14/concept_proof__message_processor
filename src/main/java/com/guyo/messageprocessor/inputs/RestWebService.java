package com.guyo.messageprocessor.inputs;

import com.guyo.messageprocessor.general.Flow;
import com.guyo.messageprocessor.messages.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWebService {

    @Autowired
    @Qualifier("AbcFlow")
    private Flow<Message> abcFlow;

    @Autowired
    @Qualifier("DefFlow")
    private Flow<Message> defFlow;

    @RequestMapping("/message")
    public void processMessage(@RequestBody final Message message) throws Exception {
        System.out.println(message.toString());

        if (message.getField1() % 2 == 0) {
            abcFlow.start(message);
        } else {
            defFlow.start(message);
        }
    }

}
