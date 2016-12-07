package com.abigail05;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by root on 11/27/16.
 */

public interface contacto_form {

    @POST("1FAIpQLSf1TTpyczI9kYDQ2ttMphvI75fbNoKcHZ6kJ6fFqHrYPf6aHw/formResponse")
    @FormUrlEncoded
    Call<Void> completeContact(
            @Field("entry.1256969696") String nombre,
            @Field("entry.1183716515") String mail,
            @Field("entry.848180187") String mensaje,
            @Field("entry.101986137") String info,
            @Field("entry.741289727") String calle,
            @Field("entry.828005485") String callealtura,
            @Field("entry.2119009113") String piso,
            @Field("entry.1075508519") String localidad,
            @Field("entry.1424755752") String provincia,
            @Field("entry.154410989") String cpostal
    );
}
