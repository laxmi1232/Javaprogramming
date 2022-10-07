abstract class Vehicale
{
    abstract void start();
    
    
}

class Car extends Vehicale{
    void start()
    {
        System.out.println("car starts with key");
        
    }
}

class Scooty extends Vehicale{
    void start(){
        System.out.println("scooty starts with kick");
        
        
    }
    public static void main(String[] args){
        Car c = new Car();
        c.start();
        
        Scooty s = new Scooty();
        s.start();
        
    }
}
