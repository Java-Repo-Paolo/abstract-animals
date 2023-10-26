package org.lessons.java.bonus;

public class Creator {

    public Device create(String type) throws IllegalArgumentException {
// type può essere o dvd player o playstation
        switch (type) {
            case "dvd player":
                return new DVDelayer();
            case "playstation":
                return new Playstation();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
