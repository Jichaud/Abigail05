package com.abigail05.Chicco;

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

public class chiccomamaderas13 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas13;
    Button btnconsulta;
    TextView txtchiccomamaderas13;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4c766fa4aa1cffe3fca07f848d12a0b8";
    ImageView chiccomamaderas13;
    String urlchiccomamaderas13 = "https://lh3.googleusercontent.com/p55b36Y-J8L5dtJn4rMF5J1eAfxUEFTZ8STQnsAzw115h7ooJOJZQf9rFbTOKXCMcdqnoajEwFVP7uuiWFe5At8py-ofIdgZgE1dyiCYbd7jWF_WIzqauPlC0XeKv_QslOHRpSIXQZb1JU65kAucwa_eLtBH5UnxLMDG2W7xi6ZB1bDq3Ez1xqSxsiAz1ESeRPlMNnjkTPuMpkJPgbRcdsDzgIl1SQOxfNchefO20TBf4eC29kv1LRmnANdhBAgQqI3VUljSnXnIbqJVA712YDlKBvIABwlyrpLFuZ3U-j-Sk8eE92EcEe7Z4WXMVdD8UynZz2cC85Zk7LdIzEZFy4pHqO-QdpdOS6TT3IdMYi1pTonxOurSNDeUgrnw4kOn_U6MscDywfVNyzSBoGKozAfwUQkcCYZp_IsW8AxioHBAjQw5gYRIFNBBGZOlLjfrYCPTxW5BhyiTKl7wTy10bmP0TyOqOCPyIh5hVyWD0XETrI4io70A-uwDtCu-BTmBU8WExeF9NDLkstdjlhNRQ7YWEQGMsE9kWMbuGGoqVDdVNVHVOu5Wm30t-SBAcNfA_p6v1KGSw3QxSdlTsd_2ZJ62igRFXBXrprp6Zs1g60SIoc_oRg=w428-h460-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas13);

        chiccomamaderas13 = (ImageView)findViewById(R.id.chiccomamaderas13);
        Picasso.with(this).load(urlchiccomamaderas13).into(chiccomamaderas13);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas13.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas13.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas13 = (TextView)findViewById(R.id.txtchiccomamaderas13);
        final String stconsulta = txtchiccomamaderas13.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas13.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas13 = (Button)findViewById(R.id.btncomprachiccomamaderas13);
        btncomprachiccomamaderas13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas13 = new Intent(chiccomamaderas13.this,webview.class);
                btncomprachiccomamaderas13.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas13);
            }
        });

    }
}
