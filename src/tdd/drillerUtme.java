package tdd;

public class drillerUtme {

    public int CalculateTotalPriceOf(int copies) {

        int invalid = 0;

        if (copies >= 1 && copies <= 4){
            return copies * 2000;
        }
        if (copies >= 5 && copies <= 9){
            return copies * 1800;
        }
        if (copies >= 10 && copies <= 29){
            return copies * 1600;
        }
        if (copies >= 30 && copies <= 49) {
        return copies * 1500;
        }
        if (copies >= 50 && copies <= 99){
            return copies * 1300;
        }
        if (copies >= 100 && copies <= 199){
            return copies * 1200;
        }
        if (copies >= 200 && copies <= 499){
            return copies * 1000;
        }
       if (copies >= 500){
            return  copies * 1000;
       }
        return invalid;
    }
}
