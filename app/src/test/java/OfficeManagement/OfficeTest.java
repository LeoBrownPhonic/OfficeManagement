package OfficeManagement;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.ArrayList;

public class OfficeTest {
  
  @Test public void testEmptyArray() {
    Office office = new Office();
    ArrayList<MeetingRoom> emptyarray = new ArrayList<MeetingRoom>();
    assertEquals("test it returns an empty array at start", emptyarray, office.allRooms());
  }

  @Test public void testAllRooms() {
    // MeetingRoom mockedmeetingroom = mock(MeetingRoom.class);
    // when(mockedmeetingroom.roomname).thenReturn("Room 1");
    Office office = new Office();
    office.newRoom("Room 1");
    office.newRoom("Room 2");
    office.newRoom("Room 3");
    assertEquals("test it returns a list of rooms added", "Room 1", office.allRooms().get(0).roomname);
    assertEquals("test it returns a list of rooms added", "Room 2", office.allRooms().get(1).roomname);
    assertEquals("test it returns a list of rooms added", "Room 3", office.allRooms().get(2).roomname);
  }

  @Test public void testNewRoom() {
    Office office = new Office();
    office.newRoom("Room 1");
    assertEquals("test it adds a room", "Room 1", office.allrooms.get(0).roomname); 

  }

  @Test public void testseeAvailableRooms() {
    Office office1 = new Office();
    office1.deleteAllRooms();
    office1.newRoom("Room 1");
    office1.newRoom("Room 2");
    office1.newRoom("Room 3");
    
    assertEquals("test it returns all unoccupied rooms", 3, office1.seeAvailableRooms().size());
    assertEquals("check room 1 is the first in the array", "Room 1", office1.seeAvailableRooms().get(0).roomname);
    office1.deleteAllAvailableRooms();
    System.out.println(office1.allRooms());
    office1.allRooms().get(0).enter();
    System.out.println(office1.allRooms().get(0).roomname);
    System.out.println(office1.allRooms().get(0).occupied);
    System.out.println(office1.seeAvailableRooms());
    office1.deleteAllAvailableRooms();
    assertEquals("test it returns all unoccupied rooms", 2, office1.seeAvailableRooms().size());
    office1.deleteAllAvailableRooms();
    assertEquals("check room 2 is now the first in the array", "Room 2", office1.seeAvailableRooms().get(0).roomname);
    
  }

  @Test public void testDeleteAllRooms() {
    Office office = new Office();
    office.newRoom("Room 1");
    assertEquals("test it returns a list of rooms added", "Room 1", office.allRooms().get(0).roomname);
    office.deleteAllRooms();
    assertEquals("test it returns an empty array after delete", 0, office.allRooms().size());

  }
}
