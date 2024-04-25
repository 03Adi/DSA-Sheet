package Day85;

public class classobject {
    public static void main(String arg[]){

        Aditya a1=new Aditya();
        a1.name();
        a1.age();
        a1.height();
        a1.weight();
        a1.qualification();
        a1.work();

    }
}

class Aditya{
    String name;
    int age;
    int height;
    int weight;
    String qualification;
    String work;

    // today we are using the void method to initilazi the class and object

    void name(){
        System.out.println(" My name is Aditya Prakash Pandey");
    }
    void age(){
        System.out.println(" Basically I'm 21 year old");
    }
    void height(){
        System.out.println(" I'm 5.8 feet boy");
    }
    void weight(){
        System.out.println(" my weight is around 60 kg");
    }
    void qualification(){
        System.out.println(" I'm B.Tech final year student");
    }
    void work(){
        System.out.println(" Basically I'm a java full stack developer");
    }
}
