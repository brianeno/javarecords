package com.brianeno.javarecord;

public record ChargeSessionWithValidation(String id, int watts, String make, String model, String vin) {
    public ChargeSessionWithValidation {
        if (id == null) {
            throw new IllegalArgumentException("ID Cannot be null");
        }
        if (watts == 0) {
            throw new IllegalArgumentException("Watts cannot be zero");
        }
        // etc.
    }
}
