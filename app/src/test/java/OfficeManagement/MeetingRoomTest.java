package OfficeManagement;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class MeetingRoomTest {


  
  @Test public void testNew() {
    MeetingRoom meetingroom = new MeetingRoom("Room 1");
    assertEquals("tests a new room is created with a name", meetingroom.roomname, "Room 1");

  }

  // @Test public void testNewRoom() {
  //   MeetingRoom meetingroom = new MeetingRoom();
  //   meetingroom.newRoom("Room 1");
  //   assertEquals("test it adds a room", meetingroom.allrooms.get(0), "Room 1"); 



  // }
}
