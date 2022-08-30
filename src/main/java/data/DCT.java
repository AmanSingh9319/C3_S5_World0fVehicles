/*
 *Author Name: Aman Singh
 *Date:30-08-2022
 *Created With: Intellij IDEA Community Edition
 */
package data;

public class DCT extends Automatic{

    public DCT(String transmissiontype, String modelNo, int noOfGears) {
        super(transmissiontype, modelNo, noOfGears);
    }

    @Override
    public void setModelNo(String modelNo) {
        super.setModelNo(modelNo);
    }

    @Override
    public int getNoOfGears() {
        return super.getNoOfGears();
    }

    @Override
    public void setNoOfGears(int noOfGears) {
        super.setNoOfGears(noOfGears);
    }
}
