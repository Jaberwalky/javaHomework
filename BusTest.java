import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {

Bus bus;
Person person;

  @Before
  public void before() {
    bus = new Bus(3);
    person = new Person();
  }

  @Test
  public void hasRouteNumber() {
    assertEquals(3, bus.getRouteNumber());
  }

  @Test
  public void startEmptyOfPassengers() {
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canTakePassengers() {
    bus.boardPassenger(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void isBusFull() {
    for (int i = 0; i < 36; i++){
      bus.boardPassenger(person);
    }
    assertEquals(true, bus.isFull());
  }

  @Test
  public void cannotTakePassengerWhenFull() {
    for (int i = 0; i < 40; i++) {
      bus.boardPassenger(person);
    }
    assertEquals(36, bus.passengerCount());
  }

}
