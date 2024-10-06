package progmmerzamannow.spring.creational.factory.abstracts;

import org.springframework.context.annotation.Configuration;
import progmmerzamannow.spring.creational.factory.abstracts.gopay.GopayCancelPaymentRequest;
import progmmerzamannow.spring.creational.factory.abstracts.gopay.GopayChargePaymentRequest;
import progmmerzamannow.spring.creational.factory.abstracts.gopay.GopayGetBalancePaymentRequest;

@Configuration
public class GopayPaymentFactory implements PaymentFactory{

  @Override
  public ChargePaymentRequest createChargeRequest() {
    return new GopayChargePaymentRequest();
  }

  @Override
  public CancelPaymentRequest createCancelRequest() {
    return new GopayCancelPaymentRequest();
  }

  @Override
  public GetBalancePaymentRequest createGetBalanceRequest() {
    return new GopayGetBalancePaymentRequest();
  }
}
