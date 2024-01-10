package com.brianeno.javarecord;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    static List<ChargeSession> SESSIONS;

    static {
        SESSIONS = Arrays.asList(
            new ChargeSession("11111", 420, "Tesla", "Model S", "KNADE221296399151"),
            new ChargeSession("22222", 380, "Ford", "F150", "5XYKT4A62CG191848"),
            new ChargeSession("33333", 405, "KIA", "EV9", "5XYKT3A69DG353356"),
            new ChargeSession("44444", 315, "Tesla", "Model Y", "KNAHT8A33E7012172"));
    }

    public void initCompare() {
        var chargeSessionRecordPojo = new ChargeSessionV1("11111", 420, "Tesla", "Model S", "KNADE221296399151");
        var chargeSessionRecordLombok = new ChargeSessionV2("11111", 420, "Tesla", "Model S", "KNADE221296399151");
        var chargeSessionRecord = new ChargeSession("11111", 420, "Tesla", "Model S", "KNADE221296399151");
        System.out.println("Pojo: " + chargeSessionRecordPojo);
        System.out.println("Lombok: " + chargeSessionRecordLombok);
        System.out.println("Record: " + chargeSessionRecord);
    }

    public void withValidation() {
        try {
            var chargeSessionRecordPojo = new ChargeSessionWithValidation(null, 420, "Tesla", "Model S", "KNADE221296399151");
        } catch (Exception ex) {
            System.out.println("Error during initialization " + ex.getMessage());
        }
    }

    public void builder() {
        var nestedBuilder = new ChargeSessionWithNestedBuilder.Builder("22222", 380)
            .make("Ford")
            .model("F150")
            .vin("5XYKT4A62CG191848")
            .build();
        System.out.println(nestedBuilder);


        var lombokBuilder = ChargeSessionWithLombokBuilder.builder()
            .id("33333")
            .watts(405)
            .make("Kia")
            .model("EV9")
            .vin("5XYKT3A69DG353356")
            .build();
        System.out.println(lombokBuilder);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.initCompare();
        main.withValidation();
        main.builder();
    }
}
