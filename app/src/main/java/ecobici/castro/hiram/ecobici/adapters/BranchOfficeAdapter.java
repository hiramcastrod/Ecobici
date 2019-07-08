package ecobici.castro.hiram.ecobici.adapters;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ecobici.castro.hiram.ecobici.R;
import ecobici.castro.hiram.ecobici.View.MapsActivity;
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
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        final Branchoffice branchOffice = branchOffices.get(i);
        viewHolder.name.setText(branchOffice.getName());
        viewHolder.address.setText(branchOffice.getAddress());
        viewHolder.opens.setText("Abierto de: " + branchOffice.getOpens());
        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MapsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("LAT", branchOffices.get(i).getLatPoint());
                bundle.putString("LONG", branchOffices.get(i).getLonPoint());
                bundle.putString("NAME", branchOffices.get(i).getName());
                intent.putExtras(bundle);
                v.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return branchOffices.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, address, opens;
        CardView cardView;
        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            name = itemView.findViewById(R.id.name_tv);
            address = itemView.findViewById(R.id.address_tv);
            opens = itemView.findViewById(R.id.opens_tv);
        }
    }
}
