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

public class nukchupetes1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukchupetes1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f9b26ef70d86f2175addebb297ff8e19";
    ImageView nukchupetes1;
    ImageView nukchupetes11;
    ImageView nukchupetes2;
    ImageView nukchupetes22;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtnukchupetes1;
    String urlnukchupete1 = "https://lh3.googleusercontent.com/tKF3N6OSVIP9QIVZwswRNEg6LIi6uDhUF1961JrbU9mEnWApgnnQuOZAXiVn7VODxxET0B7wQROp6C9dLqboXiFk23Y8ZM4Lp1z8nyHDEWA0J0to47744u1hocw_oJ2Z26Gca8ylz78iPMje_uAc0apD9FpU0cflVnScPaaUQ1OwQeoZcDy8uJ3A750sZAuWhFOgINUO00nETJS0M9DTMHoFXR2TuulHo1iD8bHikBNjWJytUWsgB9_nicoPdPU-GPGXIjyZ5mzKr0zBI8OGOf4BZSDkzBOPtkQfTKOeKHWfZa3jiRuxXFnLP-JWN_nbqfX-7GUNFQMfU5j3LhV8G6QgdLc-tK_HsWfcuBURrSjzMjBsg8GGQqLZ6NzB7qLsBlCMF4k-lPb6hRA50q49YJS8EP5pP3QOgbpeJlCggYVDLprSasYsVL4lb_qZ1RQtjw8fLhP3zB3srcuj0PmHVb8QqGbt03Wr3xNI4mPR3wO5zfwy6SMnLndWU-1MyQS5_4kxihPuZXouAG_ck2NpBaUWRLOvEx01wVk84qOnhtPZM8T48JS_lv6QTQMbH3r0F4o3V7Dsn8fl81IhSNCsLgXj-x3DjTlXnNlOD4xhTLD0jnTPTw=w346-h340-no";
    String urlnukchupete11 = "https://lh3.googleusercontent.com/A119ay8OGMAxIUgcTA4RcMrGc7MOJVxjwHBCUg9IygeYk11FebhEcPH_1f28y5ZPIg5Lo-HcooQ5IVCRXuAs7-Ey0Rw-r45QLec-OekS4GHi6X_adI9ccw1MnSq1zvWAXSdo2x9taaSEW9XvB5PSVXlTb6OBsPcisqQ-VofIeoYXCh3ZqAozu2xLimZQGohFeElHoGYG-iDwurJb7bmxAM-plvf6tzTX1B38IpNN3aFkaehekMlfhdjCHMlcCJyY_XvCid5EIg0kigGV7HnT0ozh93n5y7byaFSLyAYdUuexDpyum9Ttcc16Ps-rjJ4MK9n7uY2eaNZmzNBJHYxaj3hvLYIJoNyBNiye-tnCSI1SRrQQpHGoSzT4Ho16sEWSn7AgUQnq6uBK9UT7SgP0iHMZLZijxWND1zLp3ewu7Km87PdSkHnBv-ikmiRRXWM9XqpHj66cVyIbDe-NKyCVOJO5xXnZAVD5N6SalhE413v2puhvLPHb_ETUnTWDf8MsrexRO_xiicJnlbmesW8UisZEh30dtiXBUr4PKVqv7IixJoSLtfilzwdK3Msy3HR4R1F30K39-GAEAqk8B5OXDkCNlWGBlYkm-f6vHYzB2oxr0h7mwA=w360-h340-no";
    String urlnukchupete2 = "https://lh3.googleusercontent.com/koKo7CKTj4sIl7GYPRBB9NmVCJmutSFOaJRXT8fSM40XQgMrA-jM2laMo1AnV0WEbSlKWfbGxKuO1M9RHt0rvFPKsLaVPi3dvTDwFwNF9iIKOqmuAaxUEY3qaPn9VFrLzalqc--lhnHx8wS6NhLjuYbQPxMl0ZxOAe9Pu2jLM8dqVNX0HHQXlypYI4dfX05DeLBt7zdh9297sRWclQEoNT5oAjl6Ij0VFVpL0bZzg1XYSzAYwAlik5792Y_f-_kKD_IBwnUVx3qeLLg8Us_WgXD1Qh5Pn-PywyproPGWghidHhGajzDvgyBdUn2Es0kRu6VuJi-Doguvt5g06O6D70qXTL7jlqAbPX9ZpWlkJIHUrgS5pbeG0KPwrFrDECy_BvjxxXVnjX4IINSDHr364xkKVFpJ7sI7oh2qvFkC8XlEDW9tZeODw0lJstErDmtAMNGHKJnRtHMuarzjgn4hMCYKjFPwSi4Zj00BspJyTg2wcBu6QEOg_TLzU7pp_PZuGc-ytw36U-g5JuimzwAXVTXsNkzPHHmktk-hb5YQkWkOYbxY9jqLiSLPofjLpnoBnfjWayVkO1z4Keg2DPtz3X7LjX-faNZrHg5VcuQ_fyR0sYa_2Q=w356-h340-no";
    String urlnukchupete22 = "https://lh3.googleusercontent.com/LgDj0jb61bSnUALXCqz1cm9wIofAFfj4gpodUCIKjyPL6xEyJgd_bvQDht0N5hOO5evJZOLye5VbeEaSENrJ_Q9fCo_ml6rNPnFuH5Vzjh0fl13wPTB5LEBy4UXax-xpkH8m0p-spQu4boAWXMcMas4C_DnrlncgrqOK1n7ev_-j4H5uFGH-bqKOBYZXmjcUXEAJjdrbBdoqoDbuGd52SwiLyFL1iQnJ_pwIz8fWAfEzq5xo7NWxVMuv-1Eb_A86YvXRh4dM_KSgY_rqGtkUocAK5pFwYhnYbD8zHsg-OBZpqi3fzPlR3EqzzjUJpC4dvcavXzyVA1P5gWtDKSFld-NNSXpVrSxdTZX4_eyc8vClsuxuRk9-6I8gycya2GG1wu7YOKDS18tuUPorZ_wjzkeA2etqolPk3vMZoB9kYWLftjomdrglCRmKhcBC8JSHaculAHA10kjDvMtiDOVupcZtsi6nlXwpnvQDGri9Pmaqqd4RmETR66O0n5GWtR3Xi2_MNqzGNzwRQOYdbCnSU2NBT1fDyENEIQX6SwPl4Zgnqsr5IjkgXff0VI2ZW8bC1iKAHFxJDPv2Bz3FvK5bndyObmhU9uCHGdSqV9JiMFjvMYUj2g=w352-h340-no";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukchupetes1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukchupetes1.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukchupetes1 = (TextView)findViewById(R.id.txtnukchupetes1);
        final String stconsulta = txtnukchupetes1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukchupetes1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukchupetes1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukchupetes1 = (Button)findViewById(R.id.btncompranukchupetes1);
        btncompranukchupetes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukchupetes1 = new Intent(nukchupetes1.this, webview.class);
                btncompranukchupetes1.putExtra("string", urlcombo);
                startActivity(btncompranukchupetes1);
            }
        });

        nukchupetes1 = (ImageView)findViewById(R.id.nukchupetes1);
        Picasso.with(this).load(urlnukchupete1).into(nukchupetes1);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes1.setVisibility(View.VISIBLE);
                nukchupetes11.setVisibility(View.GONE);
                nukchupetes2.setVisibility(View.GONE);
                nukchupetes22.setVisibility(View.GONE);
            }
        });

        nukchupetes11 = (ImageView)findViewById(R.id.nukchupetes11);
        Picasso.with(this).load(urlnukchupete11).into(nukchupetes11);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes11.setVisibility(View.VISIBLE);
                nukchupetes1.setVisibility(View.INVISIBLE);
                nukchupetes2.setVisibility(View.GONE);
                nukchupetes22.setVisibility(View.GONE);
            }
        });

        nukchupetes2 = (ImageView)findViewById(R.id.nukchupetes2);
        Picasso.with(this).load(urlnukchupete2).into(nukchupetes2);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes11.setVisibility(View.GONE);
                nukchupetes1.setVisibility(View.INVISIBLE);
                nukchupetes2.setVisibility(View.VISIBLE);
                nukchupetes22.setVisibility(View.GONE);
            }
        });

        nukchupetes22 = (ImageView)findViewById(R.id.nukchupetes22);
        Picasso.with(this).load(urlnukchupete22).into(nukchupetes22);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes11.setVisibility(View.GONE);
                nukchupetes1.setVisibility(View.INVISIBLE);
                nukchupetes2.setVisibility(View.GONE);
                nukchupetes22.setVisibility(View.VISIBLE);
            }
        });

    }
}
