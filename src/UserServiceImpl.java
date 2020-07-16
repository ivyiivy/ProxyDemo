public class UserServiceImpl implements UserService{
    @Override
    public Integer getUserCount() {
        return 1;
    }

    @Override
    public String getUserInfo() {
        return "A";
    }
}
