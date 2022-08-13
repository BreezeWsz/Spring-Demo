package ssm.pojo;

public class Manager {
    private Integer mId;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "Manager{" +
                "mId=" + mId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Manager(Integer mId, String username, String password) {
        this.mId = mId;
        this.username = username;
        this.password = password;
    }

    public Manager() {
    }
}
