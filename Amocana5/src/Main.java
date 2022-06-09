import java.util.ArrayList;

public class Main {
    public static  void main(String[] args)  {

         ArrayList<Subscriber> subscriberArrayList=new ArrayList<>();
        Blog blog1=new Blog();
        Blog blog2=new Blog();

        subscriberArrayList.add(new Subscriber(blog1,"ekaterine1"));
        subscriberArrayList.add(new Subscriber(blog1,"ekaterine2"));
        subscriberArrayList.add(new Subscriber(blog2,"ekaterine3"));
        subscriberArrayList.add(new Subscriber(blog2,"ekaterine4"));


        System.out.println("First change:");
            blog1.setArcticle("article1");

        System.out.println("Second change:");
        blog2.setArcticle("article2");



    }
}




