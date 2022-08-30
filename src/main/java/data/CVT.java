/*
 *Author Name: Aman Singh
 *Date:30-08-2022
 *Created With: Intellij IDEA Community Edition
 */
package data;

public class CVT extends Automatic {

    public CVT(String transmissiontype, String modelNo, int noOfGears) {
        super(transmissiontype, modelNo, noOfGears);
    }

    @Override
    public double[] getGearRatio() {
        return super.getGearRatio();
    }

    @Override
    public void setGearRatio(double[] gearRatio) {
        super.setGearRatio(gearRatio);
    }

    @Override
    public void showSpecs() {
        super.showSpecs();
    }
}
