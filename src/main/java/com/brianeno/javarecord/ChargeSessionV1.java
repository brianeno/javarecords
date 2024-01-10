package com.brianeno.javarecord;

import java.util.Objects;

public class ChargeSessionV1 {

    private String id;
    private int watts;
    private String make;
    private String model;
    private String vin;

    public ChargeSessionV1(String id, int watts, String make, String model, String vin) {
        this.id = id;
        this.watts = watts;
        this.make = make;
        this.model = model;
        this.vin = vin;
    }

    public String getId() {
        return id;
    }

    public int getWatts() {
        return watts;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "ChargeSessionV1{" +
            "id=" + id  +
            ", watts=" + watts +
            ", make=" + make +
            ", model=" + model +
            ", vin=" + vin +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChargeSessionV1 that = (ChargeSessionV1) o;
        return Objects.equals(id, that.id) && Objects.equals(make, that.make) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, model);
    }
}
