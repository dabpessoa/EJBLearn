package br.com.cinematizando.model;

public class Address extends Model {

  private static final long serialVersionUID = 6783808394946035356L;

  private String street;
  private Integer number;

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Address [street=").append(street).append(", number=").append(number)
        .append("]");
    return builder.toString();
  }

  public Address() {}

  public Address(Integer number, String street) {
     this.number = number;
     this.street = street;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

}
