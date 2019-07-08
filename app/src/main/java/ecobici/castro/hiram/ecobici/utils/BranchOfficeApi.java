package ecobici.castro.hiram.ecobici.utils;

import java.util.List;

import ecobici.castro.hiram.ecobici.models.Branchoffice;
import retrofit2.Call;
import retrofit2.http.GET;

public interface BranchOfficeApi {

    @GET("walmart-services/mg/address/storeLocatorCoordinates")
    Call<Server.Response<List<Branchoffice>>> getBranchOffices();
}
