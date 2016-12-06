package com.abigail05.Gamise;

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

public class gamisebodyml2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamisebodyml2;
    Button btnconsulta;
    TextView txtgamisebodyml2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=955c8bd0e3d2bd0084ef7f13af328558";
    ImageView gamisebodyml2;
    String urlgamisebodyml2 = "https://lh3.googleusercontent.com/FgeX8AVrkNjCo63-guInoPnqpcTBRI6iLU90g89FN0Yx-Ufe4KE837BBwHcK8QbvLLfyrQ-q8sL5b6RAlJZxcgps5AF5et0VGgGwp1OD9w_iJzpWfDjVeyJhP5Iu_G4y1xRKEDkryoLIvwtzCppLBj3LHniNemCEw4cn-OG6cmyCrTE88bvtC8jfPCULc0cAqTWm5XTrWlYTuc8h_4Zqf0ImBQ_hpyo3PnX417bo-r2bvnCpnTQRD8xmCmH8p4qwgrrErSGLF181OViyprNLoIYHN9MFRWilKBnTTxgL2oOymffX6PZLyG7ASOkvI3Pkz_Ji93IpV_9E4VoVj_bvsGs76OH1aTvDO6VoBXtyWk6Argmtuwa1OBz4-t5S2thpXsQ1NYEZZKsJiCuHlGvpTM1rF41mj0y3oRO3Pn8Mqxe1JM0gE0nxWoSdXM8Z9AhMyXNKbFtodc9AhcPYozyixfUIynCqxQiY5fZYtnVI7AGXWQX9dHWZlmetDDcDXDYoV6x46eVQOPWL-_AC3INjwqtF4y11jYOq7jkkVM4VLMl_f8MxMH2DzLYD_8peASLNi83Os8aK91ZTQjLWqMaXzrzGq0imkaN4QXj5eg5VbrGQuHFqc6pHGev0Pz3JQHyRnhD403qmaqbLcm0mhtpD0FHvUDt2qWIdPjKj-4v_4-A=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodyml2);

        gamisebodyml2 = (ImageView)findViewById(R.id.gamisebodyml2);
        Picasso.with(this).load(urlgamisebodyml2).into(gamisebodyml2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodyml2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodyml2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamisebodyml2 = (TextView)findViewById(R.id.txtgamisebodyml2);
        final String stconsulta = txtgamisebodyml2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamisebodyml2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamisebodyml2 = (Button)findViewById(R.id.btncompragamisebodyml2);
        btncompragamisebodyml2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamisebodyml2 = new Intent(gamisebodyml2.this,webview.class);
                btncompragamisebodyml2.putExtra("string", urlcombo);
                startActivity(btncompragamisebodyml2);
            }
        });

    }
}
