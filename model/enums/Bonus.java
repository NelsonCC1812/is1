package model.enums;

import static model.auxclasses.Auxiliar.round;

import java.util.Set;

public enum Bonus {

    // *=> enum

    RESIDENTE(.75),
    TERCERA_EDAD(.10),
    ESTUDIANTE(.20);

    // *=> fields

    private final double deduction;

    // *=> constructors

    Bonus(double deduction) {
        this.deduction = deduction;
    }

    // *=> getters

    public double deduction() {
        return this.deduction;
    }

    // *=> methods

    public static double applyDeductions(Set<Bonus> bonus, double quantify) {
        return round(quantify *
                bonus.stream().map(b -> b.deduction).reduce((double) 1, (acc, sum) -> acc * (1 - sum)));
    }
}