package OfficeManagement;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class MeetingRoomTest {


  
  @Test public void testAllRooms() {
    MeetingRoom meetingroom = new MeetingRoom();
    ArrayList<String> emptyarray = new ArrayList<String>();
    assertEquals("test it returns an empty array at start", meetingroom.allRooms(), emptyarray);
  }

  @Test public void testNewRoom() {
    MeetingRoom meetingroom = new MeetingRoom();
    meetingroom.newRoom("Room 1");
    assertEquals("test it adds a room", meetingroom.allrooms.get(0), "Room 1"); 



  }
}
