public class Bus {

  private int routeNumber;
  private Person[] passengers;

  public Bus(int routeNumber){
    this.routeNumber = routeNumber;
    this.passengers = new Person[36];
  }

  public int getRouteNumber(){
    return this.routeNumber;
  }

  public int passengerCount() {
    int count = 0;
    for (Person person : passengers) {
      if (person != null) {
        count++;
      }
    }
  return count;
  }

  public void boardPassenger(Person person) {
    if (isFull()) {
      return;
    }
    passengers[passengerCount()] = person;
  }

  public boolean isFull() {
    return passengerCount() == passengers.length;
  }


}
