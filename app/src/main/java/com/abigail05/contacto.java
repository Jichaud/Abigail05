package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class contacto extends AppCompatActivity {

    EditText nombre;
    EditText mail;
    EditText mensaje;
    EditText info;
    Button btnconsulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        nombre = (EditText)findViewById(R.id.nombre);
        mail = (EditText)findViewById(R.id.mail);
        mensaje = (EditText)findViewById(R.id.mensaje);
        info = (EditText)findViewById(R.id.info);

        String stconsulta = getIntent().getStringExtra("consulta");
        mensaje.setText(stconsulta);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://docs.google.com/forms/d/e/")
                .build();
        final contacto_form contacto = retrofit.create(contacto_form.class);

        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if(!validateMail(mail.getText().toString())) {
                        mail.setError("e-mail inválido");
                        mail.requestFocus();
                    } else {
                        String nombreform = nombre.getText().toString();
                        String mailform = mail.getText().toString();
                        String mensajeform = mensaje.getText().toString();
                        String infoform = info.getText().toString();
                        retrofit2.Call<Void> completeContact = contacto.completeContact(nombreform, mailform, mensajeform, infoform);
                        completeContact.enqueue(callCallback);

                        Intent btnconsulta = new Intent(contacto.this, contactook.class);
                    startActivity(btnconsulta);
                }
                }
        });
    }

    private boolean validateMail(String mail) {

        String mailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(mailPattern);
        Matcher matcher = pattern.matcher(mail);

        return matcher.matches();

    }

    private final Callback<Void> callCallback = new Callback<Void>() {
        @Override
        public void onResponse(retrofit2.Call<Void> call, Response<Void> response) {

        }

        @Override
        public void onFailure(retrofit2.Call<Void> call, Throwable t) {

        }

    };

}