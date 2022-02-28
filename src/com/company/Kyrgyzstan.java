package com.company;

public enum Kyrgyzstan {
    BISHKEK(45355,656),
    OSH(5655,6454),
    JALAL_ABAD(56564,5656),
    YSSYK_KOL(45454,545),
    NARYN(6565,6768),
    BATKEN(5657,5676),
    TALAS(565,6765),
    ;

    int naseleniya;
    int kv_m;


    Kyrgyzstan(int naseleniya, int kv_m) {
        this.naseleniya = naseleniya;
        this.kv_m = kv_m;
    }

    public int getNaseleniya() {
        return naseleniya;
    }

    public int getKv_m() {
        return kv_m;
    }

    @Override
    public String toString() {
        return "Kyrgyzstan{" +
                "naseleniya=" + naseleniya +
                ", kv_m=" + kv_m +
                '}';
    }
}
