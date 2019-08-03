package uk.org.hexsaw.logactaesque.model;

import java.util.Date;

public class DiceRoll {

    private Date diceRolledAt = new Date();
    private String diceColour;
    private int rolledNumber;

    public Date getDiceRolledAt() {
        return diceRolledAt;
    }

    public String getDiceColour() {
        return diceColour;
    }

    public int getRolledNumber() {
        return rolledNumber;
    }

    public static DiceRoll invoke(String diceColour, int rolledNumber) {
        return new DiceRoll(diceColour, rolledNumber);
    }

    private DiceRoll(String diceColour, int rolledNumber) {
        this.diceColour = diceColour;
        this.rolledNumber = rolledNumber;
    }

}
