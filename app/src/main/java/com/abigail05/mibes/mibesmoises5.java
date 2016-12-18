package com.abigail05.mibes;

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

public class mibesmoises5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesmoises5;
    Button btnconsulta;
    TextView txtmibesmoises5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=015b32a9c1887bcfcd99e1c8ad4bbb10";
    ImageView mibesmoises5;
    String urlmibesmoises5 = "https://lh3.googleusercontent.com/UuV8lkXIHQ3ZKwKBfnZGmsZ58C8cP4JoS27Z4YB4ppJwSs36IeRL1xBHVYLWTSM-0eDS4fwBGrNuAok2sMSzMUKrfvgD3rJphphJnJDIUvp86WA95eOxZ7BbQcS8YDQvDcyRce8u5vLjsZe9VJtlNTAaKQ78CIVO_j8n-cv7TjvdXB3i62jjJY3VHBbT3_pjZuw8TTi2qZfF9Bi86pQJTQivtgGBpvrATfrjxUC4iShL-I_R3VQe1kfn3oMB0dwGH_FIaQZlBDrsx3DbogncXhdHV4PbF_faYaiX3V6xPHRPrkNRRzeFGm4Xu4GfoFj_8yHkDWoRyR2YklsVdWPOmKsZbUaK3OVLm7EembRv_ckuYbhvy7NhPndILnia8C2mvZZ1pD4qq08xOCAqnxTZhBW3WZ5rYTttkllZRjPjKgUJSLOTo1ZSkwNqpSCxo6cMiV7Hyk2g4pLTShN_drS28ZHYG-n3bJZXSTlR_xVeeYVrAPoVWCj5Nlkr2LtOAcRAT0RMnoPo0lNudFV_9KgAvzQDQImvsiI55t9dnRZMLLhmMagNAUtlhChzNnCFlrJUr09I-UURiHPI1NQBh8zo4TLU850iciYEC4Oi39d1njM45M6uwsZXtJT5Yi7cNAIbXkFCBQHOSMWyJhkDzfIgbQfbazGVoNkjLJ2isDgprBQ=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesmoises5);

        mibesmoises5 = (ImageView)findViewById(R.id.mibesmoises5);
        Picasso.with(this).load(urlmibesmoises5).into(mibesmoises5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesmoises5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesmoises5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesmoises5 = (TextView)findViewById(R.id.txtmibesmoises5);
        final String stconsulta = txtmibesmoises5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesmoises5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesmoises5 = (Button)findViewById(R.id.btncompramibesmoises5);
        btncompramibesmoises5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesmoises5 = new Intent(mibesmoises5.this,webview.class);
                btncompramibesmoises5.putExtra("string", urlcombo);
                startActivity(btncompramibesmoises5);
            }
        });

    }
}
