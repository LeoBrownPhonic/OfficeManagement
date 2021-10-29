package OfficeManagement;

import java.util.ArrayList;



public class MeetingRoom {

ArrayList<String> allrooms;
  
  MeetingRoom() {
      allrooms = new ArrayList<String>();
    }

    public ArrayList<String> allRooms() {
      return this.allrooms;
    }
  
    public void newRoom(String name) {
      allrooms.add(name);
    }

}
