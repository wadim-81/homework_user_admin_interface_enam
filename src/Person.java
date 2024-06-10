import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private int height;
    private UserRole userRole;

    public Person(String name, int age, int height, UserRole userRole) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.userRole = userRole;
    }


        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public int getHeight () {
            return height;
        }

        public void setHeight ( int height){
            this.height = height;
        }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

}
