package com.brianeno.javarecord;

public record ChargeSessionWithNestedBuilder(String id, int watts, String make, String model, String vin) {

    public static final class Builder {
        String id;
        int watts;
        String make;
        String model;
        String vin;

        public Builder(String id, int watts) {
            this.id = id;
            this.watts = watts;
        }

        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder vin(String vin) {
            this.vin = vin;
            return this;
        }

        public ChargeSessionWithNestedBuilder build() {
            return new ChargeSessionWithNestedBuilder(id, watts, make, model, vin);
        }
    }
}
