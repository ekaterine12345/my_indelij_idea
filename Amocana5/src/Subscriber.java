public class Subscriber{
    protected  Blog blog;
    protected String name;

    public Subscriber(Blog blog,String name ) {
        this.blog=blog;
        this.blog.attach(this);
        this.name=name;
    }

    public void update() {
        System.out.println("changed "+blog.getArcticle()+" "+this.name);
    }
}
