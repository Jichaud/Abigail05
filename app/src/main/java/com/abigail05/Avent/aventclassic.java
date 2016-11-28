package com.abigail05.Avent;

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
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class aventclassic extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnaventclassic1;
    Button btnaventclassic2;
    Button btnaventclassic3;
    Button btnaventclassic4;
    Button btnaventclassic5;
    Button btnaventclassic6;
    Button btnaventclassic7;
    Button btnaventclassic8;
    Button btnaventclassic9;
    Button btnaventclassic10;
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

        btnaventclassic1 = (Button)findViewById(R.id.btnaventclassic1);
        btnaventclassic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventclassic1 = new Intent(aventclassic.this, aventclassic1.class);
                startActivity(btnaventclassic1);
            }
        });

        btnaventclassic2 = (Button)findViewById(R.id.btnaventclassic2);
        btnaventclassic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventclassic2 = new Intent(aventclassic.this, aventclassic2.class);
                startActivity(btnaventclassic2);
            }
        });

        btnaventclassic3 = (Button)findViewById(R.id.btnaventclassic3);
        btnaventclassic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventclassic3 = new Intent(aventclassic.this, aventclassic3.class);
                startActivity(btnaventclassic3);
            }
        });

        btnaventclassic4 = (Button)findViewById(R.id.btnaventclassic4);
        btnaventclassic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventclassic4 = new Intent(aventclassic.this, aventclassic4.class);
                startActivity(btnaventclassic4);
            }
        });

        btnaventclassic5 = (Button)findViewById(R.id.btnaventclassic5);
        btnaventclassic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventclassic5 = new Intent(aventclassic.this, aventclassic5.class);
                startActivity(btnaventclassic5);
            }
        });

        btnaventclassic6 = (Button)findViewById(R.id.btnaventclassic6);
        btnaventclassic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventclassic6 = new Intent(aventclassic.this, aventclassic6.class);
                startActivity(btnaventclassic6);
            }
        });

        btnaventclassic7 = (Button)findViewById(R.id.btnaventclassic7);
        btnaventclassic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventclassic7 = new Intent(aventclassic.this, aventclassic7.class);
                startActivity(btnaventclassic7);
            }
        });

        btnaventclassic8 = (Button)findViewById(R.id.btnaventclassic8);
        btnaventclassic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventclassic8 = new Intent(aventclassic.this, aventclassic8.class);
                startActivity(btnaventclassic8);
            }
        });

        btnaventclassic9 = (Button)findViewById(R.id.btnaventclassic9);
        btnaventclassic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventclassic9 = new Intent(aventclassic.this, aventclassic9.class);
                startActivity(btnaventclassic9);
            }
        });

        btnaventclassic10 = (Button)findViewById(R.id.btnaventclassic10);
        btnaventclassic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventclassic10 = new Intent(aventclassic.this, aventclassic10.class);
                startActivity(btnaventclassic10);
            }
        });

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
