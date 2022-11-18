package lesson_05;

import java.util.Scanner;

public class PhoneBook {
// 1. Поля
    Contact [] contacts = new Contact[5];


// 2. Конструктор

// 3. Методы

        public void addContact(Contact contact) {
            for (int i = 0; i < contacts.length; i++) {
                if (contacts[i] == null) {
                    contacts[i] = contact;
                    break;
                }
            }
        }
//        public void FindContact (Contact contact){
//            for (int i = 0; i < contacts.length; i++) {
//                if (contacts[i].equals(contact)){
//                    contacts[i] = contact;
////                    String [] str = new String[i];
////                    str[i] = phone;
////                    str[i] = email;
//                    System.out.println(contacts[i]);
//                    break;
//                }
//            }
//        }


        public void delContact (String name){
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getName().equalsIgnoreCase(name)) {
                    contacts[i] = null;
                    break;
                }
            }
        }

    }
    public void renameContact (String name, String rename){
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getName().equals(name)) {
                    contacts[i].setName(rename);
                    break;
                }
            }

        }
    }
    public void  findContact (String name, String phone){
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i]!= null){
                if (contacts[i].getName().equals(name)){
                    contacts[i].setPhone(phone);
                    break;
                }
            }

        }
    }
}
