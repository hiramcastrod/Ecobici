package ecobici.castro.hiram.ecobici.adapters;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ecobici.castro.hiram.ecobici.R;
import ecobici.castro.hiram.ecobici.models.Branchoffice;

public class BranchOfficeAdapter extends RecyclerView.Adapter<BranchOfficeAdapter.ViewHolder> {
    public ArrayList<Branchoffice> branchOffices;
    public int res;
    public AppCompatActivity activity;

    public BranchOfficeAdapter(ArrayList<Branchoffice> branchOffices, int res, AppCompatActivity activity) {
        this.branchOffices = branchOffices;
        this.res = res;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(res, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Branchoffice branchOffice = branchOffices.get(i);
        viewHolder.name.setText(branchOffice.getName());
    }

    @Override
    public int getItemCount() {
        return branchOffices.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_tv);
        }
    }
}
