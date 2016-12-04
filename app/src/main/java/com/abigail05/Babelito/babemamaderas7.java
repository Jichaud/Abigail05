package com.abigail05.Babelito;

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

public class babemamaderas7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababemamaderas7;
    Button btnconsulta;
    TextView txtbabemamaderas7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=86cd03c05405dc2e51bb5fa66fa53b5e";
    ImageView babemamaderas7;
    String urlbabemamaderas7 = "https://lh3.googleusercontent.com/yLJ49oekWRm59s5owdLtlyVVTFYbwJ_ADbjq89kD5srZHKwKTg77zw0puMPbJj73VUk2bN4w0B17RIkFeFu0OkyfohhGukRBsn0FDLgOn17k_6DNBbMl6ZJ6-XZsFT8zWPWKLkgyCb-r72qle06ytrw7vblgSLBPj1hS1FACeLecG76aXS9B9GlSu87C-RN-cwUze4XVPhPXi7W8zxQ24V7Xa8xa9INFnwLcLh52ZU4jei-4G2uurcfHbqaPD86DNckAYWw5ezfZiQDglvjgr3Q9mVW9OGWqwWjq3uSGaB9tcrWRVQJM7Q9bOU2m2taFF_0ZklBvlnjzpt-fyKN7W6KSjMqMk8rYXOdEOlcuYvQw6t1WQKpLXoS1-nQFsTAsMWIjXBSx06__t3seNBFAufdM_3HRC0STeSghN0OSYdtoL8BdHaBA1tdMDDQGvz7hC1sS2bAyvzhhiP3lrIe21_PaHnNtWPEXZjnnDjOyc0Z95fIKnar4BW5nJXVrMFeTGWFOi8QkYggB7DHHoEw0zFpUmqYn0S57_5PctFBx72jE0YqhTzzQwBibSd7HGvNHJchkfVmYjEyCDnuQQh07nuJNSPQsIw9byK7QXz-11hJ3MuoFQQ=w371-h368-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babemamaderas7);

        babemamaderas7 = (ImageView)findViewById(R.id.babemamaderas7);
        Picasso.with(this).load(urlbabemamaderas7).into(babemamaderas7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babemamaderas7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babemamaderas7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabemamaderas7 = (TextView)findViewById(R.id.txtbabemamaderas7);
        final String stconsulta = txtbabemamaderas7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babemamaderas7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababemamaderas7 = (Button)findViewById(R.id.btncomprababemamaderas7);
        btncomprababemamaderas7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas7 = new Intent(babemamaderas7.this,webview.class);
                btncomprababemamaderas7.putExtra("string", urlcombo);
                startActivity(btncomprababemamaderas7);
            }
        });

    }
}
