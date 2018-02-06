package com.guyo.messageprocessor.abc;

import com.guyo.messageprocessor.general.Flow;
import com.guyo.messageprocessor.general.Processor;
import com.guyo.messageprocessor.general.Transformer;
import com.guyo.messageprocessor.messages.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("AbcFlow")
class AbcFlow implements Flow<Message> {

    @Autowired
    @Qualifier("AbcTransformer")
    private Transformer<Message, AbcObject> transformer;

    @Autowired
    @Qualifier("AbcProcessor")
    private Processor<AbcObject> processor;

    @Override
    public void start(final Message message) throws Exception {
        final AbcObject processable = transformer.transform(message);

        if (processable.getField5() % 2 == 0) {
            System.out.println("Doesn't need to be processed");
            return;
        }

        processor.process(processable);
    }

}
