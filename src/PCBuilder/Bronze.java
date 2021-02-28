package PCBuilder;

public class Bronze  implements DiscountCalculator {
    @Override
    public double discount1() {

        return 0;
    }

    @Override
    public double discount2() {
        return 0;
    }

    @Override
    public double discount3() {
        return 0;
    }

    public double totalDiscount(double cost) {

        switch((int) cost) {
                case 1:
                    if(cost < 300) {
                        return discount1();
                    }
                    break;
                case 2:
                  if(cost < 600) {
                       return discount2();
                   }
                    break;
                case 3:
                    if(cost > 600) {
                        return discount3();
                    }
                    break;
            }
                return 0;
        }
    }
