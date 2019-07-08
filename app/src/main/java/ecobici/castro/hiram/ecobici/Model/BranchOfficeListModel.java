package ecobici.castro.hiram.ecobici.Model;

import java.util.ArrayList;
import java.util.List;

import ecobici.castro.hiram.ecobici.interfaces.BaseInterface;
import ecobici.castro.hiram.ecobici.interfaces.BranchOfficeListInterface;
import ecobici.castro.hiram.ecobici.models.Branchoffice;
import ecobici.castro.hiram.ecobici.utils.BranchOfficeApi;
import ecobici.castro.hiram.ecobici.utils.Server;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BranchOfficeListModel implements BranchOfficeListInterface.Model {
    private BaseInterface.Model<List<Branchoffice>> output;

    public BranchOfficeListModel(BaseInterface.Model output) {
    this.output = output;
}

    @Override
    public ArrayList<Branchoffice> getBranchOffices() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.walmartmobile.com.mx/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        BranchOfficeApi branchOfficeApi = retrofit.create(BranchOfficeApi.class);

        Call<Server.Response<List<Branchoffice>>> call = branchOfficeApi.getBranchOffices();

        call.enqueue(new Callback<Server.Response<List<Branchoffice>>>() {
            @Override
            public void onResponse(Call<Server.Response<List<Branchoffice>>> call, Response<Server.Response<List<Branchoffice>>> response) {

                if(!response.isSuccessful()){
                    return;
                }

                List<Branchoffice> branchoffices = response.body().responseArray;
                output.onSuccess(branchoffices);

            }

            @Override
            public void onFailure(Call<Server.Response<List<Branchoffice>>> call, Throwable t) {
                output.onFailure(null);
            }
        });

//        ArrayList<Branchoffice> branchOffices = generateDuplicates();
//        output.onSuccess(branchOffices);
        return null;
    }

    private ArrayList<Branchoffice> generateDuplicates() {
        ArrayList<Branchoffice> branchoffices = new ArrayList<>();
        branchoffices.add(new Branchoffice("4", "1027", "SENDERO", "AV. RAUL SALINAS LOZANO  # 1001 SUR COL. HACIENDAS DE ANAHUAC, ENTRE SENDEO DIVISORIO Y RAUL SALINAS (OFICIAL)",
                "8397 9355 AL 64", "HANS ERNEST NIELSEN PEREZ", "66055", "25.7655", "25.7655", "-100.317",
                "07:00 a 23:00 / UTC–6 - V (UTC–5)"));

        branchoffices.add(new Branchoffice("4", "1027", "OTRA", "AV. RAUL SALINAS LOZANO  # 1001 SUR COL. HACIENDAS DE ANAHUAC, ENTRE SENDEO DIVISORIO Y RAUL SALINAS (OFICIAL)",
                "8397 9355 AL 64", "HANS ERNEST NIELSEN PEREZ", "66055", "25.7655", "25.7655", "-100.317",
                "07:00 a 23:00 / UTC–6 - V (UTC–5)"));

        branchoffices.add(new Branchoffice("4", "1027", "SENDERO", "AV. RAUL SALINAS LOZANO  # 1001 SUR COL. HACIENDAS DE ANAHUAC, ENTRE SENDEO DIVISORIO Y RAUL SALINAS (OFICIAL)",
                "8397 9355 AL 64", "HANS ERNEST NIELSEN PEREZ", "66055", "25.7655", "25.7655", "-100.317",
                "07:00 a 23:00 / UTC–6 - V (UTC–5)"));

        branchoffices.add(new Branchoffice("4", "1027", "SENDERO", "AV. RAUL SALINAS LOZANO  # 1001 SUR COL. HACIENDAS DE ANAHUAC, ENTRE SENDEO DIVISORIO Y RAUL SALINAS (OFICIAL)",
                "8397 9355 AL 64", "HANS ERNEST NIELSEN PEREZ", "66055", "25.7655", "25.7655", "-100.317",
                "07:00 a 23:00 / UTC–6 - V (UTC–5)"));
        return branchoffices;
    }
}
