package generic.genericmethodEx;

public class Box<T> {
  private T type;

  public void setType(T type) { // generic method set
    this.type = type;
  }

  public T getType() { // generic method get
    return this.type;
  }
}
