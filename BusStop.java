public class BusStop {

  private String name;
  private Person[] queue;

  public BusStop(String name){
    this.name = name;
    this.queue = new Person[10];
  }

  public String getName() {
    return this.name;
  }

  public int numberInQueue(){
    int count = 0;
    for (Person person : queue) {
      if (person != null) {
        count++;
      }
    }
    return count;
  }

  public void queuePassenger(Person person) {
    queue[numberInQueue()] = person;
  }

  public void passPassengerToBus(Bus bus){
    if (numberInQueue() > 0) {
      Person passenger = queue[0];
      bus.boardPassenger(passenger);
      // need to find a way to move everyone down one rather than removing a different person from the array than is on the bus.
      queue[numberInQueue() -1] = null;
    }
  }


}
