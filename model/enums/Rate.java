package model.enums;

public enum Rate {
    STANDARD(1, false, false, false),
    SILVER(5, true, false, false),
    GOLD(10, true, true, true);

    // *=> fields

    private final double cost;
    private final boolean haveOpenBar;
    private final boolean canModifyDate;
    private final boolean canRepay;

    // *=> constructors

    private Rate(double cost, boolean haveOpenBar, boolean canModifyDate, boolean canRepay) {
        this.cost = cost;
        this.haveOpenBar = haveOpenBar;
        this.canModifyDate = canModifyDate;
        this.canRepay = canRepay;
    }

    // *=> getters

    public double cost() {
        return this.cost;
    }

    public boolean haveOpenBar() {
        return this.haveOpenBar;
    }

    public boolean canModifyDate() {
        return this.canModifyDate;
    }

    public boolean canRepay() {
        return this.canRepay;
    }
}