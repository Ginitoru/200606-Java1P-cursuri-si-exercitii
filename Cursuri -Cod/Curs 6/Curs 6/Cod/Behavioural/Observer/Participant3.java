package Curs6.Behavioural.Observer;

public class Participant3 extends ParticipantObserver {
    Participant3(ChatSubject chat) {
        this.chat = chat;
        this.chat.adaugaParticipant(this);
    }

    @Override
    public void update() {
        System.out.println("Andrei a fost notificat...");
    }
}
