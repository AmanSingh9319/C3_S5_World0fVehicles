/*
 *Author Name: Aman Singh
 *Date:30-08-2022
 *Created With: Intellij IDEA Community Edition
 */
package data;

public class Manual extends Transmission {

    public Manual(String transmissiontype, String modelNo, int noOfGears) {
        super(transmissiontype, modelNo, noOfGears);
    }

    @Override
    public void setGearRatio(double[] gearRatio) {
        super.setGearRatio(gearRatio);
    }

    @Override
    public double[] getGearRatio() {
        return super.getGearRatio();
    }

    @Override
    public void showSpecs() {
        super.showSpecs();
    }
}