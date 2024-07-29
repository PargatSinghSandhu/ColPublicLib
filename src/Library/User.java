package Library;

public class User {
    protected String name;
    protected String email;
    protected String phonenumber;

    public User()
    {

    }
    public User(String name)
    {
        this.name = name;
    }

    public User(String name, String email, String phonenumber)
    {
        this.name = name;
        this.email = email;
    }

   //getter for name 
    public String getName()
    {
        return name;
    }

    //setter for name 
    public void setName(String name)
    {
        this.name = name;
    }

    //getter for email

    public String getEmail()
    {
        return email;
    }

    //setter for email
    public void setEmail(String email)
    {
        this.email = email;
    }

    //getter for phone number
    public String getPhonenumber()
    {
        return phonenumber;
    }

    //setter for phone number
    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }    


}

