package com.brianeno.javarecord;

import org.junit.jupiter.api.Test;

class ChargeSessionTest {

    @Test
    void testChargeSessionRecord() {
        ChargeSession cs = new ChargeSession("11111", 420, "Tesla", "Model S", "KNADE221296399151");

        //ChargeSession cs2 = new ChargeSession();
        //cs.id() = "22222";


        System.out.println(cs.id());
    }

}