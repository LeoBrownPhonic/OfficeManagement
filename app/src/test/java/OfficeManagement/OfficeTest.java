package OfficeManagement;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.ArrayList;

public class OfficeTest {
  
  @Test public void testEmptyArray() {
    Office office = new Office();
    ArrayList<MeetingRoom> emptyarray = new ArrayList<MeetingRoom>();
    assertEquals("test it returns an empty array at start", office.allRooms(), emptyarray);
  }

  @Test public void testAllRooms() {
    // MeetingRoom mockedmeetingroom = mock(MeetingRoom.class);
    // when(mockedmeetingroom.roomname).thenReturn("Room 1");
    Office office = new Office();
    office.newRoom("Room 1");
    office.newRoom("Room 2");
    office.newRoom("Room 3");
    assertEquals("test it returns a list of rooms added", office.allRooms().get(0).roomname, "Room 1");
    assertEquals("test it returns a list of rooms added", office.allRooms().get(1).roomname, "Room 2");
    assertEquals("test it returns a list of rooms added", office.allRooms().get(2).roomname, "Room 3");
  }

  @Test public void testNewRoom() {
    Office office = new Office();
    office.newRoom("Room 1");
    assertEquals("test it adds a room", office.allrooms.get(0).roomname, "Room 1"); 

  }

  // @Test public void testAvailable() {
  //   Office office = new Office();
  //   office.newRoom("Room 1");
  //   MeetingRoom meetingroom = office.allRooms().get(0);
  //   assertEquals("test room returns occupied", .occupied, false);
  //   meetingroom.occupy();
  //   assertEquals("test room returns occupied", office.allrooms.get(0).occupied, true); 
  // }
}
