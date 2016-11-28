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
            @Field("entry.848180187") String mensaje
    );
}
