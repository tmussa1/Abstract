public class Driver extends Person{
    public String title(){
        return "I'm your driver";
    }
    public String getName(){
        return "Bob";
    }

    class Pilot extends Person{
        public String title(){
            return "I'm your pilot";
        }
        public String getName(){
            return "Jeffrey";
        }
    }
    class Captain extends Person{
        public String title(){
            return "I'm your captain";
        }
        public String getName(){
            return "Foster";
        }
    }
    class Car{
        Person person;
    }
    class Boat{
        Person person;
    }
}
