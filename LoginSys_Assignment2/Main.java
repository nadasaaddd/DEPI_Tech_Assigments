package LoginSys_Assignment2;

public class Main {
    public void main(String[] args) {
        Login loginSys = new Login();
        boolean isLoggedIn = loginSys.login();
        if (!isLoggedIn) {
            return;
        }


        User_Info user = new User_Info();
        user.userInfo();
        user.calcGrade();
        user.displayInfo();
    }
}
