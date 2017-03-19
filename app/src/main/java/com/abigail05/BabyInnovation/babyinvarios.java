package com.abigail05.BabyInnovation;

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

public class babyinvarios extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios1;
    Button btnconsultaa1;
    TextView txtbabyinvarios1a1;
    String urlcomboa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e1ea2bcef20db1062278cd6e562b932f";
    ImageView babyinvarios1a1;
    Button btncomprababyinvarios2;
    Button btnconsultaa2;
    TextView txtbabyinvarios2a2;
    String urlcomboa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6712232c5add22599885e180274875a3";
    ImageView babyinvarios2a2;
    Button btncomprababyinvarios3;
    Button btnconsultaa3;
    TextView txtbabyinvarios3a3;
    String urlcomboa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e110c5ef4782bd1e35deae91197fbef1";
    ImageView babyinvarios3a3;
    Button btncomprababyinvarios4;
    Button btnconsultaa4;
    TextView txtbabyinvarios4a4;
    String urlcomboa4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=07e04dc39d89342dc070888d16c93084";
    ImageView babyinvarios4a4;
    Button btncomprababyinvarios5;
    Button btnconsultaa5;
    TextView txtbabyinvarios5a5;
    String urlcomboa5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=909f5f4179bdcb3a56e5a436ea3607f5";
    ImageView babyinvarios5a5;
    Button btncomprababyinvarios6;
    Button btnconsultaa6;
    TextView txtbabyinvarios6a6;
    String urlcomboa6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1e1189278f6a84da84dbf3d4ccdeb353";
    ImageView babyinvarios6a6;
    Button btncomprababyinvarios7;
    Button btnconsultaa7;
    TextView txtbabyinvarios7a7;
    String urlcomboa7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=50080f1de4b9da07946b4def126c79c4";
    ImageView babyinvarios7a7;
    Button btncomprababyinvarios8;
    Button btnconsultaa8;
    TextView txtbabyinvarios8a8;
    String urlcomboa8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e08f4a83bde266f528748f53ad1ba9f3";
    ImageView babyinvarios8a8;
    Button btncomprababyinvarios9;
    Button btnconsultaa9;
    TextView txtbabyinvarios9a9;
    String urlcomboa9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=675409f50684a85a2ed4214d2b7e8776#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView babyinvarios9a9;
    Button btncomprababyinvarios10;
    Button btnconsultaa10;
    TextView txtbabyinvarios10a10;
    String urlcomboa10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dbafe8bf743780e4b08a94e2d5635d6d#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView babyinvarios10a10;
    Button btncomprababyinvarios11;
    Button btnconsultaa11;
    TextView txtbabyinvarios11a11;
    String urlcomboa11 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3fa687634ea3160f9f8da226b8f86f1f#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView babyinvarios11a11;
    Button btncomprababyinvarios12;
    Button btnconsultaa12;
    TextView txtbabyinvarios12a12;
    String urlcomboa12 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=169e5a774711788657e4668c86924bea#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView babyinvarios12a12;
    Button btncomprababyinvarios13;
    Button btnconsultaa13;
    TextView txtbabyinvarios13a13;
    String urlcomboa13 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=af66fa25ae89d7cf5987895121c57960#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView babyinvarios13a13;
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
    LinearLayout lineara11;
    LinearLayout lineara12;
    LinearLayout lineara13;
    TextView preciobabyinvarios1;
    TextView preciobabyinvarios2;
    TextView preciobabyinvarios3;
    TextView preciobabyinvarios4;
    TextView preciobabyinvarios5;
    TextView preciobabyinvarios6;
    TextView preciobabyinvarios7;
    TextView preciobabyinvarios8;
    TextView preciobabyinvarios9;
    TextView preciobabyinvarios10;
    TextView preciobabyinvarios11;
    TextView preciobabyinvarios12;
    TextView preciobabyinvarios13;
    ImageView babyinvarios1;
    String urlbabyinvarios1 = "https://lh3.googleusercontent.com/HvTg0DcFJ7PaI5HpK1ZzYSn-BYuQXvVsMmnKU0rSoVLxS2DlLWYL0HSOIGFc9u3p1TQrjtxdlO6x9SyrnXYJKSx4-OzgTWWuZ2m9dg7D4nG7RWpbv4yM9ux4cxOiKzd8xPf__8H6XjvJmCdqwEP7YR2Yro3G2EYgjRGBv1IX9BQys0PtRueBL2xdmv6zrYPMTrR4x7ujYlZvSfIwkA0ydpYI3eQK9xUXZSht4dLKJH3l4HglFj3F9CvKzs7ssf7cebmpOp_pL01Wde6vIAvL5ph_cjsNqx8jep7P-Xy2Es6_YVplu5RgKiuCHa6ACeBQYdSXitczDmW2rmCf8K3PVgfSwBqGpRQCVXjjkrSoGin70-L3A6gO7hbf7PrexpHb80amjT8jbc3cW0I1yCbyIl1YU9H5-9nl4mRgd3PcdpWbU2RNnhSlffapgeoVAm4Urb-JIAIY69gsECaSVi4P5B_e589HqjtMtc8hykj4k1w5wCjZpK7XZsLIcyX5b36gU5VYdHBYdekdGMoofGuS6nJDnXlE78RNzsifl8camS71nQw-siL0ukzVoFfpq2ZxueodlOpQ3Y9fOuWR0CLy-sqDLh6QdkYYe-z2wdw1NVpkHQSviQ=s320-no";
    ImageView babyinvarios2;
    String urlbabyinvarios2 = "https://lh3.googleusercontent.com/BYFSr-zi7_FIBo8AhABK_opTbtrb6zTANFGWjy7cxICCAmMZXcEET4Rzw7noPPPymxt76gNrVSAkvnMsYwSsxx5CGLTSPnsoP_Yi4jqDzpbEu1NDehPDg5PrdPAZ-MRtFda2vc6rZBEBWCZ1U3rmuFGxKzxf-BW9VkELIT7RAAnvVLz2Ys2USVT5qOSlI1jx5uMc1R7Vp5JsRVdPIHnPXq0hz9towolNH_Z2R3zGJc6XGS8mFwS86y9MzmCYRSOPzfo2WrLWm3FXk0_ZtAxSJl7e0eEt2-rqkCHc6inMcAuQioAL_VWg7OFpbyx69q5kEuCzPLXawTPbxmzMMR4UDj1BScwrvEGRoUiptKrHPkTNVcehPd4Bcb5J0CXDTGDOaTB-v6X599rsbUlF3ItwrEq9KdJM6_vR8inzHcIqy-DLw-M3w60cA0KFQ_S7AaQPcIvAtG5GFbgPrOPjYHbxe7psItA8HyECo3e25-8ayoTTfKiiXyBb3p4buz0CKwdkCsEvpcTQXavtnBcXdB840HdJajNlW7i5iSRuGvgtLu-w3DOPCsjytNLRi1pl43PjghrG52hWRQ0h0guWiNeBLy5c8UPjNuhBKnv1Mz86ukXG3TelKw=s320-no";
    ImageView babyinvarios3;
    String urlbabyinvarios3 = "https://lh3.googleusercontent.com/0HYmWPGbEQQgdFuQlSZbLoYS97bD8NExw7v67Oe9GEQWRUKOsRbXYimTEdlw2fQ3eW1uE-_BItc1bOdABlTv-MW-qSOpLAKa-yo9mp5HAV1CD7MJ3eXSK0WyYH2WPaOtyxFPaQX4gbD8zbckSRmSgXU3TzVK41lAPnWyig7c1quqpSh0H0zsJ_645rS2q2y-wyfi8HjdP_DOcibOj_eQjdafJbSGKFKRX08b7J3O79XGq4k7lfpLcJMEJyVjoW0q_bYKGnwlYXb3bi8LE3WHIdIqUtmNGVee5vuiMewv4ilLAqIAkZuisD5LlxPavQa9jhFlxjVMep1n1x-so17nPo-6E1QSK0HPG1FmEE7U5EwzZdQpbQW4CIJMA6w9lKJR3x05mW2T7A_6h8ItTE957kUHjpFoqQWZNa3nNXM4WkUlLGNrXZ_fJ2dYKeyM1ZoPNY8kTpcckKUvwJxnoTkEr2QWDk-16A87iok4msbtWA-apP_F0t5f9OGwteBY1kcLXOufMjbUnVBBPLzpAsZZxwVDUkV38wf5ZyErmBdJTjjTxKbrbrAbUFiTJ7quh2Zq1L2F4_O61SdGdc-xDnYRcPTw-KdJo0VGXOamAjuFw3kZS25gzg=s320-no";
    ImageView babyinvarios4;
    String urlbabyinvarios4 = "https://lh3.googleusercontent.com/K-l6ft7PnTSenjdZM-iQwatmRRGIg-gp_elW3ZXU4rGCKvtT-OY8jd-aK8WpLgRMmX-pUX1-EZOtTvcnEJkm50MsAazdhSZ0hCKSBohsCvWXS_akv0aOT9u1c1q98SOuPd3g4uC9seN8_3oZHNrl_GOh5ZIg3FwFXK0jflK78sapcT2qWRYjfaE2xqqk6zmvNuzDHJ1bcDrmCBDr66wYShu6rqWEt1VlczlqQZJe9Ffd4Xftrlfh2CF_5A4q07ag3Y4AVybXbSiic8lBBi0T-QyUgKztLMdBo05pb5Oris7shAMKCKF9v8dqtAmXPLqRI2UnwZAUNlOyqxgFCtlfxW0QyzFgWp67Bfq4jnmgkxeSwg_iYM6_DAgRR9RYEQV0IzkvS4tqf8CCvRdTUTM9Slc3k2UhmlRAC9nh9hjVK0GxYSNk5qoHNY7DGzySHq9mapTS1m12MicNbTGgBQYcrCreCv4yirKMAVEJzXs1RsOfIXIPd6jHMDg_9I3xcJ4MmUG0n9X1ybJ2VaU0EGOJR9EYUcuytsNqDKg6LTcGN1FaAC_FR2c1FJKH6QqBYmSe1TU93nn2XvLhiZBKKt8UfT1iT5Sh-gx3GL2k7h69dyFt8riu6Q=s320-no";
    ImageView babyinvarios5;
    String urlbabyinvarios5 = "https://lh3.googleusercontent.com/hEXUYG_3elL8pp2M9pMO2OhdlRyRiu_e2Awp3NtwW_swYJQEDzI8fLCYJSUdTdbRYtME_1Z37w_8HoMkD9fNW9ymdZIp8sR4kAVKhcEgo2GCGPxMpD8fa8-v_ZUpbsXqgQIQ7QVo7Sl_dR7bNB1ljYnH5Y4mu-skTlunHJFmvYulGWa5CzB52HmIkcR8YCnEE68b6SCPDpkTJ-u8amvkPSEDjFLg5MBTQ6S_NhhY6woJ1sB_Kh78OmMdq57wklouFi3O_mO0h29Y2E6kCiXsOXzz1Quvd7X4GUO_FZLhcaqb5r_8SxJ48IuxEZOOaDlXxbiKp64VeWJTxzTNAy0b8Wfxx0ej4ulUaj42Q-qofEl0Hm1PDUt9FLfk6YAM_ecAhpJSCsiUq74mxes_XSh2MG11BwjoiWfTTJx78u_F9FQM7n_l5NhQCFojjK28rX1JQQ_iVAB1NiQ1WV0p0skwEDRBj4ifXWTyAK4nNqAUfh0oWkhTvtMqjRcUOmXz_LRKjmYb1Z3gm2QC7TXeaNhEkc8ajSAW4AHs6uTZiDO6zF3T4qQ257z4R1bwKGexe9XSMzShyAPF6qC4bdEXtex-ODo4jp3hnVe4X8_VE_UoEUFSk9mUWg=s320-no";
    ImageView babyinvarios6;
    String urlbabyinvarios6 = "https://lh3.googleusercontent.com/ANel_Nm0SR9N3plRxpcVFBpFNjkv_Hd6LLavwWVptuFaDznBkkSVsniL5nSy8oO5F3Vfk8s_zWk1bXSuHaoM7rRPOFj4q6UqA0oXADqvwv6TC9W3gwQdDSeYA8oDR6DYYbRqvmXQxt_X4m2gyTkLlFEGjM3iRRT7YbUHHJ1NYKhkkb1G9TMynpfgFbC7I30ivHBdYpDCBeKxxSFmj1OiqDsDOvx6Qligt9matZ6ZLjHu225yt2uyx1y8STbSid_b1JwXwx1ps3af1W0He4jfuQ7bnJROuaq5ZivYsZBGNl6EFyS7wPLbPUkF_u2YCg4C7PEXRgM7RkuCWNMYgzakVHX2GTKlypjWVFi5Ys_SJrOkLOBnnLyc-kUaJHv84RjsEhX7_sicUyO_bvYL_1RFlacvFndUbpP6RPJwWON7nyZSKm-PiLUbnZIsy-8STALOqAkWaWFrFoosJt1QF3cqS_HluEjfI_btS85FnYidjr04rMNTKoTyZ-cwwM1b46XQp8ATpFBGjTq_SdOF6qXxfinKudW8XBX08iDAj8wWzIqCING3lc_M68TFBCjJfgEi4w9yX7ytZ7SxDFNKcpH47TXhqOB97-ift7E-i3QXq__MS4z1iw=s320-no";
    ImageView babyinvarios7;
    String urlbabyinvarios7 = "https://lh3.googleusercontent.com/4NTrFP0YoYIEB9PNjyMz8jWpE6LiNLyBMobqFKPQk6cfCt3vBC9f2w8zKegL1XplcQZmnxE1_Etw-cmLRbuRz8jkMnZ1JTgP5Q9CELYnW9XvCoAFw-FH77RnbEh9nyU5y7W_xCMz3iee7q2ZvaP8bwgzjPSEhFc3Ei6XeT3UUAfmgYTq_zkrqltxzXXBb4xVCuXGnkZEzZ0GT08QB7z-l1FdlOEfASDdGAj8sSWGYH5DGiN3awXgNxrMxv6wNzR8dck4KNT4kYVN38MqvuiPtzgWhCDyIKUfqiHeX_HAQpfdSq2YeO-smNYK0gwuZLrg28uKvBaNXcjGJJbVTCoNLR4OORh0uBOOWuxCfPCygPvZFXizmP2Z6aSHeZ3-acZzLuMtNLAoopjlQ2-HB81UoBvewXRHfoUbXMAWrCtzEHtcPMFRt6E8FnC7ktUkt1-uq0ABO8sVhMfhh4n_1LiZb2Xum9bCf8XCoMdqJ-tW-0RFKIBsDPl6IY_qyk1Ehs18B27iBi7QILA2dtS7a7WJCrbbB8_FhpCr-ZBzxDjOPitb2slukaxGlgkWLiWCbhZr4Tpgoxo5NJiuT7s-W8m1ft59B50aioKd2UipcgU3eojYkXwVHw=s320-no";
    ImageView babyinvarios8;
    String urlbabyinvarios8 = "https://lh3.googleusercontent.com/r1qY_F7WeY7jY-75I_G25XnslvAcd6-SmJvgk4gaF3sBcsNSdt2O9QEj3wjZxSKrY5jOcvKno1HhtkvbuoW6VaBnBxMd8gVpBYA_4Q56VzEDVz5wBDwFwAouVDTsA1yTo2oHo3LAxGR5B-7bEbYbx425V5ZehfxtMNjBlZ76VlDCNsomkd3DYwae2GzbIIWP5IXFS-4Bs0OvnBggkH5d5eQShgnMBPnVOSGV58PGU2zFZWrihMnlTQVh_jOci6YZRW7G6YWqi_KuIcUYxsj1oSDxswQU2iMHt0jzSmwJ8o2PXqxvzcnWIP-ja9X_6MTGeRmn6UXOCFs5KgjKJ-LXypKrvmj7NyAA_nR3pN_eKNbL5CCF0-vP-cTpM1tAwholEY4j4ioxMXT52h1nhub4_hrqJgid-TMiHNjnsGsiPr0StqCJTE1lkOqGQvV6_VvNwv_4yR_fg4BVmufnTTVd585pYxIeBN3OxmcENrIDaRJ8U0p2f64gmqxhxdH_2oF4w57S0Mub4GMqY4tsNNS-zWRkwPSPt4YG785mzC0kdTg19xkDcF7Y1mV8QX0CUQw2a7F8bLSvrg_jqe3LOmlTXerGqBZRLDFjQyGr3pjSu2GUwYZedg=s320-no";
    ImageView babyinvarios9;
    String urlbabyinvarios9 = "https://lh3.googleusercontent.com/eXAPDhkTuSKw-gsvxQ4_m9fj_5t7rnd1RjOtsjuxtA3fy4V3DNtKi_4sGWLgBJwKd-EmadWX8dqWb8TIrTxEuCVcI3_jURp52fkag4aGV3vGCNXg0vD5uAu5n4NlS1S_lEgnl4cf-YwE81dy3GYEMh6ESHnuXlr9WZiYCWrf3LHVDNPw3CuiXlFd90f_WEiP74CDuPeEL_740XsZffFuFmgkCDcLS_STVZ9GPJ6zgonNMX3MA2ezoDcq76gSv2wZe0St1PQZbLZIaO_am2KKRV50sv9jAr4CjcTXclwM3Yl4NZh8AV5zhA-6ofv3wdoggYe6KrOM61R8Ds36p3BUF0OdwWC5joiq13JKiDjdJjHIzyLeFK4hCLl6oqtsmzBwZgiWhvd_XyWpVAxT3MMeL_JMT_uL_W6u2Bmo5vPMMpO9fjipFKWB9zIqlahHugwv1CAH-q9La_M_XHluVViAYqdFnCzIQULH11BiRZpbqlSyeOTSRGpOQBnxvoiQ3TbwqNHmpYkphy8FgArpd8fMUwqPoQo51U5KEy7xs4-IiKatuRuPjbQZf43jtxK68cYJ5cNGaOdrCsRlbVk0Qq7dnvTXfHgSjKX_U7keZ1HA8zDTpvTSCXfPr8T3qx0WMQLp-6enC_2TOLtNNmHtKOwYG9MJhmUkq1_A0dinlkVh-0w=w328-h332-no";
    ImageView babyinvarios10;
    String urlbabyinvarios10 = "https://lh3.googleusercontent.com/wJ2SL3pD5xW1svQjdLvquuYSVc_kWxw8nVVMR7Q4T6x1FpxrIcZCJ2O6E3Y_apvwjORImbgg4UPWc1i1th8xCGb0vqiDwMLEYrm01U88flAizpIloewRzo1u3kJhiJFrVRZYT7oQMfbWS-rtYr7L_I8hM8z6wLC74WXTiZZ7zG7-BNGUuf_5NjgQ6zYenunoJSaR6N_u-VtMCU5iLfHxng9Ompe3_D8jV4ZxQp3CfER9Gh24grCaZaXCJ7Hn6Bf5lFJtpsHSsNL9Zl5OfuRhtzp0tA1SPGjOgDZ7bfTaJrllGqEB1iP5eVDzn5JFJrOGQoAPmWhIgqME7xkiaSNIVgfu-7mIRwuK0NqUqG46BRobhS_bvVppQvTb2Fjb6HxtTySv1-XXMzYi2p1-j1RgVp66i5tfJbWL0G8Z6e2KDrgQoHx-bucohg6rMHHOJkNaHYGCPYN5OtIlmyxB-h3NcKKwXs73XZ5EPuu4bsKh34tlYee0kqLe0cu8AEYhq3zeNR8G6Xau7MWaa51GwsoUPMmZ7oB2MsG_KeqvoUIwf-MxIYv-F56r6YCABWtad0c8T3qgCPkAkfto7-SHlvVeelwijQrhuxdty7N4IiWtRLLNAjSy0KZ1NrzjCSpslecaqWR0VdgdBZdL9oKa-gkn9dxaYVFcZE_PQREeDXERnPo=w328-h332-no";
    ImageView babyinvarios11;
    String urlbabyinvarios11 = "https://lh3.googleusercontent.com/tb7Wf-G7S7P6cccWJ_yytR76mJcEprkz0L8lEeAqwmzJyPFD_RyWl0NBoQ6FORd-lRCS4MZXLWM2PczVG9ZFNf52yazzGrI1ZfEaDOrxBKTyJE-GB2dRckSnooCjPJpEFUqcqXL5i3x1gObrXYb1CboVjG9BeAn6-ENHTMC86VSx-X-Hugzz4kU9CcTRWPV2K_n-DqMhF0tK-NzO28zStxss5xdpGyEUnRr9nTYVX_Qadw4UkqpdiPzuzry4mNGSg3s0RzcSCgs4mXtiw1AT37wKrlenpee1GPTLlCEzEPZBAS5Lx3wOLEaBCBPLcRHqiINqXKirPZY6vMSmiZo2LI1A4qJ0_T1zfyAqWy4Sp2WThYKvLzk_WzQ62IdLCWKOH9JSUjsVDhz_5vbQ-5vENo52qOzxO75J3qiIRwSBQKZU8LZ0sGs9V7DeWmK7UcApIp5iB7Zk3wnVAvnW9faLgiInn_JO6r1Z4-8oFsYFykQU-Q7Xj5oH-iYPNyL1m-NYOgiYi3CVZcYI5hriGnuda5kpDZZg2kTrCxr2ZkHcg8U__593EBBxhiEApAGHbgoHCs1zzFnQHkJptFI5tIcyG-g8lArmWII8pNKAyPZ6O1SLoabLP3L7qRijXJ6ClYgkdmj6JxqInUlqmw57A0eqkOaPSaFhtrzW6PsKKOowjdo=w328-h332-no";
    ImageView babyinvarios12;
    String urlbabyinvarios12 = "https://lh3.googleusercontent.com/5t3OKtiilkz4pm5QVSbLm6oYLJJSgPWPI3vpBIByIFDf3SSaeydaY11GtGONMFC_nVQcDu_-ialnfjY3tS-MGfAFVbhxnOsQRf1PkYOqPcG1X0cODtlmkHrEzsXKKh9xfobvzcnQbSCaEwcECZQ17Sil0EmpeKK6o2afuVn6TQDHOhUWKWvqn6a-EwaA6RjUx_5SWI59aRkGBOvRuruSDgIT00rxvm26De20zGNGWwbud60xUHrZqVJ8FMWp1B9q9zPXITNS8J2RyJwG3hBkGlIe4jSvh2sD9wIVUuUUdWPSJzaTlUO4yESpeepcyL0LchoBX6GrLFiF7_C-aE0T__fXgPU4cRt8_xCg11hWF8Qo37EwiZihcCAO5PxcymnCA-WqP1XaPJg4Yh70_W-L4FpagR9G8lq6zlC2cnXP07p2m38KYnm2zlUtWL7mq8hSpPv6qfo5bWbHa6PCGqbbJC01xw-E79Emx5kk0x8nWtSorF6K_sxNRIP1BRj6ZEIoRjhsx5cjqMZVKepVdIHDhP8oUmXSjhp1ETjoj1JZjJC56ejVPbPfe5uBjdz3iYhGTrvJUWhfCXdESoQx500t4l094ZvQ7-WPzlWh4SqabTC_iURDTrO-yAMoCIa99nTzMBRYiPynCblf0m1AGSuhTyj8o1WNVQJNQPpNuQTwCb8=w328-h332-no";
    ImageView babyinvarios13;
    String urlbabyinvarios13 = "https://lh3.googleusercontent.com/zuh3zreyVxY9ZHh0aXMnftuFxzQGsk09rVlRff3AdC6YD3pUbIrkbe1Jc5JCm5M8owSuqMZTepUBrGApSeJGw_gLf8gkBPW1opn4LmRKUIwbadNHlWZ090WrQtuDnndZcBZ64DXsFDbyV6JeAurYKPXq5qEvqJbYs-Cd6xFhhMW6OoM-qSHrbVcnKPsnKbP6dvAQeHLHkIOmVe9iDnxcbxw8Dg0gKjoT1z9FlNxqcqU0ed2kyhgdOF0Iilp66-7FybtaHOqfJD7xETMMOgknAIR9703RSFRAuzTqaIXBc5RT1CqWhwzNeBwAA265n7JZO52vJAoHY6IRbqw0oCSorRy-IMluzUVK1-2l47sI2riho5gA0to43MYxd_vlMNQvckH5gEiZKZ-Bmmu8RdellQnGf-qBy05lTflUlI__n3d0WBS3K9_oQyX6zBp5dOUgdTN7gL3FTDIga2_21tk1zzPsfNaIedf9Y45xqSBh2hvQVvfVlByqm9FMeRXaTr8yde_Gjcj4cuONTSOXWhzb3qL7IKtA0mtb1_IYEH_0pmdIdbvL8FKfOf1A3j42sDQr-0MOXxgtVcLXZpUL40ue7ncNFztpb5mL1rUdeMSxvZRJebM9oBXq3EKkFDvS6wbppc0hVpw8JaYNaW6DsMXrtKZdY-mHH9xVKvSAiYxWdz4=w328-h332-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios);

        new preciobabyinvariosAsync().execute();

        /* babyinvarios 1 */

        babyinvarios1a1 = (ImageView)findViewById(R.id.babyinvarios1a1);
        Picasso.with(this).load(urlbabyinvarios1).into(babyinvarios1a1);

        txtbabyinvarios1a1 = (TextView)findViewById(R.id.txtbabyinvarios1a1);
        final String stconsultaa1 = txtbabyinvarios1a1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });


        btncomprababyinvarios1 = (Button)findViewById(R.id.btncomprababyinvarios1);
        btncomprababyinvarios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios1 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios1.putExtra("string", urlcomboa1);
                startActivity(btncomprababyinvarios1);
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

        /* babyinvarios 2 */

        babyinvarios2a2 = (ImageView)findViewById(R.id.babyinvarios2a2);
        Picasso.with(this).load(urlbabyinvarios2).into(babyinvarios2a2);

        txtbabyinvarios2a2 = (TextView)findViewById(R.id.txtbabyinvarios2a2);
        final String stconsultaa2 = txtbabyinvarios2a2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });


        btncomprababyinvarios2 = (Button)findViewById(R.id.btncomprababyinvarios2);
        btncomprababyinvarios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios2 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios2.putExtra("string", urlcomboa2);
                startActivity(btncomprababyinvarios2);
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

        /* babyinvarios 3 */

        babyinvarios3a3 = (ImageView)findViewById(R.id.babyinvarios3a3);
        Picasso.with(this).load(urlbabyinvarios3).into(babyinvarios3a3);

        txtbabyinvarios3a3 = (TextView)findViewById(R.id.txtbabyinvarios3a3);
        final String stconsultaa3 = txtbabyinvarios3a3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });


        btncomprababyinvarios3 = (Button)findViewById(R.id.btncomprababyinvarios3);
        btncomprababyinvarios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios3 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios3.putExtra("string", urlcomboa3);
                startActivity(btncomprababyinvarios3);
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

        /* babyinvarios 4 */

        babyinvarios4a4 = (ImageView)findViewById(R.id.babyinvarios4a4);
        Picasso.with(this).load(urlbabyinvarios4).into(babyinvarios4a4);

        txtbabyinvarios4a4 = (TextView)findViewById(R.id.txtbabyinvarios4a4);
        final String stconsultaa4 = txtbabyinvarios4a4.getText().toString();
        btnconsultaa4 = (Button)findViewById(R.id.btnconsultaa4);
        btnconsultaa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa4 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa4.putExtra("consulta", stconsultaa4);
                startActivity(btnconsultaa4);
            }
        });


        btncomprababyinvarios4 = (Button)findViewById(R.id.btncomprababyinvarios4);
        btncomprababyinvarios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios4 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios4.putExtra("string", urlcomboa4);
                startActivity(btncomprababyinvarios4);
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

        /* babyinvarios 5 */

        babyinvarios5a5 = (ImageView)findViewById(R.id.babyinvarios5a5);
        Picasso.with(this).load(urlbabyinvarios5).into(babyinvarios5a5);

        txtbabyinvarios5a5 = (TextView)findViewById(R.id.txtbabyinvarios5a5);
        final String stconsultaa5 = txtbabyinvarios5a5.getText().toString();
        btnconsultaa5 = (Button)findViewById(R.id.btnconsultaa5);
        btnconsultaa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa5 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa5.putExtra("consulta", stconsultaa5);
                startActivity(btnconsultaa5);
            }
        });


        btncomprababyinvarios5 = (Button)findViewById(R.id.btncomprababyinvarios5);
        btncomprababyinvarios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios5 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios5.putExtra("string", urlcomboa5);
                startActivity(btncomprababyinvarios5);
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

        /* babyinvarios 6 */

        babyinvarios6a6 = (ImageView)findViewById(R.id.babyinvarios6a6);
        Picasso.with(this).load(urlbabyinvarios6).into(babyinvarios6a6);

        txtbabyinvarios6a6 = (TextView)findViewById(R.id.txtbabyinvarios6a6);
        final String stconsultaa6 = txtbabyinvarios6a6.getText().toString();
        btnconsultaa6 = (Button)findViewById(R.id.btnconsultaa6);
        btnconsultaa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa6 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa6.putExtra("consulta", stconsultaa6);
                startActivity(btnconsultaa6);
            }
        });


        btncomprababyinvarios6 = (Button)findViewById(R.id.btncomprababyinvarios6);
        btncomprababyinvarios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios6 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios6.putExtra("string", urlcomboa6);
                startActivity(btncomprababyinvarios6);
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

        /* babyinvarios 7 */

        babyinvarios7a7 = (ImageView)findViewById(R.id.babyinvarios7a7);
        Picasso.with(this).load(urlbabyinvarios7).into(babyinvarios7a7);

        txtbabyinvarios7a7 = (TextView)findViewById(R.id.txtbabyinvarios7a7);
        final String stconsultaa7 = txtbabyinvarios7a7.getText().toString();
        btnconsultaa7 = (Button)findViewById(R.id.btnconsultaa7);
        btnconsultaa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa7 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa7.putExtra("consulta", stconsultaa7);
                startActivity(btnconsultaa7);
            }
        });


        btncomprababyinvarios7 = (Button)findViewById(R.id.btncomprababyinvarios7);
        btncomprababyinvarios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios7 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios7.putExtra("string", urlcomboa7);
                startActivity(btncomprababyinvarios7);
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

        /* babyinvarios 8 */

        babyinvarios8a8 = (ImageView)findViewById(R.id.babyinvarios8a8);
        Picasso.with(this).load(urlbabyinvarios8).into(babyinvarios8a8);

        txtbabyinvarios8a8 = (TextView)findViewById(R.id.txtbabyinvarios8a8);
        final String stconsultaa8 = txtbabyinvarios8a8.getText().toString();
        btnconsultaa8 = (Button)findViewById(R.id.btnconsultaa8);
        btnconsultaa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa8 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa8.putExtra("consulta", stconsultaa8);
                startActivity(btnconsultaa8);
            }
        });


        btncomprababyinvarios8 = (Button)findViewById(R.id.btncomprababyinvarios8);
        btncomprababyinvarios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios8 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios8.putExtra("string", urlcomboa8);
                startActivity(btncomprababyinvarios8);
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

        /* babyinvarios 9 */

        babyinvarios9a9 = (ImageView)findViewById(R.id.babyinvarios9a9);
        Picasso.with(this).load(urlbabyinvarios9).into(babyinvarios9a9);

        txtbabyinvarios9a9 = (TextView)findViewById(R.id.txtbabyinvarios9a9);
        final String stconsultaa9 = txtbabyinvarios9a9.getText().toString();
        btnconsultaa9 = (Button)findViewById(R.id.btnconsultaa9);
        btnconsultaa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa9 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa9.putExtra("consulta", stconsultaa9);
                startActivity(btnconsultaa9);
            }
        });


        btncomprababyinvarios9 = (Button)findViewById(R.id.btncomprababyinvarios9);
        btncomprababyinvarios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios9 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios9.putExtra("string", urlcomboa9);
                startActivity(btncomprababyinvarios9);
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

        /* babyinvarios 10 */

        babyinvarios10a10 = (ImageView)findViewById(R.id.babyinvarios10a10);
        Picasso.with(this).load(urlbabyinvarios10).into(babyinvarios10a10);

        txtbabyinvarios10a10 = (TextView)findViewById(R.id.txtbabyinvarios10a10);
        final String stconsultaa10 = txtbabyinvarios10a10.getText().toString();
        btnconsultaa10 = (Button)findViewById(R.id.btnconsultaa10);
        btnconsultaa10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa10 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa10.putExtra("consulta", stconsultaa10);
                startActivity(btnconsultaa10);
            }
        });


        btncomprababyinvarios10 = (Button)findViewById(R.id.btncomprababyinvarios10);
        btncomprababyinvarios10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios10 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios10.putExtra("string", urlcomboa10);
                startActivity(btncomprababyinvarios10);
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

        /* babyinvarios 11 */

        babyinvarios11a11 = (ImageView)findViewById(R.id.babyinvarios11a11);
        Picasso.with(this).load(urlbabyinvarios11).into(babyinvarios11a11);

        txtbabyinvarios11a11 = (TextView)findViewById(R.id.txtbabyinvarios11a11);
        final String stconsultaa11 = txtbabyinvarios11a11.getText().toString();
        btnconsultaa11 = (Button)findViewById(R.id.btnconsultaa11);
        btnconsultaa11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa11 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa11.putExtra("consulta", stconsultaa11);
                startActivity(btnconsultaa11);
            }
        });


        btncomprababyinvarios11 = (Button)findViewById(R.id.btncomprababyinvarios11);
        btncomprababyinvarios11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios11 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios11.putExtra("string", urlcomboa11);
                startActivity(btncomprababyinvarios11);
            }
        });

        lineara11 = (LinearLayout)findViewById(R.id.lineara11);

        switch11 = (Switch)findViewById(R.id.switch11);
        switch11.setChecked(false);
        switch11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch11.isChecked()) {
                    lineara11.setVisibility(View.VISIBLE);
                } else {
                    lineara11.setVisibility(View.GONE);
                }

            }
        });

        /* babyinvarios 12 */

        babyinvarios12a12 = (ImageView)findViewById(R.id.babyinvarios12a12);
        Picasso.with(this).load(urlbabyinvarios12).into(babyinvarios12a12);

        txtbabyinvarios12a12 = (TextView)findViewById(R.id.txtbabyinvarios12a12);
        final String stconsultaa12 = txtbabyinvarios12a12.getText().toString();
        btnconsultaa12 = (Button)findViewById(R.id.btnconsultaa12);
        btnconsultaa12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa12 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa12.putExtra("consulta", stconsultaa12);
                startActivity(btnconsultaa12);
            }
        });


        btncomprababyinvarios12 = (Button)findViewById(R.id.btncomprababyinvarios12);
        btncomprababyinvarios12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios12 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios12.putExtra("string", urlcomboa12);
                startActivity(btncomprababyinvarios12);
            }
        });

        lineara12 = (LinearLayout)findViewById(R.id.lineara12);

        switch12 = (Switch)findViewById(R.id.switch12);
        switch12.setChecked(false);
        switch12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch12.isChecked()) {
                    lineara12.setVisibility(View.VISIBLE);
                } else {
                    lineara12.setVisibility(View.GONE);
                }

            }
        });

        /* babyinvarios 13 */

        babyinvarios13a13 = (ImageView)findViewById(R.id.babyinvarios13a13);
        Picasso.with(this).load(urlbabyinvarios13).into(babyinvarios13a13);

        txtbabyinvarios13a13 = (TextView)findViewById(R.id.txtbabyinvarios13a13);
        final String stconsultaa13 = txtbabyinvarios13a13.getText().toString();
        btnconsultaa13 = (Button)findViewById(R.id.btnconsultaa13);
        btnconsultaa13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa13 = new Intent(babyinvarios.this,contacto.class);
                btnconsultaa13.putExtra("consulta", stconsultaa13);
                startActivity(btnconsultaa13);
            }
        });


        btncomprababyinvarios13 = (Button)findViewById(R.id.btncomprababyinvarios13);
        btncomprababyinvarios13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios13 = new Intent(babyinvarios.this,webview.class);
                btncomprababyinvarios13.putExtra("string", urlcomboa13);
                startActivity(btncomprababyinvarios13);
            }
        });

        lineara13 = (LinearLayout)findViewById(R.id.lineara13);

        switch13 = (Switch)findViewById(R.id.switch13);
        switch13.setChecked(false);
        switch13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch13.isChecked()) {
                    lineara13.setVisibility(View.VISIBLE);
                } else {
                    lineara13.setVisibility(View.GONE);
                }

            }
        });


        preciobabyinvarios1 = (TextView)findViewById(R.id.preciobabyinvarios1);
        preciobabyinvarios2 = (TextView)findViewById(R.id.preciobabyinvarios2);
        preciobabyinvarios3 = (TextView)findViewById(R.id.preciobabyinvarios3);
        preciobabyinvarios4 = (TextView)findViewById(R.id.preciobabyinvarios4);
        preciobabyinvarios5 = (TextView)findViewById(R.id.preciobabyinvarios5);
        preciobabyinvarios6 = (TextView)findViewById(R.id.preciobabyinvarios6);
        preciobabyinvarios7 = (TextView)findViewById(R.id.preciobabyinvarios7);
        preciobabyinvarios8 = (TextView)findViewById(R.id.preciobabyinvarios8);
        preciobabyinvarios9 = (TextView)findViewById(R.id.preciobabyinvarios9);
        preciobabyinvarios10 = (TextView)findViewById(R.id.preciobabyinvarios10);
        preciobabyinvarios11 = (TextView)findViewById(R.id.preciobabyinvarios11);
        preciobabyinvarios12 = (TextView)findViewById(R.id.preciobabyinvarios12);
        preciobabyinvarios13 = (TextView)findViewById(R.id.preciobabyinvarios13);

        babyinvarios1 = (ImageView)findViewById(R.id.babyinvarios1);
        Picasso.with(this).load(urlbabyinvarios1).into(babyinvarios1);

        babyinvarios2 = (ImageView)findViewById(R.id.babyinvarios2);
        Picasso.with(this).load(urlbabyinvarios2).into(babyinvarios2);

        babyinvarios3 = (ImageView)findViewById(R.id.babyinvarios3);
        Picasso.with(this).load(urlbabyinvarios3).into(babyinvarios3);

        babyinvarios4 = (ImageView)findViewById(R.id.babyinvarios4);
        Picasso.with(this).load(urlbabyinvarios4).into(babyinvarios4);

        babyinvarios5 = (ImageView)findViewById(R.id.babyinvarios5);
        Picasso.with(this).load(urlbabyinvarios5).into(babyinvarios5);

        babyinvarios6 = (ImageView)findViewById(R.id.babyinvarios6);
        Picasso.with(this).load(urlbabyinvarios6).into(babyinvarios6);

        babyinvarios7 = (ImageView)findViewById(R.id.babyinvarios7);
        Picasso.with(this).load(urlbabyinvarios7).into(babyinvarios7);

        babyinvarios8 = (ImageView)findViewById(R.id.babyinvarios8);
        Picasso.with(this).load(urlbabyinvarios8).into(babyinvarios8);

        babyinvarios9 = (ImageView)findViewById(R.id.babyinvarios9);
        Picasso.with(this).load(urlbabyinvarios9).into(babyinvarios9);

        babyinvarios10 = (ImageView)findViewById(R.id.babyinvarios10);
        Picasso.with(this).load(urlbabyinvarios10).into(babyinvarios10);

        babyinvarios11 = (ImageView)findViewById(R.id.babyinvarios11);
        Picasso.with(this).load(urlbabyinvarios11).into(babyinvarios11);

        babyinvarios12 = (ImageView)findViewById(R.id.babyinvarios12);
        Picasso.with(this).load(urlbabyinvarios12).into(babyinvarios12);

        babyinvarios13 = (ImageView)findViewById(R.id.babyinvarios13);
        Picasso.with(this).load(urlbabyinvarios13).into(babyinvarios13);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciobabyinvariosAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e1ea2bcef20db1062278cd6e562b932f";
        String preciobabyinvarios1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6712232c5add22599885e180274875a3";
        String preciobabyinvarios2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e110c5ef4782bd1e35deae91197fbef1";
        String preciobabyinvarios3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=07e04dc39d89342dc070888d16c93084";
        String preciobabyinvarios4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=909f5f4179bdcb3a56e5a436ea3607f5";
        String preciobabyinvarios5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1e1189278f6a84da84dbf3d4ccdeb353";
        String preciobabyinvarios6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=50080f1de4b9da07946b4def126c79c4";
        String preciobabyinvarios7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e08f4a83bde266f528748f53ad1ba9f3";
        String preciobabyinvarios8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=675409f50684a85a2ed4214d2b7e8776#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciobabyinvarios9st;
        String urlprecio10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dbafe8bf743780e4b08a94e2d5635d6d#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciobabyinvarios10st;
        String urlprecio11 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3fa687634ea3160f9f8da226b8f86f1f#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciobabyinvarios11st;
        String urlprecio12 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=169e5a774711788657e4668c86924bea#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciobabyinvarios12st;
        String urlprecio13 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=af66fa25ae89d7cf5987895121c57960#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciobabyinvarios13st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciobabyinvarios1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciobabyinvarios2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciobabyinvarios3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciobabyinvarios4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciobabyinvarios5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciobabyinvarios6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                preciobabyinvarios7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                preciobabyinvarios8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                preciobabyinvarios9st = metapropoerty9.attr("content");

                Document doc10 = Jsoup.connect(urlprecio10).get();
                Elements metapropoerty10 = doc10.select("meta[property=\"og:description\"]");
                preciobabyinvarios10st = metapropoerty10.attr("content");

                Document doc11 = Jsoup.connect(urlprecio11).get();
                Elements metapropoerty11 = doc11.select("meta[property=\"og:description\"]");
                preciobabyinvarios11st = metapropoerty11.attr("content");

                Document doc12 = Jsoup.connect(urlprecio12).get();
                Elements metapropoerty12 = doc12.select("meta[property=\"og:description\"]");
                preciobabyinvarios12st = metapropoerty12.attr("content");

                Document doc13 = Jsoup.connect(urlprecio13).get();
                Elements metapropoerty13 = doc13.select("meta[property=\"og:description\"]");
                preciobabyinvarios13st = metapropoerty13.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciobabyinvarios1.setText(preciobabyinvarios1st);
            preciobabyinvarios2.setText(preciobabyinvarios2st);
            preciobabyinvarios3.setText(preciobabyinvarios3st);
            preciobabyinvarios4.setText(preciobabyinvarios4st);
            preciobabyinvarios5.setText(preciobabyinvarios5st);
            preciobabyinvarios6.setText(preciobabyinvarios6st);
            preciobabyinvarios7.setText(preciobabyinvarios7st);
            preciobabyinvarios8.setText(preciobabyinvarios8st);
            preciobabyinvarios9.setText(preciobabyinvarios9st);
            preciobabyinvarios10.setText(preciobabyinvarios10st);
            preciobabyinvarios11.setText(preciobabyinvarios11st);
            preciobabyinvarios12.setText(preciobabyinvarios12st);
            preciobabyinvarios13.setText(preciobabyinvarios13st);
        }

    }
}
