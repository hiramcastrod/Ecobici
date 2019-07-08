package ecobici.castro.hiram.ecobici.interfaces;

import java.util.ArrayList;

import ecobici.castro.hiram.ecobici.models.Branchoffice;

public interface BranchOfficeListInterface {

    interface View {
        void showLoader();
        void setView(ArrayList<Branchoffice> officeArrayList);
    }

    interface Presenter extends BaseInterface.Presenter{

    }

    interface Model {
        ArrayList<Branchoffice> getBranchOffices();
    }
}
