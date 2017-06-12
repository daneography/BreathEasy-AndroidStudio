package uofsc.com.breatheasy;

/**
 * Created by danea on 6/12/2017.
 */

import uofsc.com.breatheasy.models.ServerRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import uofsc.com.breatheasy.models.ServerResponse;


public class RequestInterface {

    @POST("BreathEasy/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
