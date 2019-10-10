package ro.mirodone;


 class CheckPin {

      boolean validatePin(String pin) {

        return pin.matches("\\d{4}") || pin.matches("\\d{6}");
    }

}
