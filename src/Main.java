import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //1) Создать класс человек (поля придумайте сами). Создайте тип пользователя - enum: USER, ADMIN.
// Тип пользователя - поле в классе человек
//2) Создать интерфейс Фильтр. в нем метод, который принимает строку (веб-адрес, к которому подключается человек)
// и тип пользователя (enum). Отдает boolean значение, пропускает ли он человека к ресурсу или нет.
//3)реализуйте интерфейс таким образом:
//4)Если это админ, то доступ разрещен к любому сайту
//5) Если это пользователь, то только для тех сайтов, которые начинаются на "http://web-for-user" ему доступ разрещен
//6) Самостоятельно создайте пару пользователей и попробуйте проверить, к каким сайтам у них есть доступ

        Person iwan = new Person( "Iwan",23,165,UserRole.ADMIN);

      Person vasilii= new Person("Vasili",45,176,UserRole.USER );

        WebFilter filter = new WebFilter();




        System.out.println(iwan.getName() + ", " + iwan.getAge() + " лет, рост " + iwan.getHeight() + " см, Admin access to 'http://web-for-user': " + filter.allowAccess("http://web-for-user", iwan.getUserRole()));
        System.out.println(vasilii.getName() + ", " + vasilii.getAge() + " лет, рост " + vasilii.getHeight() + " см, User access to 'http://web-for-user': " + filter.allowAccess("http://web-for-user", vasilii.getUserRole()));



    }
}


