package com.brianeno.javarecord;

import lombok.Builder;

@Builder
public record ChargeSessionWithLombokBuilder(String id, int watts, String make, String model, String vin) {
}
