package files;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstname;
    private String lastname;
    private String cnp;
    private String phoneNumber;
    private String emailAdress;
    private String gender;
    private String country;
    private Ticket tickets;
    private String username;
    private String password;


    private static List<Ticket> ticket = new ArrayList<>();

    public static class Builder{
        private User user= new User();

        public Builder setfirstName(String firstname){
            user.firstname = firstname;
            return this;
        }

        public Builder setLastName(String lastname){
            user.lastname = lastname;
            return this;
        }

        public Builder setCNP(String cnp){
            user.cnp = cnp;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber){
            user.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setemailAdress(String emailAdress){
            user.emailAdress = emailAdress;
            return this;
        }

        public Builder setGEnder(String gender){
            user.gender = gender;
            return this;
        }

        public Builder setCountry(String country){
            user.country = country;
            return this;
        }

        public Builder setTickets(Ticket tickets){
            user.tickets = tickets;
            return this;
        }

        public Builder setUsername(String username){
            user.username = username;
            return this;
        }

        public Builder setPassword(String password){
            user.password = password;
            return this;
        }

        public User build(){
            return user;
        }

    }

    public static List<Ticket> getTicketsList(){
        return ticket;
    }

    public User(){
        this.ticket = new ArrayList<>(ticket);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Ticket> getTicket() {
        return ticket;
    }
}
