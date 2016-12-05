package com.abigail05.Arwin;

import android.content.Intent;
import android.os.AsyncTask;
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

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class arwinzapa1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompraarwinzapa1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5776ee37234e1d62289ddc960e17749b";
    ImageView arwinzapa1;
    ImageView arwinzapa2;
    ImageView arwinzapa3;
    ImageView arwinzapa4;
    ImageView arwinzapa5;
    ImageView arwinzapa6;
    ImageView arwinzapa7;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtmodelo5;
    TextView txtmodelo6;
    TextView txtmodelo7;
    TextView txtarwinzapa1;
    TextView precioarwinzapa1;
    String urlarwinzapa1 = "https://lh3.googleusercontent.com/wtNrcMyCfhXibVPMquArZQ7deAY86dpH3W0lIt6jUBF_D_RCqZK1CoW-g1xB1xXUZcuMmsE1C8iTltHGEBJWCz9klj92FuScdNNPKaAbDQJrQpKfow2vS_qC9f-R3WcpH09-O6DaflFE7FPeXcbkmCDF6l6fmjWuhcl1aYT9tbHtZq0gn9O-jG95YADlXR9z10G00fOEEaPYbjN7CIn0CPJVPSNRyP91wqDHzWuXjmlb1F1CvtHhAllqdhzclRfsTbqDcqAgjxXAJGg6QyA_bVkZhvPf24ntQ0fda3hvRFf-n0WFe58X7VMBZrUMyXjHauTdn7kix6uMeE8bmXjhNoIW0tekXRE9geBUkIpppbFZEQ9uN_QCLFOpjgfZpFveeBMZaBKa-h3tVKDo6d_DYSMas9Hk-24QP26lAwvG3uc-2JziZazkmSG2CifPkgxMLfvM3UVkWiWTOXH6jbhKescqDx959BCeiqQ_amNTc-BYs2bEYzlPFQEwtYB-FXuz8kLbDylqMqqe2PMDbaQVr-ckvej51SWEj7rnIFs0YD8ZOJMYnfOjHOtmovTMo1V3ndTVxFhvW-D9AfR45a_RbVSDH7p9anBIe8kBTaq07DDD3mDrig=s300-no";
    String urlarwinzapa2 = "https://lh3.googleusercontent.com/KmQZjK_wkyY1gtOyzpqcVJh0NYWY41htEFZAKtqkCTj_9w7JkcLlB1u5gT26nbLZWJ7P_o5GzcXhJO7u_4sHIXcJ_0keR318lkAOcJTwJ15MMRlZDAK83rdc-LyHOfq2-xf2YlJOwu4tbK8IVwYBYSONgKFiKrmMkFnC-sYTul8_PDFlZi2KkNUxjqSsVMkiD7o6uuVXnbL1uHyKSFmMJhqxVzTHMWeOIfsT0Vle6MLub3FHLeEPAx2D3IdwlSuVdWfJ7BruVilCmf9jy9BILZBSwkiWcqYxTKpdY6zNoEWD3LvQev15J_-ATk3XkUUlN06jHbrYJpPkNXyiQYUkveLdvW12Avix1Zf2qy8Je24jiwkuNxZMSI1hH5-eg_0S63n-WxqrJqWGButck21KAJ0IpCRCdOQIiJm5PE0tSZ33I2LQoBsC8ZQqSuT-iIeOTmOU6YmGpDTYUDaBjqZ6qkQlRmHe-GlNI7mfP7VO_6Dua-0o_SQpRf7_M8V8oVY20zMRttuaITO8KfeQDtYYB-1ZwfivJAzEH2-R1UXgEFSaWnGDRlgIxclJQaeDg6jO5slb6hONbINrDzSFQLsaIY-T9ehkw95dHKgHNKcXYu9HEIyUoA=s300-no";
    String urlarwinzapa3 = "https://lh3.googleusercontent.com/bXpx_YaHLBDZLi4K70op7JNNbbJqKc0KvE2GuzreRl2G9NWT-WnMrGYHQcyhZXiGMz4yZHw5FtC4rQXoVi1qP8S7aTG1pqA8YzkrbnEa0LcbVCVVLghh8CtXEoG5uIBSjNBN1UWxcGbs21agBrXq6WTQHT_segR5faP3kMPOwemnVJkLzwaQIPhKKgan8-HVRrqEE8znt_Ssy42aB_wY5hOLxUmnxGrPImobbKcZKUYh7vQ_axPMHg2J2YJbX9d71jPs01OLzLrkoaUBZOPAlmPyybKOTPGFD3oonBszOY1pNURWVk73HX8B0TH5bQBVsaY-WSj3VqdQV3IkfwIsJp8OLOVl5cgEw3wJ52rAz5wNeM5fIUbLIYZ7hOynuIDq5jN4p6Lde7cz4GwJtmSfimsZjB1PiHdLzK5e1hLodvwCudQgDTR4VHbgPLjYAJfwnyNc3WBoBTwZsoFirxCxz7ame13vrArbbs_MYxpB5YldZQ7SHfiPhJdbu3ChQyzEjTWTPNKBfmfrhpJeEB7cphp8Tk3GNI-2X7eQjH0i6mdJmT3wU_H_nDA-UGZ4wFXPYGT55MaCZvSgKVY0d2baIUc1CpZrnRiasCoYuqibj0cgOvTSdQ=s300-no";
    String urlarwinzapa4 = "https://lh3.googleusercontent.com/L01VvRS1HFK7ddABn6Ved8rxkA2UXL5tm5E2GGLzoUyrrwzQAJkdctHmlMezHsfgMoDHKaE3xFpHl6yCMN5JJr-DcYYPVbI7Plf6g_pi5_xbHFc21PA-YBDrs_yBmVyLdD-8TQsC2m4cAbu5bTlZjERLZoVHnJigSck9giBhhKdLa6LfldO4ghsjoXCp3zh_Zkk_Osn7wn5VcbcIQyTC5ltOEIUnUBJ5RE4n7oRUA1nRODrEq6d9oUnn6r-0xDeCpaWYof_NeMUT0a7NzXiFz4QD9IxIV832aY74iNY6DvddtmbVLQnVhGoeWUFjj-Edq6pkMaWA1KfKI9sQpxOvNvmFNoqTAOjJdnva43KI1NCRxLcSrYbOURcBiymF-2Qc-s8bWeyanMUnh5j37tb9wjBPlt7hexK4phjDqhKWpl-EjO8HLmG84kB5FCPaMundL6VpG0HBUNf_TWhk-w9hSHTy5266wMlQY8waE-tKvgQCwYra-XoiDis08D9Ms2MquK11AjIfgrkINl7dfx03n_Y5zYx1iHNL_i8zmRd33rLFLzwXjymFUy-FNWJC_W5FtZIxCOQsUIYVAkgQvND3aFjlmvY5-b7vF3IlUDgYZs7foQSsHw=s300-no";
    String urlarwinzapa5 = "https://lh3.googleusercontent.com/PNvzZypB5H_i6Htgk7WVhtBFdPAzJbWSYNPqx4fC-fcv4k8USqqTDE54h3xw9xA_baU50XsaDp9HRPL7QeNPhfuAePTslmsBC6Nd6Rf9WDbaZUqmsnaLl4zyYiUusNHpDrbZYF7cdhFylOKWYlwJ8V4-2xcsTQxKIZaUsdKAJEPIOsz7lPEr1HxNU2_TwSnLNBxBI8tbsPrmfscyyDJUNe0cgMbOgy6XlbgyAdIx3T_xVrW_46zXe3T5Imfl05YZ_UebYwNE4L_voQy2qN8TllJ1AX5J9jbm4sqk1vkQO0MQdrCVxHQDyOKmvQBAj8tZuBBLuaBD-bJTtVv8OpmvkB0B3x8QIO18e4l9P4AKa__RJwu5xJnrHD4_QKyu7ocadOLI9pmKKg0DoHvCYWJxfZGY5Le19Tb64ICLELSXQxQThHhY03YxhmGFhdPsDAWyEiVbkr2XkmfoP79vLWU3I8Is0J3o4zzMuS3_5GKAl5ISIEBLNFMZksIYb2i7Mhy8-yuFUnCrv0QpwoiJWudWIB2JShKKWBDg53h7UgbqyHOQ1QPhRKVxvvM_P1gUlxC38GEKCX4k8y0BErYLbo7B4BWMBw23LPjuEBTAq2eE5Cq3Ct3bTQ=s300-no";
    String urlarwinzapa6 = "https://lh3.googleusercontent.com/gQQhaGh5bkC6WIqhOj6EdTK3NHAJZiSJuHUqRwH2SSglrVm9Rc857BfXlXv0HzgCzeWig6lRVWWhWXshIxgCOnSBLx5gQ85Vket0jWDBn8SYSlE1I7j4ZgEIzKFBBxrXmf_Fl43l_7IbqYDRzbixuknxkkRM8lJGQ63oFbZb9Ps1r-6NutkXZzPolxV6oBErXGIdgF-Ip9GzeqszDilWZRWJWcby7Laro_mt8Nbn_khN-AHFJ8fZzv6E81vS3OFZEdkNTtxwFXfg9TLR5zmANt-HdBKQm6SEcOgEs9yLZyebYWbjnxr-QcYqMgMVHeuf_b5cUoOe8hKmvNNOzxb9WZYhZwOU4h7gjn252GL9svJH4dCSgEiRu2XHoXY7C1U8WxRNGtrpBb-SKwLNC_dn03mqVZA_bwWgeR28cMZUPHipFd6ZxYWgehi-oGfAYjYRhQhDC6k_MUVG7HKfcZkYcLL3vzOXo1qs1WRWgKNygkSzgiHnW_Tc75KsUNbHoIzY61axrXwKyqwN5qkR-GG3SArEnSWrRlvxu-Z8oLibR_MD1GoNhA5htZLIa0xsjefQO-BhLPqnuOnqtdVRqqdCuZXS0NDmdki-F_JEXe5oPVrfbUJNIw=s300-no";
    String urlarwinzapa7 = "https://lh3.googleusercontent.com/mI2T8ja4dNjKWh-f8T694FQNeLoOddJ0QUG1GHxpjtLwcvk9QB9aFiJFv2lR6tp5KKgJXnPZU3iaj_Zqchu5ksqUlSBpME91UgbDnrBsYfF8t2CCHsuNT1VOdoDYDY1QLydiwfRbbJMAAN22onbyqaP3ol6zORkm5sZbJS-wJTNl2gpQEU4dUScjLEkk47aFmpJDNx-dfTl66Ho7bTC_ZaL0O9Z462-gXsD8yN5SnbPxf2mAehTKK2fYKG__FqHmNPJJcF7qORVDvpds2GBn82oMDqagrHxqARkfBaikKtxndSyGMi3Q8JSUIGraiMQxeOrjqQ1uPaFIejD_M66-r1jsRZjkCJl-JwJcmPj5QiPCQywQCT2ZD8wmZCMFuqmvyx_n7D9PbGA4taVUEQR0Q2g9BubgU7n6FgkWP8Bw4TBGD9FOjn5aV7YILF2oFEXgrFcmfOllwBpb_k4JIJ3whyrK5IrgunYDVbKOhC5XRm0y7fcKr0HEnTECzCQHwUJj8TKtba6WOOuwTtiJmdhwupLSPORFPhJCZHjMTTV6xzKExt8IDqsiB0ch4i1iXlDaKdSAnn1T6Kp8vJ78a37ek49XZOIHAMNKMB54pnH8CEDEwPIaEA=s300-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arwinzapa1);

        new precioarwinzapa1Async().execute();

        precioarwinzapa1 = (TextView)findViewById(R.id.precioarwinzapa1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(arwinzapa1.this,marcas.class);
                startActivity(marca);
            }
        });

        txtarwinzapa1 = (TextView)findViewById(R.id.txtarwinzapa1);
        final String stconsulta = txtarwinzapa1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(arwinzapa1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(arwinzapa1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraarwinzapa1 = (Button)findViewById(R.id.btncompraarwinzapa1);
        btncompraarwinzapa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompraarwinzapa1 = new Intent(arwinzapa1.this, webview.class);
                btncompraarwinzapa1.putExtra("string", urlcombo);
                startActivity(btncompraarwinzapa1);
            }
        });

        arwinzapa1 = (ImageView)findViewById(R.id.arwinzapa1);
        Picasso.with(this).load(urlarwinzapa1).into(arwinzapa1);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arwinzapa1.setVisibility(View.VISIBLE);
                arwinzapa2.setVisibility(View.GONE);
                arwinzapa3.setVisibility(View.GONE);
                arwinzapa4.setVisibility(View.GONE);
                arwinzapa5.setVisibility(View.GONE);
                arwinzapa6.setVisibility(View.GONE);
                arwinzapa7.setVisibility(View.GONE);
            }
        });

        arwinzapa2 = (ImageView)findViewById(R.id.arwinzapa2);
        Picasso.with(this).load(urlarwinzapa2).into(arwinzapa2);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arwinzapa1.setVisibility(View.INVISIBLE);
                arwinzapa2.setVisibility(View.VISIBLE);
                arwinzapa3.setVisibility(View.GONE);
                arwinzapa4.setVisibility(View.GONE);
                arwinzapa5.setVisibility(View.GONE);
                arwinzapa6.setVisibility(View.GONE);
                arwinzapa7.setVisibility(View.GONE);
            }
        });

        arwinzapa3 = (ImageView)findViewById(R.id.arwinzapa3);
        Picasso.with(this).load(urlarwinzapa3).into(arwinzapa3);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arwinzapa1.setVisibility(View.INVISIBLE);
                arwinzapa2.setVisibility(View.GONE);
                arwinzapa3.setVisibility(View.VISIBLE);
                arwinzapa4.setVisibility(View.GONE);
                arwinzapa5.setVisibility(View.GONE);
                arwinzapa6.setVisibility(View.GONE);
                arwinzapa7.setVisibility(View.GONE);
            }
        });

        arwinzapa4 = (ImageView)findViewById(R.id.arwinzapa4);
        Picasso.with(this).load(urlarwinzapa4).into(arwinzapa4);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arwinzapa1.setVisibility(View.INVISIBLE);
                arwinzapa2.setVisibility(View.GONE);
                arwinzapa3.setVisibility(View.GONE);
                arwinzapa4.setVisibility(View.VISIBLE);
                arwinzapa5.setVisibility(View.GONE);
                arwinzapa6.setVisibility(View.GONE);
                arwinzapa7.setVisibility(View.GONE);
            }
        });

        arwinzapa5 = (ImageView)findViewById(R.id.arwinzapa5);
        Picasso.with(this).load(urlarwinzapa5).into(arwinzapa5);
        txtmodelo5 = (TextView)findViewById(R.id.modelo5);
        txtmodelo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arwinzapa1.setVisibility(View.INVISIBLE);
                arwinzapa2.setVisibility(View.GONE);
                arwinzapa3.setVisibility(View.GONE);
                arwinzapa4.setVisibility(View.GONE);
                arwinzapa5.setVisibility(View.VISIBLE);
                arwinzapa6.setVisibility(View.GONE);
                arwinzapa7.setVisibility(View.GONE);
            }
        });

        arwinzapa6 = (ImageView)findViewById(R.id.arwinzapa6);
        Picasso.with(this).load(urlarwinzapa6).into(arwinzapa6);
        txtmodelo6 = (TextView)findViewById(R.id.modelo6);
        txtmodelo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arwinzapa1.setVisibility(View.INVISIBLE);
                arwinzapa2.setVisibility(View.GONE);
                arwinzapa3.setVisibility(View.GONE);
                arwinzapa4.setVisibility(View.GONE);
                arwinzapa5.setVisibility(View.GONE);
                arwinzapa6.setVisibility(View.VISIBLE);
                arwinzapa7.setVisibility(View.GONE);
            }
        });

        arwinzapa7 = (ImageView)findViewById(R.id.arwinzapa7);
        Picasso.with(this).load(urlarwinzapa7).into(arwinzapa7);
        txtmodelo7 = (TextView)findViewById(R.id.modelo7);
        txtmodelo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arwinzapa1.setVisibility(View.INVISIBLE);
                arwinzapa2.setVisibility(View.GONE);
                arwinzapa3.setVisibility(View.GONE);
                arwinzapa4.setVisibility(View.GONE);
                arwinzapa5.setVisibility(View.GONE);
                arwinzapa6.setVisibility(View.GONE);
                arwinzapa7.setVisibility(View.VISIBLE);
            }
        });

    }

    public class precioarwinzapa1Async extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5776ee37234e1d62289ddc960e17749b";
        String precioarwinzapa1st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precioarwinzapa1st = metapropoerty1.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precioarwinzapa1.setText(precioarwinzapa1st);
        }

    }
}