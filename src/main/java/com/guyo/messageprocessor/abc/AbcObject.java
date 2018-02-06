package com.guyo.messageprocessor.abc;

class AbcObject {

    final private long field1;
    final private String field2;
    final private String field3;
    final private String field4;
    final private long field5;
    final private long field6;

    private AbcObject(final Builder builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
        this.field4 = builder.field4;
        this.field5 = builder.field5;
        this.field6 = builder.field6;
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

    public long getField5() {
        return field5;
    }

    public long getField6() {
        return field6;
    }

    @Override
    public String toString() {
        return "AbcObject{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", field4='" + field4 + '\'' +
                ", field5=" + field5 +
                ", field6=" + field6 +
                '}';
    }

    public static class Builder {

        final private long field1;
        final private String field2;
        private String field3;
        private String field4;
        private long field5;
        private long field6;

        public Builder(final long field1, final String field2, final String field3) {
            this.field1 = field1;
            this.field2 = field2;
            this.field3 = field3;
        }

        public Builder withField4(final String field4) {
            this.field4 = field4;
            return this;
        }

        public Builder withField5(final long field5) {
            this.field5 = field5;
            return this;
        }

        public Builder withField6(final long field6) {
            this.field6 = field6;
            return this;
        }

        public AbcObject build() {
            return new AbcObject(this);
        }

    }

}
