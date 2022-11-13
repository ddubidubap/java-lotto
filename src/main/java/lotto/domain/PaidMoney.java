package lotto.domain;

import static lotto.view.Constants.BOUGHT_NOTHING;
import static lotto.view.Constants.NOT_DIVISIBLE_BY_THOUSAND;

public class PaidMoney {
    private final int paidMoney;

    public PaidMoney(int paidMoney) {
        validateNoMoney(paidMoney);
        validateWrongMoney(paidMoney);
        this.paidMoney = paidMoney;
    }

    private void validateNoMoney(int paidMoney) {
        if (paidMoney == 0) {
            System.out.println(BOUGHT_NOTHING);
            throw new IllegalArgumentException();
        }
    }

    private void validateWrongMoney(int paidMoney) {
        if (paidMoney % 1000 != 0) {
            System.out.println(NOT_DIVISIBLE_BY_THOUSAND);
            throw new IllegalArgumentException();
        }
    }
}
