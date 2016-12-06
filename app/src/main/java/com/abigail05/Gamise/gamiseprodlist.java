package com.abigail05.Gamise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

public class gamiseprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btngamisebodymc;
    ImageView gamisebodymc;
    String urlgamisebodymc = "https://lh3.googleusercontent.com/0og556OJpj5YYTOXEaNyUwXGkhNB_15k5hiYxNRgsoQd-8tOV9ojQ0uHg9B4edcICvNhVYkyDagR5pAj6q1IsX18nU8TDvH7ouv9lo3162WCnszhTkqYnScsdIbyLvwng7hfA0eQ_U8QfAC50wKgbRqtvmH1XRAFyQqsPWi5GmhmQ0Lo8OtZyIk2yaUP1F4RYYqK8V2_KFv6GWHRs9nQhFagWPT5d9BMcD9lZKhtxlXwqrH_ogj9nrxhcR21oG04lFmuLDR6YREfYRtUKURqqJCcENAckLfgn8OMKh9bFolDn7mYxiL-aSqcFYirnYsUZYxgMiVtee-o5HTUMIjqGJYez_VkMa80SN0gKAwgVaMuDgug0QLIVUKLNojEqtN7LcWE9FkC2tpH4P7QA2-HZROHHe3OIBDaPBjo4xcV1M6Gs7RuIi6HbfwP2gbEYBKW05FFgai9ooxTbr2mgguYOzFahV2BU2QmT-MkQyo0BnXhU2iQBWJupyObsVCRorkFqu7WtTsJO0O3efPdQEw-OsrO1saTKKfwbbQTpICqMeWIN6y7JXKwj8a5kA0scIf85LDewjxY0VsLsY8nfOCR1m23UYuKGTAXPEhM4t9EDp5TWcOgO9q7L54SU0KV4MCd-KbVm1n_Cs3CzbI-0JrUr-21jXr43seuzoW7BF4XWCE=w400-h386-no";
    Button btngamisebodyml;
    ImageView gamisebodyml;
    String urlgamisebodyml = "https://lh3.googleusercontent.com/_7hxh9DYKZURNMJjO9JgDlcjgjgXc-Ct25koxftQ6dULM4rRge1vQE9LGhyLKgfaFGWv19xsNCZDoL4-PIvkticPemkxfXu1PYjTYw7JAEp8eflQltf9alip_FVeQNYE3z9Jf3Tvkrp4Zei5-1ExZTauyCMjzsKp3jAmeDCFrQYHKsJUJvMnjcJeXHRvW7IYKY1g0XMw89H5eyQTwoiBRccez16jNWSiYQi32qaQXdB6lUmO9HgdrRR3Odg66SVgIlxIdd0p3pqeb_qI7jw9HWVJYfBiSmk5iyGNCXoE3LcY1yXgJSlFlnJw7QbGaqJgnzUEEQJoScMzvSKUdUDJn29Rse4pG-32hqYUtZB_oeqP-1hwPgf3zlhawjAnVGocX7UK-IUCWmYMXDSFgO5VllgMVpe0bQl82HcklFycOeBQU6E05HPXP2KFzzhYabPF1a8hSPVY7IZLiG4wRAUEEC7bS7aXgW3HPEx6NVlz-7hyJiU_0sta4wh1QEkDLHOTMzczxOLIVxR9TBhswynlW0BfPtbx1oLjgWkPkxfoV4mR94af2txJ0cNx-LN1PGbGfyK_E59nbEUs1ANYenvgdNbpn1XI9eb2-40c7Ih4EGfZj_Or373lE7DZ6UXSdNR22nh5XcXDjm-JgDW9XrKHuLy27l5Zbw9LU7Qec_gffP0=w400-h386-no";
    Button btngamiseconj;
    ImageView gamiseconj;
    String urlgamiseconj = "https://lh3.googleusercontent.com/qdOMskkkQYlIBXzDPuyq7cSdEbXC_9aLLO_HSpfHP6n6USRM05TkO2xGyp0WcLJk44n066CL8fCmAKA0yM7yStaf6ztGNY0rhhg8EaN8chCWhQg6Ou5kah6PM0W9y4CLQanMSNr0p_2nrTYb3sspU0Rp7db1qQfXNdfnqS0uJlzFeEc5V5f0QR2-XqjwG-03HWMg3WwCS6vb08NPGYiv3R1Pc2RUNVL9AsTvWOyNw2-qsvVbrCWcCK-nOi8lMVEtaXmWVdzSbZWPdwYvem4zPRBogFUFBpilgYdaDpXtvalsfZA0PxQmaQtJJbpFCaZwifMpxSj1j0jJUDah9N7igPvYDMSbf6GnmVAJs_Z35-E5pUgjrnQv0DELiXcAsUUQb3OZrDzPT56bU3R7kL5dKghRnU7x77d2mxUDZhLvuzTPIA0aLCkx1pxh67qzOp2P07IP0Csa55FjixiDmXANVuT3Sh10Jye5NqeOwKPtjUlgLbthqR4z9A17S97-OBvDjpmBkF-2Uxyh4oPs39mfJjldrGH1VWKabDcCGM79V2V4bvI0VLcYDM89ZKa6Z2Ox4htJdQBXPUm544uv4M_ZWloMoehywMkOnmxgQ5T-dUzuN-p_jODQthCiLrhlLxKKXpe4mP-kzTIqyjy_xRLXsc85fnCIBajq34tFKD_Vwa0=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamiseprodlist);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamiseprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamiseprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

        gamisebodymc = (ImageView)findViewById(R.id.gamisebodymc);
        Picasso.with(this).load(urlgamisebodymc).into(gamisebodymc);

        btngamisebodymc = (Button)findViewById(R.id.btngamisebodymc);
        btngamisebodymc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodymc = new Intent(gamiseprodlist.this, gamisebodymc.class);
                startActivity(btngamisebodymc);
            }
        });

        gamisebodyml = (ImageView)findViewById(R.id.gamisebodyml);
        Picasso.with(this).load(urlgamisebodyml).into(gamisebodyml);

        btngamisebodyml = (Button)findViewById(R.id.btngamisebodyml);
        btngamisebodyml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodyml = new Intent(gamiseprodlist.this, gamisebodyml.class);
                startActivity(btngamisebodyml);
            }
        });

        gamiseconj = (ImageView)findViewById(R.id.gamiseconj);
        Picasso.with(this).load(urlgamiseconj).into(gamiseconj);

        btngamiseconj = (Button)findViewById(R.id.btngamiseconj);
        btngamiseconj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamiseconj = new Intent(gamiseprodlist.this, gamiseconj.class);
                startActivity(btngamiseconj);
            }
        });

    }
}
