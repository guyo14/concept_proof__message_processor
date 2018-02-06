package com.guyo.messageprocessor.abc;

import com.guyo.messageprocessor.general.Processor;
import org.springframework.stereotype.Component;

@Component("AbcProcessor")
class AbcProcessor implements Processor<AbcObject> {

    private static final String NAME = "AbcProcessor";

    @Override
    public void process(final AbcObject object) {
        System.out.println(NAME + ": " + object.toString());
    }

}
