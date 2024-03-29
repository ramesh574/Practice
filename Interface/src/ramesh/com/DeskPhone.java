package ramesh.com;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        System.out.println(myNumber);
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken ,desk phone does not have a power button ");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+ phoneNumber+"on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging)
        {
            System.out.println("Answer the desk phone");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber)
        {
            isRinging=true;
            System.out.println("Ring ring");
        }
        else {
            return isRinging;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

  
}
