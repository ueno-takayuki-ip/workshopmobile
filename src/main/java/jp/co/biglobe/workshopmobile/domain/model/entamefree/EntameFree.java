package jp.co.biglobe.workshopmobile.domain.model.entamefree;

import jp.co.biglobe.workshopmobile.domain.model.fee.MonthlyFee;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class EntameFree {
    @Getter
    private IsActive isActive;

    @Getter
    private MonthlyFee monthlyFee;

    public EntameFree(IsActive isActive){
        this.isActive = isActive;
        this.monthlyFee = new MonthlyFee(1200);
    }
}
