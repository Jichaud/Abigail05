package com.abigail05.Abigail;

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

public class combo3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button comprarcombo3;
    Button btnconsulta;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtmodelo5;
    TextView txtmodelo6;
    TextView combo1txtdesc;
    ImageView imgmodelo1;
    ImageView imgmodelo2;
    ImageView imgmodelo3;
    ImageView imgmodelo4;
    ImageView imgmodelo5;
    ImageView imgmodelo6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ba4b284e837aef9bb6c4cc1dee59c775";
    String urlcombomodelo2 = "https://lh3.googleusercontent.com/FBrJfY72C9tneNWoLzKI9YDyF7eEfqTY69Xe2MjFlEdiz7FpSIbZEZe5E386LRsa90k-8XDkshgHhghGgsinHOLBLDsbKFffIArAY2PmJGZi6nuZLmKosb16CpG-CYocgQxtPDfs0Qk_Y3ZkFn7WTiTuPKws3rjb67kJePjWj4OBae32or_5w4LmecNwD0vjA_mLbj5tgy5UuGGK9VLyysu9zSydhZvC_iuouh7fevdVH_FZweyy0y9QowX5D-7_knJrw7GlStdnUpHCD1Vf0rljGJhE-6s1gc6BY0snJr0Vdjp-RTG05g2E78RiX_ORxtcJZpsFtjXqnJzjNjG8FCNwZ39fwGVVlUmBEhxFRLdypaUSun0uN-Nxfou5SGznynL9mDYbL7Iuj8zVL7FofE6ta2MoXZY7bYAiXAkH4W7GuOWXvgkYWPnwQeKWFVP_f4I8elSfJd7wCd_Dq5AA7z-EWQwBU4-gLkgpA6zmsy1J659K0ZMJMpeT9BSRQ6Ff09tkde0anSgUBbGZ5ilCOQwPqbhJ_cnmHRcZq4kePpNeYVXRy8UtjHEomXU4M4wVRjbFOBTESft67EYrMocUdFChbErqEgrndFwFWC3iIv9jqdnLBA=w290-h333-no";
    String urlcombomodelo3 = "https://lh3.googleusercontent.com/pupS76EspIV7Ki-84nhKEvfS54uN-p2f3QqpvsKp9FSAwH5BuJOhvVbsaWVh8ukLliEus2lAcguiBqWS2zkAI21iI__SAE_3aaeeMpsxbyGr0LWFOmZwNySDuo72gg3H1nZ5czohePVlQ2VxSlXi-ePwFfFDH9gq8mR3Vl-lYqFRCxzv8G1GVd7_GgqluQ-wZ6nAEeBGW2FSEhzoTJbF4w9opo0foVfoh2aU3_HIMMe91WLBbfSuRK146U7nEDQ1xP-Y_PPt7LJjTF6G6qef4JH79WTNErWtyE21a4p7Tn5WSIvZnaE6Wkm2LYgPfd9ER2qtm8k7wNbmLMZ-9oJnRHte3frd5ELw2dUlYRf-Fmzo7UT46Iu3I4xnQcn7yVxmN-_pRysEE0SH83oySI5BHaIjSvIxdORYWdnmmTlpsn88XRxiqNWGj8DOOcXRS3z5odnBTTt7XRM25EoEdHNWTDqaFriO2aGRCyK2yXhrC-ie1y-AMn-jT6c3itTFMTexLUZqkm3q5iC1eEqAmY0NQr5YtLdcphM36vu70pHI0UPmSrA36oujMR6dgLG3JguKqjldykc1cidAYaEyzMi2B2hf_L_P-xJlseHJx31YoKMDYeReNA=w298-h342-no";
    String urlcombomodelo4 = "https://lh3.googleusercontent.com/y1OwexU_EQ_2UHt_R6poyAMvbIF64fKBltiqPQDQTniyuG0fXrabOciLDSfpGP-M2_eerLvhuc9UH6Im0yvqiBgqWS1aGka--dcOqcgkyZfvnD9STMXzdoV6Ow_cRsHVrIRkvXgMc-opSRGJrMWbNqtqIs1llI9OAXPZNHB8-puwt-liB_R8mIl9NAIThRSX_OuGlE0W7e16_pnzNvGFQ3pZFJjRpu4D0jRRwebkXufUcvLXR_dRZUEIY9mrctRJY0S62AM_RC7X5Z1gAuhrJH6OjhUNuMZVDSUsyY4Dh5qAyH5qUgTy0YCvRCI9BXvZ4A2Q9J4AFr0tROPAjgwFdrT_gpR7gHiLdiweR91OQud9-mZq-NFEyxhLyXU3bp6dHrQwT9A6lCdcnT9cr1MKqpgULAVJsyLEOpzFXwWUiDDwuCCjgJTnf3otAyVa3viiOVITP8oZvb9usIZ2RvBFoUPNt3pZyp9aFemB7GIsQkNEGhDw5l1BA6VOFSXz8gaYhsTQhvCFudw27otrZbYRAOiNs_Ajkpgq6lf4khL92qL1q75euj0tkjNTvMVvB_ylLuOO1abr7HlfdpQ2Z0_PehjNKBVJC2Kvzbr5GKTazeAzCpFWFg=w304-h317-no";
    String urlcombomodelo5 = "https://lh3.googleusercontent.com/ZrktwwZTA9eoE7p25pVOPAIiwhN6FrBBE8cmrB16gl6oiP4NLx2V1HDgBQuf82HVEhxWqVICbAIOAsIOE9XrWbEUbXsb_wMUGmF1Yx0rkjjt9DPrPJmKpbZ3xnhDxJxxtVZYoAjxYZvoj7tWNYdKR6oM7fGISwQmIRM2Y6qDOEhGlpVe6By44RCTle7SX9DfzOQAQgJzMr6f4_a_ha7fWs4ZoKZerSmAG0_IhkwIzkl0UmyqeVzQj91BsPK2SIUxy7nVyENJfUSBU7wGGqFEbMfCaxwSnMFTHAPThxeMBCyGjJqeumIFdTYfmX6YITcIEYpfsQrE7BBqHbhUE0f4yduh47PVBRmdr82qm0HFVnmj6h7zYdBlKhk6goyyd5CWq1-SeJhQv9T-5Q23dACDNQUCTlhBkSVk0riQeaRZEXfnjg4GMgKQW9q8Zl6CZcb0JpSPy4u0_sHs8rE-I68AtZeORWZT384Ee_BNwpVlNKOD4wKXsuxmUQiKTchAZKkqgJa-7kiV0m_2JIj1KUD2dqvn0QkF2XDc2Yjv5lGV7944fkqVaXdI4OOKSGCzUEujvBfiToAgcnf2exR-N7Wqwi-CEDIphH3o-JJXbP-NyHSfMODt4Q=w304-h320-no";
    String urlcombomodelo6 = "https://lh3.googleusercontent.com/vk1L1h8TMqrgyYjhK0sn4FGPPY9Q7yaAhPODEulMihBN8rt5MhkkyGvBXNo6_YP0SAIGZb-oRsv5uxy9x2CT36J10D8-8yoLbmC1iBg9h59A2KUfvJ8v7lAgRQCTv4shKT7a9_ZYwjnzpN8T_TB9jDAr2MU5zoxkd3gkih-7JzQ8suq7apgA9k8qJRwVqN2YdAOsH3Wcqwqceofznb3EVT7dZtCKRIjtE7ucMFa-C_WzTFTJr24-cG0wxlGGO3agXiXrAJFQbg2RPfyFtsfkO2ML7qvKoWqKLEVfdXMDRbvDxUyOWh3EVaIVDFqiSQvEd9AePvQwV-ggp5w1Ucig202veDARY2y4SbKZCajcg1TPyLFLUxbn9gkAgQkptCiN6SRwFChY0FZgSkV30-RafgV7231I60ItL4dYQOT3EvUYP2KDElSK-jSespRdM9thT6RVZie3R4RX0aJwmhukAw4YM3WXt-zLA-orOpiKCxxge00RVNt1GHRYvKdjPTmhdyI30EDRL-FJwPKE-FqGXX-eyGKLUVNhmjHHUScLtF2DkSHHjixeLouR8moeCtGz2dCQl4_t0PKiJtaBMvuXVkwfl6MyFZEmL8YHp1B5rgL7JE4TuQ=w299-h313-no";
    String urlcombomodelo1 = "https://lh3.googleusercontent.com/uDxHLIcbIlmS1Tsqn2fCJrhoT8Z6rUrUa0J4_sLTRikToAhXaIqrZw-VLeiUBo9w5z8D-DBkxEoc4FaY7sNZIgDKs79dTJvsz0T58ccJv2ErGZY-zj0Fy98KRJj-r7R9q2bCMAp4ic8MxIZI3BZgNix-ZEaisvTpxdUsEf2ZMMX6E5MebLw54KvVfa-ndgOsKS6vN7v_IW7e6EBulqJfU2EAF7OTlWDLYtxJ14zhpMMXaeYzrEEbWrdiFvDzVmUzknwJz6qaW5T53_Hgvj8uMz0YdC9CF7TSZYixqxKb5rDj06eG9yYE61SsYGnj8bKlfMuAdW5HvfQ-ObCAg7hPjBhwdneiz2AsGk3xRba1u0jFZYDNihnQAfwrV-VbcwAl4G669Z0lusC1bpDhO_LXq1n55wuP8uqNI6O7ICIMQ6u_BkTcfdHY9mNWsN0vAlam1byKR4TmbNVSQHbz5jZGNkRUsWoPMNd2y3ckm6FhB_XukZXdEADX43iXvfClx7WHFzF1iWyh1979ncXiLWkq5pMvDflHdrnDY0U0Y5fywFpxBeZQv-juvenO3YFvI4oaAko7urOQZ-tSgy5NlYRC4qmgxCBsyMpV7pD3FizrXf6Og85kYA=w294-h328-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(combo3.this,marcas.class);
                startActivity(marca);
            }
        });

        combo1txtdesc = (TextView)findViewById(R.id.combo1txtdesc);
        final String stconsulta = combo1txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(combo3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(combo3.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcombo3 = (Button)findViewById(R.id.btncompracombo3);
        comprarcombo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo3 = new Intent(combo3.this, webview.class);
                comprarcombo3.putExtra("string", urlcombo);
                startActivity(comprarcombo3);
            }
        });

        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo5 = (TextView)findViewById(R.id.modelo5);
        txtmodelo6 = (TextView)findViewById(R.id.modelo6);
        imgmodelo1 = (ImageView)findViewById(R.id.combomodelo1);
        Picasso.with(this).load(urlcombomodelo1).into(imgmodelo1);
        imgmodelo2 = (ImageView)findViewById(R.id.combomodelo2);
        Picasso.with(this).load(urlcombomodelo2).into(imgmodelo2);
        imgmodelo3 = (ImageView)findViewById(R.id.combomodelo3);
        Picasso.with(this).load(urlcombomodelo3).into(imgmodelo3);
        imgmodelo4 = (ImageView)findViewById(R.id.combomodelo4);
        Picasso.with(this).load(urlcombomodelo4).into(imgmodelo4);
        imgmodelo5 = (ImageView)findViewById(R.id.combomodelo5);
        Picasso.with(this).load(urlcombomodelo5).into(imgmodelo5);
        imgmodelo6 = (ImageView)findViewById(R.id.combomodelo6);
        Picasso.with(this).load(urlcombomodelo6).into(imgmodelo6);

        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.VISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
                imgmodelo6.setVisibility(View.GONE);
            }
        });

        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.VISIBLE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
                imgmodelo6.setVisibility(View.GONE);
            }
        });

        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.VISIBLE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
                imgmodelo6.setVisibility(View.GONE);
            }
        });

        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.VISIBLE);
                imgmodelo5.setVisibility(View.GONE);
                imgmodelo6.setVisibility(View.GONE);
            }
        });

        txtmodelo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.VISIBLE);
                imgmodelo6.setVisibility(View.GONE);
            }
        });

        txtmodelo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
                imgmodelo6.setVisibility(View.VISIBLE);
            }
        });

    }
}