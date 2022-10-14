package labs_examples.enumerations.labs;

enum ClassStatusOptions {
    //This means for lessons booked, not social status, lol
    SCHEDULED, COMPLETED, CANCELLED, SAME_DAY_CANCELLATION;
}

public class ClassStatus {

    private ClassStatusOptions status;

    public ClassStatusOptions getStatus() {
        return status;
    }

    public void setStatus(ClassStatusOptions status) {
        this.status = status;
    }

    public ClassStatus(ClassStatusOptions status) {
        this.status = status;
    }
}
