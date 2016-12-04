package com.abigail05.NowyBaby;

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

public class nowycamaras1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranowycamaras1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=abb4419289ab9df1ee35a6012e2f3ab8";
    ImageView nowycamaras1;
    ImageView nowycamaras11;
    ImageView nowycamaras12;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtnowycamaras1;
    String urlnowycamaras1 = "https://lh3.googleusercontent.com/-XY36FcuiXKv-qLPgCQaCEp_hlgppZql9r5B_HN5ucvOEzOXw6JQMamIW0PAMGwq4lgkILB_wKCDWGRmgfeQR_3t4ljVPObu5FyPjdRpIMEguNBMoMeOwdENZcNy4BQXK4YcJ-sdqbhoSE-dy1do_1sOwL62NAooIloCj-Axq3IRqCIny5SU6SW4C1hzG0u5tuQ3qtd8mPA1mhpoQI__8aQPXURJWWz6u1japoZR1Vk11r_QM2UPhRLF4GS4DAQ2ZL5wZDtexyUqSPCwebYCXy5Yakmd9unbO-AW2e-VwPDrgxO_rBVVXUlh0vGaFilqR6Ub_1_xX7hlWtqfOkQCV5SHyxBpBuYYN2hl71DFmrI2_njQ8h-XJPA10PMWOtq-2FmmPh0q5umQJKrC70pkNIAz_-PL_kqZ320Gj9T0sEG6BcfrsiBg8SPdbGVMJ4Md22IJbBIoSAxlSkLgt5HejLhAgCLH9soFZwMFzOgJIFgRwB2fHSF7KSx0Uu_OI4YERiw3BhF6aoEnDeRYYRBnzggP79Tp2GvpCQiuZK--JP66d1BX08JCJlMC0fAqnUU2QY0wevcl5wM8ECwklYz53chyTJS--1c6h-lcT79y3u0ALtb6Vw=s590-no";
    String urlnowycamaras11 = "https://lh3.googleusercontent.com/VlB6bJYMJ8oAzjngrA1OosBb9qLe6r0LQ9g-M_x_s8xlixqLIDCUZn-wJ2HrmtzRNyz11pKSUPDcR3vqJAmyv-3JC6XdP6Wrj3bCSijEMiUaPbqTiSgYrXVb-GZYF7B5DS7n9yxSVV2Ra_S1sGtrBadepongEiGvMFKSqbCm-mOv-leTFICngfVwix3zYT-6Zk-IPf6MG90nrIgk-h8ggBp4YDV55ZfK4ie-Ljs1HSQ_JWx7Qr-LyjK_7RA8GEhGNjqBUKOAHa9uXLONgWE5QP_ojbhzWjx092SVFNjyVZTtCI3dcaLq8Vs6M6In_sBXJMElb0FoMRJZXtIcN4VFcs88M2j9XQ7kDiSIOfeAUQW2FeiKcD6Gmdt7ZzI2iIQuMEUdQMJJMJwZzeoktIbGF4bfokMvElsdH7WiuIniY-dqKzEgMjNg9F0d75OgFiyvULfdctBV0tZ8riL-rmtrrHXMVXnn1bwZ1RGi8qXwM3lOs90tUOmldrVcEUb-PHCWv8C35Z_x5zxX4-k0F_N3azVbqpwFcz2FvHmwnoMpGqca-iYowvJLoy2sxX-1chw-VVrIk8i5f4tCUaS65hwf0x_azr4UCA5opFhS7sJjd-4E-2R2aQ=w721-h590-no";
    String urlnowycamaras12 = "https://lh3.googleusercontent.com/xIlzKwOAyj3OErhA_A9Kcr0TnHanpuqNaUvWKWh03oKNlqBMd8q-N8bdJKzc1N2YpZoBHSV_HMqt8gV0Jh2HM8SdMybU7cyAGaLpgqlBplpV8pJ5ZYmBH1ZYqIp3ZHMffRK8tKNZHtu3ZR0gadNRx1fPq3plRKq9Yl9-Vk5Vdt9QcycWYLURs90EGtrVt9IVfhk0HPeELMJ0xHn2cVezw9cz9caeuprbUHiFInKH2oEpN1emEy3UO1IGtQI-G77UOuVEaMDZlxl1an5N2jrtwv9km4wsx4Xo6QTb-8icFrmDAvKjH9sfBooweOkmOwyDykAbWqLPtMuxkOHx-PfoPtm-ScK3-JYddynlDlCPxCFUz0DQgPxONRcHiqBRXRh6UaLPvaQQsNUaMSgMx0QmJMiQKlpVEGr5FUgMz2h6N1OZUzR4a3RqA19BSxMmkE4U1FYQdbkR3yHc2YX4HgPvM2rv8z_tujSeQ6j_XTIhwPxe4b8e5nRPo-lVHsjoXfzOk-prX_3hfv_3WXOS7ePMHOinNJAqE0Se_i7YvUU7bhiI_PlpIUOqM_dxv3uvS5ReIu2k3LVHEdCJA5RbxyXUWUVtt0Y3inwjsVDdpZdidKCq58R76A=s541-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowycamaras1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowycamaras1.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnowycamaras1 = (TextView)findViewById(R.id.txtnowycamaras);
        final String stconsulta = txtnowycamaras1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowycamaras1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowycamaras1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranowycamaras1 = (Button)findViewById(R.id.btncompranowycamaras1);
        btncompranowycamaras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranowycamaras1 = new Intent(nowycamaras1.this, webview.class);
                btncompranowycamaras1.putExtra("string", urlcombo);
                startActivity(btncompranowycamaras1);
            }
        });

        nowycamaras1 = (ImageView)findViewById(R.id.nowycamaras1);
        Picasso.with(this).load(urlnowycamaras1).into(nowycamaras1);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nowycamaras1.setVisibility(View.VISIBLE);
                nowycamaras11.setVisibility(View.GONE);
                nowycamaras12.setVisibility(View.GONE);
            }
        });

        nowycamaras11 = (ImageView)findViewById(R.id.nowycamaras11);
        Picasso.with(this).load(urlnowycamaras11).into(nowycamaras11);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nowycamaras11.setVisibility(View.VISIBLE);
                nowycamaras1.setVisibility(View.INVISIBLE);
                nowycamaras12.setVisibility(View.GONE);
            }
        });

        nowycamaras12 = (ImageView)findViewById(R.id.nowycamaras12);
        Picasso.with(this).load(urlnowycamaras12).into(nowycamaras12);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nowycamaras12.setVisibility(View.VISIBLE);
                nowycamaras1.setVisibility(View.INVISIBLE);
                nowycamaras11.setVisibility(View.GONE);
            }
        });

    }
}
