package com.abigail05.Chicco;

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

public class chiccoduotrio5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccoduotrio5;
    Button btnconsulta;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView chiccoduotrio5txtdesc;
    ImageView imgmodelo1;
    ImageView imgmodelo2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e8e81fea5c048c70273d2af6b24b6437";
    String urlchiccoduotrio2img = "https://lh3.googleusercontent.com/B9gC3XyeDp2w-KYxa4-Qs85d7yOqul2mof8AooY-QTIfTRdk8vtxw1OVj8ujFFvdYEi4du6AQLtrEiETYwUmHtNKGEO_3VbiQ2MiyeNw7BS9riDNpXZi3z_Dzt0-bQwmohU91GuskHfDjotaLrpmam9_vyvwiVnQsWQqzjj7XBM45_CMrf6YENSGsjiolksodx0j7FbOzMnAgmn1ioB1txYWS3jsh9WPQ3JZCIY8uPdrkY0hPUpLGlyXZZ0cgnI0O7EDEfeVjiXky7csdyv89PrYduNvmRr_8foBlNnppRWiTcvhzQufE_vbb8zwPqtzHzMyKK4a4d2OnrZDg5soQFNf9wawP0-hivUpW83Ej6f2W-EM0RtFbY7S49XatHyFhHibAOXBJHQKtthGko6iLrKMWh59kcte6hWQgZbqZk_-4QWncjMrhbccd_PBDD3v0hjIHmVrjbP30qXelJaA-EbD_zMurmD5FlEIYDF5UrTS-1nLIrOpEkQk94EEvgRuGTt54OC94Q4oTB8lks0-YCB8kYD5_rm4KKyUWuwc1epBVtsQj5dLoa0gq8xGFqRiv5GH7HUhZxu3P3XCQWYAK4O6pBMhqZyqW7wnGT-G6gYeSx3DH292AbKjXmI14Gg8o2xO6lAPPzYVeZ_YF_Y2JQwUxCWdREG4cNMVfdo7kfY=s725-no";
    String urlchiccoduotrio1img = "https://lh3.googleusercontent.com/FC0eG4jsY-N7rn8vfzxurUa26AwqI5TJ3gSX16tGNs5yi29NIP03Z_bXV5hG-vLt_zKQGFnQGk4diFkID9pWW6zHoqeJooUGb9tLjZxQ4cLtYADEB7iPmwuRY42R9olVGd61Q7qnSE0GOXy2qI3ins5NADig-8l-6GS7pwJ8tYqbkZQgU8Sh938exTDSBkVQUVUNAhvaDPqRwdiGulnj3CoyQYGSQnzvqpVlwnA2YQB1zv_GJvUztmHIgDVrKTktnXiMELyRBouaxDZVX9WIXsGldhZFq7e325yUj6xi612BvHivNOjR03b2Fk7uX8AWb1dMmrft7ftBboGpU7oUH_c9jcbdPvzRfyJS37zjnHYisGWtuB4_v9q_mqco7aXbTE1KKd0sWaM87OrQNFgb6sdajLOqW11ooTH8LSpiKMTe-HXVdCPfHzHBO7uDxzbpLVgykdNSPUfuARE1cxFBF_0jjstP2J-S5VxeUlpc0QMexT3-KGuuxdvfb28beEmxS_eAr6MAAZ7r5sas34sa_ExQadVWkd6WqTLQOgx4f7B_MrT-3hNepK1po5mezs2tG9dLgIEYHT4gIt1sozf7GPlP0UWm3FxMYMP6kU53UdYB5VvDLaxhN3hzezTb87TRKsrus-n4mbEAsq-uec-NHrDjPIobnGq5Y7Lshsftctg=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoduotrio5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoduotrio5.this,marcas.class);
                startActivity(marca);
            }
        });

        chiccoduotrio5txtdesc = (TextView)findViewById(R.id.chiccoduotrio5txtdesc);
        final String stconsulta = chiccoduotrio5txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccoduotrio5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoduotrio5.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncomprachiccoduotrio5 = (Button)findViewById(R.id.btncomprachiccoduotrio5);
        btncomprachiccoduotrio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprachiccoduotrio5 = new Intent(chiccoduotrio5.this, webview.class);
                comprachiccoduotrio5.putExtra("string", urlcombo);
                startActivity(comprachiccoduotrio5);
            }
        });

        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        imgmodelo1 = (ImageView)findViewById(R.id.chiccoduotrio1img);
        Picasso.with(this).load(urlchiccoduotrio1img).into(imgmodelo1);
        imgmodelo2 = (ImageView)findViewById(R.id.chiccoduotrio2img);
        Picasso.with(this).load(urlchiccoduotrio2img).into(imgmodelo2);

        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.VISIBLE);
                imgmodelo2.setVisibility(View.GONE);
            }
        });

        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.VISIBLE);
            }
        });

    }
}
