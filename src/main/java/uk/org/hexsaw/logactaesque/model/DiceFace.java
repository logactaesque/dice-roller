package uk.org.hexsaw.logactaesque.model;


public class DiceFace {

    private int rolledNumber;

    public void setRolledNumber(int rolledNumber) {
        this.rolledNumber = rolledNumber;
    }

    public int getRolledNumber() {
        return rolledNumber;
    }

    public DiceFace(int rolledNumber) {
        this.rolledNumber = rolledNumber;
    }
}
