package Curs6.Behavioural.Observer;

class Participant1 extends ParticipantObserver {
    Participant1(ChatSubject chat) {
        this.chat = chat;
        this.chat.adaugaParticipant(this);
    }

    @Override
    public void update() {
        System.out.println("Ion a fost notificat...");
    }
}
