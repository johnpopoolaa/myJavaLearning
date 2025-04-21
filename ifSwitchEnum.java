// conditional with enumerations
enum Status
{
    Started, Running, InProcess, Ended;
}
public class ifSwitchEnum {
    public static void main(String a[])
    {
        Status s = Status.InProcess;
        // using if conditional
        if(s == Status.Started)
            System.out.println("Started in if");
        else if(s == Status.Running)
            System.out.println("Running in if");
        else if(s == Status.InProcess)
            System.out.println("In Process in if");
        else
            System.out.println("Process ended in if");

        // using switch conditional
        switch (s) {
            case Started:
                System.out.println("Started in switch");
                break;

            case Running:
                System.out.println("Running in switch");
                break;

            case InProcess:
                System.out.println("In Process in switch");
                break;
                
            default:
                System.out.println("Process ended in switch");
                break;
        }
    }
}
