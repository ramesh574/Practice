package ramesh.com;

public class Main {
    public static void main(String[] args) {
        ITelephone timesPhone;
      timesPhone=new DeskPhone(12345);
      timesPhone.powerOn();
      timesPhone.callPhone(12345);
      timesPhone.answer();
      timesPhone= new MobilePhone(932181282);
      timesPhone.powerOn();
      timesPhone.callPhone(932181282);
      timesPhone.answer();
    }
}