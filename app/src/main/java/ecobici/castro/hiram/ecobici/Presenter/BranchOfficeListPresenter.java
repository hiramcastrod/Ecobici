package ecobici.castro.hiram.ecobici.Presenter;

import java.util.ArrayList;

import ecobici.castro.hiram.ecobici.Model.BranchOfficeListModel;
import ecobici.castro.hiram.ecobici.interfaces.BaseInterface;
import ecobici.castro.hiram.ecobici.interfaces.BranchOfficeListInterface;
import ecobici.castro.hiram.ecobici.models.Branchoffice;

public class BranchOfficeListPresenter implements BranchOfficeListInterface.Presenter {
    private BranchOfficeListInterface.View view;
    private BranchOfficeListInterface.Model model;
    private Branchoffice branchOffice;

    public BranchOfficeListPresenter(BranchOfficeListInterface.View view) {
        this.view = view;
        onViewCreated();
    }


    @Override
    public void onViewCreated() {
        view.showLoader();

        model = new BranchOfficeListModel(new BaseInterface.Model<ArrayList<Branchoffice>>() {
            @Override
            public void onSuccess(ArrayList<Branchoffice> var) {
                view.setView(var);
            }

            @Override
            public void onFailure(ArrayList<Branchoffice> var) {

            }


        });

        model.getBranchOffices();
    }

    @Override
    public void onDestroy() {
        this.model = null;
        this.view = null;
    }
}
