import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Alex on 17/12/22 下午7:41.
 */
public class FundNetValue {
    /**
     * 净值日期
     */
    private Date netValueDate;
    /**
     * 净值
     */
    private BigDecimal netValue;

    public FundNetValue() {
    }

    public FundNetValue(Date netValueDate, BigDecimal netValue) {
        this.netValueDate = netValueDate;
        this.netValue = netValue;
    }

    public Date getNetValueDate() {
        return netValueDate;
    }

    public FundNetValue setNetValueDate(Date netValueDate) {
        this.netValueDate = netValueDate;
        return this;
    }

    public BigDecimal getNetValue() {
        return netValue;
    }

    public FundNetValue setNetValue(BigDecimal netValue) {
        this.netValue = netValue;
        return this;
    }
}
