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

public class nukchupetes2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukchupetes2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=48e7e0e0d0d2a580461a00f22b2ed145";
    ImageView nukchupetes2;
    ImageView nukchupetes22;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtnukchupetes2;
    String urlnukchupete2 = "https://lh3.googleusercontent.com/qCDXTMR55jUYMRZ8lUsm06YIZGLKDnqTL_RDVYoLYmsXz1QhqGj_2YIkZSsiKR9PKF2A2ckIuwbWsSfkmEz2v6DppCC4ztXKpY1C7ZoBfjjiQaWt7jt4J73IAtihU_RCOyNmKCQgthkJc2H36rBHg4Kjo9akvn6RVMzzfiP05OE2iHcsLaneYsw_nOFsdG5wxXXmhi0usNjTQ6DnQl408D9y_bau-URWytLKY9aqxiR8SAKcQhJMx0wMNDRRgrPoXpBXQRj8Wu51SfRaHU5LZRwMvootwZsQn-VEuFWRJ8x1Fnz9B74mcDqCUTuknjUzsNRM6-9vid_4adQLEsdoeNjF2GkGPzOaFMrmgm5vYWUQqEGP_fVZcXyWqJ53chBYmEQq-yZ_Uk281QX84f2VI5ToGsx8QlOAKptjHr50yAbl9xAkw05xX6bYI4tb-LZYnbopZBQg_aRQtjrJoj21sAs2ErP_YyEOUVQyu78o7-8Jx8Jr0kPZhVeU14pg4yst2ncbA2zuMCrNbdNR5nvqrYuMgUdF5sfJKZZAhtxPl4oKfVydwhJ9ro4ZpB4SP_FI8ZYKAamlCkBXEyDtKyrBq7yELHo_v4htwbC3k1F2A4RyX8L69A=w409-h340-no";
    String urlnukchupete22 = "https://lh3.googleusercontent.com/zk0UJnjlSJ38jjYLfkDRnbr7zv11onGmov5q786Hl8lCQgi_g7w2vnjnwP5eW4pU59mqm5zPhGTcTZyzNtFzJ_KbvTTJ9rMH9L8vByBU45UpNVw7mSUaMlfEmGT-vzDG-3XJFTLPlafUId78O-XNOQx-7HUI4D2-shrL0zLiypjaHsBYyvUaneDmmhsYozOBXdHw8zKPRXEhkAHVdqeiD1zfC5a2YbjLSmhhdxV8Tb217ItHvlOagL_Ge1ywvrCN97YrkOXyCcrSnbk4eKcNfkijq5rD2bpI-is8jNfUtvSR_K6iFKn-MYhzLr_xbefXCt4hqOFh8Yc4tuh02Dt9b3MntoD4MJpFb7xzlHKOL7M_Khz2O3YYsAiwNFG009G_eZvr1oHhFhYcCOY8X_MW6kJWsLDgowgj647MF8QvU-x7aaib56abZwRaO8g9c8p6zPYskqo1OLZ_l_qpQ5CrYdzeCimvG92aQ3zFfz0EcC_TAl4ndJ0tSAqoh9m5eOxiNb7nliO8WsNJFmHlm5wDTEl3ZmEntu76hmDExNgQ2_dYAEW5v-yD_JtXvk-CXGO5-Ct4ZipSNN8UdzhXjAzMP1zVktWGk-Vg16cWlNYTjyVUcl6kOQ=w417-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukchupetes2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukchupetes2.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukchupetes2 = (TextView)findViewById(R.id.txtnukchupetes2);
        final String stconsulta = txtnukchupetes2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukchupetes2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukchupetes2.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukchupetes2 = (Button)findViewById(R.id.btncompranukchupetes2);
        btncompranukchupetes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukchupetes2 = new Intent(nukchupetes2.this, webview.class);
                btncompranukchupetes2.putExtra("string", urlcombo);
                startActivity(btncompranukchupetes2);
            }
        });

        nukchupetes2 = (ImageView)findViewById(R.id.nukchupetes2);
        Picasso.with(this).load(urlnukchupete2).into(nukchupetes2);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes2.setVisibility(View.VISIBLE);
                nukchupetes22.setVisibility(View.GONE);
            }
        });

        nukchupetes22 = (ImageView)findViewById(R.id.nukchupetes22);
        Picasso.with(this).load(urlnukchupete22).into(nukchupetes22);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes22.setVisibility(View.VISIBLE);
                nukchupetes2.setVisibility(View.INVISIBLE);
            }
        });

    }
}
