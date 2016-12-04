package com.abigail05.BabyInnovation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class babyinvarios5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios5;
    Button btnconsulta;
    TextView txtbabyinvarios5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=909f5f4179bdcb3a56e5a436ea3607f5";
    ImageView babyinvarios5;
    String urlbabyinvarios5 = "https://lh3.googleusercontent.com/hEXUYG_3elL8pp2M9pMO2OhdlRyRiu_e2Awp3NtwW_swYJQEDzI8fLCYJSUdTdbRYtME_1Z37w_8HoMkD9fNW9ymdZIp8sR4kAVKhcEgo2GCGPxMpD8fa8-v_ZUpbsXqgQIQ7QVo7Sl_dR7bNB1ljYnH5Y4mu-skTlunHJFmvYulGWa5CzB52HmIkcR8YCnEE68b6SCPDpkTJ-u8amvkPSEDjFLg5MBTQ6S_NhhY6woJ1sB_Kh78OmMdq57wklouFi3O_mO0h29Y2E6kCiXsOXzz1Quvd7X4GUO_FZLhcaqb5r_8SxJ48IuxEZOOaDlXxbiKp64VeWJTxzTNAy0b8Wfxx0ej4ulUaj42Q-qofEl0Hm1PDUt9FLfk6YAM_ecAhpJSCsiUq74mxes_XSh2MG11BwjoiWfTTJx78u_F9FQM7n_l5NhQCFojjK28rX1JQQ_iVAB1NiQ1WV0p0skwEDRBj4ifXWTyAK4nNqAUfh0oWkhTvtMqjRcUOmXz_LRKjmYb1Z3gm2QC7TXeaNhEkc8ajSAW4AHs6uTZiDO6zF3T4qQ257z4R1bwKGexe9XSMzShyAPF6qC4bdEXtex-ODo4jp3hnVe4X8_VE_UoEUFSk9mUWg=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios5);

        babyinvarios5 = (ImageView)findViewById(R.id.babyinvarios5);
        Picasso.with(this).load(urlbabyinvarios5).into(babyinvarios5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios5 = (TextView)findViewById(R.id.txtbabyinvarios5);
        final String stconsulta = txtbabyinvarios5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios5 = (Button)findViewById(R.id.btncomprababyinvarios5);
        btncomprababyinvarios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios5 = new Intent(babyinvarios5.this,webview.class);
                btncomprababyinvarios5.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios5);
            }
        });

    }
}
