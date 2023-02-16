public class Main {


    public static void main(String[] args) {
        Phone a = new Phone("+79563365789", "Iphone", 7.8);
        Person b = new Person();
        Person v = new Person("Valentina", 20);
        v.talk();
        v.move();
        b.talk();
        b.move();
        a.receiveCall("Dima:", "+79184637109");

    }
}
