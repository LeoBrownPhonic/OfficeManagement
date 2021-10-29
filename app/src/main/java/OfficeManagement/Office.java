package OfficeManagement;

import java.util.ArrayList;




public class Office {

ArrayList<MeetingRoom> allrooms;
ArrayList<MeetingRoom> availablerooms;
  
  Office() {
      allrooms = new ArrayList<MeetingRoom>();
      availablerooms = new ArrayList<MeetingRoom>();
  }

  public ArrayList<MeetingRoom> allRooms() {
    return this.allrooms;
  }

  public void newRoom(String name) {
    MeetingRoom newmeetingroom = new MeetingRoom(name);
    allrooms.add(newmeetingroom);
  }

  public ArrayList<MeetingRoom> seeAvailable() {
    for (int i = 0; i < allrooms.size(); i++) {
      MeetingRoom currentroom = allrooms.get(i);
      if (currentroom.occupied == false) {
          availablerooms.add(currentroom);
      } 
    }
    return availablerooms;
  
  }

  public void deleteAllRooms() {
    allrooms = new ArrayList<MeetingRoom>();
  }

}
