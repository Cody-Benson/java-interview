import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Human human1 = new Human(5);
        Human human2 = new Human(8);
        Human human3 = new Human(1);
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);


        Collections.sort(humans);
        humans.forEach((h)->System.out.println(h.getAge()));
    }   
}