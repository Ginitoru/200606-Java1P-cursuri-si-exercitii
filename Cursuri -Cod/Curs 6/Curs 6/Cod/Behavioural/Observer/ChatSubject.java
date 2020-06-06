package Curs6.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class ChatSubject {
    private List<ParticipantObserver> participanti = new ArrayList<>();
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notificaTotiParticipanti();
    }

    public void adaugaParticipant(ParticipantObserver participant) {
        participanti.add(participant);
    }

    public void notificaTotiParticipanti() {
        for (ParticipantObserver participant : participanti) {
            participant.update();
        }
    }
}
