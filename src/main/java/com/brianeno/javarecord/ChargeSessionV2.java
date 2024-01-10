package com.brianeno.javarecord;

import lombok.Value;

@Value
public class ChargeSessionV2 {

    String id;
    int watts;
    String make;
    String model;
    String vin;
}
