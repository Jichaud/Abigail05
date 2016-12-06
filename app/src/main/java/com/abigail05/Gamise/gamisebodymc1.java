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

public class gamisebodymc1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamisebodymc1;
    Button btnconsulta;
    TextView txtgamisebodymc1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
    ImageView gamisebodymc1;
    String urlgamisebodymc1 = "https://lh3.googleusercontent.com/0og556OJpj5YYTOXEaNyUwXGkhNB_15k5hiYxNRgsoQd-8tOV9ojQ0uHg9B4edcICvNhVYkyDagR5pAj6q1IsX18nU8TDvH7ouv9lo3162WCnszhTkqYnScsdIbyLvwng7hfA0eQ_U8QfAC50wKgbRqtvmH1XRAFyQqsPWi5GmhmQ0Lo8OtZyIk2yaUP1F4RYYqK8V2_KFv6GWHRs9nQhFagWPT5d9BMcD9lZKhtxlXwqrH_ogj9nrxhcR21oG04lFmuLDR6YREfYRtUKURqqJCcENAckLfgn8OMKh9bFolDn7mYxiL-aSqcFYirnYsUZYxgMiVtee-o5HTUMIjqGJYez_VkMa80SN0gKAwgVaMuDgug0QLIVUKLNojEqtN7LcWE9FkC2tpH4P7QA2-HZROHHe3OIBDaPBjo4xcV1M6Gs7RuIi6HbfwP2gbEYBKW05FFgai9ooxTbr2mgguYOzFahV2BU2QmT-MkQyo0BnXhU2iQBWJupyObsVCRorkFqu7WtTsJO0O3efPdQEw-OsrO1saTKKfwbbQTpICqMeWIN6y7JXKwj8a5kA0scIf85LDewjxY0VsLsY8nfOCR1m23UYuKGTAXPEhM4t9EDp5TWcOgO9q7L54SU0KV4MCd-KbVm1n_Cs3CzbI-0JrUr-21jXr43seuzoW7BF4XWCE=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodymc1);

        gamisebodymc1 = (ImageView)findViewById(R.id.gamisebodymc1);
        Picasso.with(this).load(urlgamisebodymc1).into(gamisebodymc1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodymc1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodymc1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamisebodymc1 = (TextView)findViewById(R.id.txtgamisebodymc1);
        final String stconsulta = txtgamisebodymc1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamisebodymc1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamisebodymc1 = (Button)findViewById(R.id.btncompragamisebodymc1);
        btncompragamisebodymc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamisebodymc1 = new Intent(gamisebodymc1.this,webview.class);
                btncompragamisebodymc1.putExtra("string", urlcombo);
                startActivity(btncompragamisebodymc1);
            }
        });

    }
}
