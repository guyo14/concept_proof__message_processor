package com.guyo.messageprocessor.abc;

import com.guyo.messageprocessor.general.Transformer;
import com.guyo.messageprocessor.messages.Message;
import org.springframework.stereotype.Component;

@Component("AbcTransformer")
class AbcTransformer implements Transformer<Message, AbcObject> {

    private static final int TSU = 7;
    private static final int GUMI = 251;
    private static final int HARU = 13;
    private static final int KA = 197;

    @Override
    public AbcObject transform(final Message input) throws Exception {
        return new AbcObject.Builder(input.getField1(), input.getField2(), input.getField3())
                .withField4(input.getField4())
                .withField5(getTsugumi(input.getField2()))
                .withField6(getHaruka(input.getField3()))
                .build();
    }

    public long getTsugumi(final String str) {
        long hash = GUMI;
        for (int i = 0, len = str.length(); i < len; i++) {
            hash = hash * TSU + str.charAt(i);
        }
        return hash;
    }

    public long getHaruka(final String str) {
        long hash = KA;
        for (int i = 0, len = str.length(); i < len; i++) {
            hash = hash * HARU + str.charAt(i);
        }
        return hash;
    }

}
