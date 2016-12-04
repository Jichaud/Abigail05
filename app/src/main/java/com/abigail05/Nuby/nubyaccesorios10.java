package com.abigail05.Nuby;

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

public class nubyaccesorios10 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyaccesorios10;
    Button btnconsulta;
    TextView txtnubyaccesorios10;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=49f1f7827da103b66eef200c3ebf9857";
    ImageView nubyaccesorios10;
    String urlnubyaccesorios10 = "https://lh3.googleusercontent.com/z54V1MTY1uQUIBU9Njql066gDJZD9AcN4NSnNR1PMSKnIAZ75xU_V-UY8lq9w4I8sW6y-AitjQkyptVNlipA5nBcmCMOW8i0a_JuOIHoa1TFRK52p0fDcqwtmRxpTXp0WR0cJ8zHzBwsP3B6g3PAq0TbS9wx33yUZVe9ozoplyDe_vEtz0OOAlIXS-QImgCFE4Dx-B8EuBQ7MS_vhKIPGklibiwkXdlVOq4fAqmUZbwmTWGUlODepJSbP3-iEd0EXCC1M8qJFq-xMMZuWjc8CvYDi0ieQCbGoeRc9S9aUcxnMUj3rDhrwKCSWh6jt-eQnKxqIh9DuGRTTK8pB8IjCmPqBCL3yboQeJsblBHk8_dyia-ZhRHhVLFF914Y_Zkog81v-1xwzNpTHmEl-RpH9LnhYJSwRD82Un6fmlCa8Sio93NvLq_zM2FK-HM9XkxW8AIl_siW2eC_qDGU-qY7pO6HUUQGKjrZ7SKohqgRy-dCx_Qj4UvvhrfOGF0QfwN0uIpGSZtmaIRpJ6E2otN-Soxe8Mblh31A1Meti0Kef59Nv6o191j5Xjzw9_8x3WqAo1Mi9rdrISi0PsiKTYoIqprWxzL_C14adjCahokh5KXQPleZkQ=w544-h676-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyaccesorios10);

        nubyaccesorios10 = (ImageView)findViewById(R.id.nubyaccesorios10);
        Picasso.with(this).load(urlnubyaccesorios10).into(nubyaccesorios10);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyaccesorios10.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyaccesorios10.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyaccesorios10 = (TextView)findViewById(R.id.txtnubyaccesorios10);
        final String stconsulta = txtnubyaccesorios10.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyaccesorios10.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyaccesorios10 = (Button)findViewById(R.id.btncompranubyaccesorios10);
        btncompranubyaccesorios10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyaccesorios10 = new Intent(nubyaccesorios10.this,webview.class);
                btncompranubyaccesorios10.putExtra("string", urlcombo);
                startActivity(btncompranubyaccesorios10);
            }
        });

    }
}
