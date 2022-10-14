package labs_examples.enumerations.experiments;

enum PizzaStatus {
    //ADD THE STATUSES
    ORDERED, MAKING, READY, DELIVERED;
}

public class Pizza {
    private PizzaStatus status;

    public boolean isDeliverable() {
        if(this.status == PizzaStatus.READY){
            return true;
        } else {
            return false;
        }
    }


    public void setStatus(PizzaStatus status){
        this.status = status;
    }

    public PizzaStatus getStatus(){
        return this.status;
    }
}
