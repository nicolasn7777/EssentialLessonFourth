package task_abstract_handler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String TXT = "TXT";
        final String DOC = "DOC";
        final String XML = "XML";

        System.out.println("Введіть тип документу(TXT, DOC, XML) для операцій:");

        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        switch (type){
            case TXT->{
                TXTHandler txtHandler = new TXTHandler();
                txtHandler.open();
                txtHandler.create();
                txtHandler.change();
                txtHandler.save();
            }
            case DOC->{
                DOCHandler docHandler = new DOCHandler();
                docHandler.open();
                docHandler.create();
                docHandler.change();
                docHandler.save();
            }
            case XML->{
                XMLHandler xmlHandler = new XMLHandler();
                xmlHandler.open();
                xmlHandler.create();
                xmlHandler.change();
                xmlHandler.save();
            }
            default->{
                System.out.println("Ви ввели не відповідний документ до умов!");
            }
        }

    }
}
