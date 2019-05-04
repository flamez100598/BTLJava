/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Haidz
 */
public class Employee {
   public String UsernameEmp;
    public String Password;
     public String NameEmp;
      public String Gender;
       public String Birthday;
        public String Phone;
         public String Email;
          public String Address;

    public Employee() {
    }

    public Employee(String UsernameEmp, String Password, String NameEmp, String Gender, String Birthday, String Phone, String Email, String Address) {
        this.UsernameEmp = UsernameEmp;
        this.Password = Password;
        this.NameEmp = NameEmp;
        this.Gender = Gender;
        this.Birthday = Birthday;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
    }

    public String getUsernameEmp() {
        return UsernameEmp;
    }

    public void setUsernameEmp(String UsernameEmp) {
        this.UsernameEmp = UsernameEmp;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNameEmp() {
        return NameEmp;
    }

    public void setNameEmp(String NameEmp) {
        this.NameEmp = NameEmp;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void UsernameEmp(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
          
       
}
