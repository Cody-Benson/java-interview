public class Human implements Comparable<Human> {
    private int age;

    public Human(int age){
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public int compareTo(Human h){
        if(this.age > h.age){
            return 1;
        }
        else if(this.age < h.age){
            return -1;
        }
        else{
            return 0;
        }
    }
}
