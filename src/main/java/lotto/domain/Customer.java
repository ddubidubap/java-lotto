package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickUniqueNumbersInRange;
import static lotto.view.Constants.*;

public class Customer {
    private final int paidMoney;
    private final int numOfTicket;
    private final List<List<Integer>> purchasedTickets = new ArrayList<>();

    public Customer(int paidMoney) {
        validateProperMoney(paidMoney);
        this.paidMoney = paidMoney;
        this.numOfTicket = this.paidMoney / 1000;
        purchaseLottery();
    }

    private void validateProperMoney(int paidMoney) {
        if (paidMoney % 1000 != 0) {
            throw new IllegalArgumentException(NOT_DIVISIBLE_BY_THOUSAND);
        }
    }

    private void purchaseLottery() {
        for (int i = 0; i < this.numOfTicket; i++) {
            List<Integer> ticket = pickUniqueNumbersInRange(MIN_NUM, MAX_NUM, COUNT);
            Collections.sort(ticket);
            this.purchasedTickets.add(ticket);
        }
    }
}
