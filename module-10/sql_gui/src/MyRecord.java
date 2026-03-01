/**
 * @author Hugo Ramirez Jr.
 * @date 2/28/2026
 * Module 9 - SQL GUI
 * @description file holds the getter and sets.
 */
public class MyRecord{

  int feild_id;
  String firstname;
  String lastname;
  String favoriteteam;

    public int getFeild_id() {
        return feild_id;
    }

    public void setFeild_id(int feild_id) {
        this.feild_id = feild_id;
    }

    public String getFavoriteteam() {
        return favoriteteam;
    }

    public void setFavoriteteam(String favoriteteam) {
        this.favoriteteam = favoriteteam;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String toString(){

    return new String(feild_id + ", " +
                      firstname.toString().trim() + ", " +
                      lastname.toString().trim() + ", " +
                      favoriteteam.toString().trim());
  }
}