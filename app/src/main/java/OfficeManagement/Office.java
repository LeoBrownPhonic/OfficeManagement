package OfficeManagement;

import java.util.ArrayList;



public class Office {

ArrayList<String> allrooms;
  
  Office() {
      allrooms = new ArrayList<String>();
    }

    public ArrayList<String> allRooms() {
      return this.allrooms;
    }
  
    public void newRoom(String name) {
      allrooms.add(name);
    }

}
