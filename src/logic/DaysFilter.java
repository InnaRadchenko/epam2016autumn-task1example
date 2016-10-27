package logic;

import domain.Vaucher;

public class DaysFilter implements Filter {
    private Integer minDays;
    private Integer maxDays;

    public DaysFilter(Integer minDays, Integer maxDays) throws Exception {
        if (0 < minDays && minDays <= maxDays) {
            this.minDays = minDays;
            this.maxDays = maxDays;
        } else {
            throw new Exception();
        }
    }

    @Override
    public boolean isSatisfy(Vaucher vaucher) {
        Integer days = vaucher.getDays();
        return minDays <= days && days <= maxDays;
    }
}
