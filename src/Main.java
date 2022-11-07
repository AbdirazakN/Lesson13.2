public class Main {
    public static void main(String[] args) {

        //Student и Course деген класстарды тузунуз.Student класска поле катары студенттин аты, жашы, жана канча соз
        //жаза алары келсин.Course класска поле катары курстун аты, инструктордун аты, жана Студент класста берилген
        //студенттер келсин.Бардык класстарга конструкторлорду тузунуз.Курска 16 жаштан томон студенттер келсе
        //"(студенттин аты) окууга мумкунчулугу жок деп мааниси 0 го барабарланып чыксын.Курстун аты 2 тамгадан коп
        //болсун.Бир канча объектилерин тузуп жана аларга конструктор аркылуу маанилерин бериниз.
        //Аларды консолго чыгарыныз.

        Student student = new Student("Asan",12,60);

        Course course = new Course("IT"," Aijamal Asangazieva ",student.getName());

        System.out.println("Student's name:  "+student.getName()+"\nAge:  "+student.getAge()+"\nWPM:  "+student.getTyping());
        System.out.println("Courses:  "+course.getName()+"\nInstrutor:  "+course.getNameIns()+"\nStudent class:  "+course.student());


    }
}