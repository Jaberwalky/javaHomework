import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest {

Bus bus;
Person person;
BusStop busStop;

  @Before
  public void before(){
    bus = new Bus(4);
    person = new Person();
    busStop = new BusStop("Gilmerton Road");
  }

  @Test
  public void hasName() {
    assertEquals("Gilmerton Road", busStop.getName());
  }

  @Test
  public void canQueuePassengers() {
    busStop.queuePassenger(person);
    assertEquals(1, busStop.numberInQueue());
  }

  @Test
  public void canAddPassengerToBus() {
    busStop.queuePassenger(person);
    busStop.passPassengerToBus(bus);
    assertEquals(0, busStop.numberInQueue());
    assertEquals(1, bus.passengerCount());
  }

}
