package progmmerzamannow.spring.creational.factory.abstracts.creditcard;

import lombok.Getter;
import lombok.Setter;
import progmmerzamannow.spring.creational.factory.abstracts.CancelPaymentRequest;
import progmmerzamannow.spring.creational.factory.abstracts.PaymentMethod;

public class CreditCardCancelPaymentRequest implements CancelPaymentRequest {

  @Getter
  @Setter
  private String id;

  @Override
  public PaymentMethod getMethod() {
    return PaymentMethod.CREDIT_CARD;
  }
}
