package lotto.view;

public class Constants {
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 45;
    public static final int COUNT = 6;

    public static final String INPUT_MONEY = "구입 금액을 입력해 주세요.";
    public static final String BOUGHT_NOTICE = "%d개를 구매했습니다.";
    public static final String INPUT_WINNING_NUMBERS = "당첨 번호를 입력해 주세요.";
    public static final String INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";
    public static final String WIN_STAT = "당첨 통계\n---";
    public static final String EARNED_RATE = "총 수익률은 %.f입니다.";

    public static final String ERROR_ALERT = "[ERROR] ";
    public static final String NOT_DIVISIBLE_BY_THOUSAND = ERROR_ALERT + "1000원 단위로 값을 지불해야 합니다.";
    public static final String BOUGHT_NOTHING = ERROR_ALERT + "로또 용지를 1개 이상 구입해야 합니다.";
    public static final String NOT_SIX = ERROR_ALERT + "당첨 번호는 6개여야 합니다.";
    public static final String NOT_NUMERIC = ERROR_ALERT + "입력값은 숫자여야 합니다.";
    public static final String NOT_PROPER_NUMBER = ERROR_ALERT + "로또 번호는 1부터 45 사이의 숫자여야 합니다.";
    public static final String CANNOT_BE_BONUS = ERROR_ALERT + "당첨 번호에 이미 존재하는 번호입니다.";
}
