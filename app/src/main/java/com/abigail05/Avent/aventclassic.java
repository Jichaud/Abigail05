package com.abigail05.Avent;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
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

public class aventclassic extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventclassic1;
    Button btnconsultaa1;
    TextView txtaventclassic1a1;
    String urlcomboa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3a4283fb4cceb39951b4ab653573cf8e";
    ImageView aventclassic1a1;
    Button btncompraaventclassic2;
    Button btnconsultaa2;
    TextView txtaventclassic2a2;
    String urlcomboa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7afd4b7a5f4d2e01f2b812a14a5f8cc8";
    ImageView aventclassic2a2;
    Button btncompraaventclassic3;
    Button btnconsultaa3;
    TextView txtaventclassic3a3;
    String urlcomboa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d6758fccc414910ed57c957c2f992112";
    ImageView aventclassic3a3;
    Button btncompraaventclassic4;
    Button btnconsultaa4;
    TextView txtaventclassic4a4;
    String urlcomboa4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b01e81a362fad8f5a0b424b8b8078aba";
    ImageView aventclassic4a4;
    Button btncompraaventclassic5;
    Button btnconsultaa5;
    TextView txtaventclassic5a5;
    String urlcomboa5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c5aa1627adc10907066315ac053e3ddc";
    ImageView aventclassic5a5;
    Button btncompraaventclassic6;
    Button btnconsultaa6;
    TextView txtaventclassic6a6;
    String urlcomboa6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8fabc4314513bf5c22fbd2d9fb9e4622";
    ImageView aventclassic6a6;
    Button btncompraaventclassic7;
    Button btnconsultaa7;
    TextView txtaventclassic7a7;
    String urlcomboa7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=505a17be43b51768a520b322981df9f4";
    ImageView aventclassic7a7;
    Button btncompraaventclassic8;
    Button btnconsultaa8;
    TextView txtaventclassic8a8;
    String urlcomboa8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=fe9002f6de0329ac775f467a73f1abf1";
    ImageView aventclassic8a8;
    Button btncompraaventclassic9;
    Button btnconsultaa9;
    TextView txtaventclassic9a9;
    String urlcomboa9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b771ecb66a204e58514e2c94f17850f9";
    ImageView aventclassic9a9;
    Button btncompraaventclassic10;
    Button btnconsultaa10;
    TextView txtaventclassic10a10;
    String urlcomboa10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=87daecf23d49845cab835d24132e2210";
    ImageView aventclassic10a10;
    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;
    Switch switch7;
    Switch switch8;
    Switch switch9;
    Switch switch10;
    LinearLayout lineara1;
    LinearLayout lineara2;
    LinearLayout lineara3;
    LinearLayout lineara4;
    LinearLayout lineara5;
    LinearLayout lineara6;
    LinearLayout lineara7;
    LinearLayout lineara8;
    LinearLayout lineara9;
    LinearLayout lineara10;
    TextView precioaventclassic1;
    TextView precioaventclassic2;
    TextView precioaventclassic3;
    TextView precioaventclassic4;
    TextView precioaventclassic5;
    TextView precioaventclassic6;
    TextView precioaventclassic7;
    TextView precioaventclassic8;
    TextView precioaventclassic9;
    TextView precioaventclassic10;
    ImageView aventclassic1;
    String urlaventclassic1 = "https://lh3.googleusercontent.com/wmZnWMpzmOf7JAvV9KsT-xVkJK-hNvP02YeGMNkwGslkAGhqdS8j3_BOAOJ0sbpdUzkSWzPysGjT_c4ARgQyYxwKZosYkmJncA_GI-kFIP9DT5Di-9pk16hGV0tvinLV8w6rjdWY_erle5GpBGQPORAuX0-20BrMlYieg5dAomLSPeMEJBMY2s1fhFYjiKI8G_thJMO-BDcUUXm6_xvS9hBe3ZGCUE_6dvyQOLCutuNei6HoxVgbsYg5CLcLZ76sXHUGH2c0Pm1Ezr2d1i4DSqBVJNHVO7YKsdXiUVVdKiiMnqGUwMZU7R7Nh9v6ypIxt1kFvTwdre2hkSk60E9FEXulAcJq3HBHvdj6cR8C5Iqqsb-UbJci2Oh8cfXc6R6SbdEa_bIxIO9btIpKEjytLq28L9EPo_AJFSZLrVIt3rgD9eUXQXZnp_kb-77eDjJmZWMXZoc7lrKMbRUTfDld7va5rLfuRDfpg71vEVOaABegMC0zdqgul3OuG1lVyvcanA-MdaK0mynV106lr3QfLjKxY7Jllp0Km77GTdmS4rgy0Z2BPZ7S6kWxCzhenKnpBxDCyivLQSML2Hdh9ALs9vKz7PxidjkWkeIsH3sHJovRDSsXfw=w494-h435-no";
    ImageView aventclassic2;
    String urlaventclassic2 = "https://lh3.googleusercontent.com/-3HjBiOLrG-y43LFlKuF37TQa3f1E2hC117vVUVEapgzbjKS9rfbn6fGr4gcN3WStNmLRDp94T4KB4LPUnqRMBAtpGcqIcM0TnB2UnUN5uEWTzdyCcXQB4KQF67AWtoJ9GYTn8VHS3cwBWcS9PL0KEvEjucizEdCQJudo5gKEeobE6m_YuIrNt9bMIG99rf22YnLVHhZbkl8Bj66XLzEqUZBVhSjLC5sZ11knn0IszLGSMFAlQbMyzsOZqkYBhGCdPfo3kvNWGLnjT9jyD1SGG4wQbq2bKAH9OWOfeI8vqZWa_ReImo9sy-Z9nv5EFvQD4XHHF-kXQQ4yTluu5OVtUkX8PszJdM8nUkC1EOHErQVk_mVLv3R5CjVeR7j2dMW4MhO94xAz0qkG6XqjKQpNceztrUaG4NYvbTd66l9ND4NmRZhIMF5FzUZoSj8NHs9iJClj52lXDc0US9nIiEfhdoZhjrLii27mNDaHT-UhJq9KMI5SmMQHYhOOYYHWYUHDGD_1U9vuwj4Bvvw6wQFhd1H7icSYsUHNUmTZkuu5887G33pymr-mOn4YbOz9JqfQ5pOYT1aFAA7-zWNL-SzRH9q9jqQqWXS4LgNT786s5uPeDWu-Q=w494-h435-no";
    ImageView aventclassic3;
    String urlaventclassic3 = "https://lh3.googleusercontent.com/8RGm5hU94eojhXPpx-u5KfrCjsODV3oao6pRgJlkj_YmXhG2ZFku40gi-ILrah2GnoDcysHyojUHiwyieLE9DiLFuUcna4sr9WLu0YApDdQSujzHNT0qaEypL7O74c-bQFe7jcuUNqEfZ4hBw-UiD-Q1T5p7sTiHWIAqR1XoUiA1DAolvuixeizSlJrOEX2rgLPBWLOudrJxsWh5p7XNpX94f7eGdGeR4SV823bz6UFBl9pvXwH8-Cfizh2fQBNxfF43XDQ06ltKSRHttHFmfVNmB3V4FDVlQdOlwl4VxmLdNXmUq09aBLaCIEZd72X8ywE9pzHgdFt5GuH_8heq7hbyvB4fTVuihiZTcF0OOz2NFXeDv50mOko80qAiup1lMoOYTqMYWneZK-ve2sEM1PY83Qp5iWrz1jMKBH5Fg42uQaKLWQu9au4P01EWPJ6TIqekPNoWeQ0LObeJzUr7C5LgGbZjRs_i-8jUk7kaTRaLAKYuegrSj0hlUKsZbOcHfck2wn5nlPqorYGvqJU5Eru_uwfmwkrQImBC9BALlE1u0L5mH6sZN9cbGWlYmW75SS_XFibLEr00z6EXIFsQQoH7RE7iEx-6oJllOg8hYeLgWWpvLg=w494-h435-no";
    ImageView aventclassic4;
    String urlaventclassic4 = "https://lh3.googleusercontent.com/Y4COAUQx7NN0GmG8OiPWjDjuzBRP3fCfW7EtMjMU-2zNuPvDSMLloUKfJRiHt9v614s7RqEmMNMmZ4tU-xxMdbnUoYeaMIZlUfnu29G3gRwpGiY3Ru2RfsNDRj4vQXs4F6aDkZXZ-mwnOAiGECOGB7zlH10Nl190fDjo656cfkO5C_Xi846Pk3t8C-qkbyvm_hKq6v2Qhfe48ecZEqqCNrSXupWhwDO4F7LrvBY7Md37nHTTu8XobVK4HCpFNeHmeKYk7iDnI_vAO7Z0vH2zEr979TJQ4ZRMSX2NOHwfNOdY-XN18snUB8MT6tCsTa13pLaQjNISm1x7Sc5KfLFe8w9GOKe7j0CMjKHhRm0N8vjEizLQI4exfJM9NDbikRtS_XA0NpLEKOJuw3wQNXC6Uua7TwAcTB2ooivVCUGaQhx3BFFVvf_nxI_XDT2ga7gmw8-lnnGhqUcVLcQ_tbEYmbKri2rMCRYB6SLQ_FqnUvQFridhHfJ5ZWbgVJIFkfne4fpBioqGRQN52fbbbz3hYwASO8kvsiBOM4iVzsS1QRM03Ap-AXqsKGtBcjEPDkNTGXjIESDGxKqWUHSH6QHh2bBi5b0AjAui60IzwxDBxv32mSXivw=w494-h435-no";
    ImageView aventclassic5;
    String urlaventclassic5 = "https://lh3.googleusercontent.com/BEEkwBYGeX9-oiutgWc9xK6RlybMweeXE6jjaNRbd-eAIO7U2eTK1_Y5QeoQGxCv5e2JzGZm5JBAxvm19d1pi96VwBuVn_TpG1XvKT4s-0TyUiGrRaOzaUFMBa2vUNV7exTZOsjY3NMJdJZKvpsPvMgwf9kmGozY1qc6135En0oKf9q7feBTnurBKg1bhFBd0K4_bciLs6YHOaJqCe43Exf2lxBnttkGaWajaJFlwBPrqBr7hHutRShNVmH7WcKiOnWGsfZwi-c8OqQU0DZmxD66qD0CksIaOTCybclP6VT8_l8emy_rgl3FEsQ0mjyjer1CEvw76IDGmGmHypV3QeMqFvTm-pWES3fpL6_cKa-JmqUom30H1W_2lhC_CARqUP_RtlbcLYzKuP_gqATjgPQCLzR-M27OG9GHIihJdrIEXDloX0g83zNL826NMvUqglOxTZUOkZHJZyQBTKsvxHhfZXsihY4kV_jUY-4-_TwOhsaK47vtIQ0_OlFbwq-I8FAzftxftllUzy7xgAKlzmDbgooJYxcO7zCtrMQqkL6JJwCi7RApx50fZxWFjNVocs7En0rVarzOktj5OqZCQW_RcNRW340XpzD8vJipzDM-Oo5rBA=w494-h435-no";
    ImageView aventclassic6;
    String urlaventclassic6 = "https://lh3.googleusercontent.com/yw0kbPY13-L_nKmLZl5ipyFkbyZx0qEccaiu4O5sCCLXZUYlv3r0XiiIMuyyNouOSZprd1Epuz3M0RvOoQg9_o0WdBmUaJdmzNNSHu0Zr_vwAIE2Gs_iTlFrSBC7oZ6VS9b7azae0JnFi-zRJuvFDSEMgEA5WOc99ZEzLwkZm1VST-OL8g7lcGTgj162l1IK0Hb3lJwJXSu1809yWr8mVznZluD1Rd61dTp0t7J8z6MeyCdJu9Gel4VjnT9UzjKxTmHK0Zub3j5xefTs78G9nu2We95E3GUg1wfKyeEtCBkjOYCPAYRANK0_2eW7twFmGHbf-DYCWkWeTCZ5-kA8bZypCY3bekTaDUVryXA3JjnnjtRcojN5NFhoQskd3YcT4J9xLGrwnx2_H0_V3dMus-JNuiBHogms3ZseNeocdQ9cphO-i3Co98xHP4FEHCURdpkQavpPWMDlcbV-emYnA7UksXWA1afduucXr2dGud-UFgZFdO5PkPlR4UfPL_wZpIid9irPIg2HnhtmwBdOwXi5prfrZn7oFdxM_AoHYjM6Un52J35RtXiETdTHUGnbLH00s9OlwnYOFVtGwQsteTxLtZLlefkSO9eBTGYlmvGfx1wxDw=w494-h435-no";
    ImageView aventclassic7;
    String urlaventclassic7 = "https://lh3.googleusercontent.com/5K7j0yaCZsx-UFPkU098eAdvtCyDj0dCjVHdirrKDATeNJMwOWYqSQ0djpShzhHV2Eyjb-kMAaf8Fbf3LkNfdgzosh2FTrGjFYxVV6YXNEHzE-CgERWKLNWMd_ArERYPdMljSh6iQMUAjJd3z9lUkTU4P6-kfUMAU6Colhu_Znl0T9efw-K7HQlNaL-qrJkfUoJobCmjg5U59zznkn_qDHrjd2NgTdWwdrs6NhL713X5Oo3-CSvfr9QlAngToYDseWfw-xi36yRhlZuxT8NXixs3_1XV2Vf7l-7xDAiC8qtlO18bCvQJLWxjvq-ni-hyyPmce3FwXGL-DXhQIFqfK-17qu259IhUaRSbnH_gy-yE47s4GU3u3Q43B7piPufzABAd-JiVJJIIxqqv4qHhGPdFZNbuTVZXoipHtBap3zLmXQJ6YYy7esyqxIElBaUpq0FMgMVXaoLx-e_6iPXUn-Bm3C8MfyfdGtDX-zE1lr41ZWZDJ8QIJFcZwLRSeCf4WDoAFPuMI5axrtR_xVJBM6hIZ8HmatBZhHMDFZUOH-p-b_-tTkCQbfmun7kFeXbe561lAc6y8zVtqIzVf0Y9xphyOcAnjgVkOqPt6bb78G81u3UAjQ=w494-h435-no";
    ImageView aventclassic8;
    String urlaventclassic8 = "https://lh3.googleusercontent.com/D_-NFEmtJEn4QxrguLuuloyfOVTqVSwkqZEJZ-AoBJRlLgwVBdf0iZWr7MvKjCgB0qvCNzUTaRgrBjkYOEmFx3jDXhOQKGEfUpxiMz2XGyy7jmih3xjASyMdYnRwlFeJ7qqj4x6D_kADZ2LAXqbCH2jc07k4l5Wv7BHEnh-bF60zg-Q3TDg22m5zXY9WuMXEtWz3UEFIPYQSfy0B_HHz9Pb_i9XosGcvvsN7_3x9st0B6uKqMEtIXa8_cZU27zrt3FFoieBOnS8SE0eWYSYxvkpdo99y8RO8gcjh3QdRdglo9uxN6WbinQ_wGy8aKo1MAeYq7iKh4NKzkdecbdhnsqSuxT79lSQanjToHkm0P4wrMSCkPls1Yr74RFtRO25MnQkJi-wu_qCMerFWTiYbzgu8SU_sHGPH4fGnegbT1WwB_oPXsaOVJAcOWBEMCLgmCFmrRLw7vh5K_J--OR95d0vcg7z4vmFb-hanQAdwh5SU7l77_5CzboV0rZFuU74WtXxOx_y7PBMMMQhrLDhCoCbvpfnLe4f0SPA9nJO1DZhtoI_fZS0My3X6bRbR3OpAKn8o5E20L-n56S6Q_Mu38zS1h96b5LydLiM3jPTFoz1-3rT4zg=w494-h435-no";
    ImageView aventclassic9;
    String urlaventclassic9 = "https://lh3.googleusercontent.com/h2etJ5aTn6RY6cjCnxydQaIXR-SmJVwb0DeOLrW6By_77hmZMh3yMWOdRn721INfE94qbf8VPUNXdZeEIxYOabMGAQWYFWYE3x6i7ce4TpnrPi5M5QTuCyOil7DrubL_XSbJYfHH_DEO-wICyTCM5dK3O7rNYETFTqDdkzatXOYfQWeS6u4-rde3tixWtCIlz63c80kW9EcMMAPLUSMZyLXhnrY7frvmriUXoYbS0fIeADONeUhzip8fX2VercwNvJhhjQfABBAuIgcLCFvmaOQ0nPWBtmIF8rurnTzGPu18rUHtrLCi01avY4iohX2r9Jg3If2diE-6bXcQ58mqxcx22w-YBJyJgiyyCkxyWMa3PPQPA2qFndfIofSLcPdWbjzyId6bDPXMxY_jHshX0iKyr20OREIjUyavcVgU340id4UNSO3rZirsMV-1CUIHO-IXzonz575ZO-dC7cKWJU6vjWoo_LGblkdOqNeEqA5tQt5ob2rkdQS3TDc7GPfTkduc33dChnVcqZWEXwuePjX7wzjOw2PVE_VIKlH_tSgzB29l3QiY3q6V1EpTOuvF0DTFU3ET1S_ih-cPkv3EB8pMwxCsygcOgD9zrf9TWJsHoU3mcw=w448-h352-no";
    ImageView aventclassic10;
    String urlaventclassic10 = "https://lh3.googleusercontent.com/c9AQjZBKHwpXCnT3pbgaK8Ijm1yHACW7Ni9WPrPoDN1F2p5VhhTRxvcMtwXg-SXFpossBJLkMmj1F8waPL3k16nMOxgXeXZ74xC0DuLSdxTxUgGhi3HtLY957qa3iChW7Chyz1T9RSEsJtGM5LJzIpCJXMAi4fUK9nxTiHMjpGEGyFAe_hPALGsYFdSLulnN42ke9dEpSY2VljGcQKPFuvXtTP5INmnX4K3rSp-Rw9ORG9xdoBC-BhVjB0th6l-WqNQ5nOy1Mfl_1fXo6lnLidtxnZEp_UoLtg5KZOfrv3l2xhpa4CmQy6DZ4VfwBNMR5olwZHpjSHojfq-42L-TngGlg8uLgyJKl-_kUxz2m-ez6u8-qJ0XbVF57GYYeME2LUI3XIAgqUPO9yPbkcu9x6k1qkBAvEAgDjNpgefmgls5jV5FBj0q84baL6UzF6EYgqxkmyfHnDRHV-NviAQyhOAqJPHe_t19HDkwbSSwfHbUu8s7O_QnW5n5FaH98G5MPfQsJFozmUWecOrFHiDehYMYsVs7D6IyH6WRN-j5fqZaq3GKcg3DvzzaIeMgPxMIO9AqaUf8-HFEsM-MImg3KKELOxIb7ZTMZuuJyhw8liW4Fp_nBA=w444-h352-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventclassic);

        new precioaventclassicAsync().execute();

        /* classic 1 */

        aventclassic1a1 = (ImageView)findViewById(R.id.aventclassic1a1);
        Picasso.with(this).load(urlaventclassic1).into(aventclassic1a1);

        txtaventclassic1a1 = (TextView)findViewById(R.id.txtaventclassic1a1);
        final String stconsultaa1 = txtaventclassic1a1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(aventclassic.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });


        btncompraaventclassic1 = (Button)findViewById(R.id.btncompraaventclassic1);
        btncompraaventclassic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic1 = new Intent(aventclassic.this,webview.class);
                btncompraaventclassic1.putExtra("string", urlcomboa1);
                startActivity(btncompraaventclassic1);
            }
        });

        lineara1 = (LinearLayout)findViewById(R.id.lineara1);

        switch1 = (Switch)findViewById(R.id.switch1);
        switch1.setChecked(false);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch1.isChecked()) {
                    lineara1.setVisibility(View.VISIBLE);
                } else {
                    lineara1.setVisibility(View.GONE);
                }

            }
        });

        /* classic 2 */

        aventclassic2a2 = (ImageView)findViewById(R.id.aventclassic2a2);
        Picasso.with(this).load(urlaventclassic2).into(aventclassic2a2);


        txtaventclassic2a2 = (TextView)findViewById(R.id.txtaventclassic2a2);
        final String stconsultaa2 = txtaventclassic2a2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(aventclassic.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });


        btncompraaventclassic2 = (Button)findViewById(R.id.btncompraaventclassic2);
        btncompraaventclassic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic2 = new Intent(aventclassic.this,webview.class);
                btncompraaventclassic2.putExtra("string", urlcomboa2);
                startActivity(btncompraaventclassic2);
            }
        });

        lineara2 = (LinearLayout)findViewById(R.id.lineara2);

        switch2 = (Switch)findViewById(R.id.switch2);
        switch2.setChecked(false);
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch2.isChecked()) {
                    lineara2.setVisibility(View.VISIBLE);
                } else {
                    lineara2.setVisibility(View.GONE);
                }

            }
        });

        /* classic 3 */

        aventclassic3a3 = (ImageView)findViewById(R.id.aventclassic3a3);
        Picasso.with(this).load(urlaventclassic3).into(aventclassic3a3);


        txtaventclassic3a3 = (TextView)findViewById(R.id.txtaventclassic3a3);
        final String stconsultaa3 = txtaventclassic3a3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(aventclassic.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });


        btncompraaventclassic3 = (Button)findViewById(R.id.btncompraaventclassic3);
        btncompraaventclassic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic3 = new Intent(aventclassic.this,webview.class);
                btncompraaventclassic3.putExtra("string", urlcomboa3);
                startActivity(btncompraaventclassic3);
            }
        });

        lineara3 = (LinearLayout)findViewById(R.id.lineara3);

        switch3 = (Switch)findViewById(R.id.switch3);
        switch3.setChecked(false);
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch3.isChecked()) {
                    lineara3.setVisibility(View.VISIBLE);
                } else {
                    lineara3.setVisibility(View.GONE);
                }

            }
        });

        /* classic 4 */

        aventclassic4a4 = (ImageView)findViewById(R.id.aventclassic4a4);
        Picasso.with(this).load(urlaventclassic4).into(aventclassic4a4);


        txtaventclassic4a4 = (TextView)findViewById(R.id.txtaventclassic4a4);
        final String stconsultaa4 = txtaventclassic4a4.getText().toString();
        btnconsultaa4 = (Button)findViewById(R.id.btnconsultaa4);
        btnconsultaa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa4 = new Intent(aventclassic.this,contacto.class);
                btnconsultaa4.putExtra("consulta", stconsultaa4);
                startActivity(btnconsultaa4);
            }
        });


        btncompraaventclassic4 = (Button)findViewById(R.id.btncompraaventclassic4);
        btncompraaventclassic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic4 = new Intent(aventclassic.this,webview.class);
                btncompraaventclassic4.putExtra("string", urlcomboa4);
                startActivity(btncompraaventclassic4);
            }
        });

        lineara4 = (LinearLayout)findViewById(R.id.lineara4);

        switch4 = (Switch)findViewById(R.id.switch4);
        switch4.setChecked(false);
        switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch4.isChecked()) {
                    lineara4.setVisibility(View.VISIBLE);
                } else {
                    lineara4.setVisibility(View.GONE);
                }

            }
        });

        /* classic 5 */

        aventclassic5a5 = (ImageView)findViewById(R.id.aventclassic5a5);
        Picasso.with(this).load(urlaventclassic5).into(aventclassic5a5);


        txtaventclassic5a5 = (TextView)findViewById(R.id.txtaventclassic5a5);
        final String stconsultaa5 = txtaventclassic5a5.getText().toString();
        btnconsultaa5 = (Button)findViewById(R.id.btnconsultaa5);
        btnconsultaa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa5 = new Intent(aventclassic.this,contacto.class);
                btnconsultaa5.putExtra("consulta", stconsultaa5);
                startActivity(btnconsultaa5);
            }
        });


        btncompraaventclassic5 = (Button)findViewById(R.id.btncompraaventclassic5);
        btncompraaventclassic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic5 = new Intent(aventclassic.this,webview.class);
                btncompraaventclassic5.putExtra("string", urlcomboa5);
                startActivity(btncompraaventclassic5);
            }
        });

        lineara5 = (LinearLayout)findViewById(R.id.lineara5);

        switch5 = (Switch)findViewById(R.id.switch5);
        switch5.setChecked(false);
        switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch5.isChecked()) {
                    lineara5.setVisibility(View.VISIBLE);
                } else {
                    lineara5.setVisibility(View.GONE);
                }

            }
        });

        /* classic 6 */

        aventclassic6a6 = (ImageView)findViewById(R.id.aventclassic6a6);
        Picasso.with(this).load(urlaventclassic6).into(aventclassic6a6);


        txtaventclassic6a6 = (TextView)findViewById(R.id.txtaventclassic6a6);
        final String stconsultaa6 = txtaventclassic6a6.getText().toString();
        btnconsultaa6 = (Button)findViewById(R.id.btnconsultaa6);
        btnconsultaa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa6 = new Intent(aventclassic.this,contacto.class);
                btnconsultaa6.putExtra("consulta", stconsultaa6);
                startActivity(btnconsultaa6);
            }
        });


        btncompraaventclassic6 = (Button)findViewById(R.id.btncompraaventclassic6);
        btncompraaventclassic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic6 = new Intent(aventclassic.this,webview.class);
                btncompraaventclassic6.putExtra("string", urlcomboa6);
                startActivity(btncompraaventclassic6);
            }
        });

        lineara6 = (LinearLayout)findViewById(R.id.lineara6);

        switch6 = (Switch)findViewById(R.id.switch6);
        switch6.setChecked(false);
        switch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch6.isChecked()) {
                    lineara6.setVisibility(View.VISIBLE);
                } else {
                    lineara6.setVisibility(View.GONE);
                }

            }
        });

        /* classic 7 */

        aventclassic7a7 = (ImageView)findViewById(R.id.aventclassic7a7);
        Picasso.with(this).load(urlaventclassic7).into(aventclassic7a7);


        txtaventclassic7a7 = (TextView)findViewById(R.id.txtaventclassic7a7);
        final String stconsultaa7 = txtaventclassic7a7.getText().toString();
        btnconsultaa7 = (Button)findViewById(R.id.btnconsultaa7);
        btnconsultaa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa7 = new Intent(aventclassic.this,contacto.class);
                btnconsultaa7.putExtra("consulta", stconsultaa7);
                startActivity(btnconsultaa7);
            }
        });


        btncompraaventclassic7 = (Button)findViewById(R.id.btncompraaventclassic7);
        btncompraaventclassic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic7 = new Intent(aventclassic.this,webview.class);
                btncompraaventclassic7.putExtra("string", urlcomboa7);
                startActivity(btncompraaventclassic7);
            }
        });

        lineara7 = (LinearLayout)findViewById(R.id.lineara7);

        switch7 = (Switch)findViewById(R.id.switch7);
        switch7.setChecked(false);
        switch7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch7.isChecked()) {
                    lineara7.setVisibility(View.VISIBLE);
                } else {
                    lineara7.setVisibility(View.GONE);
                }

            }
        });

        /* classic 8 */

        aventclassic8a8 = (ImageView)findViewById(R.id.aventclassic8a8);
        Picasso.with(this).load(urlaventclassic8).into(aventclassic8a8);


        txtaventclassic8a8 = (TextView)findViewById(R.id.txtaventclassic8a8);
        final String stconsultaa8 = txtaventclassic8a8.getText().toString();
        btnconsultaa8 = (Button)findViewById(R.id.btnconsultaa8);
        btnconsultaa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa8 = new Intent(aventclassic.this,contacto.class);
                btnconsultaa8.putExtra("consulta", stconsultaa8);
                startActivity(btnconsultaa8);
            }
        });


        btncompraaventclassic8 = (Button)findViewById(R.id.btncompraaventclassic8);
        btncompraaventclassic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic8 = new Intent(aventclassic.this,webview.class);
                btncompraaventclassic8.putExtra("string", urlcomboa8);
                startActivity(btncompraaventclassic8);
            }
        });

        lineara8 = (LinearLayout)findViewById(R.id.lineara8);

        switch8 = (Switch)findViewById(R.id.switch8);
        switch8.setChecked(false);
        switch8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch8.isChecked()) {
                    lineara8.setVisibility(View.VISIBLE);
                } else {
                    lineara8.setVisibility(View.GONE);
                }

            }
        });

        /* classic 9 */

        aventclassic9a9 = (ImageView)findViewById(R.id.aventclassic9a9);
        Picasso.with(this).load(urlaventclassic9).into(aventclassic9a9);


        txtaventclassic9a9 = (TextView)findViewById(R.id.txtaventclassic9a9);
        final String stconsultaa9 = txtaventclassic9a9.getText().toString();
        btnconsultaa9 = (Button)findViewById(R.id.btnconsultaa9);
        btnconsultaa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa9 = new Intent(aventclassic.this,contacto.class);
                btnconsultaa9.putExtra("consulta", stconsultaa9);
                startActivity(btnconsultaa9);
            }
        });


        btncompraaventclassic9 = (Button)findViewById(R.id.btncompraaventclassic9);
        btncompraaventclassic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic9 = new Intent(aventclassic.this,webview.class);
                btncompraaventclassic9.putExtra("string", urlcomboa9);
                startActivity(btncompraaventclassic9);
            }
        });

        lineara9 = (LinearLayout)findViewById(R.id.lineara9);

        switch9 = (Switch)findViewById(R.id.switch9);
        switch9.setChecked(false);
        switch9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch9.isChecked()) {
                    lineara9.setVisibility(View.VISIBLE);
                } else {
                    lineara9.setVisibility(View.GONE);
                }

            }
        });

        /* classic 10 */

        aventclassic10a10 = (ImageView)findViewById(R.id.aventclassic10a10);
        Picasso.with(this).load(urlaventclassic10).into(aventclassic10a10);


        txtaventclassic10a10 = (TextView)findViewById(R.id.txtaventclassic10a10);
        final String stconsultaa10 = txtaventclassic10a10.getText().toString();
        btnconsultaa10 = (Button)findViewById(R.id.btnconsultaa10);
        btnconsultaa10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa10 = new Intent(aventclassic.this,contacto.class);
                btnconsultaa10.putExtra("consulta", stconsultaa10);
                startActivity(btnconsultaa10);
            }
        });


        btncompraaventclassic10 = (Button)findViewById(R.id.btncompraaventclassic10);
        btncompraaventclassic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic10 = new Intent(aventclassic.this,webview.class);
                btncompraaventclassic10.putExtra("string", urlcomboa10);
                startActivity(btncompraaventclassic10);
            }
        });

        lineara10 = (LinearLayout)findViewById(R.id.lineara10);

        switch10 = (Switch)findViewById(R.id.switch10);
        switch10.setChecked(false);
        switch10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch10.isChecked()) {
                    lineara10.setVisibility(View.VISIBLE);
                } else {
                    lineara10.setVisibility(View.GONE);
                }

            }
        });

        /* resto de código */

        precioaventclassic1 = (TextView)findViewById(R.id.precioaventclassic1);
        precioaventclassic2 = (TextView)findViewById(R.id.precioaventclassic2);
        precioaventclassic3 = (TextView)findViewById(R.id.precioaventclassic3);
        precioaventclassic4 = (TextView)findViewById(R.id.precioaventclassic4);
        precioaventclassic5 = (TextView)findViewById(R.id.precioaventclassic5);
        precioaventclassic6 = (TextView)findViewById(R.id.precioaventclassic6);
        precioaventclassic7 = (TextView)findViewById(R.id.precioaventclassic7);
        precioaventclassic8 = (TextView)findViewById(R.id.precioaventclassic8);
        precioaventclassic9 = (TextView)findViewById(R.id.precioaventclassic9);
        precioaventclassic10 = (TextView)findViewById(R.id.precioaventclassic10);

        aventclassic1 = (ImageView)findViewById(R.id.aventclassic1);
        Picasso.with(this).load(urlaventclassic1).into(aventclassic1);

        aventclassic2 = (ImageView)findViewById(R.id.aventclassic2);
        Picasso.with(this).load(urlaventclassic2).into(aventclassic2);

        aventclassic3 = (ImageView)findViewById(R.id.aventclassic3);
        Picasso.with(this).load(urlaventclassic3).into(aventclassic3);

        aventclassic4 = (ImageView)findViewById(R.id.aventclassic4);
        Picasso.with(this).load(urlaventclassic4).into(aventclassic4);

        aventclassic5 = (ImageView)findViewById(R.id.aventclassic5);
        Picasso.with(this).load(urlaventclassic5).into(aventclassic5);

        aventclassic6 = (ImageView)findViewById(R.id.aventclassic6);
        Picasso.with(this).load(urlaventclassic6).into(aventclassic6);

        aventclassic7 = (ImageView)findViewById(R.id.aventclassic7);
        Picasso.with(this).load(urlaventclassic7).into(aventclassic7);

        aventclassic8 = (ImageView)findViewById(R.id.aventclassic8);
        Picasso.with(this).load(urlaventclassic8).into(aventclassic8);

        aventclassic9 = (ImageView)findViewById(R.id.aventclassic9);
        Picasso.with(this).load(urlaventclassic9).into(aventclassic9);

        aventclassic10 = (ImageView)findViewById(R.id.aventclassic10);
        Picasso.with(this).load(urlaventclassic10).into(aventclassic10);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventclassic.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventclassic.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precioaventclassicAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3a4283fb4cceb39951b4ab653573cf8e";
        String precioaventclassic1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7afd4b7a5f4d2e01f2b812a14a5f8cc8";
        String precioaventclassic2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d6758fccc414910ed57c957c2f992112";
        String precioaventclassic3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b01e81a362fad8f5a0b424b8b8078aba";
        String precioaventclassic4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c5aa1627adc10907066315ac053e3ddc";
        String precioaventclassic5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8fabc4314513bf5c22fbd2d9fb9e4622";
        String precioaventclassic6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=505a17be43b51768a520b322981df9f4";
        String precioaventclassic7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=fe9002f6de0329ac775f467a73f1abf1";
        String precioaventclassic8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b771ecb66a204e58514e2c94f17850f9";
        String precioaventclassic9st;
        String urlprecio10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=87daecf23d49845cab835d24132e2210";
        String precioaventclassic10st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precioaventclassic1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precioaventclassic2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precioaventclassic3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                precioaventclassic4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                precioaventclassic5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                precioaventclassic6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                precioaventclassic7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                precioaventclassic8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                precioaventclassic9st = metapropoerty9.attr("content");

                Document doc10 = Jsoup.connect(urlprecio10).get();
                Elements metapropoerty10 = doc10.select("meta[property=\"og:description\"]");
                precioaventclassic10st = metapropoerty10.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precioaventclassic1.setText(precioaventclassic1st);
            precioaventclassic2.setText(precioaventclassic2st);
            precioaventclassic3.setText(precioaventclassic3st);
            precioaventclassic4.setText(precioaventclassic4st);
            precioaventclassic5.setText(precioaventclassic5st);
            precioaventclassic6.setText(precioaventclassic6st);
            precioaventclassic7.setText(precioaventclassic7st);
            precioaventclassic8.setText(precioaventclassic8st);
            precioaventclassic9.setText(precioaventclassic9st);
            precioaventclassic10.setText(precioaventclassic10st);
        }

    }
}
