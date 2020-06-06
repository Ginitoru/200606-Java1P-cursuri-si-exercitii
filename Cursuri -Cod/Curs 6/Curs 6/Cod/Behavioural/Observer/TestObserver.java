package Curs6.Behavioural.Observer;

public class TestObserver {
    public static void main(String[] args) {
        ChatSubject chat = new ChatSubject();

        Participant1 participant1 = new Participant1(chat);
        Participant2 participant2 = new Participant2(chat);
        Participant3 participant3 = new Participant3(chat);

        System.out.println("Am modificat textul...");
        chat.setText("Text1");
        System.out.println("------------------------------------");
        System.out.println("Am modificat textul...");
        chat.setText("Text2");
    }
}
