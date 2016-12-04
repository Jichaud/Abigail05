package com.abigail05.BabyInnovation;

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

public class babyinvarios2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios2;
    Button btnconsulta;
    TextView txtbabyinvarios2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6712232c5add22599885e180274875a3";
    ImageView babyinvarios2;
    String urlbabyinvarios2 = "https://lh3.googleusercontent.com/BYFSr-zi7_FIBo8AhABK_opTbtrb6zTANFGWjy7cxICCAmMZXcEET4Rzw7noPPPymxt76gNrVSAkvnMsYwSsxx5CGLTSPnsoP_Yi4jqDzpbEu1NDehPDg5PrdPAZ-MRtFda2vc6rZBEBWCZ1U3rmuFGxKzxf-BW9VkELIT7RAAnvVLz2Ys2USVT5qOSlI1jx5uMc1R7Vp5JsRVdPIHnPXq0hz9towolNH_Z2R3zGJc6XGS8mFwS86y9MzmCYRSOPzfo2WrLWm3FXk0_ZtAxSJl7e0eEt2-rqkCHc6inMcAuQioAL_VWg7OFpbyx69q5kEuCzPLXawTPbxmzMMR4UDj1BScwrvEGRoUiptKrHPkTNVcehPd4Bcb5J0CXDTGDOaTB-v6X599rsbUlF3ItwrEq9KdJM6_vR8inzHcIqy-DLw-M3w60cA0KFQ_S7AaQPcIvAtG5GFbgPrOPjYHbxe7psItA8HyECo3e25-8ayoTTfKiiXyBb3p4buz0CKwdkCsEvpcTQXavtnBcXdB840HdJajNlW7i5iSRuGvgtLu-w3DOPCsjytNLRi1pl43PjghrG52hWRQ0h0guWiNeBLy5c8UPjNuhBKnv1Mz86ukXG3TelKw=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios2);

        babyinvarios2 = (ImageView)findViewById(R.id.babyinvarios2);
        Picasso.with(this).load(urlbabyinvarios2).into(babyinvarios2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios2 = (TextView)findViewById(R.id.txtbabyinvarios2);
        final String stconsulta = txtbabyinvarios2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios2 = (Button)findViewById(R.id.btncomprababyinvarios2);
        btncomprababyinvarios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios2 = new Intent(babyinvarios2.this,webview.class);
                btncomprababyinvarios2.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios2);
            }
        });

    }
}
