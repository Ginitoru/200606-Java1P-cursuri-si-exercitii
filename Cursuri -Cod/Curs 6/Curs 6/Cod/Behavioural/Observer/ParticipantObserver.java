package Curs6.Behavioural.Observer;

public abstract class ParticipantObserver {
    protected ChatSubject chat;
    public abstract void update();
}
