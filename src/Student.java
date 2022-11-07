public class Student {
    private String name;
    private int age;
    private int typing;

    public Student(String name,int age,int typing){
        this.name = name;
        if (age > 16) {
            this.age = age;
        }else {
            System.out.println(name+" Окууга мумкунчулугу жок!");
        }
        this.typing = typing;

    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    int getTyping(){
        return typing;
    }
}
