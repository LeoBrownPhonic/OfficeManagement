package OfficeManagement;

import java.util.ArrayList;




public class Office {

ArrayList<MeetingRoom> allrooms;
  
  Office() {
      allrooms = new ArrayList<MeetingRoom>();
  }

  public ArrayList<MeetingRoom> allRooms() {
    return this.allrooms;
  }

  public void newRoom(String name) {
    MeetingRoom newmeetingroom = new MeetingRoom(name);
    allrooms.add(newmeetingroom);
  }

}
