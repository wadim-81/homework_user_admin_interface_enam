public class WebFilter implements Filter {
@Override
public boolean allowAccess(String url, UserRole userRole) {
        if (userRole == UserRole.ADMIN) {
            return true;
        } else if (userRole == UserRole.USER) {
            return url.contains("http://web-for-user");

        }
return false;
    }

        }

//4)Если это админ, то доступ разрещен к любому сайту
//5) Если это пользователь, то только для тех сайтов, которые начинаются на "http://web-for-user" ему доступ разрещен


