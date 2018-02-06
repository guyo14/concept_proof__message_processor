package com.guyo.messageprocessor.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    private final long field1;
    private final String field2;
    private final String field3;
    private final String field4;

    public Message(@JsonProperty("field1") final long field1,
            @JsonProperty("field2") final String field2,
            @JsonProperty("field3") final String field3,
            @JsonProperty("field4") final String field4) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }

    public long getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    public String getField4() {
        return field4;
    }

    @Override
    public String toString() {
        return "Message{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", field4='" + field4 + '\'' +
                '}';
    }
}
