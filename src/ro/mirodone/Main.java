package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        CheckPin pin = new CheckPin();

        System.out.println(pin.validatePin("1234.1"));
        System.out.println(pin.validatePin("-234"));
        System.out.println(pin.validatePin("1.234"));
        System.out.println(pin.validatePin("1234") + "true");
        System.out.println(pin.validatePin("12345") + " false");
        System.out.println(pin.validatePin("123456") + "true");

        CheckPinC pin1 = new CheckPinC();
        System.out.println(pin1.validatePin("1234.1"));
        System.out.println(pin1.validatePin("-234"));
        System.out.println(pin1.validatePin("1.234"));
        System.out.println(pin1.validatePin("1234") + "true");
        System.out.println(pin1.validatePin("12345") + " false");
        System.out.println(pin1.validatePin("123456") + "true");

    }
}
