package progmmerzamannow.spring.creational.factory.abstracts.gopay;

import lombok.Getter;
import lombok.Setter;
import progmmerzamannow.spring.creational.factory.abstracts.CancelPaymentRequest;
import progmmerzamannow.spring.creational.factory.abstracts.PaymentMethod;

public class GopayCancelPaymentRequest implements CancelPaymentRequest {

  @Getter
  @Setter
  private String id;

  @Override
  public PaymentMethod getMethod() {
    return PaymentMethod.GOPAY;
  }
}
