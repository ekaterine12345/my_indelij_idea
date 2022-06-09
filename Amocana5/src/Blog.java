import java.util.ArrayList;

public class Blog {
    private String arcticle;
    ArrayList<Subscriber> subscriberArrayList=new ArrayList<Subscriber>();

    public String getArcticle() {
        return arcticle;
    }

    public void setArcticle(String arcticle) {
        this.arcticle = arcticle;
        notifyAllSubscribers();
    }

    public void attach(Subscriber subscriber)
    {
       this.subscriberArrayList.add(subscriber);
    }

    public void notifyAllSubscribers()
    {
        for (Subscriber subscriber:subscriberArrayList)
            subscriber.update();
    }

}
