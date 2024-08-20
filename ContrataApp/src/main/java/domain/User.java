package domain;

public class User implements UtilUser {
    private int idUser;
    private String userName;
    private String lasName;
    private String email;
    private String phone;
    private String adress;
    private String city;
    private String state;
    private String country;
    UserType userType;
    private String password;


    // Generar constructor, primero uno vacio y el otro lleno. Un contructor es para inicializar

    public User(){

    }

    public User(int idUser, String userName, String lasName, String email, String phone, String adress, String city, String state, String country, UserType userType, String password) {
        this.idUser = idUser;
        this.userName = userName;
        this.lasName = lasName;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.userType = userType;
        this.password = password;
    }

    // Getter and Setter siempre que coloco un tipo de datos int, float, debe retornar, un dato tipo void no retorna
    // Los getter y los setter solo sirve para las variables encapsuladas

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void createUser() {

    }

    @Override
    public void listUser() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}
