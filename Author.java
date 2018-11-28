public class Author
{
    private String name;
    private String email;
    private char gender;
    public Author (String n, String e, char g)
    {
        name = n;
        email = e;
        if ( g == 'F' || g == 'M' || g == 'U' )
        {
            gender = g;
        }
        else
            gender = 'U';
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public char getGender()
    {
        return gender;
    }
    public void setEmail ( String e )
    {
        email = e;
    }
    @Override
    public String toString ()
    {
        return " Имя " + name + " , Почта " + email + " , Пол " + gender;
    }
}