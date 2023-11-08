public class BonusMilesService {

    public int calculate(int price) {

        int bonusMiles;

        int bonus = 20;

        bonusMiles = price / bonus;

        return bonusMiles;
    }
}
