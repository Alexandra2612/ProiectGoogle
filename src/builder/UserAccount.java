package builder;

public class UserAccount {
    private String username,password,email;//necessary info
    private String phonenumber,gender,nickname;//optional info
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public String getGender() {
        return gender;
    }
    public String getNickname() {
        return nickname;
    }
    public UserAccount(UserBuilder builder){
        this.username=builder.username;
        this.password=builder.password;
        this.email=builder.email;
        this.phonenumber=builder.phonenumber;
        this.gender=builder.gender;
        this.nickname=builder.nickname;
    }
    @Override
    public String toString() {
        return "UserAccount{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", gender='" + gender + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
    public static class UserBuilder {
        private String username,password,email;//necessary info
        private String phonenumber,gender,nickname;//optional info
        public UserBuilder(String username,String password,String email){
            this.username=username;
            this.password=password;
            this.email=email;
        }
        public UserBuilder setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
            return this;
        }
        public UserBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public UserBuilder setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public UserAccount build(){
            return new UserAccount(this);
        }
    }
}
