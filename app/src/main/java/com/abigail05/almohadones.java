package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class almohadones extends AppCompatActivity {

    Button vercombo1;
    Button vercombo2;
    Button vercombo3;
    Button vercombo4;
    Button home;
    Button producto;
    Button marca;
    ImageView combo1img;
    String urlcombo1img = "https://lh3.googleusercontent.com/0PZVM2KAiLotF7nrs-MHjo0F7IAtdclqVzPegR1Hva2PXoQn4mJaH1zoykpqTtF5Wqqw2eaFz41VhGp63-SLObi1U3IxKntfhGxsCeNqul_s37yDLQ-VNhCHrdPvZ1ceQNHCRxqNpx67XLvoSN4H8aMUjqrPF5o41PvdQ5jgYu_97WAruYnzWcHx_P6kUWfdISZKWvFgdAthWrJ4NDr89vhDTarqtYD6l4O91uw1DzbxVgoJAG3iFEYI00Oenixfa7Bx8Yl4EydMmzxk0-EwTqUbm8Tife0gTajaYHPQa-NVBrFbv8qGEXv4H29Xdj8-DeA4cgquQCOsv_xzPMOh6EEp48DbLu2n6mL7MLNeZnAhobXxkiClvjxDcQ9oJ328QxZ7ncKzQO6sjWgl2YKAeGFq9HWApNa1X6_9bYafPVMyXu-M7DdfRcyyE8ALDdbYlJAa1Ys5OT97LfNQK1IVCdkd5nFYM8MpPf1UuctiBGkJEtewdOLzlNg5QP_mPsF1ZgWOhUeaJmhYWIgEXo4yj0QjCSgLCvfAkuwYrrm5GV0knm3YYthDMyyw12yLw2_woZbfadGRGmKmYkP-cOI0dEyur5rxZu7x2cP7fA61ElKk5MLwYg=w571-h591-no";
    ImageView combo2img;
    String urlcombo2img = "https://lh3.googleusercontent.com/D_GoJNNtYDbBuxU1MqKfOuKqgyLM926OPcW5vX546gtR6VfEAHpwhTgSn9e_7h1mOpiOkf_vOVQWcBtkp2tgbfOLU7vnQgexbx1UX-ABlnEaGcwBC6rVdK4BFtCMnEBfahQvrwMQoCyTT-MLV0iK3QK3BljBqzEw7arV0nKvSnnJH9uVORSg-Bj-q56LNRwPqF9gJ75rZy-NA774pCr_Zoefwwg8GIAxPzpD-RcnIlEEp6UhYjwBmVVm8XN3UNZr47w8yDF4X640TpMwKB7hyLaKY2f54wpULBTYohHYC9XxbTgXjdggz6kFqWvRsqzVxnL9GKaHEJJjldXa9sewthMryYKHzg5g1KYVC5CLYeY5pzfa-ncmBl9_rKMM30o_jXONtPxuRBTZIuui8-cgKEGJRzuso971GPRsM3aaIV3Mg6dgMMytnliT3MiLSwPjZkHkgWoE5BepInEcNPKikkf9j90RJs-VqQUmVDnI_xT2hjSEOav6NDsImHRoPtef3l7N88PId1i-h6u7PCnOwDuuWNi173svPILdtw1SQbC7S4NWnvPBeFTCDto3yEe6fBXn_2-BWaE_jB4JomhrQfcqtDodgn8HJmumZYlupfKsPgtl6Q=w570-h535-no";
    ImageView combo3img;
    String urlcombo3img = "https://lh3.googleusercontent.com/uDxHLIcbIlmS1Tsqn2fCJrhoT8Z6rUrUa0J4_sLTRikToAhXaIqrZw-VLeiUBo9w5z8D-DBkxEoc4FaY7sNZIgDKs79dTJvsz0T58ccJv2ErGZY-zj0Fy98KRJj-r7R9q2bCMAp4ic8MxIZI3BZgNix-ZEaisvTpxdUsEf2ZMMX6E5MebLw54KvVfa-ndgOsKS6vN7v_IW7e6EBulqJfU2EAF7OTlWDLYtxJ14zhpMMXaeYzrEEbWrdiFvDzVmUzknwJz6qaW5T53_Hgvj8uMz0YdC9CF7TSZYixqxKb5rDj06eG9yYE61SsYGnj8bKlfMuAdW5HvfQ-ObCAg7hPjBhwdneiz2AsGk3xRba1u0jFZYDNihnQAfwrV-VbcwAl4G669Z0lusC1bpDhO_LXq1n55wuP8uqNI6O7ICIMQ6u_BkTcfdHY9mNWsN0vAlam1byKR4TmbNVSQHbz5jZGNkRUsWoPMNd2y3ckm6FhB_XukZXdEADX43iXvfClx7WHFzF1iWyh1979ncXiLWkq5pMvDflHdrnDY0U0Y5fywFpxBeZQv-juvenO3YFvI4oaAko7urOQZ-tSgy5NlYRC4qmgxCBsyMpV7pD3FizrXf6Og85kYA=w294-h328-no";
    ImageView combo4img;
    String urlcombo4img = "https://lh3.googleusercontent.com/TNP66LtKXbcgW-VXfLQasJeZWjL5LfHBlmZda1Tp7BX0tuzzX8XQaTHTnOr4P_ifEIKrwFYXzrYvJ4mvCkmg5js-KrlfC38RMU-67DWUDLj0usJcR932eV6FKb2KG-n5U7Do7GailUFHLq5FgN3DBl4xKSVO8XZsaxAWAvVggoOgR5Pdu6JQCpaExWi5qdVjZGtpxwOVEmYz_LdS2tptyxqmHKvtVpcIW6q50pmFNBJEo9tRljXjGplUwaPEm_FG_JBZRwYsJa-zLUjcy497EAhA-54aEyewAjWvTxWxk390q8mS02QcoEvFLnZgYVqF1T_Eyk5IhN5a4UJubY96n5rSCG48msWsFQ8R83fLf43EhrC6zqIRBuvKAX2N8x9AG3pMOkPZMWJS_XbZrp0lQzGaq9q1UvtP-TmxMMWCd2WJpEgJJC7VOQ7VQItkCEhZRFAdVPc7e0rccddo4z9qnMXskJthqBVoVm1Qp3lSKGTLQEcTgYE8rAKhtVhCxfg9NvVdX88g2tajMd3pes3BuJLKyLUzHSqioWkSGasvb_NZAkR8SsoKs3SbeOGe1LMA42OUAIbWsVFT6U2SK5mX2SX_APFPmxcchjvYC9CVc_HrRSZ7Ww=w460-h284-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almohadones);

        combo1img = (ImageView)findViewById(R.id.combo1img);
        Picasso.with(this).load(urlcombo1img).into(combo1img);

        combo2img = (ImageView)findViewById(R.id.combo2img);
        Picasso.with(this).load(urlcombo2img).into(combo2img);

        combo3img = (ImageView)findViewById(R.id.combo3img);
        Picasso.with(this).load(urlcombo3img).into(combo3img);

        combo4img = (ImageView)findViewById(R.id.combo4img);
        Picasso.with(this).load(urlcombo4img).into(combo4img);

        producto = (Button) findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);

        vercombo1 = (Button) findViewById(R.id.btncombo1);
        vercombo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vercombo1 = new Intent(almohadones.this, combo1.class);
                startActivity(vercombo1);
            }
        });

        vercombo2 = (Button) findViewById(R.id.btncombo2);
        vercombo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vercombo2 = new Intent(almohadones.this, combo2.class);
                startActivity(vercombo2);
            }
        });

        vercombo3 = (Button) findViewById(R.id.btncombo3);
        vercombo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vercombo3 = new Intent(almohadones.this, combo3.class);
                startActivity(vercombo3);
            }
        });

        vercombo4 = (Button) findViewById(R.id.btncombo4);
        vercombo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vercombo4 = new Intent(almohadones.this, combo4.class);
                startActivity(vercombo4);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(almohadones.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

}