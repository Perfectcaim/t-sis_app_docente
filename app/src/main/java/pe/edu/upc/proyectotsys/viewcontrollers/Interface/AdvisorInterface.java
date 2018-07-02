package pe.edu.upc.proyectotsys.viewcontrollers.Interface;

import pe.edu.upc.proyectotsys.models.Advisor;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Query;

public interface AdvisorInterface {
    @Headers("Authorization: Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==")
    @POST("/api/advisor")
    void RegisterAdvisor(@Body Advisor advisor, Callback<Advisor> callback);

    @Headers("Authorization: Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==")
//    @FormUrlEncoded
    @POST("/api/login/advisor")
    void LoginUser(@Body Advisor advisor, Callback<Advisor> callback);
}