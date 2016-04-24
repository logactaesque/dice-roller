package uk.org.hexsaw.logactaesque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.org.hexsaw.logactaesque.model.DiceFace;
import uk.org.hexsaw.logactaesque.model.Rollable;

@Controller
public class DiceController {

    @Autowired(required = true)
    private Rollable greenDice;

    @Autowired(required = true)
    private Rollable yellowDice;

    @Autowired(required = true)
    private Rollable brownDice;

    @Autowired(required = true)
    private Rollable blueDice;

    @Autowired(required = true)
    private Rollable greyDice;

    @Autowired(required = true)
    private Rollable redDice;

    @Autowired(required = true)
    private Rollable blackDice;

    @RequestMapping(path = "/dice/yellow/roll", method = RequestMethod.GET)
    public @ResponseBody DiceFace yellowDiceRoll() {
        return new DiceFace(yellowDice.roll());
    }

    @RequestMapping(path = "/dice/green/roll", method = RequestMethod.GET)
    public @ResponseBody DiceFace greenDiceRoll() {
        return new DiceFace(greenDice.roll());
    }

    @RequestMapping(path = "/dice/brown/roll", method = RequestMethod.GET)
    public @ResponseBody DiceFace brownDiceRoll() {
        return new DiceFace(brownDice.roll());
    }

    @RequestMapping(path = "/dice/blue/roll", method = RequestMethod.GET)
    public @ResponseBody DiceFace blueDiceRoll() {
        return new DiceFace(blueDice.roll());
    }

    @RequestMapping(path = "/dice/grey/roll", method = RequestMethod.GET)
    public @ResponseBody DiceFace greyDiceRoll() {
        return new DiceFace(greyDice.roll());
    }

    @RequestMapping(path = "/dice/red/roll", method = RequestMethod.GET)
    public @ResponseBody DiceFace redDiceRoll() {
        return new DiceFace(redDice.roll());
    }

    @RequestMapping(path = "/dice/black/roll", method = RequestMethod.GET)
    public @ResponseBody DiceFace blackDiceRoll() {
        return new DiceFace(blackDice.roll());
    }


}
