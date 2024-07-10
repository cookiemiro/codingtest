package generic.interfaceEx;

public class Codi implements Rentable<AirConditionMachine> {

  @Override
  public AirConditionMachine rent() {
    return new AirConditionMachine();
  }
}
