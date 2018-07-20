package com.example.rump.p2000reader.model.accident;

import java.util.List;

public class AccidentLoadedEvent {
    public final List<Accident> accidentList;

    public AccidentLoadedEvent(List<Accident> accidentList) {
         this.accidentList = accidentList;
    }
}
