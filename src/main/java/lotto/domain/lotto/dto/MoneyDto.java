package lotto.domain.lotto.dto;

import java.util.Objects;

public record MoneyDto(String money) {
    public MoneyDto {
        if(money == null) {
            throw new IllegalArgumentException("money cannot be null");
        }
    }
}
