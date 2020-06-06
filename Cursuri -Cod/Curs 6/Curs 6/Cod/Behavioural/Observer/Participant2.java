package Curs6.Behavioural.Observer;

public class Participant2 extends ParticipantObserver {
    Participant2(ChatSubject chat) {
        this.chat = chat;
        this.chat.adaugaParticipant(this);
    }

    @Override
    public void update() {
        System.out.println("Mihai a fost notificat...");
    }
}