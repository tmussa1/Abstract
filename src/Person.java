public abstract class Person {

    public abstract String title();
    public abstract String getName();

    public static void main(String[] args){
        Driver person = new Driver();
        System.out.println("The red porsche is being driven by " + person.getName());
    }


}
