package lotto.domain.lotto;

import lotto.global.constant.BonusNumberMatch;

public class WinningNumbers {
    private WinningNormalNumbers winningNormalNumbers;
    private BonusNumber bonusNumber;

    public WinningNumbers(WinningNormalNumbers winningNumbers, BonusNumber bonusNumber) {
        this.winningNormalNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }

    public void generateWinningNormalNumbers(String number) {
        winningNormalNumbers.generateWinningNormalNumbers(number);
    }

    public void generateBonusNumber(String number) {
        bonusNumber.generateBonusNumber(number);
        winningNormalNumbers.validateBonusIsDuplicateWithWinningNormalNumber(bonusNumber);
    }

    public int getWinningNumberMatchCount(Lotto lotto) {
        return winningNormalNumbers.compareWinningNormalNumberWithLotto(lotto);
    }

    public BonusNumberMatch isBonusNumberMatch(Lotto lotto, int matchCount) {
        return bonusNumber.compareBonusNumberWithLotto(lotto, matchCount);
    }

    public WinningNormalNumbers getWinningNormalNumbers() {
        return winningNormalNumbers;
    }

    public BonusNumber getBonusNumber() {
        return bonusNumber;
    }
}
