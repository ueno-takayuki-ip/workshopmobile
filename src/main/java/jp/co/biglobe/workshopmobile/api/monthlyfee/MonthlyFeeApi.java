package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.service.FeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class MonthlyFeeApi {

    @RequestMapping(value = "/monthly-fee", method = RequestMethod.GET)
    public Map invoke(
            Request request
    ) {
        FeeService feeService = new FeeService();

        Map<String, Object> res = new HashMap<>();

        res.put("monthly_fee", feeService.calculateMonthlyFee(request.getPlanForm().getPlan(), request.isEntame_free()).getValue());
        return res;
    }

}
