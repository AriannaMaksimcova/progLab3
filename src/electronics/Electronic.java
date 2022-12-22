package electronics;

import interfaces.OnOffSwitchable;

public abstract class Electronic implements OnOffSwitchable {
    private String type;
    private boolean isTurnedOn = false;
    public Electronic(String type){
        this.type = type;
    }
    @Override
    public void turnOn() {
        isTurnedOn = true;
    }
    @Override
    public void turnOff(){
        isTurnedOn = false;
    }
    public boolean isTurnedOn() {
        return isTurnedOn;
    }
    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

}
