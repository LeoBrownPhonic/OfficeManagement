package OfficeManagement;

// import java.util.ArrayList;



public class MeetingRoom {

String roomname;
Boolean occupied;
  
  MeetingRoom(String name) {
      roomname = name;
      occupied = false;
    }

  public void enter() {
    occupied = true;
  }

  public Boolean available() {
    return occupied;
  }
  
}
