/*
 *Author Name: Aman Singh
 *Date:30-08-2022
 *Created With: Intellij IDEA Community Edition
 */
package data;

public class Transmission {
    private String transmissiontype;
    private String modelNo;
    private int noOfGears;

    public Transmission(String transmissiontype, String modelNo, int noOfGears) {
        this.transmissiontype = transmissiontype;
        this.modelNo = modelNo;
        this.noOfGears = noOfGears;
    }

    public String getTransmissiontype() {
        return transmissiontype;
    }

    public void setTransmissiontype(String transmissiontype) {
        this.transmissiontype = transmissiontype;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }
    double [] gearRatio=new double[noOfGears];

    public double[] getGearRatio() {
        return gearRatio;
    }

    public void setGearRatio(double[] gearRatio) {
        this.gearRatio = gearRatio;
    }

    public void showSpecs(){
        System.out.println("Transmission type = " + transmissiontype);
        System.out.println("Transmission model no = "+modelNo);
        System.out.println("key Specifications : ");
        System.out.println("forward Gears = "+noOfGears);
        for (int i =0; i<noOfGears;i++){
            System.out.println(gearRatio);
        }
}
}
