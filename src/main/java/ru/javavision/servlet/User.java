package ru.javavision.servlet;

public class User{
    String Id;
    String Login, Password, Name, EMail, Gender, BDay, FavColor, Description, Mailing, UsrAgrmnt;
    User(String Id, String Login, String Password, String Name, String EMail, String Gender, String BDay, String FavColor, String Description, String Mailing, String UsrAgrmnt){
        this.Id = Id;
        this.Login = Login;
        this.Password = Password;
        this.Name = Name;
        this.EMail = EMail;
        this.Gender = Gender;
        this.BDay = BDay;
        this.FavColor = FavColor;
        this.Description = Description;
        this.Mailing = Mailing;
        this.UsrAgrmnt = UsrAgrmnt;
    }
    public String getId() { return Id;}
    public String getLogin() { return Login;}
    public String getPassword() { return Password;}
    public String getName() { return Name;}
    public String getEMail() { return EMail;}
    public String getGender() { return Gender;}
    public String getBDay() { return BDay;}
    public String getFavColor() { return FavColor;}
    public String getDescription() { return Description;}
    public String getMailing() { return Mailing;}
    public String getUsrAgrmnt() { return UsrAgrmnt;}
}
