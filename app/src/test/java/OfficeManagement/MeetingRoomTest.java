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

  @Test public void testEnter() {
    MeetingRoom meetingroom = new MeetingRoom("Room 1");
    meetingroom.enter();
    assertEquals("test it changes occupied to true", meetingroom.occupied, true); 
  }

  @Test public void testAvailable() {
    MeetingRoom meetingroom = new MeetingRoom("Room 1");
    assertEquals("test it returns false when unoccupied", meetingroom.available(), false); 
    meetingroom.enter();
    assertEquals("test it changes occupied to true", meetingroom.available(), true); 
  }
}
