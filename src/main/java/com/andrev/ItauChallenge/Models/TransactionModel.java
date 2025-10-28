package com.andrev.ItauChallenge.Models;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;

public class TransactionModel {

  @NotNull
  private final Double value;
  private final OffsetDateTime dateTime;

  public TransactionModel(Double value, OffsetDateTime dateTime) {
    this.value = value;
    this.dateTime = dateTime;
  }

  public Double getValue() {
    return value;
  }

  public OffsetDateTime getDateTime() {
    return dateTime;
  }
}
