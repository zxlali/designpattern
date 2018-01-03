#基金最大回撤率O(n)

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Alex on 17/12/22 下午7:44.
 */
public class FundAnalyseTool {
    public static BigDecimal analyse(List<FundNetValue> netValues) {
        if (netValues == null || netValues.size() == 0)
            return BigDecimal.valueOf(-99);

        Collections.sort(netValues, new Comparator<FundNetValue>() {
            public int compare(FundNetValue o1, FundNetValue o2) {
                return o1.getNetValueDate().compareTo(o2.getNetValueDate());
            }
        });

        BigDecimal minRate = BigDecimal.valueOf(Double.MAX_VALUE);
        for (int i = 0; i < netValues.size() - 1; i++) {
            FundNetValue fundNetValueOut = netValues.get(i);
            for (int j = i + 1; j < netValues.size(); j++) {
                FundNetValue fundNetValueInner = netValues.get(j);
                BigDecimal rate = BigDecimal.ZERO.compareTo(fundNetValueInner.getNetValue()) == 0 ?
                    BigDecimal.ZERO :
                    fundNetValueInner.getNetValue()
                        .divide(fundNetValueOut.getNetValue(), 4, RoundingMode.HALF_UP);
                if (minRate.compareTo(rate) > 0) {
                    minRate = rate;
                }
            }
        }
        return BigDecimal.ONE.subtract(minRate);
    }

    public static BigDecimal analyse_1(List<FundNetValue> netValues) {
        BigDecimal max = netValues.get(0).getNetValue();
        BigDecimal minRate = BigDecimal.ONE;
        for (int i = 1; i < netValues.size(); i++) {
            if (netValues.get(i).getNetValue().compareTo(max) > 0) {
                max = netValues.get(i).getNetValue();
            } else {
                BigDecimal current =
                    netValues.get(i - 1).getNetValue().divide(max, 4, BigDecimal.ROUND_HALF_UP);
                if (current.compareTo(minRate) < 0)
                    minRate = current;
            }
        }

        return BigDecimal.ONE.subtract(minRate);
    }

    public static void main(String[] args) {
        List<FundNetValue> fundNetValues = new ArrayList<FundNetValue>();
        FundNetValue f1 =
            new FundNetValue(DateTime.now().withTimeAtStartOfDay().toDate(), BigDecimal.valueOf(2));
        fundNetValues.add(f1);
        FundNetValue f2 =
            new FundNetValue(DateTime.now().withTimeAtStartOfDay().plusDays(1).toDate(),
                BigDecimal.valueOf(6));
        fundNetValues.add(f2);
        FundNetValue f3 =
            new FundNetValue(DateTime.now().withTimeAtStartOfDay().plusDays(2).toDate(),
                BigDecimal.valueOf(9));
        fundNetValues.add(f3);
        FundNetValue f4 =
            new FundNetValue(DateTime.now().withTimeAtStartOfDay().plusDays(3).toDate(),
                BigDecimal.valueOf(15));
        fundNetValues.add(f4);
        FundNetValue f5 =
            new FundNetValue(DateTime.now().withTimeAtStartOfDay().plusDays(4).toDate(),
                BigDecimal.valueOf(12));
        fundNetValues.add(f5);
        FundNetValue f6 =
            new FundNetValue(DateTime.now().withTimeAtStartOfDay().plusDays(5).toDate(),
                BigDecimal.valueOf(10));
        fundNetValues.add(f6);
        FundNetValue f7 =
            new FundNetValue(DateTime.now().withTimeAtStartOfDay().plusDays(6).toDate(),
                BigDecimal.valueOf(11));
        fundNetValues.add(f7);
        FundNetValue f8 =
            new FundNetValue(DateTime.now().withTimeAtStartOfDay().plusDays(7).toDate(),
                BigDecimal.valueOf(12));
        fundNetValues.add(f8);
        FundNetValue f9 =
            new FundNetValue(DateTime.now().withTimeAtStartOfDay().plusDays(8).toDate(),
                BigDecimal.valueOf(14));
        fundNetValues.add(f9);
        FundNetValue f10 =
            new FundNetValue(DateTime.now().withTimeAtStartOfDay().plusDays(9).toDate(),
                BigDecimal.valueOf(18));
        fundNetValues.add(f10);

        System.out.println("O(n):" + analyse_1(fundNetValues));
        System.out.println("O(n2):" + analyse(fundNetValues));
    }
}
