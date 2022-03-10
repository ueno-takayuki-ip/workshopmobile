package jp.co.biglobe.workshopmobile.domain.service;

import jp.co.biglobe.workshopmobile.domain.model.entamefree.EntameFree;
import jp.co.biglobe.workshopmobile.domain.model.entamefree.IsActive;
import jp.co.biglobe.workshopmobile.domain.model.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.model.plan.Plan;

public class FeeService {
    public MonthlyFee calcutateMonthlyFee(Plan plan,boolean isActive){
        if(plan == Plan._1ギガ && isActive){
            throw new RuntimeException("1ギガのプランではエンタメフリーオプションはつけられません");
        }

        EntameFree entameFree = new EntameFree(new IsActive(isActive));

        if (entameFree.getIsActive().isActiveFlag()){
            return plan.getMonthlyFee().add(entameFree.getMonthlyFee());
        }

        return plan.getMonthlyFee();
    }
}
