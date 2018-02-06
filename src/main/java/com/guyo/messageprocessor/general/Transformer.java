package com.guyo.messageprocessor.general;

public interface Transformer<I, O> {

    O transform(I input) throws Exception;
}
