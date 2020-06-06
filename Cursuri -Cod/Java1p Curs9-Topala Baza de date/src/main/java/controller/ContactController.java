package controller;

import dao.ContactDao;
import model.Contact;

import java.util.List;

public class ContactController {

    private ContactDao contactDao;

    private ContactController() {
        contactDao = new ContactDao(ConnectionManager.getInstance().getConnection());

    }

    public List<Contact> findPersoana(int persoanaId){
        return contactDao.findByPersoana(persoanaId);
    }

    public boolean create (Contact contact){
        return contactDao.create(contact);
    }

    private static final class SingletonHolder{
        public static ContactController INSTANCE = new ContactController();
    }

    public static ContactController getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
