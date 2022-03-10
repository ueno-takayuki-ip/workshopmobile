package jp.co.biglobe.workshopmobile.domain.model.fee;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 月額料金
 */
@AllArgsConstructor
public class MonthlyFee {
    @Getter
    private final int value;

    public MonthlyFee add(MonthlyFee that){
        return new MonthlyFee(this.value + that.value);
    }
}
