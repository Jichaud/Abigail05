package com.abigail05.Avent;

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

public class aventprodlist extends AppCompatActivity {

    Button home;

    Button marca;
    Button btnaventclassic;
    Button btnaventnatural;
    Button btnaventchupetes;
    Button btnaventaccesorios;
    ImageView aventclassic;
    String urlaventclassic = "https://lh3.googleusercontent.com/7Z-BiUkRMBz6ypVruDI039UUce0Pst2BJpF7t42rH0MR3HzOQ801TWAXzs1S7qgnRQ4Q4Lvei3eiah07LD0GTKOERSzwtRtHEV1yzIqeA1NFl0KZ0pz__BvAtkHehdvw69v13JHhqxIcuC_q7uGR4YvpmJQJmqccBJkdM9ZDYgcaTUJsKw0ja9frL-n8CwWd5sZSOTL5XRlTG0ucsw20DqJ_KyXomJUnzPzcBuC8seZclJrap66YKvscOGVQHbu15f9s6cbGQqjy5a7xva4OFGF_6XFxyoW3f_AIyEmdgWN8HjxevoehpAAILH77q5FYzH_RXRecvnOTRfwnRs6GN4NDCWD7DURxbmbSPj22rMtTfAO2NOToQUQW6IPHqcGWm9Us-StqNKG2IqPOGU3gUPjDMdwsm1IoBjOihtomPUlnppEYZR0HHd0gzo3x93huQQFI8X0ayjr-D-3z6bekCxyUozvz0TXCwU2LjG8tMgyz9CF5N6udp2oGECG1vZc3n9gb6TE2DiTXCvsFCZa6YRyDM9O15cnGr4IGQkpagImPOi2EbdcOUC_DNxPqIpOGF8G3rMmn8Gc9aoJ30uuNstrqZwBATQnuvHtCeqchQQ9ubqanoQ=w240-h139-no";
    ImageView aventnatural;
    ImageView aventchupetes;
    String urlaventchupetes = "https://lh3.googleusercontent.com/BRHnofUgSeRhHPdNW5L9HFZIhlNtZ_7SpKPrzIguyjnCdBWQppVLfWbPX8K-MDOs7fotvSfoKH8k88J33YmO4R8savetfui3OSPGJl_6-NkYHaN7Jvzwdq3S4ZFGs0ENnVnro3hGM3fD5sN7sHcC5QN7VjKatjVoZuOKq46QQ8xB5dobNSFSUKlF4OZ16MqT1wFsukai9KZwiOg32whq_VNSZAVlI-BxXmX57gHh4OGK1rbHI_mkYMoEflW5zv7lGXE_HYS5tHXTziP9Weqv7DMg1ZPwPHDwvqzd1YGMtbbnuJMU6M1xG5cBvVqZpAsaGT14epvEnWP3Tf1PUcbFL8lzg4aefPrHaUUNiskXk6lV1p2d5KC1TjaahUHkpNB-J42gC0Y4MaHdRcDGMqn9W1ilr8gXYxDNBAs4czpSMrdMEw59NX5sI3F97d60QO6x0GKdAOM9PqmgLb5xoMd2uehLca9LMKfZ7epIbh47LPL1wbNK4yzCk3yle_pyW0wXqo7Vx4GvgA0Waetbwzz1A1cXqv_WW7Ua-dfg0VbY0VwQ4MsgWs1jkAEHz_ajOjEdf7qI2n_XZXk65kNE_D7XVbRvk9joSdyceFbr3eFfcGcLdXW36Q=w240-h139-no";
    ImageView aventaccesorios;
    String urlaventaccesorios = "https://lh3.googleusercontent.com/nvBBBLuJ1SVFOXgWNqlnK7kf8_nJbVx28n4MsCEFZbqcoQxXnTIf4NDbMq-v_NOGJRUhhLCYXNkUKONIWFWUaAm9V_KzK1574jqPwV_GVrUQu3XhCIMZCp4MJ7BKiN-QzNbGkK_aPWV-pRgauJVfEQs7fteSGjSICqz6q2-HbtYIkUJCcGqe210bQ39T3mv2d95PVRAO6TQU4Ezk-F4cBqAI4F-iYYmOd2KoLXYwwRhi6ZC49HBUlWeOhCLA9W1lyZkW62JkbFPxXOpsi_sMu59xpjGweNqQ_Xhtib9ImiOwtnhaoNwXxCToIiH19sc_V7p_2GtFb_ar3NvUw7C811yJ7ZOJH6K8WiO2SIkWpPBm_MN8663W7oaSx905ap0aGCSR2VZrxNM2IcZ34QnXyujJhxF1n64C_22rmCMxJoPSu2ihZOzY5qwrV2UtHpOhwg-BmIF_G-w_I2Z1xa-eMIbalwkLvG0SDhWACb2z4seV7hN9nqyMvUYs8CoqgXUjjr6Uhvpl-HuWGkktL7VAedWtFru3oMYsc7pjC0hGqCoxcrJ9RoSEIgJ3nxQvCgTWFhfweIAIeNn_KUdZ0CUX3yiVo85aVjoyzn7t-E0Eu77EQi6UUg=w240-h139-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventprodlist);

        aventclassic = (ImageView)findViewById(R.id.aventclassic);
        Picasso.with(this).load(urlaventclassic).into(aventclassic);

        aventnatural = (ImageView)findViewById(R.id.aventnatural);
        Picasso.with(this).load(urlaventclassic).into(aventnatural);

        aventchupetes = (ImageView)findViewById(R.id.aventchupetes);
        Picasso.with(this).load(urlaventchupetes).into(aventchupetes);

        aventaccesorios = (ImageView)findViewById(R.id.aventaccesorios);
        Picasso.with(this).load(urlaventaccesorios).into(aventaccesorios);

        btnaventclassic = (Button)findViewById(R.id.btnaventclassic);
        btnaventclassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventclassic = new Intent(aventprodlist.this, aventclassic.class);
                startActivity(btnaventclassic);
            }
        });

        btnaventnatural = (Button)findViewById(R.id.btnaventnatural);
        btnaventnatural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventnatural = new Intent(aventprodlist.this, aventnatural.class);
                startActivity(btnaventnatural);
            }
        });

        btnaventchupetes = (Button)findViewById(R.id.btnaventchupetes);
        btnaventchupetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupetes = new Intent(aventprodlist.this, aventchupetes.class);
                startActivity(btnaventchupetes);
            }
        });

        btnaventaccesorios = (Button)findViewById(R.id.btnaventaccesorios);
        btnaventaccesorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventaccesorios = new Intent(aventprodlist.this, aventaccesorios.class);
                startActivity(btnaventaccesorios);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

    }
}
