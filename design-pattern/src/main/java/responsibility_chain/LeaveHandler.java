package responsibility_chain;

/**
 * Created by mengfw on 2017/12/4.
 */
public abstract class LeaveHandler {
    private LeaveHandler successor;

    public LeaveHandler(LeaveHandler successor) {
        this.successor = successor;
    }

    public LeaveHandler() {
    }

    public LeaveHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(LeaveHandler successor) {
        this.successor = successor;
    }

    public  abstract void disposeLeave(int day);
}
