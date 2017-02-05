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

public class chiccojuguetes extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes1;
    Button btnconsultaj1;
    TextView txtchiccojuguetes1j1;
    String urlcomboj1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f11f905a81410a416d3239aaef4ebb06#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes1j1;
    Button btncomprachiccojuguetes2;
    Button btnconsultaj2;
    TextView txtchiccojuguetes2j2;
    String urlcomboj2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3182c7e12be43e667ddb0feca7bb45d8#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes2j2;
    Button btncomprachiccojuguetes3;
    Button btnconsultaj3;
    TextView txtchiccojuguetes3j3;
    String urlcomboj3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=35d097e106cb6dbbfbb4aa286acf5796#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes3j3;
    Button btncomprachiccojuguetes4;
    Button btnconsultaj4;
    TextView txtchiccojuguetes4j4;
    String urlcomboj4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=af43bb95016ec5c0b45d7c9fb6c787e0#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes4j4;
    Button btncomprachiccojuguetes5;
    Button btnconsultaj5;
    TextView txtchiccojuguetes5j5;
    String urlcomboj5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5662bd5f5b710f518e70e179a6038272#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes5j5;
    Button btncomprachiccojuguetes6;
    Button btnconsultaj6;
    TextView txtchiccojuguetes6j6;
    String urlcomboj6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=889db988d9b7bce05b84e6930cdc5483#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes6j6;
    Button btncomprachiccojuguetes7;
    Button btnconsultaj7;
    TextView txtchiccojuguetes7j7;
    String urlcomboj7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c57a7c1548976f9364e2cc9df3791935#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes7j7;
    Button btncomprachiccojuguetes8;
    Button btnconsultaj8;
    TextView txtchiccojuguetes8j8;
    String urlcomboj8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=223004d699e041b0a06aeed56a2b01e0#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes8j8;
    Button btncomprachiccojuguetes9;
    Button btnconsultaj9;
    TextView txtchiccojuguetes9j9;
    String urlcomboj9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=badce095a082b537d3b879b73343fddd#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes9j9;
    Button btncomprachiccojuguetes10;
    Button btnconsultaj10;
    TextView txtchiccojuguetes10j10;
    String urlcomboj10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=84f7df372898b3acd5d7103e7fca8ff3#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes10j10;
    Button btncomprachiccojuguetes11;
    Button btnconsultaj11;
    TextView txtchiccojuguetes11j11;
    String urlcomboj11 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=77e2843e77613d0bd52e99f6618fc069#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes11j11;
    Button btncomprachiccojuguetes12;
    Button btnconsultaj12;
    TextView txtchiccojuguetes12j12;
    String urlcomboj12 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0b690a894109a8c8cfe4bc06259c7297#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes12j12;
    Button btncomprachiccojuguetes13;
    Button btnconsultaj13;
    TextView txtchiccojuguetes13j13;
    String urlcomboj13 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4e277adffcf7ac5036e0702225f86d54#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes13j13;
    Button btncomprachiccojuguetes14;
    Button btnconsultaj14;
    TextView txtchiccojuguetes14j14;
    String urlcomboj14 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1e201c5df31b117d4b988ca75d227457#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes14j14;
    Button btncomprachiccojuguetes15;
    Button btnconsultaj15;
    TextView txtchiccojuguetes15j15;
    String urlcomboj15 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d80acfc820299912861725f50e55cfcb#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes15j15;
    Button btncomprachiccojuguetes16;
    Button btnconsultaj16;
    TextView txtchiccojuguetes16j16;
    String urlcomboj16 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=95eaf2695872226cfa88a609f7ce481c#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes16j16;
    Button btncomprachiccojuguetes18;
    Button btnconsultaj18;
    TextView txtchiccojuguetes18j18;
    String urlcomboj18 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=fc5fa688bdcf73e8eca1d2c50c36220e#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes18j18;
    Button btncomprachiccojuguetes19;
    Button btnconsultaj19;
    TextView txtchiccojuguetes19j19;
    String urlcomboj19 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=20c810577863c40ade26d1f9b179e46b#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes19j19;
    Button btncomprachiccojuguetes20;
    Button btnconsultaj20;
    TextView txtchiccojuguetes20j20;
    String urlcomboj20 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8c08b9ef758bfee7c7b61c2edebd5730#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes20j20;
    Button btncomprachiccojuguetes21;
    Button btnconsultaj21;
    TextView txtchiccojuguetes21j21;
    String urlcomboj21 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=414a00047c3e34830aebd30c676a254a#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes21j21;
    Button btncomprachiccojuguetes22;
    Button btnconsultaj22;
    TextView txtchiccojuguetes22j22;
    String urlcomboj22 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f0ded81c62129f9bcc4372beda3a0ae3#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes22j22;
    Button btncomprachiccojuguetes23;
    Button btnconsultaj23;
    TextView txtchiccojuguetes23j23;
    String urlcomboj23 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e0376bb6ddc16b878a78cd6d57e417f6#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes23j23;
    Button btncomprachiccojuguetes24;
    Button btnconsultaj24;
    TextView txtchiccojuguetes24j24;
    String urlcomboj24 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1a09716809958c11723ba49f91d6ff02#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes24j24;
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
    Switch switch11;
    Switch switch12;
    Switch switch13;
    Switch switch14;
    Switch switch15;
    Switch switch16;
    Switch switch18;
    Switch switch19;
    Switch switch20;
    Switch switch21;
    Switch switch22;
    Switch switch23;
    Switch switch24;
    LinearLayout linearj1;
    LinearLayout linearj2;
    LinearLayout linearj3;
    LinearLayout linearj4;
    LinearLayout linearj5;
    LinearLayout linearj6;
    LinearLayout linearj7;
    LinearLayout linearj8;
    LinearLayout linearj9;
    LinearLayout linearj10;
    LinearLayout linearj11;
    LinearLayout linearj12;
    LinearLayout linearj13;
    LinearLayout linearj14;
    LinearLayout linearj15;
    LinearLayout linearj16;
    LinearLayout linearj18;
    LinearLayout linearj19;
    LinearLayout linearj20;
    LinearLayout linearj21;
    LinearLayout linearj22;
    LinearLayout linearj23;
    LinearLayout linearj24;
    TextView preciochiccojuguetes1;
    TextView preciochiccojuguetes2;
    TextView preciochiccojuguetes3;
    TextView preciochiccojuguetes4;
    TextView preciochiccojuguetes5;
    TextView preciochiccojuguetes6;
    TextView preciochiccojuguetes7;
    TextView preciochiccojuguetes8;
    TextView preciochiccojuguetes9;
    TextView preciochiccojuguetes10;
    TextView preciochiccojuguetes11;
    TextView preciochiccojuguetes12;
    TextView preciochiccojuguetes13;
    TextView preciochiccojuguetes14;
    TextView preciochiccojuguetes15;
    TextView preciochiccojuguetes16;
    TextView preciochiccojuguetes18;
    TextView preciochiccojuguetes19;
    TextView preciochiccojuguetes20;
    TextView preciochiccojuguetes21;
    TextView preciochiccojuguetes22;
    TextView preciochiccojuguetes23;
    TextView preciochiccojuguetes24;
    ImageView chiccojuguetes1;
    String urlchiccojuguetes1 = "https://lh3.googleusercontent.com/BO_bcxxTZW_RPK4qKwmvWnYKxUkCAC4X6zXR_oDFw3cD5KaoGdeEsdmxJOtMPZUDlEL9AOQkAWwzP2kcuiGnpG5JSurinXL7nuregOuDybplwNCZbmmKsGQkhKVwvm_XG1JlIkOZM68pCg-xPqClWMSCGCZQGpvPKPUVKRR7WiClGYnBp_QoF-6AQe-l0H60peY1KO-MCN5QUvxfSfA8GymvIHciws47G3YMQ_CvNret66FZfkPsmOFkQjsQJ4aqR4LcmIPQHnHvOl1qYIu7z93axJAgtbLxT7LtdjUF7qdAbzCvcMsF_3HDkHL3rclVTPsA3fFYMKGhQ0aYBy4Ywo1Zw6ByUxQm0gYg6UrixRmQb57p2QHpHFx_Z5K3RFJrX-NuP8HVwuKrGtorCCZK6dP8FX-NGSBTyWPC1WUOrEzYyJw_rYzAZqF6I5zr8XHtDgR06Rm3feKHuT3B4G5263nUkfH3TnRXB2lnwAa-Imb7gBIK35paMO_lKKZhm7Cy0XKv8Pahuw3EN3MBX7BFmeYBaRD0SeT56WYY6AIRu5KhQ3dZL_x_ycm3ZyK_QmZvHsNvWGtgBRytfFAwnyVRMJmrt25AdiguoJgX-JLQeTLVWzWTtTRCq_SrdX6ag4m_uVabZDu4Nixhq_S1oN9AQqdJHyqm5NYNTVGCgTW1v94=w452-h451-no";
    ImageView chiccojuguetes2;
    String urlchiccojuguetes2 = "https://lh3.googleusercontent.com/2x5NU_TCWiHKY1L4XbPfakjTcEH3jFlNKldLY6a8-st4mXlB2ORrksc2nrACrORZZ_K25j2N-kv_DlWJ6-2CEtBLCxxuWV3jEjxMt2MKzwKD8ONdXDDWpvDq46oZmmGeA2xORQe0IXmaVaENKA2ZDAp3LicmOy9RZCjcH2Vc2NkFoZAfYwB01w7GM85yyC67hlz2Kq4pC-nH50ZZ1GUyJMnA8NX-Kr7FH7hX29X6XcRAllWg3Hb_mmrLa8SwlBjhz4jgQH4qFx3XWf97OAcxud3-NHMRUR8jb7bwzXq_uC8b7_JBuEoldaYKM-ED6Wg2lyH2abnWEzt_CkVqrMIh6ov804gOM_ovYI520Ieiz4K2I71h8EwvrK_IMrOK1W07dyDqejCUsyyE4Xil_xEZPvGjEI9TZNBxkfQcMQ3HBps1wkBSGx3JbfRKZx7hyPGGthZdK7UT7rM4T2oD9y-btnnNOJmg_NvTFq8a7o-gZFTa_-G-MvfKH4ewJ1hBHYEFiVcb9g9wVo0Q81Hyxq65AFg4YckKRqmAsuDxLV_5IUc7VI1pS1TioZgnCDy44HAbDkKqxt4ycvQRO95-6qq56AAERxN779KoI2LbUHkrkU2UmAY08FRoORDA56-EKrRFGj_Xhj6NRTWWScf5S_fziFEpRaRHVh3M15oOiR16uWM=s451-no";
    ImageView chiccojuguetes3;
    String urlchiccojuguetes3 = "https://lh3.googleusercontent.com/f5kC3v2OpMBJcurNDYwTT6-itC2qGvteD_dkUFmi1ec4LQHxR_dQ78jzAazz1roKkFZBRQ0XupboyKF_74ciohshowbbOiSFSA8hcvST8nNAP_fYx2pSuH6UPU4gBWR1-LUKXSrwpdRH0sJuOQJc7OKHbPpUkRn36syuKAcLZ8mcCGpa0-C7C-fi1775MeLIhlyE9UmkoyqJ9QDA53U9IY1rK476GpVszJMK5Am5XAYB3miaGQNKIQWXAMAl5HwyTwRTCOpL9yKpf5-jFMU_VP_HfWepUEoRfQHe_muKULMdnfk8O3u44XK_QZu4c7aZMV9FwZ9rqAR4KT4IoJSHqQD-mHVUTphcUWJbhPsaQOfoO5JtPcLWEPec60kTA1Hl0HaMGy5rIxHmgm0mL701tD8XxwXW2AQUNRlzQu-Sh0xl7UXqqW4oqK1mCDwoDYlpTMB6yxMZfp3PzW6mAKCsGvy2jPOjJ6HDJvNeH_P8VLk7Ev6s7IRfkjdA8O2RIO0JFEWOry2Ueqiz_NYWYfWslLZjjBBbvF1BVgyBP9aVjGAANMLsGyKMqaqtL6mRXmHzDQj-agTXRcXl65WjMJSS4-FNb0BDo6eg4D2LUH9r4guCeS5QhNvLLjk2lbcjzMclvAKJ5A2v98NG_XC6XyVQkqKpRXtANQU7S4MXCZTqFIk=w396-h400-no";
    ImageView chiccojuguetes4;
    String urlchiccojuguetes4 = "https://lh3.googleusercontent.com/E1KzRFeZ6Uz4wbvdJqbuDZp-sZr7Tc4870zGjj5WKjbUpZ7s2okCYpDNiLBIahBwlYLHnp84OdG89PBeIfRe4ue4qI3Ss5JhvKJRF657DuyuX3BfuA09KaPqUl5uExVWmfQ3P-s2LCGPzdm-qw9KgzDsR0H04CUspouqGpSXgJZoId5PL--EdqDNV-1pawEy-jxoEGu4vtzkEENu1oHmwq6J4H35Vq4kZC0no03jbOC86TvBi7PHlfar8elNV0IMbPcfhMPmkz6MdeaOgqt-h1f15KxoVN6eh5aaNsfmNAOUKzps9sL2J1b45DRZF_nTxr5lRhFgzBpkGWktkX1L3f7V6Btp7stKbgxBeFfT4qo4GR5SBWytSzYJ4d23UXsNRikhWec8bGYWZxYoOh5OtMHQWOPy5rJsZo2HwiVTJAoaNSWV3A78JJVQXNZFUBSsMbVMK47Lsgd0-2cY9H9GoeoZoAL1i-BaOyA8JY3gUbnrDcrvtZACMbNOaXkPu2O2hYkJ1IbgtMDnfqj3WeWuQGa-wbW0ozPzf3comh7Q-LSIa_qPpLQJBEkfWzFPYodKnK6hMvUN_UAbZ_OvLEeBElnHfmnHF1WfTsOboNy0GR5YN4DlPCY37L0OzR3cmK77SAEEvFvKSDn9M444eSKKX_ZIY-A2lJSK_HWyAyqqWbk=s400-no";
    ImageView chiccojuguetes5;
    String urlchiccojuguetes5 = "https://lh3.googleusercontent.com/KUh2JFW5c6IUhbBgeDmglGTjXgr28yfFr3SVCBJGlpfNyPZTdtkVXN0vME57c_97S7StpFvXpbqVJnW67JnJfREjeVMrL_biHtPvJRWu0Qxil2tNeWy77qGzgcuUxpNoSLFJjoxSu09R3Lh4JU7j4df9RBBLJAXB2VIL7d9-PlBW_KBvEdcgeyPoMjXZ6I43YAKlHYjj3DIfoFKZFU5jc-eQvm70rc5V-eEIM-dM1g48OM8TEnwrj_sPj1-On2XsjignSpUFUP-OcaSe4xTXb5HtDAQN4A1TXp5SshwwgoZBJvQWTct6tHtxgU_7HwVWzYS930MRhWAm1XeD3ESgtaC8mb9oB0nEsBjLCEp7YPtbRgk0KQlrykeaKhPPJVq_OkJusOwyTnon_AaWtVCuPP6FmGE0EwICCnxxD4dhGjsNx-sZ4TOASslwhf7SCyVMDB3RVMQiC0bI_Etz9vIQw5FE4h4DvFSV727S9gPqVJkwxIggeOUlIU1iBD8-st-JDoQ7skb78r_1BNc8deWWkH33z9gUE4OBiDF3aNruRimQK0yGacbPTQwyk0yx-RDTFck_a-mWND2v1VHcGsxMH1UGqDymisYFyYNG_gn9OKfCbqFtopnXTCy77mLIc3OrCm_9UuvakBJbbYSm0uZr8JA8b5DPVd4wdSqz1cblLec=s400-no";
    ImageView chiccojuguetes6;
    String urlchiccojuguetes6 = "https://lh3.googleusercontent.com/eu5HGjQbu7UyXe20yPvoOfEi2PJj-e12VamYg-XI4TxiHTLKR9YZRngw68b7xSKeujnWijVZuFd0DoPu0Sh-MtDxcnd-8qDQpmc4C9dr8tn1tr6VCLhR_MZ5O78QyDbJo349Lg1grV7pKi7Py6AYrRSEFHnnDKK98BVmYiqce5e-tOg9nEbmQluVKgd0CfJ7OSBksg6fFd9Tr48sc7XZ1Ejmmsko1sQHE1hxlzeMH03-hRGrhO-0j0V4aCdGkw7K9skA2AE-HstRP1OnKNQF-dmbPNZgAYS5imkjVnQGsvtTyq0RLOQpwPoqAbPrKK1A0xHAs52GCD_tniKUAUzXIlJfOlAN6Vw4Hlwx5Nng52Phz3judSrX-7qSEJEAAdr9UpMREQ4S4P164WV_rKx9E8Ye2ugW9Pyzrzbze8eY3ZDfPaOn4FDuc_JSEmgJ-aquEWNzCq9L1nnXozdY7knIJQQI17tHjyLcqwW5NDDyNYYpTHkPIeq21WTeRQkpau-RQgA0UWba3O_4MAXByuSgmicrNzT5GP-dBwj1WjQequ5CBgt01jwBHesexIbzGi9kn4SfjBNfRLLsetAl-uIR2aNOq5AJBISQADmjXZVSYus9J1v8c048C0M5sxZIvrxWmsS9u4Vsrrv0sUx-ge03FJ7FZN3ndiKW7nKiH6UwLR8=s400-no";
    ImageView chiccojuguetes7;
    String urlchiccojuguetes7 = "https://lh3.googleusercontent.com/XIPlAE3UrhH13lQA0hiHNwFQzB_82L8Dekf2HtKx5hzXkUAk0QHuhKqfuB3w79ZRJU9s4SJ-L14_RmkmmEP8LvjAfK1p9CEC22kYsW1mVnlnbp6hT7S02HT0EAi1vymT3vMx9W67YQ6tybcQwTWzjt_hQL_9aGwmRrnDhfZCOagt796W1y-fxd2kdWrx9Si_rDCIqKPqn_r8fZLk6Jul57QX8LIHS1-EtnJKezoCiK-fuiZgTx-314a9foHqNtrJaomw9KGh_KQY3Y1v9nVOIjiVELo4gQxQdVDM2DXvW_WAtviLXXFjB4FLzjvf5386HUfTr65Wbg-VRsKuRyAGnsmTb0FdEFaKwzeq6nHHQjk7Kpf7o49m5WN_EjBvxPKvRH84RRr8yue5m36dh8yAIs-gIstk9OOiXTt2ZTVVcA8IldqmuxcnmBwEwcfEZob87coC3ySjF1La4WhvsSkMqCw8jNgm2PVyJnKReiXIAxiS6BGqyZS11FmxoWKnmuAnSYWQeihGWXLhqd71t0rbEVTjqzvzmHkj5o6Pwbshq_1qhAnb0RAvByvSOHnnyFdF1PFW-s_wlLgYVLC00HA28b00BBJ4IFXkMcnExsp_4HG6c1-fGCL1DDrcSc8R_wq0ytdnwg1SVfSwTGW7_Ks66uFwynxiSStYAyunEJEHwd8=w396-h400-no";
    ImageView chiccojuguetes8;
    String urlchiccojuguetes8 = "https://lh3.googleusercontent.com/T8XlqbSl-w2D8zvRl0pY5-T4yOl1lqrWYWarIEMDvy5YC-GdSSYOomqtJCPwEoinF-W6uxTC8_Vt5VtQvxF0kzzHx1BdAnc-W9hjpsoIsnNuczmLSOVMdnLella0nyIoSy52ZoXp_NtXmt699aU4S35Iuz3fkijEnpd8Vb3HenAP0kLnN3QupiUuu7pIIs1aDB-ClElN8T8sUaTS8va9dS0OKLReSPTZocQdLuIQo2H7THAQwIRmWhnZiF9aps0eGiYG3dCf2ITTWXqjfE-3g8OH19B4vs61JvO_23-1fyuzm65atDb4eJf0LdG7obChjObBtjqbALCisAB2k_s1wQXanSENtn6urAY1xZmSUaviYPDgxOVrpI1f7Cd1QwS2CnESwF57Fatgy2K4MwUDN_tt2VvOwrP3DGhCdVXCCUBV95QtCUPee8yVa8aQEZJybEcH7hUOdJSoWVMLgmOUZMmeWeWGnRgHHuayhxZV8dDPTaGzyh-MXBzEkkORBtlI3TQabGayhxkZ42gvXdrmqATVjHAUPEBYe4-1mRvMXJJsf5czsEt7nkKeFsdZtAa2caRaO1_H6d9nLv2iJZI3Gnd0Lprg9MZX7i0GChaZmmxWXUmLhZ94s-0O9OHQTFj8nXcIQjh2LLzmp9-OkmlmvNDvQcmveOt_xqZWN38rjng=s400-no";
    ImageView chiccojuguetes9;
    String urlchiccojuguetes9 = "https://lh3.googleusercontent.com/wWmHdr9mSzmsTGoMs-gmolAln8YPGEos_zRIBGKWjDPwCVzCT7_HnA9KkK42ubGtRz4QySzvCPbKBeYtTrMP2Y6F7yANzkY1B6W9r52qsRVF6BRhuLOah0FrwBPl1ZeYqHoGxeo3syYd8RbOo9tcHfwxAY82h1plLAK7bprWpnKR40AN5IlhutguBYwc0USMYco8L4J2ujDZTmc4BVujnvCmNAKUWKQUWCU9cVc5GSjNwuFIeHkHR35IR_HEXBLkby6rl6TYp6zq96cHbe2AOgzCC-Y9tXKBcAsQvNeSpq1woeSZvXkmlqPh2VxrfcTJ70v1-444jIBov4m3VFyQS_9T_oi4lle157trtct_cMiS7QULsM4YW4EpWu3rqB1PPSIxDJNkIC2pPGFVP_w2n9HP373YvNfyUaq1v4BzU8rrnv1hMczvdOleXzQK0jklVXBInf6gH7fohPWqtD4Vr7wR1-xjOVqJYmnBUmQLPhEvIzFfjBTL5TLFinPv51SfnBblC0h3IQ3T_n9l1wSGImMmjW3L-p08zBoRRVjjeiBzwB00FRjfZi_YfWrTjoRdsjWR4zoG--W16DOhvINUkA41xweGT0WuNjlg453bTKpPEfPGP8n5o65f8mACCeWMCrwopIP5pqYbUYCtGDJ94xLI11UePNYVUpM44kohVf4=w396-h400-no";
    ImageView chiccojuguetes10;
    String urlchiccojuguetes10 = "https://lh3.googleusercontent.com/OWM2jp1CVBRa1Q-kGgSOseyJrr6YnoVkfKETvmoaa8yfG91bpP4gs1QSf8-fSBhc-dX2CuepY9YoRpxV2R5IJb7q6f2ZEKOrP6geP3DDGhBXtDQnuh1HcouXcHNOvw4dON03eXzLtydUpKxSvBiimeLSaF2l0VpsM5drfXbOenWwjP7WKMB-qhQ-XV0CzJqw7tNhKZAg7NUAiddo1PSNkDnwrUzcYma4N0yCb_nhAUc6xefkqD1AACQ2tnLTkEECIWtd9Q6UooP-rhyrk6WGRQ0BL29HKgTGnAuhTKMZwJFxhwBYFmJcJLi6RpSy6DaoU39cR3Z0wTeGF7LsRiQav-tw8SuxOeQ_bWaLxde5lHuSELQLSp9VixqHQWcZjYJfiq8Z7jsT-CSJurRv73oPygqW2Zcye1_y9KzvQIA5O4KxOysHc8UlZS0Jq5H6p3diZx7r3N3clpdGxjyXXKYCNJiAXT7B67FewJtzGES1BbtacU3LI2MMeQGkkJRSAIXT6jm0ouPWMchp4ah8SW5ZPmJdLshYpgd5Nu2guYA-hMVbRsidfALZmCb-9s9oDBymw4KH79zzs6YIFcdk47fdxoE2B1wi9iA4RQnFEJL2k1IySw0ZqeycrzciSWbiDJ9-N3cQmTEO6W2975SHcPmR5rwI9GAng6OS3_miEl6Jdg4=w396-h400-no";
    ImageView chiccojuguetes11;
    String urlchiccojuguetes11 = "https://lh3.googleusercontent.com/k2TZblnazO1dn-3fp3R49eUbcO2NUohgO8E5SQ8G6fYihjyNVeWFiT_Es9RuuVXCUVztIMy-VAwjwV3vKhwdtG1Yyp1CSC6nSE5w5SazfJRMK0DTABsB6NzCmweTTuO9BGWQaLvEMqHYCtgoYMvmOidEwHnh2R9E8Tn3ASQiIjn9a48riCS2Mmz9weaTnlTemTaAfu2zBXYRxTgWuVzNneddr496Oofac9sw0Ng8z-ObSZBfSnJbncfNDHhL_WWUWRDd6TaNjyoi8Fh3vBvT3tj8hqR4XDDfPP512Y9n2Id73K6NYH_VLt5TsMAWC9lN09weJ0JB5PreuGPRyaonkkh7f4lX_-fRdwCNU7Phn9KhLVHlJVv-C9cymAcl2RfNDvK0U46oXqcNFID2NW6rBnTTKCxxwwZldi2hSOyA4fXD0gkkQopqoh_RR6sCT9CxEv3isVJXEaJTaQA2EzN_Eqh9EFCRHUhni1zC2KF3D6xwLCoa9viuLcjj7SgU3mxcgJguwm4cilcUSSrZ--UaVz0OVEQAxfFExsJQe9fupfg0wxZDOFnbk49Eb_9m216Q11XVUUwdaT3sG4FrNe215MMrcsKrQ_l1xqZRHjaP8ekjxFc3Onja8rZht6qgJvIQlh1IUopnOzOw8GdxcGRHchLyLcZsDzhb9WCwcUtCZSk=w396-h400-no";
    ImageView chiccojuguetes12;
    String urlchiccojuguetes12 = "https://lh3.googleusercontent.com/bybHOktMfaKIj36fdxmNHPp9dYBl0IR_SwFcG7ReL_RUA3BeFi3jQ_n5z_W2SgziwKuYkATKLk-4oXCEuDW1hpmu-f5jsu-7k6xFC_myWoYHnNX95neosTqutN0Aeb05WciWUdzSvPAy0TDNPBO74E-51N8TCD5zVUNly_hVGrv-2_o-Rzn24w4QXK1cQ1aZJYzpFJN2ehbZrmZM9A3n4DXhxcwiGbkXCC45ulFoEhQ5Dh327KJog1zOw0CNGjIolnaTafLLl2DASaCch29-XaGBAocdLN2BfrW0-1GvxCW_hbesdrV5srIq8PIuJ9RouGUOOHTDjJ4B7lcej5BSepwm9coLX0317veVnuviq9iegNkA_lf6MMZSLzHRa1Vke-dgFZD64T_FbPZTF7Hj52UBhIi1xogVOZzh3kLU1OA6YOMWl0HuWtTzeLypCKZT9mG48Qi_ZNYy6UJJRn_xk05HOBo-ICVWuMoQIrjRj9oD2RI4NZ-pRvrrx-VpXp2NMsHZfGQbxzJq2FlpyYEsjOEAZiaWRmdCTCpysTs7Zb30FRmnOmiI8DIkaMKbv7YEYE9m8jF90MwXN_yfB6G8_cHFhitH0NiejuOpuqdnIm-Xz7m0H0qzT-Lp29SrCLKG7IkHAL7eZtenxheh0nYQQDm0CTs08Hw1mO_8BexdBeU=w396-h400-no";
    ImageView chiccojuguetes13;
    String urlchiccojuguetes13 = "https://lh3.googleusercontent.com/2Wj4pTG1JS-He4lLuBwFKyxY5V864gmvbV-xJ8uvtzP7x2bv1aRr2RTE-rvPxE61vQ2qJj_GOqoCfiVaSKlVA6-3sPRGsRa4uKSU72TjVwARoMcYuJ2sFMzuLN2X2AfWUw0uYdWsf2Zn9rcP68SaZZWfulXAKGblne6MmA3uOU_B71wBnSFymGg9Um3bKzkkDvyYZjpuVD1SXlc4m9q-Fqc7wRTNHT-MxLq9YzcvANLNPvV2mfGkWHgSTsv7jvam8tJuFFDVEWhRanbwy3C3Ll443LZ2FWLb-fkE65GdDmEdsB6ipB3FNP7slmxRCNvhhbrN43ZfKLxoGLg_ZNCWI2nD0AOYcFU9QWHdjxSvUWnrfxr2ec4vaSPvkbPjWHeje-C2m9b0VEnSleOIg1DgCz1Ask30qoolj0w9af0gGH-zRh3FYY4fzXwzyIo0Fpg73FWZxCTvhpjzLyoLNbmoKdUiscPfNkIeDotBLN7CMxWGdc50S0Z0IMFm2faRPy2irLZj4X0Elvsv1S_quQqQxcbYo4XsV5-KVSWnCWfIAhVMNZzkwgiRylUgJUsheysRheLWTianuS5kWjDaSiZnG-5r3a1EsV2lc-K8W1DwmkNvpR4Q7gYSdDssnMNP7wqkBCCns0kRUE8f43yn1Ei0_Ph3DvLSs-Om02yhgcJJHg8=w396-h400-no";
    ImageView chiccojuguetes14;
    String urlchiccojuguetes14 = "https://lh3.googleusercontent.com/zpfmoq93bjlDuSqCd7EtI2m7xaZb9tCVq1Pwo-d1F_aCi3vw-nysilRU1-p6oj7FrTgbUDGQoDmLvF5u6pTT3K1LPM5nuS5vH7CjVB32jG-lNEvhnGnB66nDHUdfCTluewKXQ42ZDigW_WApoxriE6jHLaXEYjFYh4NRk0h04b2pP_iopWgzfkhZGfZDo57_QvNii3FYnnVcYczi5GIX75lt2_FsC0KwW28s1_aRbwQk05cWWaCEeelQ7z0eyJR4-hvoJT7Qn7rMa8OsKtqW63VTu2PAB6fSO4wP2lvsPXC_osgX4blb9SL3wsnZN_TX0S_MXm--vKd1TZ9aTxqKDksHU6LAco-QgcwfDyIQclJt-rRaA-gGSxD_nOVOI_er225nIe7GwuA2CFlfYUYaMSjpOZEeHfmNQgFgZ-45M_9GM8AFz5AxEN8ltcWKiYyOt8MtOBuzhtSFP99L_GlIm4xCXj3tuvG8cEl-_rEKGaQa3yp7l17Z0cZiGycF7xoCxm1yt88ANqMVbiuwjzdLU1Oc9z4b94bjHh7U8Q7IVAHhHU5d0fXZ3csMSw1xcmLZwPlbglu5v7eXvX0Yafr2K9_cRv3gAw90xP-MtHF7LHOmLHYV_kRHyXhpD19HaMqof9lGMjRqybSuKoWAOHxnDk2QP5M8T3dMLH8MDU8G0eo=w396-h400-no";
    ImageView chiccojuguetes15;
    String urlchiccojuguetes15 = "https://lh3.googleusercontent.com/fLZbBC9FfY9G51j9Zccf2TitWuJbi25gHU6skQ9A0tnVKwCLiwJKYSw5M7-KbKOeO9L91bNqF1jc53Etlg_IvyCoZA9OOt4G0qgyHkIROmY2LpUBJbkeXAF1_ZwgFtNKZGbEQRrhpU3rBF06hcLgdFMC38kR9DOI8pQxjs_OAZcCe672ihbjnZ0XpcLV0ZuKpT41e9QPKeKyrRnFu7_QRaQ-8s9eKUXd0VwqBekEeKSxIkToPSPafNt1I3n_e1BKzvPIE6TfWpGdHqLXJdGBPUKRCMyj4i1iFYo7MBvMou9BWrHmUmxDewHjHB-bJ23lMzfHL4G4l9fmej6Ze0Xw99sQCn-u1QxS4GNaVCiniSEXkDrmY0iC2Ka4AeYYEsaIz9_ZUnSOkhGEl6IcHiaUaMLcE-E38DQuJBr1dv2URy3JkIvdZ1i5qhUbuUVVVfSfKCo7l3oZfun4gsIos3Xr5KW6fYEhVn1P_hrwuoXh2bVhSn7q-bJoWH3uh7YoXVNZ0P2cDC5dFLUuC-vefz21E2nKW3_IiLfPOpa6vB4p3vmEAtODOgUm5KVics_QnOQIOq4Wkpw9ornM5Pn6hQOJ1_OjaI_lmg3nZ0vflL85gLKGgDTW3puQK9zr3FcX1PeIkNx9yvCZvd4f7cZKsJcATL_Ougr7hCVIOJ13he0U2QY=w396-h400-no";
    ImageView chiccojuguetes16;
    String urlchiccojuguetes16 = "https://lh3.googleusercontent.com/VcZA2naN4FKuN8S-gWnTmsgwKdSGbWRpkl0Lym8Udj4A7MCR6b--TVJkm7hirYd71OGmUybu-5_ZerK2F_Fc1HcNNDPmQ86s0zstpbTH1KenhAeWPhHMGs9B4tHUAlNWKBKEuoJhCMF3DfHDphyImWl4kdI8Q_gYEQQ_5vOgZ0V0PiGfTltdJVmpxPUFEiiYfC1Av2jeQ2mKcP4yCoECsJJpHV974Bs1-aAEy_9xzSjqw4bXP5xTyYKGTAIhQ_HGISx1XF5cD1uB1iC1iYHgQWwz-WDGehjLlexYhZtqMydQnSWSTZGKWP__Hij_45Ft-Z-VptU82lEdpVPmZN5Jd_1htRwK-lzpvYxqKGSAdXaZO-nKgkN29qFzAcPJAe8IYNyzk5amwH5qZKIKtaEi9mrJlb2EbAjMeDaOYHknEug9cCGECDdB3SQDW_LbatPE0b7guh6pxncEUekVKf4jXFj4sv-y_Wcg9hitvRdmPmh3Xlxz7ekahKI1m9HriW_Xgd3dsvdki28PnXKzpjAInRP9XZlPdyhHShaJCAxuANshuko5PC9qcyyYucg1wDrUv528KyA8i9I3Ss2lk59lLpqpV2D41msxAU9Q828BPOSsAewEHiaO2VdsPcnmXdRZGd7w3ZOu9HUfT52Nbmpxv25Mrgul-tre-DwtTGJVUD8=w396-h400-no";
    ImageView chiccojuguetes18;
    String urlchiccojuguetes18 = "https://lh3.googleusercontent.com/jlsYcHjgQGp73YEFTExve3ZWnkZWQLVrxd4X3HGpIO_l1QPhr_NPdEb3rJ_AHuG9JllM_5MgmTiF1ldglDxhy7gPduzIP_8b7X03feqganvzJMzxy8HUFJtfP11o6eH2mJ0mwRqwhOzcHw4qgD71f8fM1aP8SCbmihhaChbql179wtW2SL5zr54ecf9F1R3mnWJwLhvFr5lR3mYO5N2Ot5LFSZZSubld7D8TXfOI8vnTpoFylDxLSxR7Nhj2BXr27wfuz9RCB5yho2dyA1gGWOV_Abn5sufVV8vKoaBoQoYYWbB61Cr_tCBYKcH_mIWIq4b7vtnjqJ3OjSLz_Bgw-A9UhWZQH3UuN-UuZhz1EU6p82ryqH-RStN1Bx4mf0VN51tCPwPh3OsBbElN3lHcg9tu8-cMCQy9hI-YXe2Y6R-fZJyeDgfCL1K61Ev13VVl9LgLGDbsBpE5qr84MY3bt5q9JJuUMdpYftdlA6_rJuL7AS7TNPcE8BvDPtdCfmqXYSWkBZqL0jags3OYSswAf3OHhKIWueLryZRPTasG4FKbQ3oq22saexqoC2OMfyrySU2wCUCfbjHSrh3BVv-MqPPsOSYE-4OcE2SvZT1aRWpdPo2W02AAz3e-hhLsCQiQQafIpdvmCF7PO82f-u4ji6vwSUmJWkPwJ5EIOds6mf8=w396-h400-no";
    ImageView chiccojuguetes19;
    String urlchiccojuguetes19 = "https://lh3.googleusercontent.com/aPDzWAvLJdZAW_PIjsB4zX0bNtzsjNtARnPmESTlCK9aszpIbn8HrYPHKhSWrVJ3zJsaiJ9LTk5znujHu96QagxpnobltmHjMKLwJJIZe1sk6ixHyWgyfdI2_xNBR_MnxG84EuQdhqa6muJeCiox6JMILD3i0_EdCKeqKEfuksjnyD1aWu7xnss5bnTwK_aKDRE3omNcZ81br8goM9FNmfpTB9yhYurd4dmfSjxR8ttHkzuyvSbmSVnlrnY2vWDjXviDFxjE4vS20HEUqFwfYaD4iSGqETaGg14iVCR8opdJrUPoPVNrRICKKjQefGjWzexR0iuc91ynH-v3ZBW4Td3CJtbQkHhQKXHmQFGJlBXZszfIzjHIePKBM93GE4oL6ZnckJkSVwng2jRUCbMFclajJyZfuqCi3L3hcPRAhOBHPIJyxs_caHCu3_Yv9pvIXmeW14_S6Zv6eWeOtlmCid-uQ4AIduD5gF6xa1pYxoauy86UMfQMIXOo5IbGRhop8-IoL2F8cDukDSh5yYZcidXx-RSIN5XicGnScgcHISt-n3ZvRULHGcaoUH8Xkq7vlUP6frFn8LZauknsTRMHI2w94cB1o0d-NGpofCkjjOCI8VF2a68BDT124YbK9sCH4IRJku0DwXsKw7BnBPB33VTNtYHQg8Mos-yA4pvjSDw=w396-h400-no";
    ImageView chiccojuguetes20;
    String urlchiccojuguetes20 = "https://lh3.googleusercontent.com/Tq1hXCuPglDZmsnLyntVpJeWQ9sdmVbGiATuZH1KuVA4zVkgYR1l4x8MScx3d6ktrpLuT4q72aiiUvpDs3-QrDyWFvp2BaRK2ulYiRZn--smaHB_45aG2WDsnCNwZg1hjRozv9Ubt9t1-PX3wC96Ze8YN_IPpToif8pVJMcLPGek6pLY3TZKrjwQfpgxJ2_zUd0YuYsjDh8qPXwQiQgV33xcSCaM0P9hF9UZfPYGEpDG4tYqh6Adrbsg5vPHAUYNksSbdx3ocY57VEf667cQUrD1MBDDv6KiGMmeDf9jprzIN2tGxVSWfSBTLQYxSO_WkDQYhYdPiZOOoeHmRAoDszFhnzfWrEdwzaqcSRlS_tLC28o0LB2aYx06ugcT8HdNaFgue_32zaBZJw2H9m_WqxZ3ZGFB0rl2WpX7dKixVNDR4Wov3LtwTf-WQhqTt-RILeJrValANPeZAvrtlqDfvSSMhmIbzShU6cwUIunnVB4jo7m2-TQ5rIvdELW4UeUJUHpyd12RmJk3_wkHZnC-bOsVY-rswNnoXd4GmleoOxJw8daVjmNfZ1EUdo-vu-8cHFpOsCCFecyGiiMDbWRh_KJAlv9nqZcaPpaT4m7XYazGMd0twRGof0zysEKeHBOBXlx4tMs3BI9ZYLrCquDrvlOclHFZTUse8yIeHR39DFM=w396-h400-no";
    ImageView chiccojuguetes21;
    String urlchiccojuguetes21 = "https://lh3.googleusercontent.com/NjolME4mgpi3eaM9pMRuZJQ2pwKedv9yx1GcR6zayOs_PeFLHTAmVJSb8OogbsrdPQ0wZPZ_NRLrPiYxAb0MkXaZeg0d1V0cYxUYI4-BSUbcpOUm_0_pEIbkooPgLXuFqxzicFk3jYS5MSSXVr5awKzg3NFqtvvZ0iNhz4nTCA1nrMJQ54rN6fLu-UKtZVePkGDBvB5FALfax6AZIcLzN3zeg3bpEwk8ykbrCEAdKzPlvr3NxdcKYkQjhe5JujtE8QQFqVOG8fpvxGf1AgJ50ZRLQECxYyAheWIcroXaG0SBZVeamzMCnm1NW-bZlP8yvzSJTYtvnMjpTzUAPNj5C4sMV3ZRJPBZJeZFnE1QTz9cPorhPKD23s_dmYG5nPLlTrHfGeNldspJOO_v80KuuvO-CImpyLRwzWzIuiT_R5z_37yEu7rTDgLSiXZvXy8tCqLS9xlztzZrx7samU7nnpLmSa-GCPynX6S3z48gWUMv_wY72JdnyMaWf6Vaj0vUgNqmvykRG0MpzQL_13FEEzjT6GI4D8aGIgKdj2-2XdscAQjPgg5GfnDlNbtlZnaZQx5tTcwtV4X4fLF0tgA8S4gXmtav_X3sjUUi2IyUfjsW3Pb4NIA3D_cWTblutskavU3KDNInu2Vnp1ga0w4LHTiKjVPcEMpDte-kCCGtCa0=w396-h400-no";
    ImageView chiccojuguetes22;
    String urlchiccojuguetes22 = "https://lh3.googleusercontent.com/mVvjJvXraPz4B4Gurx2MUmoTpLeMHL4vX8tcmoi_RbFq1vEfMJI6GoZwVzN7qieJQN31l-sLeeW07YYGXE_SphBGKnocCN9umrYuDntGShvmWSzp8WtQCksxP1wP9KqNO3ulchXaAGEdVOpxn2OVR3h-_rEBnWf57K7YKCqvtx_kc91E_aWP3w5Zyd_Y-LttGMqXcjYG78ZnKPs8Ynn5TP_-dnZtJ5xObB1n3JrDTsVfSoosZbpxxekBXuxCWEXjjgDbJDPIsVB7DgHmylo9OUz8Krc75KFZZoOOSdiEzfBWKXM9mN074_FXNaaa261zDCbElRz-QrQNveazLouP7zcQhba1ckwgpJ9dHDDlEoAy4afqmIWelCAUOzWWcM4fa7oehK2jnBVW-URPSdM9upGvzHyl5j1e3GdnziOg3ODTlCwDtxjXAIn4ViPL4CwBC1JvkPwR8Vf5m9BCLx_aGJsRAsJ3-OpELyJSkWgJhiJZ0Ox0U2VNBItmAySbiV03-g879RjI_CHgu09G3mH8LgYhWvcdzdvfQFSR0Agl0k0o-U6s1pIK8V8a8ck_8tRhU7TlYaFjks10YihFMs4TVO91XZTngeTIzRVcUBHZCDVu3N15aWxq8wFDUrhR21Vw78c_aYfTnfFRP4hcuKYRm2HC9S6RvPyIHEtAqpe4j54=w396-h400-no";
    ImageView chiccojuguetes23;
    String urlchiccojuguetes23 = "https://lh3.googleusercontent.com/Iu4JV4G0KaUEt_OrS6iRUCsPOl0iOtfrw_tjg5nbfsD98FtjggmK3oc-k4uy1y6JegJHdJUe6kEKiBWIH0HyJ0wczy9HOKSothUx-tPA2unWvEU2t4hBfvpW-Ngu1iEri5rIRf2wDJf1KEx_qHf5rjoem9sCEZghsOK8oqpkX-7GXySv1W9ce5f5amxMr4wtid1A6aG9lWo9_ZUxwdLsYo3e7j_eEIIWQtvKK7aoFrR7PHdxxWM6moFQDq7QXXSo-291yeOVVmi1jEtu071hGvBjK0MlVN93awKNCAr7uCAXHoop38ofxiL_6tNpt5vGJhPkvyT_oMgy3YDs0JQv02gCmRO23cpuDZe8wOlSTixT23-uJJGdlQ3IStmTOLKY6JKBcnJPFVlOdNNwz6nuvxEnd3S_9YI8oVkFU9uZJgTT4Lm0mLfNbYCuQTaaNpSeC03T78otc2nrQtFX30pQzwL4dDmiX2_qejcQzGkKmM-BkQZ8E61QZeuXbVVz6C1jVH1I-xoNlqPET15hyGC0LVEhi-5ddFyOwYewoouZB3chADzKSOjQlw4HWKFxTOyjBYDnw5FFvnbovUThzzTeY8pYlB2Wvp7O-fapRtfpl5CWz0rdTk7SkkZIhT7somdUmq0CIudE4Hetqw06nzrO9SortSRUuTZH0n7IOs20NCA=w396-h400-no";
    ImageView chiccojuguetes24;
    String urlchiccojuguetes24 = "https://lh3.googleusercontent.com/ISfQmi9kW8hB0NWQe-uYh1Ex3513blImcCfWOj2mqGUj1-derj-OyYvITO2x03ta1Gm-VgO2EJ1xsEQmdcL_7bAycJUDvz4mpuMIouKkI8BGseg0zgmiKqSWK6rlOFgTHdPljk5e1LM04o_AifrNKAnlhqG6CQ0z1L6uNXC_HXpKf00UKxBxQmM0Wsa0XWIoyRG_YcGr-Y9775GwtUFR5FihAzY0GPp4jrc_qUhEXp1vWUs_y8ox9XFNHF2hA19MASOOfSDcvY9GRvTXdNAROmALCTMUCyyboblBi5yDEgY7sdHz6H7cTupmQ54faan4qTshEhIKrGlMUv_nU07z-X_OCMSUCloAIGVXwrbVu8cpcRNN97o-vO3wE2AQU6JVxDhwWDfUKAGoLRLe3qnYdbuzQhQz9ed-I5SG_HjfIEyw2sRmkWnx9g_5c9CsRUxbS80HeJlPgcxF2E0O9zOBO4EVQlaXou5M96B8L8HmiibMILDjp8GpnrFitEXB-ozbMKWlqzEWdlnPjqMmDCWrz2xQiBeWYZ7j6e_vvpHFj0FhPO_JDW_sUei5-7po5GbA23KyexiM8h8NoYiDLARJWYnzDi6xAlkcBlUIHiHq1TNwumPXJZl_OYM_9tTdSn11Q3Qf8gMij846BOcT_eSrjGlKOwpRweukviUzPGM6BPs=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes);
        new chiccojuguetes.preciochiccojuguetesAsync().execute();

        /* juguetes 1 */

        chiccojuguetes1j1 = (ImageView)findViewById(R.id.chiccojuguetes1j1);
        Picasso.with(this).load(urlchiccojuguetes1).into(chiccojuguetes1j1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes.this,marcas.class);
                startActivity(marca);
            }
        });

        txtchiccojuguetes1j1 = (TextView)findViewById(R.id.txtchiccojuguetes1);
        final String stconsultaj1 = txtchiccojuguetes1j1.getText().toString();
        btnconsultaj1 = (Button)findViewById(R.id.btnconsultaj1);
        btnconsultaj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj1 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj1.putExtra("consulta", stconsultaj1);
                startActivity(btnconsultaj1);
            }
        });


        btncomprachiccojuguetes1 = (Button)findViewById(R.id.btncomprachiccojuguetes1);
        btncomprachiccojuguetes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes1 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes1.putExtra("string", urlcomboj1);
                startActivity(btncomprachiccojuguetes1);
            }
        });

        linearj1 = (LinearLayout)findViewById(R.id.linearj1);

        switch1 = (Switch)findViewById(R.id.switch1);
        switch1.setChecked(false);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch1.isChecked()) {
                    linearj1.setVisibility(View.VISIBLE);
                } else {
                    linearj1.setVisibility(View.GONE);
                }

            }
        });


        /* juguetes 2 */

        chiccojuguetes2j2 = (ImageView)findViewById(R.id.chiccojuguetes2j2);
        Picasso.with(this).load(urlchiccojuguetes2).into(chiccojuguetes2j2);

        txtchiccojuguetes2j2 = (TextView)findViewById(R.id.txtchiccojuguetes2j2);
        final String stconsultaj2 = txtchiccojuguetes2j2.getText().toString();
        btnconsultaj2 = (Button)findViewById(R.id.btnconsultaj2);
        btnconsultaj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj2 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj2.putExtra("consulta", stconsultaj2);
                startActivity(btnconsultaj2);
            }
        });


        btncomprachiccojuguetes2 = (Button)findViewById(R.id.btncomprachiccojuguetes2);
        btncomprachiccojuguetes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes2 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes2.putExtra("string", urlcomboj2);
                startActivity(btncomprachiccojuguetes2);
            }
        });

        linearj2 = (LinearLayout)findViewById(R.id.linearj2);

        switch2 = (Switch)findViewById(R.id.switch2);
        switch2.setChecked(false);
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch2.isChecked()) {
                    linearj2.setVisibility(View.VISIBLE);
                } else {
                    linearj2.setVisibility(View.GONE);
                }

            }
        });

                /* juguetes 3 */

        chiccojuguetes3j3 = (ImageView)findViewById(R.id.chiccojuguetes3j3);
        Picasso.with(this).load(urlchiccojuguetes3).into(chiccojuguetes3j3);

        txtchiccojuguetes3j3 = (TextView)findViewById(R.id.txtchiccojuguetes3j3);
        final String stconsultaj3 = txtchiccojuguetes3j3.getText().toString();
        btnconsultaj3 = (Button)findViewById(R.id.btnconsultaj3);
        btnconsultaj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj3 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj3.putExtra("consulta", stconsultaj3);
                startActivity(btnconsultaj3);
            }
        });


        btncomprachiccojuguetes3 = (Button)findViewById(R.id.btncomprachiccojuguetes3);
        btncomprachiccojuguetes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes3 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes3.putExtra("string", urlcomboj3);
                startActivity(btncomprachiccojuguetes3);
            }
        });

        linearj3 = (LinearLayout)findViewById(R.id.linearj3);

        switch3 = (Switch)findViewById(R.id.switch3);
        switch3.setChecked(false);
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch3.isChecked()) {
                    linearj3.setVisibility(View.VISIBLE);
                } else {
                    linearj3.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 4 */

        chiccojuguetes4j4 = (ImageView)findViewById(R.id.chiccojuguetes4j4);
        Picasso.with(this).load(urlchiccojuguetes4).into(chiccojuguetes4j4);

        txtchiccojuguetes4j4 = (TextView)findViewById(R.id.txtchiccojuguetes4j4);
        final String stconsultaj4 = txtchiccojuguetes4j4.getText().toString();
        btnconsultaj4 = (Button)findViewById(R.id.btnconsultaj4);
        btnconsultaj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj4 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj4.putExtra("consulta", stconsultaj4);
                startActivity(btnconsultaj4);
            }
        });


        btncomprachiccojuguetes4 = (Button)findViewById(R.id.btncomprachiccojuguetes4);
        btncomprachiccojuguetes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes4 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes4.putExtra("string", urlcomboj4);
                startActivity(btncomprachiccojuguetes4);
            }
        });

        linearj4 = (LinearLayout)findViewById(R.id.linearj4);

        switch4 = (Switch)findViewById(R.id.switch4);
        switch4.setChecked(false);
        switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch4.isChecked()) {
                    linearj4.setVisibility(View.VISIBLE);
                } else {
                    linearj4.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 5 */

        chiccojuguetes5j5 = (ImageView)findViewById(R.id.chiccojuguetes5j5);
        Picasso.with(this).load(urlchiccojuguetes5).into(chiccojuguetes5j5);

        txtchiccojuguetes5j5 = (TextView)findViewById(R.id.txtchiccojuguetes5j5);
        final String stconsultaj5 = txtchiccojuguetes5j5.getText().toString();
        btnconsultaj5 = (Button)findViewById(R.id.btnconsultaj5);
        btnconsultaj5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj5 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj5.putExtra("consulta", stconsultaj5);
                startActivity(btnconsultaj5);
            }
        });


        btncomprachiccojuguetes5 = (Button)findViewById(R.id.btncomprachiccojuguetes5);
        btncomprachiccojuguetes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes5 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes5.putExtra("string", urlcomboj5);
                startActivity(btncomprachiccojuguetes5);
            }
        });

        linearj5 = (LinearLayout)findViewById(R.id.linearj5);

        switch5 = (Switch)findViewById(R.id.switch5);
        switch5.setChecked(false);
        switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch5.isChecked()) {
                    linearj5.setVisibility(View.VISIBLE);
                } else {
                    linearj5.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 6 */

        chiccojuguetes6j6 = (ImageView)findViewById(R.id.chiccojuguetes6j6);
        Picasso.with(this).load(urlchiccojuguetes6).into(chiccojuguetes6j6);

        txtchiccojuguetes6j6 = (TextView)findViewById(R.id.txtchiccojuguetes6j6);
        final String stconsultaj6 = txtchiccojuguetes6j6.getText().toString();
        btnconsultaj6 = (Button)findViewById(R.id.btnconsultaj6);
        btnconsultaj6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj6 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj6.putExtra("consulta", stconsultaj6);
                startActivity(btnconsultaj6);
            }
        });


        btncomprachiccojuguetes6 = (Button)findViewById(R.id.btncomprachiccojuguetes6);
        btncomprachiccojuguetes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes6 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes6.putExtra("string", urlcomboj6);
                startActivity(btncomprachiccojuguetes6);
            }
        });

        linearj6 = (LinearLayout)findViewById(R.id.linearj6);

        switch6 = (Switch)findViewById(R.id.switch6);
        switch6.setChecked(false);
        switch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch6.isChecked()) {
                    linearj6.setVisibility(View.VISIBLE);
                } else {
                    linearj6.setVisibility(View.GONE);
                }

            }
        });


        /* juguetes 7 */

        chiccojuguetes7j7 = (ImageView)findViewById(R.id.chiccojuguetes7j7);
        Picasso.with(this).load(urlchiccojuguetes7).into(chiccojuguetes7j7);

        txtchiccojuguetes7j7 = (TextView)findViewById(R.id.txtchiccojuguetes7j7);
        final String stconsultaj7 = txtchiccojuguetes7j7.getText().toString();
        btnconsultaj7 = (Button)findViewById(R.id.btnconsultaj7);
        btnconsultaj7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj7 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj7.putExtra("consulta", stconsultaj7);
                startActivity(btnconsultaj7);
            }
        });


        btncomprachiccojuguetes7 = (Button)findViewById(R.id.btncomprachiccojuguetes7);
        btncomprachiccojuguetes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes7 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes7.putExtra("string", urlcomboj7);
                startActivity(btncomprachiccojuguetes7);
            }
        });

        linearj7 = (LinearLayout)findViewById(R.id.linearj7);

        switch7 = (Switch)findViewById(R.id.switch7);
        switch7.setChecked(false);
        switch7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch7.isChecked()) {
                    linearj7.setVisibility(View.VISIBLE);
                } else {
                    linearj7.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 8 */

        chiccojuguetes8j8 = (ImageView)findViewById(R.id.chiccojuguetes8j8);
        Picasso.with(this).load(urlchiccojuguetes8).into(chiccojuguetes8j8);

        txtchiccojuguetes8j8 = (TextView)findViewById(R.id.txtchiccojuguetes8j8);
        final String stconsultaj8 = txtchiccojuguetes8j8.getText().toString();
        btnconsultaj8 = (Button)findViewById(R.id.btnconsultaj8);
        btnconsultaj8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj8 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj8.putExtra("consulta", stconsultaj8);
                startActivity(btnconsultaj8);
            }
        });


        btncomprachiccojuguetes8 = (Button)findViewById(R.id.btncomprachiccojuguetes8);
        btncomprachiccojuguetes8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes8 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes8.putExtra("string", urlcomboj8);
                startActivity(btncomprachiccojuguetes8);
            }
        });

        linearj8 = (LinearLayout)findViewById(R.id.linearj8);

        switch8 = (Switch)findViewById(R.id.switch8);
        switch8.setChecked(false);
        switch8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch8.isChecked()) {
                    linearj8.setVisibility(View.VISIBLE);
                } else {
                    linearj8.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 9 */

        chiccojuguetes9j9 = (ImageView)findViewById(R.id.chiccojuguetes9j9);
        Picasso.with(this).load(urlchiccojuguetes9).into(chiccojuguetes9j9);

        txtchiccojuguetes9j9 = (TextView)findViewById(R.id.txtchiccojuguetes9j9);
        final String stconsultaj9 = txtchiccojuguetes9j9.getText().toString();
        btnconsultaj9 = (Button)findViewById(R.id.btnconsultaj9);
        btnconsultaj9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj9 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj9.putExtra("consulta", stconsultaj9);
                startActivity(btnconsultaj9);
            }
        });


        btncomprachiccojuguetes9 = (Button)findViewById(R.id.btncomprachiccojuguetes9);
        btncomprachiccojuguetes9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes9 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes9.putExtra("string", urlcomboj9);
                startActivity(btncomprachiccojuguetes9);
            }
        });

        linearj9 = (LinearLayout)findViewById(R.id.linearj9);

        switch9 = (Switch)findViewById(R.id.switch9);
        switch9.setChecked(false);
        switch9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch9.isChecked()) {
                    linearj9.setVisibility(View.VISIBLE);
                } else {
                    linearj9.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 10 */

        chiccojuguetes10j10 = (ImageView)findViewById(R.id.chiccojuguetes10j10);
        Picasso.with(this).load(urlchiccojuguetes10).into(chiccojuguetes10j10);

        txtchiccojuguetes10j10 = (TextView)findViewById(R.id.txtchiccojuguetes10j10);
        final String stconsultaj10 = txtchiccojuguetes10j10.getText().toString();
        btnconsultaj10 = (Button)findViewById(R.id.btnconsultaj10);
        btnconsultaj10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj10 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj10.putExtra("consulta", stconsultaj10);
                startActivity(btnconsultaj10);
            }
        });


        btncomprachiccojuguetes10 = (Button)findViewById(R.id.btncomprachiccojuguetes10);
        btncomprachiccojuguetes10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes10 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes10.putExtra("string", urlcomboj10);
                startActivity(btncomprachiccojuguetes10);
            }
        });

        linearj10 = (LinearLayout)findViewById(R.id.linearj10);

        switch10 = (Switch)findViewById(R.id.switch10);
        switch10.setChecked(false);
        switch10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch10.isChecked()) {
                    linearj10.setVisibility(View.VISIBLE);
                } else {
                    linearj10.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 11 */

        chiccojuguetes11j11 = (ImageView)findViewById(R.id.chiccojuguetes11j11);
        Picasso.with(this).load(urlchiccojuguetes11).into(chiccojuguetes11j11);

        txtchiccojuguetes11j11 = (TextView)findViewById(R.id.txtchiccojuguetes11j11);
        final String stconsultaj11 = txtchiccojuguetes11j11.getText().toString();
        btnconsultaj11 = (Button)findViewById(R.id.btnconsultaj11);
        btnconsultaj11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj11 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj11.putExtra("consulta", stconsultaj11);
                startActivity(btnconsultaj11);
            }
        });


        btncomprachiccojuguetes11 = (Button)findViewById(R.id.btncomprachiccojuguetes11);
        btncomprachiccojuguetes11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes11 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes11.putExtra("string", urlcomboj11);
                startActivity(btncomprachiccojuguetes11);
            }
        });

        linearj11 = (LinearLayout)findViewById(R.id.linearj11);

        switch11 = (Switch)findViewById(R.id.switch11);
        switch11.setChecked(false);
        switch11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch11.isChecked()) {
                    linearj11.setVisibility(View.VISIBLE);
                } else {
                    linearj11.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 12 */

        chiccojuguetes12j12 = (ImageView)findViewById(R.id.chiccojuguetes12j12);
        Picasso.with(this).load(urlchiccojuguetes12).into(chiccojuguetes12j12);

        txtchiccojuguetes12j12 = (TextView)findViewById(R.id.txtchiccojuguetes12j12);
        final String stconsultaj12 = txtchiccojuguetes12j12.getText().toString();
        btnconsultaj12 = (Button)findViewById(R.id.btnconsultaj12);
        btnconsultaj12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj12 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj12.putExtra("consulta", stconsultaj12);
                startActivity(btnconsultaj12);
            }
        });


        btncomprachiccojuguetes12 = (Button)findViewById(R.id.btncomprachiccojuguetes12);
        btncomprachiccojuguetes12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes12 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes12.putExtra("string", urlcomboj12);
                startActivity(btncomprachiccojuguetes12);
            }
        });

        linearj12 = (LinearLayout)findViewById(R.id.linearj12);

        switch12 = (Switch)findViewById(R.id.switch12);
        switch12.setChecked(false);
        switch12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch12.isChecked()) {
                    linearj12.setVisibility(View.VISIBLE);
                } else {
                    linearj12.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 13 */

        chiccojuguetes13j13 = (ImageView)findViewById(R.id.chiccojuguetes13j13);
        Picasso.with(this).load(urlchiccojuguetes13).into(chiccojuguetes13j13);

        txtchiccojuguetes13j13 = (TextView)findViewById(R.id.txtchiccojuguetes13j13);
        final String stconsultaj13 = txtchiccojuguetes13j13.getText().toString();
        btnconsultaj13 = (Button)findViewById(R.id.btnconsultaj13);
        btnconsultaj13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj13 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj13.putExtra("consulta", stconsultaj13);
                startActivity(btnconsultaj13);
            }
        });


        btncomprachiccojuguetes13 = (Button)findViewById(R.id.btncomprachiccojuguetes13);
        btncomprachiccojuguetes13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes13 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes13.putExtra("string", urlcomboj13);
                startActivity(btncomprachiccojuguetes13);
            }
        });

        linearj13 = (LinearLayout)findViewById(R.id.linearj13);

        switch13 = (Switch)findViewById(R.id.switch13);
        switch13.setChecked(false);
        switch13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch13.isChecked()) {
                    linearj13.setVisibility(View.VISIBLE);
                } else {
                    linearj13.setVisibility(View.GONE);
                }

            }
        });


        /* juguetes 14 */

        chiccojuguetes14j14 = (ImageView)findViewById(R.id.chiccojuguetes14j14);
        Picasso.with(this).load(urlchiccojuguetes14).into(chiccojuguetes14j14);

        txtchiccojuguetes14j14 = (TextView)findViewById(R.id.txtchiccojuguetes14j14);
        final String stconsultaj14 = txtchiccojuguetes14j14.getText().toString();
        btnconsultaj14 = (Button)findViewById(R.id.btnconsultaj14);
        btnconsultaj14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj14 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj14.putExtra("consulta", stconsultaj14);
                startActivity(btnconsultaj14);
            }
        });


        btncomprachiccojuguetes14 = (Button)findViewById(R.id.btncomprachiccojuguetes14);
        btncomprachiccojuguetes14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes14 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes14.putExtra("string", urlcomboj14);
                startActivity(btncomprachiccojuguetes14);
            }
        });

        linearj14 = (LinearLayout)findViewById(R.id.linearj14);

        switch14 = (Switch)findViewById(R.id.switch14);
        switch14.setChecked(false);
        switch14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch14.isChecked()) {
                    linearj14.setVisibility(View.VISIBLE);
                } else {
                    linearj14.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 15 */

        chiccojuguetes15j15 = (ImageView)findViewById(R.id.chiccojuguetes15j15);
        Picasso.with(this).load(urlchiccojuguetes15).into(chiccojuguetes15j15);

        txtchiccojuguetes15j15 = (TextView)findViewById(R.id.txtchiccojuguetes15j15);
        final String stconsultaj15 = txtchiccojuguetes15j15.getText().toString();
        btnconsultaj15 = (Button)findViewById(R.id.btnconsultaj15);
        btnconsultaj15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj15 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj15.putExtra("consulta", stconsultaj15);
                startActivity(btnconsultaj15);
            }
        });


        btncomprachiccojuguetes15 = (Button)findViewById(R.id.btncomprachiccojuguetes15);
        btncomprachiccojuguetes15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes15 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes15.putExtra("string", urlcomboj15);
                startActivity(btncomprachiccojuguetes15);
            }
        });

        linearj15 = (LinearLayout)findViewById(R.id.linearj15);

        switch15 = (Switch)findViewById(R.id.switch15);
        switch15.setChecked(false);
        switch15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch15.isChecked()) {
                    linearj15.setVisibility(View.VISIBLE);
                } else {
                    linearj15.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 16 */

        chiccojuguetes16j16 = (ImageView)findViewById(R.id.chiccojuguetes16j16);
        Picasso.with(this).load(urlchiccojuguetes16).into(chiccojuguetes16j16);

        txtchiccojuguetes16j16 = (TextView)findViewById(R.id.txtchiccojuguetes16j16);
        final String stconsultaj16 = txtchiccojuguetes16j16.getText().toString();
        btnconsultaj16 = (Button)findViewById(R.id.btnconsultaj16);
        btnconsultaj16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj16 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj16.putExtra("consulta", stconsultaj16);
                startActivity(btnconsultaj16);
            }
        });


        btncomprachiccojuguetes16 = (Button)findViewById(R.id.btncomprachiccojuguetes16);
        btncomprachiccojuguetes16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes16 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes16.putExtra("string", urlcomboj16);
                startActivity(btncomprachiccojuguetes16);
            }
        });

        linearj16 = (LinearLayout)findViewById(R.id.linearj16);

        switch16 = (Switch)findViewById(R.id.switch16);
        switch16.setChecked(false);
        switch16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch16.isChecked()) {
                    linearj16.setVisibility(View.VISIBLE);
                } else {
                    linearj16.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 18 */

        chiccojuguetes18j18 = (ImageView)findViewById(R.id.chiccojuguetes18j18);
        Picasso.with(this).load(urlchiccojuguetes18).into(chiccojuguetes18j18);

        txtchiccojuguetes18j18 = (TextView)findViewById(R.id.txtchiccojuguetes18j18);
        final String stconsultaj18 = txtchiccojuguetes18j18.getText().toString();
        btnconsultaj18 = (Button)findViewById(R.id.btnconsultaj18);
        btnconsultaj18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj18 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj18.putExtra("consulta", stconsultaj18);
                startActivity(btnconsultaj18);
            }
        });


        btncomprachiccojuguetes18 = (Button)findViewById(R.id.btncomprachiccojuguetes18);
        btncomprachiccojuguetes18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes18 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes18.putExtra("string", urlcomboj18);
                startActivity(btncomprachiccojuguetes18);
            }
        });

        linearj18 = (LinearLayout)findViewById(R.id.linearj18);

        switch18 = (Switch)findViewById(R.id.switch18);
        switch18.setChecked(false);
        switch18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch18.isChecked()) {
                    linearj18.setVisibility(View.VISIBLE);
                } else {
                    linearj18.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 19 */

        chiccojuguetes19j19 = (ImageView)findViewById(R.id.chiccojuguetes19j19);
        Picasso.with(this).load(urlchiccojuguetes19).into(chiccojuguetes19j19);

        txtchiccojuguetes19j19 = (TextView)findViewById(R.id.txtchiccojuguetes19j19);
        final String stconsultaj19 = txtchiccojuguetes19j19.getText().toString();
        btnconsultaj19 = (Button)findViewById(R.id.btnconsultaj19);
        btnconsultaj19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj19 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj19.putExtra("consulta", stconsultaj19);
                startActivity(btnconsultaj19);
            }
        });


        btncomprachiccojuguetes19 = (Button)findViewById(R.id.btncomprachiccojuguetes19);
        btncomprachiccojuguetes19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes19 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes19.putExtra("string", urlcomboj19);
                startActivity(btncomprachiccojuguetes19);
            }
        });

        linearj19 = (LinearLayout)findViewById(R.id.linearj19);

        switch19 = (Switch)findViewById(R.id.switch19);
        switch19.setChecked(false);
        switch19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch19.isChecked()) {
                    linearj19.setVisibility(View.VISIBLE);
                } else {
                    linearj19.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 20 */

        chiccojuguetes20j20 = (ImageView)findViewById(R.id.chiccojuguetes20j20);
        Picasso.with(this).load(urlchiccojuguetes20).into(chiccojuguetes20j20);

        txtchiccojuguetes20j20 = (TextView)findViewById(R.id.txtchiccojuguetes20j20);
        final String stconsultaj20 = txtchiccojuguetes20j20.getText().toString();
        btnconsultaj20 = (Button)findViewById(R.id.btnconsultaj20);
        btnconsultaj20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj20 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj20.putExtra("consulta", stconsultaj20);
                startActivity(btnconsultaj20);
            }
        });


        btncomprachiccojuguetes20 = (Button)findViewById(R.id.btncomprachiccojuguetes20);
        btncomprachiccojuguetes20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes20 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes20.putExtra("string", urlcomboj20);
                startActivity(btncomprachiccojuguetes20);
            }
        });

        linearj20 = (LinearLayout)findViewById(R.id.linearj20);

        switch20 = (Switch)findViewById(R.id.switch20);
        switch20.setChecked(false);
        switch20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch20.isChecked()) {
                    linearj20.setVisibility(View.VISIBLE);
                } else {
                    linearj20.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 21 */

        chiccojuguetes21j21 = (ImageView)findViewById(R.id.chiccojuguetes21j21);
        Picasso.with(this).load(urlchiccojuguetes21).into(chiccojuguetes21j21);

        txtchiccojuguetes21j21 = (TextView)findViewById(R.id.txtchiccojuguetes21j21);
        final String stconsultaj21 = txtchiccojuguetes21j21.getText().toString();
        btnconsultaj21 = (Button)findViewById(R.id.btnconsultaj21);
        btnconsultaj21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj21 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj21.putExtra("consulta", stconsultaj21);
                startActivity(btnconsultaj21);
            }
        });


        btncomprachiccojuguetes21 = (Button)findViewById(R.id.btncomprachiccojuguetes21);
        btncomprachiccojuguetes21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes21 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes21.putExtra("string", urlcomboj21);
                startActivity(btncomprachiccojuguetes21);
            }
        });

        linearj21 = (LinearLayout)findViewById(R.id.linearj21);

        switch21 = (Switch)findViewById(R.id.switch21);
        switch21.setChecked(false);
        switch21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch21.isChecked()) {
                    linearj21.setVisibility(View.VISIBLE);
                } else {
                    linearj21.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 22 */

        chiccojuguetes22j22 = (ImageView)findViewById(R.id.chiccojuguetes22j22);
        Picasso.with(this).load(urlchiccojuguetes22).into(chiccojuguetes22j22);

        txtchiccojuguetes22j22 = (TextView)findViewById(R.id.txtchiccojuguetes22j22);
        final String stconsultaj22 = txtchiccojuguetes22j22.getText().toString();
        btnconsultaj22 = (Button)findViewById(R.id.btnconsultaj22);
        btnconsultaj22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj22 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj22.putExtra("consulta", stconsultaj22);
                startActivity(btnconsultaj22);
            }
        });


        btncomprachiccojuguetes22 = (Button)findViewById(R.id.btncomprachiccojuguetes22);
        btncomprachiccojuguetes22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes22 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes22.putExtra("string", urlcomboj22);
                startActivity(btncomprachiccojuguetes22);
            }
        });

        linearj22 = (LinearLayout)findViewById(R.id.linearj22);

        switch22 = (Switch)findViewById(R.id.switch22);
        switch22.setChecked(false);
        switch22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch22.isChecked()) {
                    linearj22.setVisibility(View.VISIBLE);
                } else {
                    linearj22.setVisibility(View.GONE);
                }

            }
        });

        /* juguetes 23 */

        chiccojuguetes23j23 = (ImageView)findViewById(R.id.chiccojuguetes23j23);
        Picasso.with(this).load(urlchiccojuguetes23).into(chiccojuguetes23j23);

        txtchiccojuguetes23j23 = (TextView)findViewById(R.id.txtchiccojuguetes23j23);
        final String stconsultaj23 = txtchiccojuguetes23j23.getText().toString();
        btnconsultaj23 = (Button)findViewById(R.id.btnconsultaj23);
        btnconsultaj23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj23 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj23.putExtra("consulta", stconsultaj23);
                startActivity(btnconsultaj23);
            }
        });


        btncomprachiccojuguetes23 = (Button)findViewById(R.id.btncomprachiccojuguetes23);
        btncomprachiccojuguetes23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes23 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes23.putExtra("string", urlcomboj23);
                startActivity(btncomprachiccojuguetes23);
            }
        });

        linearj23 = (LinearLayout)findViewById(R.id.linearj23);

        switch23 = (Switch)findViewById(R.id.switch23);
        switch23.setChecked(false);
        switch23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch23.isChecked()) {
                    linearj23.setVisibility(View.VISIBLE);
                } else {
                    linearj23.setVisibility(View.GONE);
                }

            }
        });


        /* juguetes 24 */

        chiccojuguetes24j24 = (ImageView)findViewById(R.id.chiccojuguetes24j24);
        Picasso.with(this).load(urlchiccojuguetes24).into(chiccojuguetes24j24);

        txtchiccojuguetes24j24 = (TextView)findViewById(R.id.txtchiccojuguetes24j24);
        final String stconsultaj24 = txtchiccojuguetes24j24.getText().toString();
        btnconsultaj24 = (Button)findViewById(R.id.btnconsultaj24);
        btnconsultaj24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaj24 = new Intent(chiccojuguetes.this,contacto.class);
                btnconsultaj24.putExtra("consulta", stconsultaj24);
                startActivity(btnconsultaj24);
            }
        });


        btncomprachiccojuguetes24 = (Button)findViewById(R.id.btncomprachiccojuguetes24);
        btncomprachiccojuguetes24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes24 = new Intent(chiccojuguetes.this,webview.class);
                btncomprachiccojuguetes24.putExtra("string", urlcomboj24);
                startActivity(btncomprachiccojuguetes24);
            }
        });

        linearj24 = (LinearLayout)findViewById(R.id.linearj24);

        switch24 = (Switch)findViewById(R.id.switch24);
        switch24.setChecked(false);
        switch24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch24.isChecked()) {
                    linearj24.setVisibility(View.VISIBLE);
                } else {
                    linearj24.setVisibility(View.GONE);
                }

            }
        });


        /* Resto código */

        preciochiccojuguetes1 = (TextView)findViewById(R.id.preciochiccojuguetes1);
        preciochiccojuguetes2 = (TextView)findViewById(R.id.preciochiccojuguetes2);
        preciochiccojuguetes3 = (TextView)findViewById(R.id.preciochiccojuguetes3);
        preciochiccojuguetes4 = (TextView)findViewById(R.id.preciochiccojuguetes4);
        preciochiccojuguetes5 = (TextView)findViewById(R.id.preciochiccojuguetes5);
        preciochiccojuguetes6 = (TextView)findViewById(R.id.preciochiccojuguetes6);
        preciochiccojuguetes7 = (TextView)findViewById(R.id.preciochiccojuguetes7);
        preciochiccojuguetes8 = (TextView)findViewById(R.id.preciochiccojuguetes8);
        preciochiccojuguetes9 = (TextView)findViewById(R.id.preciochiccojuguetes9);
        preciochiccojuguetes10 = (TextView)findViewById(R.id.preciochiccojuguetes10);
        preciochiccojuguetes11 = (TextView)findViewById(R.id.preciochiccojuguetes11);
        preciochiccojuguetes12 = (TextView)findViewById(R.id.preciochiccojuguetes12);
        preciochiccojuguetes13 = (TextView)findViewById(R.id.preciochiccojuguetes13);
        preciochiccojuguetes14 = (TextView)findViewById(R.id.preciochiccojuguetes14);
        preciochiccojuguetes15 = (TextView)findViewById(R.id.preciochiccojuguetes15);
        preciochiccojuguetes16 = (TextView)findViewById(R.id.preciochiccojuguetes16);
        preciochiccojuguetes18 = (TextView)findViewById(R.id.preciochiccojuguetes18);
        preciochiccojuguetes19 = (TextView)findViewById(R.id.preciochiccojuguetes19);
        preciochiccojuguetes20 = (TextView)findViewById(R.id.preciochiccojuguetes20);
        preciochiccojuguetes21 = (TextView)findViewById(R.id.preciochiccojuguetes21);
        preciochiccojuguetes22 = (TextView)findViewById(R.id.preciochiccojuguetes22);
        preciochiccojuguetes23 = (TextView)findViewById(R.id.preciochiccojuguetes23);
        preciochiccojuguetes24 = (TextView)findViewById(R.id.preciochiccojuguetes24);        
        
        chiccojuguetes1 = (ImageView)findViewById(R.id.chiccojuguetes1);
        Picasso.with(this).load(urlchiccojuguetes1).into(chiccojuguetes1);

        chiccojuguetes2 = (ImageView)findViewById(R.id.chiccojuguetes2);
        Picasso.with(this).load(urlchiccojuguetes2).into(chiccojuguetes2);

        chiccojuguetes3 = (ImageView)findViewById(R.id.chiccojuguetes3);
        Picasso.with(this).load(urlchiccojuguetes3).into(chiccojuguetes3);

        chiccojuguetes4 = (ImageView)findViewById(R.id.chiccojuguetes4);
        Picasso.with(this).load(urlchiccojuguetes4).into(chiccojuguetes4);

        chiccojuguetes5 = (ImageView)findViewById(R.id.chiccojuguetes5);
        Picasso.with(this).load(urlchiccojuguetes5).into(chiccojuguetes5);

        chiccojuguetes6 = (ImageView)findViewById(R.id.chiccojuguetes6);
        Picasso.with(this).load(urlchiccojuguetes6).into(chiccojuguetes6);

        chiccojuguetes7 = (ImageView)findViewById(R.id.chiccojuguetes7);
        Picasso.with(this).load(urlchiccojuguetes7).into(chiccojuguetes7);

        chiccojuguetes8 = (ImageView)findViewById(R.id.chiccojuguetes8);
        Picasso.with(this).load(urlchiccojuguetes8).into(chiccojuguetes8);

        chiccojuguetes9 = (ImageView)findViewById(R.id.chiccojuguetes9);
        Picasso.with(this).load(urlchiccojuguetes9).into(chiccojuguetes9);

        chiccojuguetes10 = (ImageView)findViewById(R.id.chiccojuguetes10);
        Picasso.with(this).load(urlchiccojuguetes10).into(chiccojuguetes10);

        chiccojuguetes11 = (ImageView)findViewById(R.id.chiccojuguetes11);
        Picasso.with(this).load(urlchiccojuguetes11).into(chiccojuguetes11);

        chiccojuguetes12 = (ImageView)findViewById(R.id.chiccojuguetes12);
        Picasso.with(this).load(urlchiccojuguetes12).into(chiccojuguetes12);

        chiccojuguetes13 = (ImageView)findViewById(R.id.chiccojuguetes13);
        Picasso.with(this).load(urlchiccojuguetes13).into(chiccojuguetes13);

        chiccojuguetes14 = (ImageView)findViewById(R.id.chiccojuguetes14);
        Picasso.with(this).load(urlchiccojuguetes14).into(chiccojuguetes14);

        chiccojuguetes15 = (ImageView)findViewById(R.id.chiccojuguetes15);
        Picasso.with(this).load(urlchiccojuguetes15).into(chiccojuguetes15);

        chiccojuguetes16 = (ImageView)findViewById(R.id.chiccojuguetes16);
        Picasso.with(this).load(urlchiccojuguetes16).into(chiccojuguetes16);

        chiccojuguetes18 = (ImageView)findViewById(R.id.chiccojuguetes18);
        Picasso.with(this).load(urlchiccojuguetes18).into(chiccojuguetes18);

        chiccojuguetes19 = (ImageView)findViewById(R.id.chiccojuguetes19);
        Picasso.with(this).load(urlchiccojuguetes19).into(chiccojuguetes19);

        chiccojuguetes20 = (ImageView)findViewById(R.id.chiccojuguetes20);
        Picasso.with(this).load(urlchiccojuguetes20).into(chiccojuguetes20);

        chiccojuguetes21 = (ImageView)findViewById(R.id.chiccojuguetes21);
        Picasso.with(this).load(urlchiccojuguetes21).into(chiccojuguetes21);

        chiccojuguetes22 = (ImageView)findViewById(R.id.chiccojuguetes22);
        Picasso.with(this).load(urlchiccojuguetes22).into(chiccojuguetes22);

        chiccojuguetes23 = (ImageView)findViewById(R.id.chiccojuguetes23);
        Picasso.with(this).load(urlchiccojuguetes23).into(chiccojuguetes23);

        chiccojuguetes24 = (ImageView)findViewById(R.id.chiccojuguetes24);
        Picasso.with(this).load(urlchiccojuguetes24).into(chiccojuguetes24);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciochiccojuguetesAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f11f905a81410a416d3239aaef4ebb06#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3182c7e12be43e667ddb0feca7bb45d8#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=35d097e106cb6dbbfbb4aa286acf5796#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=af43bb95016ec5c0b45d7c9fb6c787e0#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5662bd5f5b710f518e70e179a6038272#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=889db988d9b7bce05b84e6930cdc5483#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c57a7c1548976f9364e2cc9df3791935#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=223004d699e041b0a06aeed56a2b01e0#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=badce095a082b537d3b879b73343fddd#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes9st;
        String urlprecio10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=84f7df372898b3acd5d7103e7fca8ff3#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes10st;
        String urlprecio11 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=77e2843e77613d0bd52e99f6618fc069#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes11st;
        String urlprecio12 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0b690a894109a8c8cfe4bc06259c7297#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes12st;
        String urlprecio13 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4e277adffcf7ac5036e0702225f86d54#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes13st;
        String urlprecio14 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1e201c5df31b117d4b988ca75d227457#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes14st;
        String urlprecio15 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d80acfc820299912861725f50e55cfcb#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes15st;
        String urlprecio16 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=95eaf2695872226cfa88a609f7ce481c#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes16st;
        String urlprecio18 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=fc5fa688bdcf73e8eca1d2c50c36220e#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes18st;
        String urlprecio19 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=20c810577863c40ade26d1f9b179e46b#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes19st;
        String urlprecio20 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8c08b9ef758bfee7c7b61c2edebd5730#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes20st;
        String urlprecio21 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=414a00047c3e34830aebd30c676a254a#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes21st;
        String urlprecio22 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f0ded81c62129f9bcc4372beda3a0ae3#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes22st;
        String urlprecio23 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e0376bb6ddc16b878a78cd6d57e417f6#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes23st;
        String urlprecio24 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1a09716809958c11723ba49f91d6ff02#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccojuguetes24st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciochiccojuguetes1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciochiccojuguetes2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciochiccojuguetes3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciochiccojuguetes4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciochiccojuguetes5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciochiccojuguetes6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                preciochiccojuguetes7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                preciochiccojuguetes8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                preciochiccojuguetes9st = metapropoerty9.attr("content");

                Document doc10 = Jsoup.connect(urlprecio10).get();
                Elements metapropoerty10 = doc10.select("meta[property=\"og:description\"]");
                preciochiccojuguetes10st = metapropoerty10.attr("content");

                Document doc11 = Jsoup.connect(urlprecio11).get();
                Elements metapropoerty11 = doc11.select("meta[property=\"og:description\"]");
                preciochiccojuguetes11st = metapropoerty11.attr("content");

                Document doc12 = Jsoup.connect(urlprecio12).get();
                Elements metapropoerty12 = doc12.select("meta[property=\"og:description\"]");
                preciochiccojuguetes12st = metapropoerty12.attr("content");

                Document doc13 = Jsoup.connect(urlprecio13).get();
                Elements metapropoerty13 = doc13.select("meta[property=\"og:description\"]");
                preciochiccojuguetes13st = metapropoerty13.attr("content");

                Document doc14 = Jsoup.connect(urlprecio14).get();
                Elements metapropoerty14 = doc14.select("meta[property=\"og:description\"]");
                preciochiccojuguetes14st = metapropoerty14.attr("content");

                Document doc15 = Jsoup.connect(urlprecio15).get();
                Elements metapropoerty15 = doc15.select("meta[property=\"og:description\"]");
                preciochiccojuguetes15st = metapropoerty15.attr("content");

                Document doc16 = Jsoup.connect(urlprecio16).get();
                Elements metapropoerty16 = doc16.select("meta[property=\"og:description\"]");
                preciochiccojuguetes16st = metapropoerty16.attr("content");

                Document doc18 = Jsoup.connect(urlprecio18).get();
                Elements metapropoerty18 = doc18.select("meta[property=\"og:description\"]");
                preciochiccojuguetes18st = metapropoerty18.attr("content");

                Document doc19 = Jsoup.connect(urlprecio19).get();
                Elements metapropoerty19 = doc19.select("meta[property=\"og:description\"]");
                preciochiccojuguetes19st = metapropoerty19.attr("content");

                Document doc20 = Jsoup.connect(urlprecio20).get();
                Elements metapropoerty20 = doc20.select("meta[property=\"og:description\"]");
                preciochiccojuguetes20st = metapropoerty20.attr("content");

                Document doc21 = Jsoup.connect(urlprecio21).get();
                Elements metapropoerty21 = doc21.select("meta[property=\"og:description\"]");
                preciochiccojuguetes21st = metapropoerty21.attr("content");

                Document doc22 = Jsoup.connect(urlprecio22).get();
                Elements metapropoerty22 = doc22.select("meta[property=\"og:description\"]");
                preciochiccojuguetes22st = metapropoerty22.attr("content");

                Document doc23 = Jsoup.connect(urlprecio23).get();
                Elements metapropoerty23 = doc23.select("meta[property=\"og:description\"]");
                preciochiccojuguetes23st = metapropoerty23.attr("content");

                Document doc24 = Jsoup.connect(urlprecio24).get();
                Elements metapropoerty24 = doc24.select("meta[property=\"og:description\"]");
                preciochiccojuguetes24st = metapropoerty24.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciochiccojuguetes1.setText(preciochiccojuguetes1st);
            preciochiccojuguetes2.setText(preciochiccojuguetes2st);
            preciochiccojuguetes3.setText(preciochiccojuguetes3st);
            preciochiccojuguetes4.setText(preciochiccojuguetes4st);
            preciochiccojuguetes5.setText(preciochiccojuguetes5st);
            preciochiccojuguetes6.setText(preciochiccojuguetes6st);
            preciochiccojuguetes7.setText(preciochiccojuguetes7st);
            preciochiccojuguetes8.setText(preciochiccojuguetes8st);
            preciochiccojuguetes9.setText(preciochiccojuguetes9st);
            preciochiccojuguetes10.setText(preciochiccojuguetes10st);
            preciochiccojuguetes11.setText(preciochiccojuguetes11st);
            preciochiccojuguetes12.setText(preciochiccojuguetes12st);
            preciochiccojuguetes13.setText(preciochiccojuguetes13st);
            preciochiccojuguetes14.setText(preciochiccojuguetes14st);
            preciochiccojuguetes15.setText(preciochiccojuguetes15st);
            preciochiccojuguetes16.setText(preciochiccojuguetes16st);
            preciochiccojuguetes18.setText(preciochiccojuguetes18st);
            preciochiccojuguetes19.setText(preciochiccojuguetes19st);
            preciochiccojuguetes20.setText(preciochiccojuguetes20st);
            preciochiccojuguetes21.setText(preciochiccojuguetes21st);
            preciochiccojuguetes22.setText(preciochiccojuguetes22st);
            preciochiccojuguetes23.setText(preciochiccojuguetes23st);
            preciochiccojuguetes24.setText(preciochiccojuguetes24st);
        }

    }
}
