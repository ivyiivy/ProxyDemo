public class SchoolServiceImpl implements SchoolService{
    @Override
    public String querySchoolName(Integer id) {
        return "School name is 第"+id+"中学";
    }
}
