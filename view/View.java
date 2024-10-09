package exceptFinal.view;

import exceptFinal.controllerContact.ControllerContact;

public class View {

    public void start() {
        System.out.println(
                "Ведите через пробел вашии данные - ФИО, пол(f,m), телефон, дату рождения(dd.mm.yyyy) ");
        // Scanner scanner = new Scanner(System.in);
        // String dataContact = scanner.nextLine();
        // String dataContact = "3.05.1974 g 456546546 Ivan Ivanich Ivanoff";
        String dataContact = "m 30.05.1974 Petrs Ivanich Ivanoff 456546546";
        System.out.println(dataContact);

        String[] dataString = dataContact.split(" ");
        if (dataString.length != 6) {
            throw new ArrayIndexOutOfBoundsException("Вы не ввели 6 элементов.");
        }
        ControllerContact controllerContact = new ControllerContact(dataString);
    }
}
