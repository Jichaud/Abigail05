package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Switch;

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
    Button btnenviodhl;
    Switch switch1;
    EditText calle;
    EditText callenumero;
    EditText piso;
    EditText localidad;
    EditText provincia;
    EditText cpostal;
    LinearLayout layoutcontact;
    Spinner spinner_provincias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        btnenviodhl = (Button)findViewById(R.id.btnenviodhl);
        calle = (EditText)findViewById(R.id.calle);
        callenumero = (EditText)findViewById(R.id.callenumero);
        piso = (EditText)findViewById(R.id.piso);
        localidad = (EditText)findViewById(R.id.localidad);
        provincia = (EditText)findViewById(R.id.provincia);
        cpostal = (EditText)findViewById(R.id.cpostal);
        layoutcontact = (LinearLayout)findViewById(R.id.layoutcontact);
        spinner_provincias = (Spinner)findViewById(R.id.sprovincias);
        CargaProvincias();

        btnenviodhl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnenviodhl = new Intent(contacto.this,envio.class);
                startActivity(btnenviodhl);
            }
        });

        switch1 = (Switch)findViewById(R.id.switch1);
        switch1.setChecked(false);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch1.isChecked()) {
                    layoutcontact.setVisibility(View.VISIBLE);
                } else {
                    layoutcontact.setVisibility(View.GONE);
                }

            }
        });

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
                        String calleform = calle.getText().toString();
                        String callenumeroform = callenumero.getText().toString();
                        String pisoform = piso.getText().toString();
                        String localidadform = localidad.getText().toString();
                        String provinciaform = provincia.getText().toString();
                        String cpostalform = cpostal.getText().toString();
                        retrofit2.Call<Void> completeContact = contacto.completeContact(nombreform, mailform, mensajeform, infoform, calleform, callenumeroform, pisoform, localidadform, provinciaform, cpostalform);
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

    public void CargaProvincias() {
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(contacto.this,R.array.provincias, android.R.layout.simple_spinner_dropdown_item);
        spinner_provincias.setAdapter(adaptador);
        final String sp_provinciatxt = spinner_provincias.getSelectedItem().toString();

        spinner_provincias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                provincia.setText(spinner_provincias.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


}