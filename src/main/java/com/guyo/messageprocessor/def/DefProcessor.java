package com.guyo.messageprocessor.def;

import com.guyo.messageprocessor.general.Processor;
import com.guyo.messageprocessor.messages.Message;
import org.springframework.stereotype.Component;

@Component("DefProcessor")
class DefProcessor implements Processor<Message> {

    private static final String NAME = "DefProcessor";

    @Override
    public void process(Message object) {
        System.out.println(NAME + ": " + object.toString());
    }

}
