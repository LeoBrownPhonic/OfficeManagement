package OfficeManagement;

// import java.util.ArrayList;



public class MeetingRoom {

String roomname;
Boolean occupied;
  
  MeetingRoom(String name) {
      roomname = name;
      occupied = false;
    }

  public Boolean available() {
    return occupied;
  }
  
  public void enter() {
    occupied = true;
  }

  public void leave() {
    occupied = false;
  }
  
}
