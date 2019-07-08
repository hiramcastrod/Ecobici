package ecobici.castro.hiram.ecobici.View;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ecobici.castro.hiram.ecobici.Presenter.BranchOfficeListPresenter;
import ecobici.castro.hiram.ecobici.R;
import ecobici.castro.hiram.ecobici.adapters.BranchOfficeAdapter;
import ecobici.castro.hiram.ecobici.databinding.FragmentBranchOfficeListBinding;
import ecobici.castro.hiram.ecobici.interfaces.BranchOfficeListInterface;
import ecobici.castro.hiram.ecobici.models.Branchoffice;

/**
 * A simple {@link Fragment} subclass.
 */
public class BranchOfficeListFragment extends Fragment implements BranchOfficeListInterface.View {
    public BranchOfficeListPresenter presenter;
    private Branchoffice branchOffice;
    FragmentBranchOfficeListBinding binding;

    public BranchOfficeListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     binding = DataBindingUtil.inflate(inflater, R.layout.fragment_branch_office_list, container, false);

     presenter = new BranchOfficeListPresenter(this);
     return binding.getRoot();
    }

    @Override
    public void showLoader() {

    }

    @Override
    public void setView(ArrayList<Branchoffice> officeArrayList) {
        binding.rvBranchoffices.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.rvBranchoffices.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new BranchOfficeAdapter(officeArrayList, R.layout.branchoffice_card_view, (AppCompatActivity) getActivity());
        binding.rvBranchoffices.setAdapter(adapter);
    }


}
