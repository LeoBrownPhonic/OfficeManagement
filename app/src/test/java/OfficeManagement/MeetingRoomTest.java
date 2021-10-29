package OfficeManagement;

import org.junit.Test;
import static org.junit.Assert.*;


public class MeetingRoomTest {


  
  @Test public void testNew() {
    MeetingRoom meetingroom = new MeetingRoom("Room 1");
    assertEquals("tests a new room is created with a name", meetingroom.roomname, "Room 1");

  }

  @Test public void testHasStatus() {
    MeetingRoom meetingroom = new MeetingRoom("Room 1");
    assertEquals("tests a new room has a false occupied status", meetingroom.occupied, false);
    
  }

  @Test public void testOccupy() {
    MeetingRoom meetingroom = new MeetingRoom("Room 1");
    meetingroom.occupy();
    assertEquals("test it changes occupied to true", meetingroom.occupied, true); 
  }
}
