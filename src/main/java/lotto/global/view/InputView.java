package lotto.global.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String input() {
        return Console.readLine();
    }

    public static long inputInteger() {
        return Long.parseLong(input());
    }

}