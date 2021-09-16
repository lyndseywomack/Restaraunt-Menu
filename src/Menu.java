import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //Class Variables
    ArrayList<MenuItems> menuItems = new ArrayList<>();
    private Date lastUpdated;
    /* Constructor */

    public Menu(){
        this.lastUpdated = new Date();
    }

    //Methods
        //getters and setters
    public ArrayList<MenuItems> getMenuItems(){return  this.menuItems;}
    public void setMenuItems(ArrayList<MenuItems> menuItems){this.menuItems = menuItems;}

    public Date getLastUpdated(){return this.lastUpdated;}
    public void setDate(Date lastUpdated){this.lastUpdated = lastUpdated;}

}

