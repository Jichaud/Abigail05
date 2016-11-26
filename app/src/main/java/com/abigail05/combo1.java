package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class combo1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button comprarcombo1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e68ff9a9f087a16157f80793fc0ca56f";
    ImageView combo1imgrojo;
    ImageView combo1imgnaranja;
    ImageView combo1imglila;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    String urlcombo1imgrojo = "https://lh3.googleusercontent.com/0PZVM2KAiLotF7nrs-MHjo0F7IAtdclqVzPegR1Hva2PXoQn4mJaH1zoykpqTtF5Wqqw2eaFz41VhGp63-SLObi1U3IxKntfhGxsCeNqul_s37yDLQ-VNhCHrdPvZ1ceQNHCRxqNpx67XLvoSN4H8aMUjqrPF5o41PvdQ5jgYu_97WAruYnzWcHx_P6kUWfdISZKWvFgdAthWrJ4NDr89vhDTarqtYD6l4O91uw1DzbxVgoJAG3iFEYI00Oenixfa7Bx8Yl4EydMmzxk0-EwTqUbm8Tife0gTajaYHPQa-NVBrFbv8qGEXv4H29Xdj8-DeA4cgquQCOsv_xzPMOh6EEp48DbLu2n6mL7MLNeZnAhobXxkiClvjxDcQ9oJ328QxZ7ncKzQO6sjWgl2YKAeGFq9HWApNa1X6_9bYafPVMyXu-M7DdfRcyyE8ALDdbYlJAa1Ys5OT97LfNQK1IVCdkd5nFYM8MpPf1UuctiBGkJEtewdOLzlNg5QP_mPsF1ZgWOhUeaJmhYWIgEXo4yj0QjCSgLCvfAkuwYrrm5GV0knm3YYthDMyyw12yLw2_woZbfadGRGmKmYkP-cOI0dEyur5rxZu7x2cP7fA61ElKk5MLwYg=w571-h591-no";
    String urlcombo1imgnaranja = "https://lh3.googleusercontent.com/t9SKzzOjsfzTwdtb65gARgW023MPjI5JJqnwnyU0-a7MaSWbbKbv8-UG6XqmF_Nvv4tjJIT9-lxIGjbzVWzU10z0UNHuEHGetAoSMHvKiYefPzy0EG6lbi1dWDOEpWzzsLOxaSS12TyZGYfXGFsXfLQ5Zs3610R2WSJ4epteskQZncd3xuXcJs-RWqCtFMQZSNcKgFeylTGV5Yggm5EG_Z0WB7o4RsrFdMzrbzbqq6wIfGAFCICIuOtMzevYdFqgFE-HKdUm-6DPEi3No2lMeXU37BVQYT_VlVH_FC-Xn8SlmFtVN4P2eGyXxeI4J9Lsz-okFMMSYRhYtp8JuMfbel6grbbuogI19ZGns4RLMzZa0QafCw3SmwcUL1mh61HdKfqG7kuXf59H2ynTxtpRw2EoMw9kZK3FJ3gsW8GfInEwAH2jy59KY-a4OC53zeEEXw3GCpBGT-dJTQ5nnRbQbe_OMlPakx7fo3npMoRC7LggOZNcJYdHq1FeeZ8RIuoqFH1LEnHvexGfRzbf7sdw64tJtW1_R7jaNJo1ip7koH48XZ0Z9SYbpFXOaDWl_87xpf-yrgGkaGpHjxS98OB0zW2kSQD2oF6Swr53zcZojW0cT_Juqg=w606-h591-no";
    String urlcombo2imglila = "https://lh3.googleusercontent.com/QLj2X3etHckSNk40eF8xOs3STirem3mxf-t2g07fV01_e63Vib9m3KIlPYW1ZFbETYbeIrHf1ZZaDQQ26CHcREO7T2h7LnBDqY-lWHKvkNeiX1F5e1bR2zo1RYc5EDtwdmNekjG4IYFuYkZjVuLYLr_bwjvgMy1aQEsocjW5K52TxneyMAG0v_IPhNgC1XL3A7HUyS4_zV-T0bVA7j8khu0eLM-4zMcfEiObL768Nv-uH9bzFVFen4X_d1lNagna-cOQaH0LDELQLn8IOZ8vQFP8gL6HzieCkvtA1-gM_gTWo6JA5pFuEvtu6rcI3l_qGbbNzkwsER7FJVdGnkDvn3kR755pgYAK_ZMXvCROl_GVFEpi25K_7DlJNj8QMiD6BPRO5NESsIZN9vQVMHDvpkbCMhvJZvS35tkBihmXalh53fo1rRH71ZHVOEhMHOAcCCJoxNgv34UJ5myaR03l2dhwhpdg2ZyYZsIDCFkpXq8zSlY6zt8UNTgpoh6QVrB8wZH71dGqeNfjz4YwRngDHdfLH-p5aRgesI_gsO7Q6Ksyu37jaqZxFXTHPV6m35bBnA168gxSkvjrjpZUe13l-TIzUGr2eIgRcG2gupun7ducMTmoww=w594-h591-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo1);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(combo1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(combo1.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcombo1 = (Button)findViewById(R.id.btncompracombo1);
        comprarcombo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo1 = new Intent(combo1.this, webview.class);
                comprarcombo1.putExtra("string", urlcombo);
                startActivity(comprarcombo1);
            }
        });

        combo1imgrojo = (ImageView)findViewById(R.id.combo1imgrojo);
        Picasso.with(this).load(urlcombo1imgrojo).into(combo1imgrojo);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                combo1imgrojo.setVisibility(View.VISIBLE);
                combo1imgnaranja.setVisibility(View.GONE);
                combo1imglila.setVisibility(View.INVISIBLE);
            }
        });

        combo1imgnaranja = (ImageView)findViewById(R.id.combo1imgnaranja);
        Picasso.with(this).load(urlcombo1imgnaranja).into(combo1imgnaranja);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                combo1imgnaranja.setVisibility(View.VISIBLE);
                combo1imgrojo.setVisibility(View.INVISIBLE);
                combo1imglila.setVisibility(View.INVISIBLE);
            }
        });

        combo1imglila = (ImageView)findViewById(R.id.combo1imglila);
        Picasso.with(this).load(urlcombo2imglila).into(combo1imglila);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                combo1imglila.setVisibility(View.VISIBLE);
                combo1imgnaranja.setVisibility(View.INVISIBLE);
                combo1imgrojo.setVisibility(View.INVISIBLE);
            }
        });

    }

}