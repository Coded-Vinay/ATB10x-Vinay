package OOPSConceptPractice.Polymorphism;


import java.util.Scanner;

/*
TODO: Develop a Notification class with a method sendNotification().
 Implement subclasses such as EmailNotification, SMSNotification, and PushNotification,
 where each class provides a different implementation for sending notifications.
 */
public class Notification {

    public static void main(String[] args) {
        sendNotification("testing method overload");

        EmailNotification en = new EmailNotification();
        en.sendNotification();


    }

    void sendNotification() {
        System.out.println("Notification is sent ");
    }

    static void sendNotification(String typeNotification) {
        System.out.println(typeNotification);
    }
}


class EmailNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Email Notification is sent");

    }
}

class SMSNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("SMS Notification is sent");

    }
}

class PushNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Push Notification is sent");

    }
}
