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

public class nukhigiene2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukhigiene2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5f36a5c06a5c87a837214459cb0bb4f4";
    ImageView nukhigiene2;
    ImageView nukhigiene21;
    ImageView nukhigiene22;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtnukhigiene2;
    String urlnukhigiene2 = "https://lh3.googleusercontent.com/BE24K6OroGkF3KlvT5tOMjEnycpSlDGzjGd9mhmNIikDUfgB_gpCyabHtmLnCQbCS_cdBYEVeP0fMhF3r2dfxSJsiOUiAWMWsuM2KdOO1FBEpKKFxGPpGM8xDxc69H_fTtE3buL9Xk2W18V3k1pHX85UNwcb9VHXoNRfGuybwhhbRsAfx-Lfe_tLApxtCUnz3FZh56k1vj8Gm21Yn67d-lxQFwpO9zlR24Pp3hEtERzFsGlL7dY1yFnAoha0qMR6kaZHHiX_4OBh6A0LNJHLeZWRn40njwn-zoybpc2FHA1LXr_zbAE4wRFV9W8TOfRTaSqNxZxyfkT0Wkc500VlllOpbx3VQ6XMgcudmkFlTNeMvx30_yRB8nHKSOU3Z6mr4NO7NeOI52iNBjBIvQOQbJ2EfNJ2WQ21A76rEDE4O5hICfMYAmfDhEWUUx0sSKCev4cZ3rFSoBjPKzPT9wNcFQBgtGZo8ZE_Rf89ZDG1S9ngQHr3kC2djGNAl-N24lzAIoYz1WkFpXBlO4X31N8rDBwR318wcDn_HmGvb68HO0x1GM9kLqpO8C2CXSVpHN_TqguR2rTLjHtyo_1CnxlKRPtCRdffbFdXSf9WhGIHjStl_Lj7Hg=w484-h365-no";
    String urlnukhigiene21 = "https://lh3.googleusercontent.com/Hkm8ZtLkJhmqtdxGAzcvIK4luylTTC9vFyJtjhlrcquHrXiU99XneAfRUVzyATGPHuP9QT2gsXIFt4GpYkM4awHDk42Ulw4dMxNmLjYbQ4p49nCe6OIvbDg0DmipfxgnPDlZSGUT2GBplPlTqNViB_ePEnov3hgslPiduEMHmiAX-QPb0lx6_QkMkrgFLs2RxWnvvTd9HFRFkwlE4tfeMmTMA1Pdizq5ERfwZ8E00eMH2mGwfN0Z8dS9Um7Y7ZhUe_iMD_Qi5h9HJmcMF-191WS-BL3rZM1uEIVE_-9C4OwRurs0Ro8nZofCbXI34OAzbnxflBuwc44HAkfh0_58Bg2D-wWCLXmZpVsViNQOVAcm51QSA1hhDdAb5V38g3zmu3Unr0hiJ61S-VGOwXckOdvrVaIsB5y6DJbOrqCEvdmPi3PxUGIVpxp9vDyoLcEOKIl2XRt76T1xpgW1q0WLMAvohuOxVmd8qDb3ktI6LuJQpplWepvjAcf4WshXDa_sDq12hAG4QHfo4MWCnt6zaUa1U83dDlwQs_RefX8oygp1bUnHGCGiH_SN5JVSyX9JW20hETY4Cq-dtro5_OnGirvcgTS3p9OQQiChntgcsL_cI5Styg=w484-h365-no";
    String urlnukhigiene22 = "https://lh3.googleusercontent.com/lir5Mg1vxyxcFS3YTijdSO_JNMhYJ4oPXlhG4wGF0Gbln9-8NqyhB3tRFdyRiKjG_tNpVJOU8HIWFyGWfwJT6JAKW85fneHSHr6sB87tUjhNZKtlXnXMLkjzkR3sJG6IYgEafaAMJ4bn4cyaqm_inJXR8EGm0NriLip5sTCyvpu-V5x5keGetJRKeTLFNuR2OOYVqb_uVKCx29sgxchpg0UbtbXdFfMj81HmAJR4XLRSVRR6naZVuG03iPz-OqSNK41jgTDlfjfw_MAHJhZQXkN6hnwvk8nYk-i1x-cqypT1w26JbnTbfoc17fiig5qsXzMLNXGb9HyCBhzLnpi1GMUPGsuqkKELrM2zkojMtZ-oA-ep-jFcsaeAxn06tyNhlUkPiXFJcaQxOFxz6rVGHWv_UwUV0Qtgm5VavdFfoeJOzHR3eAr4k4gBRYTLWf2YTqxA_YLLxBSHqmN9L8mL_-JTJ58_vyqV0sXpAkLyYFTyvPuzf44XBZwG6qcJT45VO3m0BzEoHFNP8mdDnvvexlNAgu7RenWUpMgyWCyiuuVHHgJ23NOtzBLDwyNpuKyRfgPhV9gf7wEfN0K4LF4wFKK7twXg2slNvERQ43on0CeGSAeinA=w484-h365-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukhigiene2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukhigiene2.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukhigiene2 = (TextView)findViewById(R.id.txtnukhigiene2);
        final String stconsulta = txtnukhigiene2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukhigiene2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukhigiene2.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukhigiene2 = (Button)findViewById(R.id.btncompranukhigiene2);
        btncompranukhigiene2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukhigiene2 = new Intent(nukhigiene2.this, webview.class);
                btncompranukhigiene2.putExtra("string", urlcombo);
                startActivity(btncompranukhigiene2);
            }
        });

        nukhigiene2 = (ImageView)findViewById(R.id.nukhigiene2);
        Picasso.with(this).load(urlnukhigiene2).into(nukhigiene2);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukhigiene2.setVisibility(View.VISIBLE);
                nukhigiene21.setVisibility(View.GONE);
                nukhigiene22.setVisibility(View.GONE);
            }
        });

        nukhigiene21 = (ImageView)findViewById(R.id.nukhigiene21);
        Picasso.with(this).load(urlnukhigiene21).into(nukhigiene21);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukhigiene21.setVisibility(View.VISIBLE);
                nukhigiene2.setVisibility(View.INVISIBLE);
                nukhigiene22.setVisibility(View.GONE);
            }
        });

        nukhigiene22 = (ImageView)findViewById(R.id.nukhigiene22);
        Picasso.with(this).load(urlnukhigiene22).into(nukhigiene22);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukhigiene22.setVisibility(View.VISIBLE);
                nukhigiene2.setVisibility(View.INVISIBLE);
                nukhigiene21.setVisibility(View.GONE);
            }
        });

    }
}
