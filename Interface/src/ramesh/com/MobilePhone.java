package ramesh.com;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    public  boolean isOn=false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println(" Mobile phone is power up ");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + "on Mobile phone");
        }
        else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging)
        {
            System.out.println("Answer the Mobile phone");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber&& isOn)
        {
            isRinging=true;
            System.out.println("Chal chaiya chaiya ring");
        }
        else {
            isRinging=false;
            System.out.println("Mobile is not on or may be number is different");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
