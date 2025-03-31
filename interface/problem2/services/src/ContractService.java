import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;
        for(int i = 1; i <= months; i++) {
//            O metodo plusMonths adiciona uma quantidade ao mes
            LocalDate localDate = contract.getDate().plusMonths(i);

            double juros = onlinePaymentService.interest(basicQuota, i);
            double taxa = onlinePaymentService.paymentFee(basicQuota + juros);
            double cota = basicQuota + juros + taxa;

            contract.getInstallmentList().add(new Installment(localDate, cota));
        }
    }
}
