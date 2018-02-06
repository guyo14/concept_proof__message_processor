package com.guyo.messageprocessor.def;

import com.guyo.messageprocessor.general.Flow;
import com.guyo.messageprocessor.general.Processor;
import com.guyo.messageprocessor.messages.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("DefFlow")
class DefFlow implements Flow<Message> {

    @Autowired
    @Qualifier("DefProcessor")
    private Processor<Message> processor;

    @Override
    public void start(Message message) throws Exception {
        processor.process(message);
    }

}
