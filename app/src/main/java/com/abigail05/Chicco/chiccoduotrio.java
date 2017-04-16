package com.abigail05.Chicco;

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

public class chiccoduotrio extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsultaa1;
    Button comprarchiccoduotrio1;
    String urlchiccoduotrioa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=27d8e203c90fcd24ffdf3cb4852b5cde";
    ImageView chiccoduotrio1imgrojoa1;
    ImageView chiccoduotrio1imgnaranjaa1;
    ImageView chiccoduotrio1imglilaa1;
    TextView txtmodelo1a1;
    TextView txtmodelo2a1;
    TextView txtmodelo3a1;
    TextView chiccoduotrio1txtdesca1;
    String urlchiccoduotrio1imgrojoa1 = "https://lh3.googleusercontent.com/5TH1LyOdBkBVjlHhpCAggeT-mCeZw4j2MDbB0sYhwC5K1n-FSjdoG5S4bRPA61pT583WfaKZoqIW7vVWaFILYY16vpj9Wyv4oNGKPFC1Mdg0tdDtjYtkHlDibBE-myUsTrbHI8uT6N77i7KLyJziOuICjXhPP65LkqMptB8sq2FHBvGjwwFW8FbV25az1et7zcUADnxUAk82u0Hmov_XkWFTsNtnHf68AVPrfGaICJrueaCI-sVLka1yNmTnWzb1X_XHABPcEnrbH1gMka67ZilpI2Gau3LxC1PB_3FMtNnSqKqeWmPDvk6lsyWfxC-tbEfJ_zyTeXG8bfx8yJbcV-KqsuCMoram5fN_Gyv4RSkRQFrqOPixZ7olw-dZej79W1Tc-gZ4jPhvvr4V_CZZ0O10JXKiA5LTBzUNK7Ou-HVQq_kuEs2653xIlhp4qF7ErqTubHjh_WuotFFrGPZnioea_VhcJYDEV6RLGjW6El57Q49SHtJhAwNNwkCrHucFQ2ndObTT6T5DXRNXoOniT4337MDNUAhgAsqrOiwwYFTFiP7vpSyBAUGeCU5U1a77ORx5tYq-sJfHuUSiAq9Eajt60JG2dJEHjyeZoxP3jj6Y82gUdO2i7qj74tpQ15qF-jVPlt8nZoM9QkCzj6sRMN6ot6auBjobwLrZx3SuFC0=s725-no";
    String urlchiccoduotrio1imgnaranjaa1 = "https://lh3.googleusercontent.com/1ZgZXZRJWC6hNSwHYkUqp_lmKjqVg61C0mfFYxxvqe0j5NBPkPQLeM7faYhMGPCq9e0wTJBh9hDEGm9OItQNsrnypND4l-ZCZNowGSXtubCOzNDMxlCCo2Y59gAXBmGEQNsEPWurrau4s9axH4NpkNvEugeBawS-2R9lmFyJZ9Vi-9DWC-KP2UcaW_LcdM1IVLkpAYoDSITGtnpsxjm--KiyYCmDLHTBc42mrIfrd8kocH99jp_qZagJIVCwtat-OYAiLE14po4kW7ypZkYWnqydOeiU7fGrl-Rz5P6-o6s6lCDrSrz0mGQuYIAt0SN9AkMyZ5NK9GZgr-DdRDvyg-I0DeoONl1goYmiAcqJEisllmJcLjEk9k2o1cyMvR-nIpzQjsSTX1HxzFx6pZXPsRNhT_Pt-dEo-v_9tS-3rHI30DzOL8K1JObdb6bRtJj_WHBsgZUYZlktvKTZwXkQYpzFSy0jC4g33ywqLoqtmEqzR1XeVEA5KATnCs6YG8g9zo0cMv1AxldoQUs7CiK3B8GzpGd26XS1zEiFCH-J-PV-HD7ZrDYxqJQIxfMS9v8zM6H1U3DdhChLzZa6Mbdnjyk_HzyVLO-XyTNt3yuWZdCWNOPGTw1u3OOAOMwNI7Etovrx92CZjkDFhxVkaRvK921qk7EihFIVC5fD5-QHemc=s725-no";
    String urlchiccoduotrio2imglilaa1 = "https://lh3.googleusercontent.com/ILqpGuULutvZ0Xj8vs5kY_TqY4YMf47PukKwSkdWqUcycUCBVQHOxCRgQY4kUK0sJehOPEIkAO3Q0voaytRgY09fkLhxFB5F5pBW8tQvit_sYRPJ3aWID0g4jIii7Agj7lHJbJUTce5cMRWcgwk853Avi7yqB55OZa7yedwEqnCupeQPOFoaIVXQURvaosWmH0ZGeF-Bq87DHlzP7rLCm_EXj_l4pshoDEc4hKfT8VbcKnYtx8OoyZaL7xVtD9Z9U2haO0NXGHpbNcghi6DWXgXNYhT-Vzjse_K_pjVpHuD3RzFyg4kpgEK52ZEU-5jpBer2x2K92WozQQHERTN4GetYK6vM2398NjQJ76donghnSGM5EQXA9lxFIu3LRbsH5memTREwTFXziyFWWcO-S3kIVHno-enJ2Q3GnypLh3yUO-l2zxWdWbCiG8H7IwLbiOyM1OjcX6nt6cFvuqKrXiiryu1I7dHTOWpjEH8g0ameqIJuc6X_QMV6cMZ7-qGKfnTNs0mZBDxhKMtRrhiIajfiRTrl7JOrz0smE-vbpb9OsAR5w5DiNmUNlwXWMdoFupQUz5aC4Gfaja5DKbjF5ccCf4lQcvckh5YCypHnCsSrDPwRnE-PsenR-UlGMKBCwdoHDUneeeEFhL0EaI6KNLHudqMp1_dY16LgmC9ootQ=s725-no";
    Button btncomprachiccoduotrio2;
    Button btnconsultaa2;
    TextView txtmodelo1a2;
    TextView txtmodelo2a2;
    TextView chiccoduotrio2txtdesca2;
    ImageView imgmodelo1a2;
    ImageView imgmodelo2a2;
    String urlcomboa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e29dbdebd15b27b8fc030402d90939b3";
    String urlchiccoduotrio2imga2 = "https://lh3.googleusercontent.com/aLCa2bwglHwByQrvQ4HkbTT5UtRQvmGgeZnqorMR49fnXTxVY4-gpkA7Oiqqxh8WLOOuox8yz37qwM-9eNh045pNK_tFrE5ap_nOMC1doqLg1cP96PVdNJ1XS9vh85bPSFGFg80yrqO4Dbp0pSQ4EGtDDWHn5vMQiLBgzzMSM0vOXLKUtydgLw9dBxkUOaf8Nw9mMIVbhGf0c7NXxdq-gb18kNns58aZ-meRZpXsAQ2Oc_-pDH13zdjUGcMWfNgL9EvFJ2uKWrWCRI4RUskIOQEjnnx3gT89uKt3Oy-ueajIenQtcmbLaSEedmz1WhSi-QYYC_C2h-Jpu_672efftaRouM3VfdO7YiUIQyh_30LXufMquQpPKgykbnyjUt755YSHUQZuZ-MTDF22Qdkpm3RAorb6U2tc6CaBQqHs5uG2EKn3fumJYRPKf3EPKXM8IXK6m0cmCvr9kVjf9a1Z2W2DZFYGcrUYnTw-RFbPankNeCAdjmiIKEIqjtPiVYJURKjxPgvOfG_d0FSGcZlBk-EMYnc4_iCaUDIgLEl_svrJ4rC5_RDIFx_khBxoHv5YznZ5DOKSnS9FdKqsXj62Z-WPc-l2CzY6BFEbMoAfVsRx5KU4Ufkoip15atnKLt5HYWBVezDaD1RN3iQ6rLRKMGlGeFMZuzgSpwSxF03xeUo=w725-h726-no";
    String urlchiccoduotrio1imga2 = "https://lh3.googleusercontent.com/IVAYosLP2P2LKc2_5DKGkem1B_toiMyPx6b--kutPzm--hfxXXEgAr8Fj25e54y4S5foBHRiICZVybVrx2aRgir1oovZQp1eb1RFkp6hslPKYn6QkYU-8aqj44yEB2PAKVwiESyw0YwoQGRIk9CzyMO9c9eawxU9Q38UlY1LyrDLJAJTMu5F5gloe4aOIWdDmL62NzqkoUd01_pzzGplvOV-Ertj35i6Eh2mqA9sCPFHYbw27890zO3EfA0ovGsmr-gFW-yC6fSHQMAd-FrcEX724dq4fx-Z2UMM8j81EAWB9rG6tLSWJACXu0L990Hpjsyaba050ybZK72p8rykzlPkL-lzSqMUcwgWZKRnf3elJZrNPcaBhAJmcIRYfG4-grGRZAwiS-8d4r5JAEy2HFoTVkwdBnoUvqN2aLeN2mhFGaYHskPlXn_76411-6D_Umc54RnXuigJaTe9OPF46hWPEsI2HA8xnHXSqdtDc6RFBRHM9bkGMv6GNMwrXonJI2Wp88hO5_5cuUbsFN5K0N37BhhYbYklEZF_i5sg3XJbCPBAmuDhke3n60JjqU6oUepLTfckMooYNsmtKjdAuLEZ4Fc96LoPWmYQwqEfxnQjvs3u_m-rYd367rFb-vo4pkCNQmQ2vu9AXuQ8N3-hyoKZfSp7jCHO1jOarZ-fqxU=s725-no";
    Button btncomprachiccoduotrio3;
    Button btnconsultaa3;
    TextView txtchiccoduotrio3a3;
    String urlcomboa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=10b707b0fb3a97de75c39d0f2eee046a";
    ImageView chiccoduotrio3a3;
    Button btncomprachiccoduotrio4;
    Button btnconsultaa4;
    TextView txtchiccoduotrio4a4;
    String urlcomboa4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=faeb1b3afa9d330cbedc7200a8a47e04";
    ImageView chiccoduotrio4a4;
    Button btncomprachiccoduotrio5;
    Button btnconsultaa5;
    TextView txtmodelo1a5;
    TextView txtmodelo2a5;
    TextView chiccoduotrio5txtdesca5;
    ImageView imgmodelo1a5;
    ImageView imgmodelo2a5;
    String urlcomboa5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e8e81fea5c048c70273d2af6b24b6437";
    String urlchiccoduotrio2imga5 = "https://lh3.googleusercontent.com/B9gC3XyeDp2w-KYxa4-Qs85d7yOqul2mof8AooY-QTIfTRdk8vtxw1OVj8ujFFvdYEi4du6AQLtrEiETYwUmHtNKGEO_3VbiQ2MiyeNw7BS9riDNpXZi3z_Dzt0-bQwmohU91GuskHfDjotaLrpmam9_vyvwiVnQsWQqzjj7XBM45_CMrf6YENSGsjiolksodx0j7FbOzMnAgmn1ioB1txYWS3jsh9WPQ3JZCIY8uPdrkY0hPUpLGlyXZZ0cgnI0O7EDEfeVjiXky7csdyv89PrYduNvmRr_8foBlNnppRWiTcvhzQufE_vbb8zwPqtzHzMyKK4a4d2OnrZDg5soQFNf9wawP0-hivUpW83Ej6f2W-EM0RtFbY7S49XatHyFhHibAOXBJHQKtthGko6iLrKMWh59kcte6hWQgZbqZk_-4QWncjMrhbccd_PBDD3v0hjIHmVrjbP30qXelJaA-EbD_zMurmD5FlEIYDF5UrTS-1nLIrOpEkQk94EEvgRuGTt54OC94Q4oTB8lks0-YCB8kYD5_rm4KKyUWuwc1epBVtsQj5dLoa0gq8xGFqRiv5GH7HUhZxu3P3XCQWYAK4O6pBMhqZyqW7wnGT-G6gYeSx3DH292AbKjXmI14Gg8o2xO6lAPPzYVeZ_YF_Y2JQwUxCWdREG4cNMVfdo7kfY=s725-no";
    String urlchiccoduotrio1imga5 = "https://lh3.googleusercontent.com/FC0eG4jsY-N7rn8vfzxurUa26AwqI5TJ3gSX16tGNs5yi29NIP03Z_bXV5hG-vLt_zKQGFnQGk4diFkID9pWW6zHoqeJooUGb9tLjZxQ4cLtYADEB7iPmwuRY42R9olVGd61Q7qnSE0GOXy2qI3ins5NADig-8l-6GS7pwJ8tYqbkZQgU8Sh938exTDSBkVQUVUNAhvaDPqRwdiGulnj3CoyQYGSQnzvqpVlwnA2YQB1zv_GJvUztmHIgDVrKTktnXiMELyRBouaxDZVX9WIXsGldhZFq7e325yUj6xi612BvHivNOjR03b2Fk7uX8AWb1dMmrft7ftBboGpU7oUH_c9jcbdPvzRfyJS37zjnHYisGWtuB4_v9q_mqco7aXbTE1KKd0sWaM87OrQNFgb6sdajLOqW11ooTH8LSpiKMTe-HXVdCPfHzHBO7uDxzbpLVgykdNSPUfuARE1cxFBF_0jjstP2J-S5VxeUlpc0QMexT3-KGuuxdvfb28beEmxS_eAr6MAAZ7r5sas34sa_ExQadVWkd6WqTLQOgx4f7B_MrT-3hNepK1po5mezs2tG9dLgIEYHT4gIt1sozf7GPlP0UWm3FxMYMP6kU53UdYB5VvDLaxhN3hzezTb87TRKsrus-n4mbEAsq-uec-NHrDjPIobnGq5Y7Lshsftctg=s725-no";
    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;
    LinearLayout lineara1;
    LinearLayout lineara2;
    LinearLayout lineara3;
    LinearLayout lineara4;
    LinearLayout lineara5;
    TextView preciochiccoduotrio1;
    TextView preciochiccoduotrio2;
    TextView preciochiccoduotrio3;
    TextView preciochiccoduotrio4;
    TextView preciochiccoduotrio5;
    ImageView chiccoduotrio1;
    String urlchiccoduotrio1 = "https://lh3.googleusercontent.com/5TH1LyOdBkBVjlHhpCAggeT-mCeZw4j2MDbB0sYhwC5K1n-FSjdoG5S4bRPA61pT583WfaKZoqIW7vVWaFILYY16vpj9Wyv4oNGKPFC1Mdg0tdDtjYtkHlDibBE-myUsTrbHI8uT6N77i7KLyJziOuICjXhPP65LkqMptB8sq2FHBvGjwwFW8FbV25az1et7zcUADnxUAk82u0Hmov_XkWFTsNtnHf68AVPrfGaICJrueaCI-sVLka1yNmTnWzb1X_XHABPcEnrbH1gMka67ZilpI2Gau3LxC1PB_3FMtNnSqKqeWmPDvk6lsyWfxC-tbEfJ_zyTeXG8bfx8yJbcV-KqsuCMoram5fN_Gyv4RSkRQFrqOPixZ7olw-dZej79W1Tc-gZ4jPhvvr4V_CZZ0O10JXKiA5LTBzUNK7Ou-HVQq_kuEs2653xIlhp4qF7ErqTubHjh_WuotFFrGPZnioea_VhcJYDEV6RLGjW6El57Q49SHtJhAwNNwkCrHucFQ2ndObTT6T5DXRNXoOniT4337MDNUAhgAsqrOiwwYFTFiP7vpSyBAUGeCU5U1a77ORx5tYq-sJfHuUSiAq9Eajt60JG2dJEHjyeZoxP3jj6Y82gUdO2i7qj74tpQ15qF-jVPlt8nZoM9QkCzj6sRMN6ot6auBjobwLrZx3SuFC0=s725-no";
    ImageView chiccoduotrio2;
    String urlchiccoduotrio2 = "https://lh3.googleusercontent.com/aLCa2bwglHwByQrvQ4HkbTT5UtRQvmGgeZnqorMR49fnXTxVY4-gpkA7Oiqqxh8WLOOuox8yz37qwM-9eNh045pNK_tFrE5ap_nOMC1doqLg1cP96PVdNJ1XS9vh85bPSFGFg80yrqO4Dbp0pSQ4EGtDDWHn5vMQiLBgzzMSM0vOXLKUtydgLw9dBxkUOaf8Nw9mMIVbhGf0c7NXxdq-gb18kNns58aZ-meRZpXsAQ2Oc_-pDH13zdjUGcMWfNgL9EvFJ2uKWrWCRI4RUskIOQEjnnx3gT89uKt3Oy-ueajIenQtcmbLaSEedmz1WhSi-QYYC_C2h-Jpu_672efftaRouM3VfdO7YiUIQyh_30LXufMquQpPKgykbnyjUt755YSHUQZuZ-MTDF22Qdkpm3RAorb6U2tc6CaBQqHs5uG2EKn3fumJYRPKf3EPKXM8IXK6m0cmCvr9kVjf9a1Z2W2DZFYGcrUYnTw-RFbPankNeCAdjmiIKEIqjtPiVYJURKjxPgvOfG_d0FSGcZlBk-EMYnc4_iCaUDIgLEl_svrJ4rC5_RDIFx_khBxoHv5YznZ5DOKSnS9FdKqsXj62Z-WPc-l2CzY6BFEbMoAfVsRx5KU4Ufkoip15atnKLt5HYWBVezDaD1RN3iQ6rLRKMGlGeFMZuzgSpwSxF03xeUo=w725-h726-no";
    ImageView chiccoduotrio3;
    String urlchiccoduotrio3 = "https://lh3.googleusercontent.com/JNuvmCjxnIgtzoLVBO0A2r89g-6Cb0wFcWfcG8uv2a0LD4GCcj5T4RMl6kkGjo9uZSUriyJSoM9EZujHPYQYlEZ3H074ckAU0xnzL87ltCXdBpayRAUweYFqyuYHnRSp3s31n-FfE63XfOvYz9H3yMbpgRDFCYckY4h905jT6S_ueM2FsjRjfoofWCyI4c6rNoXUODOWYxztDFBLvwghxYuujz39e6OlVxjkDZ160HQxl6hsDTJ9xr96mRM9xrvViJ8teyifmFtD0sbIQAln4Dx7ofrSyx5VV-EF1tBlLqOaxSHl6dCXidOuHUcsZ4OZKz06vVnSaGDl3e8_5wqMa0xGGWsegqYf7-DAhkc7wjlXTKlqsjpg8SpxjG3Dj9vGnZKrcSjBzRFZNuH_X6Oy8IFUBbR8_TCKaYNTEPeEI5ivDTGkQlX5_RaiwWJxmJR0ifSS7vYp5C6UoUP7GNXYPXlEfhmJ0wNr5_vPackbAzK_OmoApWkT-qwqj8XrWKYcqg0ipJaNWjO4zQTst-kUvYJwUq_eOk1IIQ3qxmB2vOQGqzVvxfwhMVVFE7O8bAom3tdfad1B-5PaHXvSAD1pe1zWlUrUiZ53gZbLHKkxWE3ndun1KvUCtjf-m3CgiwXSyaciPCOQLJPsolHgT4vm2L7mgJEa9ZaHBFmQgY2TYBU=s725-no";
    ImageView chiccoduotrio4;
    String urlchiccoduotrio4 = "https://lh3.googleusercontent.com/7C5p46FPe0UL5jV0sb5wVPWA8wg1UB_wBpXBFZwYDEijYUDNAertxkzYMAPo08Rkku5Y1KlMbIsPyftIb_TTa7liCPMHzlSLveGNocjVCtROKKP85QqpMspEGsEZagLlRG9XgCFGpBeKDvNMEBc4MSjeDjt6gmPKYc2g_2j_A6AZ44a1o3s9ot1HFFXD3nekCK7Dbv2guo9pycwdaeNGMk5Yp-GdOCi1IqgIbsmyAmwvOAu3uYfgUuzQ1gTZh0jh_y-D1x6Zr4Tu5MB5zXscCJzZAbQw3yjv3rDiu35ccxnmzM-xj7hoy4PWrBUfFUep1FhdLS5N--NQzm2g842eJfZ6nbI-OmXX8ilkPJ2vTT4bqhlgUMw0arx609-lu497j3xfqIwGtF9AmEvnsbi0YW9lizLh4nrwm0vXuvWhkcjU9goRDz7cyeSTymagCOPBfMjHryocJeTuMKvJY2uFjTD9J28q8HUhnweGDBmKze4-q-d_Sl3Z7nn2s4q7r-NcP5b-FoeHxeRAy-bCaK-i-rME9QAhfQWsBxfafDk115OunQFXCNB6D0L_kJsjHbzTnlHyCv1zweLgiD6l8c-YmoQfmAHV50HwgTlK222-luP5r1fHkQc4lV1HMOMqZa2wqYMdB8UcbxZlx6ARZ7rJvLUrRaP4b4sMjeV_DAoRSiM=s726-no";
    ImageView chiccoduotrio5;
    String urlchiccoduotrio5 = "https://lh3.googleusercontent.com/B9gC3XyeDp2w-KYxa4-Qs85d7yOqul2mof8AooY-QTIfTRdk8vtxw1OVj8ujFFvdYEi4du6AQLtrEiETYwUmHtNKGEO_3VbiQ2MiyeNw7BS9riDNpXZi3z_Dzt0-bQwmohU91GuskHfDjotaLrpmam9_vyvwiVnQsWQqzjj7XBM45_CMrf6YENSGsjiolksodx0j7FbOzMnAgmn1ioB1txYWS3jsh9WPQ3JZCIY8uPdrkY0hPUpLGlyXZZ0cgnI0O7EDEfeVjiXky7csdyv89PrYduNvmRr_8foBlNnppRWiTcvhzQufE_vbb8zwPqtzHzMyKK4a4d2OnrZDg5soQFNf9wawP0-hivUpW83Ej6f2W-EM0RtFbY7S49XatHyFhHibAOXBJHQKtthGko6iLrKMWh59kcte6hWQgZbqZk_-4QWncjMrhbccd_PBDD3v0hjIHmVrjbP30qXelJaA-EbD_zMurmD5FlEIYDF5UrTS-1nLIrOpEkQk94EEvgRuGTt54OC94Q4oTB8lks0-YCB8kYD5_rm4KKyUWuwc1epBVtsQj5dLoa0gq8xGFqRiv5GH7HUhZxu3P3XCQWYAK4O6pBMhqZyqW7wnGT-G6gYeSx3DH292AbKjXmI14Gg8o2xO6lAPPzYVeZ_YF_Y2JQwUxCWdREG4cNMVfdo7kfY=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoduotrio);

        new chiccoduotrio.preciochiccoduotrioAsync().execute();

        /* chicco duotrio 1 */

        chiccoduotrio1txtdesca1 = (TextView)findViewById(R.id.chiccoduotrio1txtdesca1);
        final String stconsultaa1 = chiccoduotrio1txtdesca1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(chiccoduotrio.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });

        comprarchiccoduotrio1 = (Button)findViewById(R.id.btncomprachiccoduotrio1);
        comprarchiccoduotrio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccoduotrio1 = new Intent(chiccoduotrio.this, webview.class);
                comprarchiccoduotrio1.putExtra("string", urlchiccoduotrioa1);
                startActivity(comprarchiccoduotrio1);
            }
        });

        chiccoduotrio1imgrojoa1 = (ImageView)findViewById(R.id.chiccoduotrio1imgrojoa1);
        Picasso.with(this).load(urlchiccoduotrio1imgrojoa1).into(chiccoduotrio1imgrojoa1);
        txtmodelo1a1 = (TextView)findViewById(R.id.modelo1a1);
        txtmodelo1a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoduotrio1imgrojoa1.setVisibility(View.VISIBLE);
                chiccoduotrio1imgnaranjaa1.setVisibility(View.GONE);
                chiccoduotrio1imglilaa1.setVisibility(View.INVISIBLE);
            }
        });

        chiccoduotrio1imgnaranjaa1 = (ImageView)findViewById(R.id.chiccoduotrio1imgnaranjaa1);
        Picasso.with(this).load(urlchiccoduotrio1imgnaranjaa1).into(chiccoduotrio1imgnaranjaa1);
        txtmodelo2a1 = (TextView)findViewById(R.id.modelo2a1);
        txtmodelo2a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoduotrio1imgnaranjaa1.setVisibility(View.VISIBLE);
                chiccoduotrio1imgrojoa1.setVisibility(View.INVISIBLE);
                chiccoduotrio1imglilaa1.setVisibility(View.INVISIBLE);
            }
        });

        chiccoduotrio1imglilaa1 = (ImageView)findViewById(R.id.chiccoduotrio1imglilaa1);
        Picasso.with(this).load(urlchiccoduotrio2imglilaa1).into(chiccoduotrio1imglilaa1);
        txtmodelo3a1 = (TextView)findViewById(R.id.modelo3a1);
        txtmodelo3a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoduotrio1imglilaa1.setVisibility(View.VISIBLE);
                chiccoduotrio1imgnaranjaa1.setVisibility(View.INVISIBLE);
                chiccoduotrio1imgrojoa1.setVisibility(View.INVISIBLE);
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

        /* chicco duotrio 2 */

        chiccoduotrio2txtdesca2 = (TextView)findViewById(R.id.chiccoduotrio2txtdesca2);
        final String stconsultaa2 = chiccoduotrio2txtdesca2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(chiccoduotrio.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });


        btncomprachiccoduotrio2 = (Button)findViewById(R.id.btncomprachiccoduotrio2);
        btncomprachiccoduotrio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprachiccoduotrio2 = new Intent(chiccoduotrio.this, webview.class);
                comprachiccoduotrio2.putExtra("string", urlcomboa2);
                startActivity(comprachiccoduotrio2);
            }
        });

        txtmodelo1a2 = (TextView)findViewById(R.id.modelo1a2);
        txtmodelo2a2 = (TextView)findViewById(R.id.modelo2a2);
        imgmodelo1a2 = (ImageView)findViewById(R.id.chiccoduotrio1imga2);
        Picasso.with(this).load(urlchiccoduotrio1imga2).into(imgmodelo1a2);
        imgmodelo2a2 = (ImageView)findViewById(R.id.chiccoduotrio2imga2);
        Picasso.with(this).load(urlchiccoduotrio2imga2).into(imgmodelo2a2);

        txtmodelo1a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1a2.setVisibility(View.VISIBLE);
                imgmodelo2a2.setVisibility(View.GONE);
            }
        });

        txtmodelo2a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1a2.setVisibility(View.INVISIBLE);
                imgmodelo2a2.setVisibility(View.VISIBLE);
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

        /* chicco duotrio 3 */

        chiccoduotrio3a3 = (ImageView)findViewById(R.id.chiccoduotrio3a3);
        Picasso.with(this).load(urlchiccoduotrio3).into(chiccoduotrio3a3);

        txtchiccoduotrio3a3 = (TextView)findViewById(R.id.txtchiccoduotrio3a3);
        final String stconsultaa3 = txtchiccoduotrio3a3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(chiccoduotrio.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });


        btncomprachiccoduotrio3 = (Button)findViewById(R.id.btncomprachiccoduotrio3);
        btncomprachiccoduotrio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccoduotrio3 = new Intent(chiccoduotrio.this,webview.class);
                btncomprachiccoduotrio3.putExtra("string", urlcomboa3);
                startActivity(btncomprachiccoduotrio3);
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

        /* chicco duotrio 4 */

        chiccoduotrio4a4 = (ImageView)findViewById(R.id.chiccoduotrio4a4);
        Picasso.with(this).load(urlchiccoduotrio4).into(chiccoduotrio4a4);

        txtchiccoduotrio4a4 = (TextView)findViewById(R.id.txtchiccoduotrio4a4);
        final String stconsultaa4 = txtchiccoduotrio4a4.getText().toString();
        btnconsultaa4 = (Button)findViewById(R.id.btnconsultaa4);
        btnconsultaa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccoduotrio.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsultaa4);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccoduotrio4 = (Button)findViewById(R.id.btncomprachiccoduotrio4);
        btncomprachiccoduotrio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccoduotrio4 = new Intent(chiccoduotrio.this,webview.class);
                btncomprachiccoduotrio4.putExtra("string", urlcomboa4);
                startActivity(btncomprachiccoduotrio4);
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

        /* chicco duotrio 5 */

        chiccoduotrio5txtdesca5 = (TextView)findViewById(R.id.chiccoduotrio5txtdesca5);
        final String stconsultaa5 = chiccoduotrio5txtdesca5.getText().toString();
        btnconsultaa5 = (Button)findViewById(R.id.btnconsultaa5);
        btnconsultaa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccoduotrio.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsultaa5);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccoduotrio5 = (Button)findViewById(R.id.btncomprachiccoduotrio5);
        btncomprachiccoduotrio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprachiccoduotrio5 = new Intent(chiccoduotrio.this, webview.class);
                comprachiccoduotrio5.putExtra("string", urlcomboa5);
                startActivity(comprachiccoduotrio5);
            }
        });

        txtmodelo1a5 = (TextView)findViewById(R.id.modelo1a5);
        txtmodelo2a5 = (TextView)findViewById(R.id.modelo2a5);
        imgmodelo1a5 = (ImageView)findViewById(R.id.chiccoduotrio1imga5);
        Picasso.with(this).load(urlchiccoduotrio1imga5).into(imgmodelo1a5);
        imgmodelo2a5 = (ImageView)findViewById(R.id.chiccoduotrio2imga5);
        Picasso.with(this).load(urlchiccoduotrio2imga5).into(imgmodelo2a5);

        txtmodelo1a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1a5.setVisibility(View.VISIBLE);
                imgmodelo2a5.setVisibility(View.GONE);
            }
        });

        txtmodelo2a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1a5.setVisibility(View.INVISIBLE);
                imgmodelo2a5.setVisibility(View.VISIBLE);
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

        preciochiccoduotrio1 = (TextView)findViewById(R.id.preciochiccoduotrio1);
        preciochiccoduotrio2 = (TextView)findViewById(R.id.preciochiccoduotrio2);
        preciochiccoduotrio3 = (TextView)findViewById(R.id.preciochiccoduotrio3);
        preciochiccoduotrio4 = (TextView)findViewById(R.id.preciochiccoduotrio4);
        preciochiccoduotrio5 = (TextView)findViewById(R.id.preciochiccoduotrio5);

        chiccoduotrio1 = (ImageView)findViewById(R.id.chiccoduotrio1);
        Picasso.with(this).load(urlchiccoduotrio1).into(chiccoduotrio1);

        chiccoduotrio2 = (ImageView)findViewById(R.id.chiccoduotrio2);
        Picasso.with(this).load(urlchiccoduotrio2).into(chiccoduotrio2);

        chiccoduotrio3 = (ImageView)findViewById(R.id.chiccoduotrio3);
        Picasso.with(this).load(urlchiccoduotrio3).into(chiccoduotrio3);

        chiccoduotrio4 = (ImageView)findViewById(R.id.chiccoduotrio4);
        Picasso.with(this).load(urlchiccoduotrio4).into(chiccoduotrio4);

        chiccoduotrio5 = (ImageView)findViewById(R.id.chiccoduotrio5);
        Picasso.with(this).load(urlchiccoduotrio5).into(chiccoduotrio5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoduotrio.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoduotrio.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciochiccoduotrioAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=27d8e203c90fcd24ffdf3cb4852b5cde";
        String preciochiccoduotrio1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e29dbdebd15b27b8fc030402d90939b3";
        String preciochiccoduotrio2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=10b707b0fb3a97de75c39d0f2eee046a";
        String preciochiccoduotrio3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=faeb1b3afa9d330cbedc7200a8a47e04";
        String preciochiccoduotrio4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e8e81fea5c048c70273d2af6b24b6437";
        String preciochiccoduotrio5st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciochiccoduotrio1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciochiccoduotrio2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciochiccoduotrio3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciochiccoduotrio4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciochiccoduotrio5st = metapropoerty5.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciochiccoduotrio1.setText(preciochiccoduotrio1st);
            preciochiccoduotrio2.setText(preciochiccoduotrio2st);
            preciochiccoduotrio3.setText(preciochiccoduotrio3st);
            preciochiccoduotrio4.setText(preciochiccoduotrio4st);
            preciochiccoduotrio5.setText(preciochiccoduotrio5st);
        }

    }

}
