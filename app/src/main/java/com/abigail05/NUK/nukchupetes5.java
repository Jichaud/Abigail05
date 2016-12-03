package com.abigail05.NUK;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class nukchupetes5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukchupetes5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b945e13a231bd9ae1929f3aa32a14f50";
    ImageView nukchupetes5;
    ImageView nukchupetes55;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtnukchupetes5;
    String urlnukchupetes5 = "https://lh3.googleusercontent.com/Gfzs8yr8NcceJ4zKtc1pXL9lo0BCApPiPh9FGl94d6HecIIHStOyikVuHoAzKYALAtRt3qiRgrP3Q-Zh4YtbbSveJvMS5zvjL87woyKcILBDSR2Gwv6_fzfch3WiHXQLfxW7FotUqn0-fVjgYtcntFUhZdLIks0_CaZl8bOzgH38FdwlTK_HhlaBDDM2x_oQetLN-pC_qOXr3MpQqKOoOKEBwCaBM00SozcO3XdXeI0k4B_JcFmF_Jy0v6kOBUpfmcx3pUCZcc9vvMvtsgPTiggYWCJoVG9iYwzRn7a1iYJcQVX12NitR3xzZjxxFN9ouqVRPRWrPpeuhcycWu3uMzp6r7KTmy8viza50CQssbmrk-UUHpAUk-cjJZBpqiFqLecWfvj3X4YbSwF8ZW3Jo7bwW1jU-kg1WSQlK007izHVt6aR27x9XO4tmpxynay9TKFO6b7xm_Fyoi6Gl8BXKiRgrDRcEkNxEfqXrX_f8OtrJBnlN8pbRSd1zbCZhNCLk61bHaS24Ya4iXVt1J4r2iXoEmJt-i2oRdSASQxVR6AjtLKEK4TUcq6D1_LUXNZmQuyaOTo5Ksux27pZCACARNdnZbi0_5otnZicDCRS0C6cBvLzxw=w361-h300-no";
    String urlnukchupetes55 = "https://lh3.googleusercontent.com/X-i09lXYM-uAUAbyG0rbVPwn9GgDRUVmygv3V7OEy_J3Q7hEmW23Fzltc4bP51gZC7tpx1rvZKn5zc_n_uzn37FwX15yrDdRrt8sHGTcQSRac50xUARUt_60oGeDlZVTF6s5I0vZZWhnNf2dQLoMUfptn1pQ6wMfFlMUWJ5ZTO4i6dV5GNmm1IhYn8NtkI93dgdi7ZgopfE4WjI1EpT4AefJ1YWfJNr_dAJsdsS7DYKyxeYPqMrmqjQS0q-8C0Cc_It0xSwJW0rT3UVozV6UXyrfHyXicYhygt8XfmwwC1_AOxFmdWokdcitqxABhvEty3bcXbjLM1LNh7kGH1YWyhdysO9eaARS8nTyRVBAC-Io0p2oQXSygndNUTKq6D5iFC_W9JapxJJF0AZ1_J5Ytm77DbR3jm9IpU-zCrhuoCcIfsb_wso5wTg4AWkJV2mhNuyvx0U7gRimnK1TADoFCpnJIl_dQQCCx_IvtuEFE9RnDy9pLmbLivZ5N2a6kt2RGOvwLQjfW6YssxQvNTLcf2IAJNsknikaaaUzSmZUtsdQWn_e0I6ZN15k5bQM9djRfe14sGvLF4Ka6dUo_nl27nnLroLWsogUBigNreQD-vTAlQC4Hw=w361-h300-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukchupetes5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukchupetes5.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukchupetes5 = (TextView)findViewById(R.id.txtnukchupetes5);
        final String stconsulta = txtnukchupetes5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukchupetes5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukchupetes5.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukchupetes5 = (Button)findViewById(R.id.btncompranukchupetes5);
        btncompranukchupetes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukchupetes5 = new Intent(nukchupetes5.this, webview.class);
                btncompranukchupetes5.putExtra("string", urlcombo);
                startActivity(btncompranukchupetes5);
            }
        });

        nukchupetes5 = (ImageView)findViewById(R.id.nukchupetes5);
        Picasso.with(this).load(urlnukchupetes5).into(nukchupetes5);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes5.setVisibility(View.VISIBLE);
                nukchupetes55.setVisibility(View.GONE);
            }
        });

        nukchupetes55 = (ImageView)findViewById(R.id.nukchupetes55);
        Picasso.with(this).load(urlnukchupetes55).into(nukchupetes55);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes55.setVisibility(View.VISIBLE);
                nukchupetes5.setVisibility(View.INVISIBLE);
            }
        });

    }
}
