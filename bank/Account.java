package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    //getters and setters
    // getters
    public String getPassword(){
        return this.password;
    }

    //setters
    public void setPassword(String pass){
        this.password = pass;
    }
}
