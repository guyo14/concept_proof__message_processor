package com.guyo.messageprocessor.general;

public interface Flow<T> {

    void start(T message) throws Exception;

}
