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

public class mibesbaberos4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesbaberos4;
    Button btnconsulta;
    TextView txtmibesbaberos4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=bd85f9e62b945d577739453f2a101a33";
    ImageView mibesbaberos4;
    String urlmibesbaberos4 = "https://lh3.googleusercontent.com/9kyRDDtjIqA9gwDXIZGiNzrPiM7ubRMRqlhl5zZwhZluFZgMhfXc85-X6iUAVY6dPKLlWvvDmL6NsOlOoreO2lx2H4-E8tyZHQX9POYo1qxx3J47bkQjbLIlfGGSSlpsSEZAcd0x5s6bUnnPynDLe6aJNll7WZlxufDsCyBJ3m8u9419292lT5AtES-6J-AZ7EJ0ub70kOPvj9LgNFBQEO1zUyViz6ZpBsj1RpS3HqHbMfW2bbWuyGUB8IoYwgIVjS4_OhivI2bA6cuD_JeFOMHUoYpk_F7ygtZ-CxzsejUY-TjydbYkJ-tIT_LzLk1Qf27J3mP8XnvvBhlXCGcm_Gl3diYxkjapPsEBvCHQsma2KrjBPrNIHhgI00q7hhshbeu8oE5vooQNHwN6u1cgB4I-gyMTQgumpRxoNXxgqRxxCeEjObSo5x5ihcZy1Lcq8gtRdp7EkQV1xX0HOHBy9-UBVQm1jK0npK9o1cM8VUvE0gQMzvH7cS10lQo96NFD94P3WkkhEOqvhFwz_Uv2Z1szWMnSrDuwJH539NqMomehffEWKXO2VcQb7PmBJpKpeJ7D5C9Try--HgtZWwrQ01SFkRRb5jBkMG2nF6OZKmKhVDqTXnTXjykuq6MGy34Pma313-TadMsNa3xj9NuOMWCTyb0Q4drhiETYPunduIE=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesbaberos4);

        mibesbaberos4 = (ImageView)findViewById(R.id.mibesbaberos4);
        Picasso.with(this).load(urlmibesbaberos4).into(mibesbaberos4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesbaberos4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesbaberos4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesbaberos4 = (TextView)findViewById(R.id.txtmibesbaberos4);
        final String stconsulta = txtmibesbaberos4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesbaberos4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesbaberos4 = (Button)findViewById(R.id.btncompramibesbaberos4);
        btncompramibesbaberos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesbaberos4 = new Intent(mibesbaberos4.this,webview.class);
                btncompramibesbaberos4.putExtra("string", urlcombo);
                startActivity(btncompramibesbaberos4);
            }
        });

    }
}
