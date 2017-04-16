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

public class chiccomamaderas extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas1;
    Button btnconsultaa1;
    TextView txtchiccomamaderas1a1;
    String urlcomboa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=42aa73e7d9cacea2cd18b1a7c7ed1fca";
    ImageView chiccomamaderas1a1;
    Button btncomprachiccomamaderas2;
    Button btnconsultaa2;
    TextView txtchiccomamaderas2a2;
    String urlcomboa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=921d15ee20f0dddeeeed71e06b22557a";
    ImageView chiccomamaderas2a2;
    Button btncomprachiccomamaderas3;
    Button btnconsultaa3;
    TextView txtchiccomamaderas3a3;
    String urlcomboa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de5886502a538d82275e2532ecd73251";
    ImageView chiccomamaderas3a3;
    Button btncomprachiccomamaderas4;
    Button btnconsultaa4;
    TextView txtchiccomamaderas4a4;
    String urlcomboa4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5d1ef7650e22b6e463cdfb812acf7de0";
    ImageView chiccomamaderas4a4;
    Button btncomprachiccomamaderas5;
    Button btnconsultaa5;
    TextView txtchiccomamaderas5a5;
    String urlcomboa5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=a05008652603ccfad9666eb8dcd0a133";
    ImageView chiccomamaderas5a5;
    Button btncomprachiccomamaderas6;
    Button btnconsultaa6;
    TextView txtchiccomamaderas6a6;
    String urlcomboa6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=962569427313ba6d0d9902effbc4a31c";
    ImageView chiccomamaderas6a6;
    Button btncomprachiccomamaderas7;
    Button btnconsultaa7;
    TextView txtchiccomamaderas7a7;
    String urlcomboa7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3f176ccb8cc4972cd9de23dd503fbf01";
    ImageView chiccomamaderas7a7;
    Button btncomprachiccomamaderas8;
    Button btnconsultaa8;
    TextView txtchiccomamaderas8a8;
    String urlcomboa8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b2ba59fda2d26dc6d00f7c0bfa80885b";
    ImageView chiccomamaderas8a8;
    Button btncomprachiccomamaderas9;
    Button btnconsultaa9;
    TextView txtchiccomamaderas9a9;
    String urlcomboa9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0bd393d865ec9e08e6e570c802cc93e6";
    ImageView chiccomamaderas9a9;
    Button btncomprachiccomamaderas10;
    Button btnconsultaa10;
    TextView txtchiccomamaderas10a10;
    String urlcomboa10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=647d80235744dd9fa0e7323d55d66712";
    ImageView chiccomamaderas10a10;
    Button btncomprachiccomamaderas11;
    Button btnconsultaa11;
    TextView txtchiccomamaderas11a11;
    String urlcomboa11 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=da99acd0caf73566da3f17e1a7119dbf";
    ImageView chiccomamaderas11a11;
    Button btncomprachiccomamaderas12;
    Button btnconsultaa12;
    TextView txtchiccomamaderas12a12;
    String urlcomboa12 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c130da95e53441caa3e7456ef0685890";
    ImageView chiccomamaderas12a12;
    Button btncomprachiccomamaderas13;
    Button btnconsultaa13;
    TextView txtchiccomamaderas13a13;
    String urlcomboa13 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4c766fa4aa1cffe3fca07f848d12a0b8";
    ImageView chiccomamaderas13a13;
    Button btncomprachiccomamaderas14;
    Button btnconsultaa14;
    TextView txtchiccomamaderas14a14;
    String urlcomboa14 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8bf0b3d4d7d04fd871c93fb71dbb57a4";
    ImageView chiccomamaderas14a14;
    Button btncomprachiccomamaderas15;
    Button btnconsultaa15;
    TextView txtchiccomamaderas15a15;
    String urlcomboa15 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=77dba17f306b92bb6731a83216973346";
    ImageView chiccomamaderas15a15;
    Button btncomprachiccomamaderas16;
    Button btnconsultaa16;
    TextView txtchiccomamaderas16a16;
    String urlcomboa16 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=343fa9458fa3bcd510b11288fa7129c8";
    ImageView chiccomamaderas16a16;
    Button btncomprachiccomamaderas17;
    Button btnconsultaa17;
    TextView txtchiccomamaderas17a17;
    String urlcomboa17 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d05b32fd707e18e374fe785c7c7b126e";
    ImageView chiccomamaderas17a17;
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
    Switch switch17;
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
    LinearLayout lineara14;
    LinearLayout lineara15;
    LinearLayout lineara16;
    LinearLayout lineara17;
    TextView preciochiccomamaderas1;
    TextView preciochiccomamaderas2;
    TextView preciochiccomamaderas3;
    TextView preciochiccomamaderas4;
    TextView preciochiccomamaderas5;
    TextView preciochiccomamaderas6;
    TextView preciochiccomamaderas7;
    TextView preciochiccomamaderas8;
    TextView preciochiccomamaderas9;
    TextView preciochiccomamaderas10;
    TextView preciochiccomamaderas11;
    TextView preciochiccomamaderas12;
    TextView preciochiccomamaderas13;
    TextView preciochiccomamaderas14;
    TextView preciochiccomamaderas15;
    TextView preciochiccomamaderas16;
    TextView preciochiccomamaderas17;
    ImageView chiccomamaderas1;
    String urlchiccomamaderas1 = "https://lh3.googleusercontent.com/6v3Wo6gv__psB2pWhyVcBn-y0DO3RYhmgCRCsUyzb7zAwXBXaipEo9bB3zB6jPt-FlFddppHCy4ZWbNrN0NgRJqM7QuIgfxaJbYQQoiQGgL_CBCceE_fytLRb1m4Qf6J_ZHn43swazGB9maeBfZPFpf00-fIYGDpDO-VPglsnRTR9mB-gpM2ySj4VwvkwF2WyISE18m5nsp7GmTqbYRjUfQJkuiuR9p_JXFoXtWL_nVQzSAKhc213dmlh3OBsymqXRMAAutdRMOkOTx3MdnhLBPDiXZHJC0k122z3G0y8dKVebDum9aJAiYo8sQU2u71ea3BzHnjVBghnkYqGhzh7lP2byHLT8gC3oroveGSfgSHbEqhiEzrCQ4QsKIr7_z36a7fYeqdi8do2fhSmHBQ1jj5dHOAGuOEbhntrZ8Yg7wGdi6Bs9y0Sh2u7p5CYPQXBRnwwQyR35TusUezLZToygu-ehHWz5Zfl9d8BVHjoiz0g6B9eD_-WVX6y2cHSCspn24sS_6w67zYS-MGKMuAqVZ5pKmyQk7XAfDjIPutyBL2yRabtCBk4YKNBypLfKP58nTGPhQ0eAUmVLGvmtt3iV1CPCFGD1N9gHQpGHjpOOokPdhnDg=w400-h399-no";
    ImageView chiccomamaderas2;
    String urlchiccomamaderas2 = "https://lh3.googleusercontent.com/h3Z5ynWmhdEsMPjJllpiruFTDeI70WfurYUdiYY3ZRcJUdWQvcj0mYCCgQsnYIwADLNBrjATtpTPJCBlPNZBWzicsJta4FTavr4ySWCA4FsBp8je6vYgb4sP62-OB_F_-UTzVs9SrqHETPayobeVDEh8LSnNp1B21pd399c3DquCWYwhFahx5SDhSKoiF3B8Ii0ph1zzTBd9IoQNtsJmbAJTOgn6is5qjVg1aOlai2Y3XgJKhs34xyQYD1cVigaY65r70Ubpl9zVg7bcsdlziCTB3Pi3m2BD_nePYsOuAilqSPQ0ct-fBRkZjYG3necZ9JEHIwdNep3OTPW42dZOS8lFl6BXB2Pe9M-2d_73xuX5N4orPGqdHEKUxkio3Zl7TayB5aJhQ9vwIZDlOAmHL-Jo2QIXab8prZa8t9wXjbRR_O9lvTwy7OYhWONK9h4kQwhALxB69O3chk3Ki83mqelKCfaY7a8wLstqFS91liUWuU9kIp9C5hay9ZVHh5WjFlZ7PwEMBYiTVuGT09KhVFdcZ7qRAP7KbRcV71EGInWYH7hdCiFKTBQe4B3-BhoIupkpb9l27D5i59x5hySYWOgZZe-HNDPq5nJTdzjMOey_zsJlzA=w400-h399-no";
    ImageView chiccomamaderas3;
    String urlchiccomamaderas3 = "https://lh3.googleusercontent.com/zOmQFqJ9eXQCu-g8RFslDM0g6cslxk8mkvdDt8yon5BNEuWfdPpGVQWgCNU3CKQnClBx04Ne5f--rH3aJjXhmhaXU-E8GT5Vz2sgfFys7La7Jib-q-SER03R-RT4r7L2LuVobu6cvrnYSM7j_vDhKzCO13Dm4fkKXVCE7OwMCRe-n1i1QMi6u_BOtSPtyx39FyPNG24q7M8zrzTofwbJcX3A9v2KtiRm0Zn0V_7e_dPEgNMr0SN_obWhsXr100Mq6kl9VFaYfOzkm7Xmklww9H3lNlgaUmQMftbBkdCA-g6AEJDJVKemKNBmELw34EvZJKuQP7qRwRItO1k1aHiI1sV-Iav1On_sNtpsd4JER8bBeAIUoqAXdWRyiEUXeL0DHMXzZkChB3mTd-4oDLS0qdANjSWJxUw4sn48uHqhdjP9OH2M_wIivg1o1wT8nlzcIHGG6RQwMlYTvMnmsw4cJezIbnqkR5jLfWd1-J2HjMyl6hDHGdlt0Po_xdEjM8azN16cBDHNGzbw-OTQTyem_eaz8hZYq_r87TzxMvPiCh3s7XoMfslCKn4g8VMl0f3SlqcBT1LDSJpTa35Evfj6AsQbVpuXHUZt7KtQfcxpWowDux-p3g=w396-h399-no";
    ImageView chiccomamaderas4;
    String urlchiccomamaderas4 = "https://lh3.googleusercontent.com/_0gT5luWvXdQM-COtLygs2s-HPvnO-e-ZqRmE3lGs3ra1u8DD9_51b_y8Gui80z72dQUmkmxWAEe6a4GlZWhnLC2rJqZvwzgy7S57gRMvEAiH5RebjXy1RIyfizZKrn3EuehF_s2vZuYscF0hJ3OEL7SnvmA4TwwIfNA-ncgGyKXvsp8aalqS-DW4Wj3jyM71K1Q2iodfwSyc72K40p4CyzGMh265Cj-9uj7qbSKDT1atU4nNZvLFpUoTbKEZFq-7QdACqdZqXIxC-9Lqm9d77246YnVpbNy0yVDkS1g8P0t3C-csaOtd_esWh3Wd9ExT_FNPlhnvt5XiE8ZjvOHEhwiHJOrT3udGfBKMGNT5FwrE9MKZY6N_9gn_UnD79M3hGgcnnq5zSSJoDxlzN_oOnYqGjzIboBss7dfZOXy3Szj3qwuoGhjzVWUeonL5OKDcHi-V7Ydmr6irqpeiK_oq92mjrPiMnb5DK4E00KlHJow7kZGIn_-mM16bmFN_YKE5SYUUZhDJXcRkhQfUfomRWRMDvEFJTyTv_FJYdNqRFYlZfRDgL1dSaUyXUghGDl8pD71Haypm-Vsw3o1-0wZaIn3hriuQ3ckGLCA8h77nVPilO70pQ=w400-h399-no";
    ImageView chiccomamaderas5;
    String urlchiccomamaderas5 = "https://lh3.googleusercontent.com/dCk-OJAS4G-3p_o3hJ35pTUHpC4wwnwmusJKqh5YiGc9_58mk5aqBNC3nPSTYUMM2LoZ-TZV3kPWUq6Utk8wU6uMKkDOA2nVvD2Dy-zOpXO302LzOHIu5qwBNYi-Jf_hhoGcUPtvMn6wdegJDtBwK8F8n7eumx59gkfHxGnlzoXJhuYvDDbeNn01XtHJEyYQbTHOecd5n6UMWUgNh_f07uDnwBok2sRGsV2CaUyJWZjs2NjnfMYcy01dB64BMCGsRWfgXssTjG_YItoOcfX2XV7tLHC0eAPUOedcReT3NS_6YGZ-j1dMROSD-K8uJRdrpON7ZLNgTIjEc_HSR2H2NCZBjAImWAighBPR9_Oixc1CcQIMMpYh7g75LdcMShUOkFa5K-Z_90Nm85BV7YuxFDxpBA9uTp0Oa_z6tXKbty9eQwjGcPcz8wshKYeX4UZWHVUeUyT6vJv0c0WR_LMiSXOiOSZwBOvMm1XGSB_acjWZmovygDfdwDjkSblCp2h-_sZN8RshZm6x8sToz3gZ2aGOTbiPfwGgyvmZeyPAQnNRt3jYWPralQ09JuegwiVag1OlBLcbjkAO8CmBon3TjGbbzRhc0SQqPgT7nZv0ULtRo5fEfA=w396-h400-no";
    ImageView chiccomamaderas6;
    String urlchiccomamaderas6 = "https://lh3.googleusercontent.com/TfMAzh6QmbVGFwiw9gEbpyrB6w0d1vRUg4Tq8WabS0TYliiXEclnzeBSh6JKjpVTgX-oGrY_ov4LeYZgW51c9uozyIOPKAJD4YBqbCSp7fnqLlBB8Xty7yc4F5D86a4jjyGvlmyQmmTcLwEH7t3ykB57cXWkrn-IoJQy-Pig-nYrfj4Gn3UgMNu4fc7LsgIR9c4x37XyrAHtJEq5Zopf_1GQOsl2fVS4gXQXMafifPkHN1SnZBVOxM4qOQFYgTU14CrRyeil447uvWx_tPkZSYphof6CXV1g121kgAhNlwv3x5WpsCqwElN9HRjJuGhGahzkiPe-y_c9Kd5OC6Z0AMx5wbbl5oiiDBi3W841tn4Wlmq8qtcHenVlRKZ39ReH511q3EZ3aizyICscwyXWqwFtJKGVx2HtU8RNy4prJTWTtzrzegV5tgkz8L9StYjv14Yq_i9-sf1OftenIbb1qnA0YpiKkKYP9gotFRrgZ_MEQRoT4MWLkE_1_eCMceQvxuzUIhO1OwNBit0J5iYdk-3WgivdWDzYkk8RD-J0F2QbxYlFXTreLAL6-B7MEWm0P3BvnRQ3S_9ff4fjyglB9Whgu4oX7tg9Dlm3LIlc8WN5-lwlpw=w247-h400-no";
    ImageView chiccomamaderas7;
    String urlchiccomamaderas7 = "https://lh3.googleusercontent.com/zRjrakoAfbDwZC3loPAq_RLl2EkF9WF-JEQhZhv1lLUVsquPKZUtcpCEpPS0-NGQ9zzoysm4Lgw3M21hYaNB9oeOjvKy6UG1PyTsByirh-LKEZS4fyhoDOWG1EOwiJg8tP3jEIrmvjpK4jautA-tIAxN_GH9Ra-GRTUzN_0OESxWXAkSybM26Ipqw-7SgNcb2My4ViN33CrVxUcuWgpmSeyTNU7G8s9JZUyuUKaM498hEU5G_8v7zwdQe-bpJ0mxpWhsJ7zi5TOfcsXIyBewXkJQg3Puy2BfafYskVTDZ8VPaTl-G3CSopmelpSoAf8uzrLqZ3reyiS8pYuxQKasY98_77bz89si-dLMlXlkf4AYapG1yJCa1kOKYrSrdHJkDp5cuWTRmSP3usFuVViMTf-AvZ2tUdziiJ9OyB5nKYHjqWhCIyA0jyASAfHC2IaRCGZA7r69ykcMIxEUkSmCepYkKWsiuuyQvDvRk07tEy6LwXfjp_4S1cyNGWVQCutrWNJDMasJGC4jQ5Cuvd5PiMnJSwz23IFbAr6nL5vbQFWU7MazDK8Dct5cVAnBp1kvUaVDltpRsV-q5jZ0_Udus1lE08un4Lb9krCD5IEwFCvlb7JEAA=w250-h400-no";
    ImageView chiccomamaderas8;
    String urlchiccomamaderas8 = "https://lh3.googleusercontent.com/QOdSefwLHK9uHTHQlFy4P7hFFhLEMa2Lbz2cd1nai25a0iPYtXCwG_KqnB5QunCmlyrjBqG4JcBu9VHsh5qP0jMkdXPiu095dsijZwr4S5K32HvwDNYa0nT5XLftmHDIhmtAu46A6hKtYy9_-rdnZs3CFD-epeDCvd5eaWi3bZWiV6WIYkmrBBaffRluebrpwXom0yEWp8edXDnH1_-6Gc-JB6ZIHm50VisMn2lAocneIfL-pe59JoSDdMXyb1Z2XFdqTzs9tDoS3z2qRN6p3E1omNktasx5HI2TkGZeTitWORInY4qOSQ_YLXLSe8yu8Fh8rRmbNZUfF_zaIJhcHAY2jOyPehrkZpqI-m40f119llBMxUkiLQ-S6gp4kT-97JHYPh3OUkZx77cQXpH34KbqDnWh4GhYgh_KOAhMNqQO5VPqQo-wYSDq3blus4XSh6lY2h_bmYAPSEEsz1MJSgvWvD1fREWPa92c4y5f_ildYrVKbgVLw5Gz8iZbqXfJXtN_tEHowC1BSEwd2JyrTeZ-CtfAUKAjGHyPeMMGryT23Bz1RQxJeSe7tOYW_ze6Oafrouf5UPYZ0E4qNbULKjGGXUVoHdRnj8LMEIW7TJrM0Z86Ow=w260-h400-no";
    ImageView chiccomamaderas9;
    String urlchiccomamaderas9 = "https://lh3.googleusercontent.com/iBy4SrbGH7eCWH5Bp0WEPIPj4aila-R6SokZI6QuLYNKm0ctz3TxdIBV74ejpyvJWZTh74tRYFqITxcpd_Ti8MNX-Ip7Rx10nqAQUsW3PhtRqIAuiDNllLGrc-iusK2z6A4KjU9Uh-BPFKQ8k_LnnVyPi6jACd8RfhuRZF5CRbIfyO9HrioTxMCPF8LhPf2vFRRWT9AOe0Rw9OBLbPoc6_3effwpTdv-69qqlXDzghu7w5y_3DMcgQbjRIYi0sB5N5ZECmapgOrNeaB2LiIxAURH5YS_y1Um3FZbhuY-eFX8FYq3sN3WWT059jgf6TVZEsF14syB_HAWWsYkwaYfnJicWE2oJhluITFBcAoFF1aFr8n26SGDeIpfaXl8NRCdZVr60OwKvB3d_kwaTjnWs9lSDmQXv3vpdcB1e6W4JhdKb22rZ0pw0M3qgCPSTu-uHFtnfnJRQmhsPT92UZisu-TX9po1oomSCzRRYJHJgzwA-dQM-gWKCRTA0N19VzRuO16c7h3gMvgYfRPNL0SEzmXvGOlSs5lF7qBqXJOJkzqAGFU-plb5_yIo0iYohTFeegoqa09w6FiPjAlmCQgW7Emt9nwyyNRtD28yq2OKl1uiMOlMXQ=s426-no";
    ImageView chiccomamaderas10;
    String urlchiccomamaderas10 = "https://lh3.googleusercontent.com/ajc-zoULa66M0aK8LgR2FLZHXp7_gf0Tq3_0cnmOffb5sDRu_IOoHjvEBOI4zygiGR2mAsALw9ALBIjHHXz2sogB-ngZVu3V4Z-tENkQD6Qc9WTcgME-sG8M11BFRyOq_-fFT1po2JQ94Zc3XXdjSyL1o6XHgsNpsuR6eNNJsCx9_fT5CvBl8fNMZdH7QMIDacV9suS-9T3xB1JQbWbxujvB2fmeQmzzz75ahfsxXOOCrus60NW_FwzCUjfAs9vJXLXVsnQ9JJo_T6wciTPCfxNAjmthybMJrwLPr0lG8tgDQU34o15OCtg2KcwWivWRBk92t1rpkBpbezyJLjTrHcZQdZZA8Rntr4pSAjbVj1hB5Jl9Q4-eo_OMLwP2DcYh-vv469zbED6zBRH_wTS0TJThFyboddgOOqScW5fG2BIuLTzkVXRCFu_q2qV0RQ95RU9HA8b2BcBQh_Goglk05N15VNTVl9T-PVeUSFF9nhL3Maw7nNhMSwC177ukALle0qIhF7hk5Gyc0PM0tZEobnLDvG-UtjZMHEV7QGcY3unIpxx0dy-vNxXP0gWXBh5c9mdaUlLkYT3FQ2JO_y4Dk_LFy7le7NKHDnYviu3w8b10-q3LGw=w423-h424-no";
    ImageView chiccomamaderas11;
    String urlchiccomamaderas11 = "https://lh3.googleusercontent.com/eule38NVNu9HiDPXBDuAN-S83UF1QDLUwa8C2OfelWPTeavyALpPCfvjZuRb2JTFz0q9Bc3y6d50AHx_zESWIpeJ6aM3hTkQ8-RlXm0l-iQ3PUqgIxNTzps4Cg_t6oo95LBXRQ8BXwruBIPq0DFLygyU9iFvwjWOvRbS5TbR-p_TA_WgyANhKPwmopypAQmKC9VA6fu8Z1cvX5zLgpBGLyksWvA4qJR91A-xC9aflzjZdf4WJv9kuJzgpQlBo5r_suXft0bEjZG1sT1LgG0DDRczI82tjZatOvVruGjdszGNx8x92wfzPMT0NzhiShEkP9OcV3zaK5KLOK84grXR8wxBfyZNFfylDZjVmQ_ZzdhKHC3hWwLLQJiLX3sFOEeRMTxKcaf_cuePEYWbqvmMjv3yd-2eelf51w8XkVb8Uee2NjYh8AsosfZxqCS8--1iBPD8SZzCpGsa4378zhV6W1orYA_Z5s18tKv1-rV03W6j6xen1lXFNgktlLSh2NZzvpGlgCAPACq7mEJKTGYS0ILvOKky9q9_wricq4QJGza7FQTQVnl8nqJYIeEXpoChZIUiOu_LtHoFX0oK1Gg4enlPCiYjPDeVvkRftqCCqEt65M_y9g=w426-h423-no";
    ImageView chiccomamaderas12;
    String urlchiccomamaderas12 = "https://lh3.googleusercontent.com/DpJcEh2ghd4w9eWsLsbdb0xFCyNXMN3Rgb2wj8QmRoOz_lF9ez6Hb1aAm8VMSxEz9EJ9RejDse4gedDiD7672X6sjWXVUHYAqNXTFyCRyXp7eC2cBvBq8wUBAvBODKqD79TQI46dg3bAEaxJY4IMf8E1_6NhbzQr7_5BNY51E9CtLL9QCwQPTR1uBwBAdki4DKWDGGbx2X3FRZd0fNWgX2FaVvI4JKiGVZxN_Ey32f4AAPgSEalHtdQSxT5_AiO_Dq2vyQpK2xMvOjElkKXlwaT47HwJHGeLt_C7GAsddoeioHNWtwQD2js4zN1k1xI2QMsnnbtOC8qinPhTlVDgUuIPvcjr1Xz791ZxcRbhAjb0vDhMRTYyx9mxtoxTMCkTA-i5MyJEvvPdga5pzHK8y01ssG9VAi44qknvZ1FhGXYq_ERFeyuMeSTSMlpWJTqprEczNFgr3KND9ZBZAZrtv_ntSfwjp1Ae7itOmvPT_6PT1cYlDeGpDnGoXceaALfYci3UrTWtHapmYy8CTMgHoPi7EOQOpwJU5_ATiCurK8on5ksbQ9Y6XnkRcOl7b0K17dYmAii_Rh3QuMptAqvnMiRLpAyRgkR0kwGdobnOvtjdU9wWMg=w424-h423-no";
    ImageView chiccomamaderas13;
    String urlchiccomamaderas13 = "https://lh3.googleusercontent.com/p55b36Y-J8L5dtJn4rMF5J1eAfxUEFTZ8STQnsAzw115h7ooJOJZQf9rFbTOKXCMcdqnoajEwFVP7uuiWFe5At8py-ofIdgZgE1dyiCYbd7jWF_WIzqauPlC0XeKv_QslOHRpSIXQZb1JU65kAucwa_eLtBH5UnxLMDG2W7xi6ZB1bDq3Ez1xqSxsiAz1ESeRPlMNnjkTPuMpkJPgbRcdsDzgIl1SQOxfNchefO20TBf4eC29kv1LRmnANdhBAgQqI3VUljSnXnIbqJVA712YDlKBvIABwlyrpLFuZ3U-j-Sk8eE92EcEe7Z4WXMVdD8UynZz2cC85Zk7LdIzEZFy4pHqO-QdpdOS6TT3IdMYi1pTonxOurSNDeUgrnw4kOn_U6MscDywfVNyzSBoGKozAfwUQkcCYZp_IsW8AxioHBAjQw5gYRIFNBBGZOlLjfrYCPTxW5BhyiTKl7wTy10bmP0TyOqOCPyIh5hVyWD0XETrI4io70A-uwDtCu-BTmBU8WExeF9NDLkstdjlhNRQ7YWEQGMsE9kWMbuGGoqVDdVNVHVOu5Wm30t-SBAcNfA_p6v1KGSw3QxSdlTsd_2ZJ62igRFXBXrprp6Zs1g60SIoc_oRg=w428-h460-no";
    ImageView chiccomamaderas14;
    String urlchiccomamaderas14 = "https://lh3.googleusercontent.com/qAPdiMO2kurpR5sTuA3CunMaucdVraFeLS8gp2_lJWY2qv2yr_tZAi9yTWl1MQV3lhH_VUcUnF1VLPmee5Y0TpmGhotJX5SZu5l1bd3OQBx4Ei1IbYXHKtPv_gOCWWlISeIjwYSHhUXhEEHFB2-vxHHHjHFXtDVXYkOC-cPQtlP6OhTBz67jHphwHyiyP6VkZowqlVap7lD2goLxW1u35GZmQ5OxhsiwxoXCN2_VjKQIYoHtQw3PY2ZRNdYgq53YvrUwop5VR7_iW-c93Vw8rBfu8_sTPSxWReflkU7ncYVTgePl9DrBWw8bWgEBFyQQPNL_f37ZC8vXcIg5-chrb-llZ_X3tc34D93Qi1lc2osl2YObXUHFfmWWYFTJIDz1vL3t88bVE2q8jfL5XiUNb_4UbZxL1zmitUasuedb31teQnBC9EKn1I3tc7jUKrWsrVr_d2EW8Yavy9p6Lhs1XRSlHYrWRgKHu9gD9VJu6ftR-CPJQM_ux0ga1aEQkF1yjCc8NOI29YDwQ0gtHa8R7ZRNUeMjmBp1fmO8IDJU3kBfH8Z3QwipWciBt8PoU6J7rg1s0GrWXCv_VVQ-t1LlhV8zLfvgokvNPAxMXgBnkjizjk7ztQ=w428-h460-no";
    ImageView chiccomamaderas15;
    String urlchiccomamaderas15 = "https://lh3.googleusercontent.com/XQGwPBPbLIHGHMfPiZekU7fII6Y0DzUhUN0VhxSm5zNmiv_EJXi4p3L-lzbZcpsW3_sjnZfI_6RQtekWtr3AfYtP9b2eCIlAWZQQOl0FHSE07oN9_KyPxGjhdU8rWrOnxWoO5QQaLUH2L3N_rd6uxca2055KrQAHpOUHdhmtK6l04RhWjkd5P_kPPuLAXhiRecAtUdLBkY0RD7AljjbNG8ol-htKASnn9aFuUT7AWQXyCyuSC4kK4i3PhNN2V4JwotegSqGjAndR0TcWoRHVXc0OmkbeHK5JsUpcsoVTXDjKudMQTBgeuczbMJBQ0CIxVDc9hzvJvkY6sRXIypFKRTR41WMXRuh3dXFAKX2Ggw0y9YSmWpSRpcsN_MYIu7oZQTO_6OgRkem4mHxdN_0Pm3yADy7SGbZ7DD0pmpGiOjGtTtLF7zSGqAjztQwiOnz7mvt_6d-zsMN-8bi1bmXmRMHtYdbgu0Zas1Q6DBDdcrvMC6IwdXLFhn3ZetvVsZJOjfUHpbi-1zcP5ocCENr8pRHtcxm_JbdlVWPio9nYsqmoWYwaYT0M_MZyY2BAtYy3UWX24pycUPB2jfcvwBeiyPWERtRLwND4Iz82Bm1WsSiaNdtxXw=w428-h460-no";
    ImageView chiccomamaderas16;
    String urlchiccomamaderas16 = "https://lh3.googleusercontent.com/30adcIKHwy_2RH4VM-QI4GKc7vFacccqVsquKM-sUPGnL26LFnQ1HcFwRnIU2RPBubgT4NiElP7EcGDf0bPL2XWKiu6QkfLDMlJfytzyLQ-2ww6ZbmCop_K2xt7tvsU4LczdKe6YSZO8r0EFl5Po2fdOLRmhNt8YyIik-_n6PFa_VE5fSJXEAtwyzDEZTl3jeBIP9VWDMeG0yPv4bWbhxkV6dNp-7NSWqgBjMlzZzWMoO8SDNTjUJRPJ22JGleRGxd68wyCzlFmdoqwTw6wvOmfk6erPW3cq5ec24qXl6lo526fbynoKAHxNdkU2CEx_R8Po39XDDve1iScrOeElhaT3VpvKwOwA9R4H1kTiUgIqnvQQs2U23qAW3EowDjmgjlQDpLcbqGRh31V-6GoZUKFRPeh3uMoGeMFFd-i66EgAFHAbSjuambiATn0vjG4B3qSoAmH00DM3AHlykpBjhJloIiriOkDuhgK15VppE_MJ_jWnYOyiY7IBwM2U8vJ5f67UP3frRHQeJcneugchyjo05kxh-ezPQ9f-luraXoXHZVWVPl3560kwgsMOLzvlp6lmzvvFKu85-8r2mPgNmJdvSFmkAwEunKZv-Q8a9WhtckO0yw=w428-h460-no";
    ImageView chiccomamaderas17;
    String urlchiccomamaderas17 = "https://lh3.googleusercontent.com/P4UngwI4DYYkemlUxbCMTZGj7nmX67i-DjC3vcz9RBUcqZl47q8tTQjKPQNdURbF7m_IrBihymDPkDNi85NDzIkgDkTJAp4HNvN217KI5O9bdZfQ1tk88rzqprqFnbQBovU1VaNfnNqJe_SOTFG5bSKu4u4tHP6SgOanNeJlfYaEhTmzAjHPOgCa6Ee7yQAkV_jb_kOhw3dWL7sPWIr-gRR2kDUIjBv4cKxe3YSyyyKsrkn8v7BzDobYggWFqlQhrDCg5PW711FlDB3U9fWVwAoMGhjAIM-_m3wap3oRZpMi1Q5W3D9NZZzRcKxa0IlISg-WmsBlV56QvK-pgp0UsK8PDLfW6wUzoXOXlZiNStWSSkbm9J72DVxZfagwrNhZQqqBNjajz7euBzTjp4sEeg7qPIAWmAJodof8MXXC0vRnR4zosvy4CZV8AbAMcnd34t4BnBVej0DdtbmHpgq8LoDN7rOcMWpOCYPZvUUrrv9QAgpVt8EjDh9ejrOnvWo6PzObVhre7IkGtNSio9cgILXik4NFjzIhQC8vKE3wHxRq5Msqi7xaSeUhOfEllcWipOG0JSFKHRPX-uOsdTcmy5GTDnXB8BCV2kPtNuNB_1J0usKq1A=w428-h456-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas);

        new preciochiccomamaderasAsync().execute();

        /* chicco mamaderas 1 */

        chiccomamaderas1a1 = (ImageView)findViewById(R.id.chiccomamaderas1a1);
        Picasso.with(this).load(urlchiccomamaderas1).into(chiccomamaderas1a1);

        txtchiccomamaderas1a1 = (TextView)findViewById(R.id.txtchiccomamaderas1a1);
        final String stconsultaa1 = txtchiccomamaderas1a1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });


        btncomprachiccomamaderas1 = (Button)findViewById(R.id.btncomprachiccomamaderas1);
        btncomprachiccomamaderas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas1 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas1.putExtra("string", urlcomboa1);
                startActivity(btncomprachiccomamaderas1);
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

        /* chicco mamaderas 2 */

        chiccomamaderas2a2 = (ImageView)findViewById(R.id.chiccomamaderas2a2);
        Picasso.with(this).load(urlchiccomamaderas2).into(chiccomamaderas2a2);


        txtchiccomamaderas2a2 = (TextView)findViewById(R.id.txtchiccomamaderas2a2);
        final String stconsultaa2 = txtchiccomamaderas2a2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });


        btncomprachiccomamaderas2 = (Button)findViewById(R.id.btncomprachiccomamaderas2);
        btncomprachiccomamaderas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas2 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas2.putExtra("string", urlcomboa2);
                startActivity(btncomprachiccomamaderas2);
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

        /* chicco mamaderas 3 */

        chiccomamaderas3a3 = (ImageView)findViewById(R.id.chiccomamaderas3a3);
        Picasso.with(this).load(urlchiccomamaderas3).into(chiccomamaderas3a3);


        txtchiccomamaderas3a3 = (TextView)findViewById(R.id.txtchiccomamaderas3a3);
        final String stconsultaa3 = txtchiccomamaderas3a3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });


        btncomprachiccomamaderas3 = (Button)findViewById(R.id.btncomprachiccomamaderas3);
        btncomprachiccomamaderas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas3 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas3.putExtra("string", urlcomboa3);
                startActivity(btncomprachiccomamaderas3);
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

        /* chicco mamaderas 4 */

        chiccomamaderas4a4 = (ImageView)findViewById(R.id.chiccomamaderas4a4);
        Picasso.with(this).load(urlchiccomamaderas4).into(chiccomamaderas4a4);


        txtchiccomamaderas4a4 = (TextView)findViewById(R.id.txtchiccomamaderas4a4);
        final String stconsultaa4 = txtchiccomamaderas4a4.getText().toString();
        btnconsultaa4 = (Button)findViewById(R.id.btnconsultaa4);
        btnconsultaa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa4 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa4.putExtra("consulta", stconsultaa4);
                startActivity(btnconsultaa4);
            }
        });


        btncomprachiccomamaderas4 = (Button)findViewById(R.id.btncomprachiccomamaderas4);
        btncomprachiccomamaderas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas4 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas4.putExtra("string", urlcomboa4);
                startActivity(btncomprachiccomamaderas4);
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

        /* chicco mamamderas 5 */

        chiccomamaderas5a5 = (ImageView)findViewById(R.id.chiccomamaderas5a5);
        Picasso.with(this).load(urlchiccomamaderas5).into(chiccomamaderas5a5);

        txtchiccomamaderas5a5 = (TextView)findViewById(R.id.txtchiccomamaderas5a5);
        final String stconsultaa5 = txtchiccomamaderas5a5.getText().toString();
        btnconsultaa5 = (Button)findViewById(R.id.btnconsultaa5);
        btnconsultaa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa5 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa5.putExtra("consulta", stconsultaa5);
                startActivity(btnconsultaa5);
            }
        });


        btncomprachiccomamaderas5 = (Button)findViewById(R.id.btncomprachiccomamaderas5);
        btncomprachiccomamaderas5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas5 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas5.putExtra("string", urlcomboa5);
                startActivity(btncomprachiccomamaderas5);
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

        /* chicco mamaderas 6 */

        chiccomamaderas6a6 = (ImageView)findViewById(R.id.chiccomamaderas6a6);
        Picasso.with(this).load(urlchiccomamaderas6).into(chiccomamaderas6a6);

        txtchiccomamaderas6a6 = (TextView)findViewById(R.id.txtchiccomamaderas6a6);
        final String stconsultaa6 = txtchiccomamaderas6a6.getText().toString();
        btnconsultaa6 = (Button)findViewById(R.id.btnconsultaa6);
        btnconsultaa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa6 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa6.putExtra("consulta", stconsultaa6);
                startActivity(btnconsultaa6);
            }
        });


        btncomprachiccomamaderas6 = (Button)findViewById(R.id.btncomprachiccomamaderas6);
        btncomprachiccomamaderas6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas6 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas6.putExtra("string", urlcomboa6);
                startActivity(btncomprachiccomamaderas6);
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

        /* chicco mamaderas 7 */

        chiccomamaderas7a7 = (ImageView)findViewById(R.id.chiccomamaderas7a7);
        Picasso.with(this).load(urlchiccomamaderas7).into(chiccomamaderas7a7);

        txtchiccomamaderas7a7 = (TextView)findViewById(R.id.txtchiccomamaderas7a7);
        final String stconsultaa7 = txtchiccomamaderas7a7.getText().toString();
        btnconsultaa7 = (Button)findViewById(R.id.btnconsultaa7);
        btnconsultaa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa7 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa7.putExtra("consulta", stconsultaa7);
                startActivity(btnconsultaa7);
            }
        });


        btncomprachiccomamaderas7 = (Button)findViewById(R.id.btncomprachiccomamaderas7);
        btncomprachiccomamaderas7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas7 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas7.putExtra("string", urlcomboa7);
                startActivity(btncomprachiccomamaderas7);
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

        /* chicco mamaderas 8 */

        chiccomamaderas8a8 = (ImageView)findViewById(R.id.chiccomamaderas8a8);
        Picasso.with(this).load(urlchiccomamaderas8).into(chiccomamaderas8a8);


        txtchiccomamaderas8a8 = (TextView)findViewById(R.id.txtchiccomamaderas8a8);
        final String stconsultaa8 = txtchiccomamaderas8a8.getText().toString();
        btnconsultaa8 = (Button)findViewById(R.id.btnconsultaa8);
        btnconsultaa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa8 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa8.putExtra("consulta", stconsultaa8);
                startActivity(btnconsultaa8);
            }
        });


        btncomprachiccomamaderas8 = (Button)findViewById(R.id.btncomprachiccomamaderas8);
        btncomprachiccomamaderas8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas8 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas8.putExtra("string", urlcomboa8);
                startActivity(btncomprachiccomamaderas8);
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

        /* chicco mamaderas 9 */

        chiccomamaderas9a9 = (ImageView)findViewById(R.id.chiccomamaderas9a9);
        Picasso.with(this).load(urlchiccomamaderas9).into(chiccomamaderas9a9);

        txtchiccomamaderas9a9 = (TextView)findViewById(R.id.txtchiccomamaderas9a9);
        final String stconsultaa9 = txtchiccomamaderas9a9.getText().toString();
        btnconsultaa9 = (Button)findViewById(R.id.btnconsultaa9);
        btnconsultaa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa9 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa9.putExtra("consulta", stconsultaa9);
                startActivity(btnconsultaa9);
            }
        });


        btncomprachiccomamaderas9 = (Button)findViewById(R.id.btncomprachiccomamaderas9);
        btncomprachiccomamaderas9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas9 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas9.putExtra("string", urlcomboa9);
                startActivity(btncomprachiccomamaderas9);
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

        /* chicco mamaderas 10 */

        chiccomamaderas10a10 = (ImageView)findViewById(R.id.chiccomamaderas10a10);
        Picasso.with(this).load(urlchiccomamaderas10).into(chiccomamaderas10a10);

        txtchiccomamaderas10a10 = (TextView)findViewById(R.id.txtchiccomamaderas10a10);
        final String stconsultaa10 = txtchiccomamaderas10a10.getText().toString();
        btnconsultaa10 = (Button)findViewById(R.id.btnconsultaa10);
        btnconsultaa10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa10 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa10.putExtra("consulta", stconsultaa10);
                startActivity(btnconsultaa10);
            }
        });


        btncomprachiccomamaderas10 = (Button)findViewById(R.id.btncomprachiccomamaderas10);
        btncomprachiccomamaderas10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas10 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas10.putExtra("string", urlcomboa10);
                startActivity(btncomprachiccomamaderas10);
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

        /* chicco mamaderas 11 */

        chiccomamaderas11a11 = (ImageView)findViewById(R.id.chiccomamaderas11a11);
        Picasso.with(this).load(urlchiccomamaderas11).into(chiccomamaderas11a11);

        txtchiccomamaderas11a11 = (TextView)findViewById(R.id.txtchiccomamaderas11a11);
        final String stconsultaa11 = txtchiccomamaderas11a11.getText().toString();
        btnconsultaa11 = (Button)findViewById(R.id.btnconsultaa11);
        btnconsultaa11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa11 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa11.putExtra("consulta", stconsultaa11);
                startActivity(btnconsultaa11);
            }
        });


        btncomprachiccomamaderas11 = (Button)findViewById(R.id.btncomprachiccomamaderas11);
        btncomprachiccomamaderas11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas11 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas11.putExtra("string", urlcomboa11);
                startActivity(btncomprachiccomamaderas11);
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

        /* chicco mamaderas 12 */

        chiccomamaderas12a12 = (ImageView)findViewById(R.id.chiccomamaderas12a12);
        Picasso.with(this).load(urlchiccomamaderas12).into(chiccomamaderas12a12);

        txtchiccomamaderas12a12 = (TextView)findViewById(R.id.txtchiccomamaderas12a12);
        final String stconsultaa12 = txtchiccomamaderas12a12.getText().toString();
        btnconsultaa12 = (Button)findViewById(R.id.btnconsultaa12);
        btnconsultaa12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa12 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa12.putExtra("consulta", stconsultaa12);
                startActivity(btnconsultaa12);
            }
        });


        btncomprachiccomamaderas12 = (Button)findViewById(R.id.btncomprachiccomamaderas12);
        btncomprachiccomamaderas12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas12 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas12.putExtra("string", urlcomboa12);
                startActivity(btncomprachiccomamaderas12);
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

        /* chicco mamaderas 13 */

        chiccomamaderas13a13 = (ImageView)findViewById(R.id.chiccomamaderas13a13);
        Picasso.with(this).load(urlchiccomamaderas13).into(chiccomamaderas13a13);

        txtchiccomamaderas13a13 = (TextView)findViewById(R.id.txtchiccomamaderas13a13);
        final String stconsultaa13 = txtchiccomamaderas13a13.getText().toString();
        btnconsultaa13 = (Button)findViewById(R.id.btnconsultaa13);
        btnconsultaa13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa13 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa13.putExtra("consulta", stconsultaa13);
                startActivity(btnconsultaa13);
            }
        });


        btncomprachiccomamaderas13 = (Button)findViewById(R.id.btncomprachiccomamaderas13);
        btncomprachiccomamaderas13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas13 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas13.putExtra("string", urlcomboa13);
                startActivity(btncomprachiccomamaderas13);
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

        /* chicco mamaderas 14 */

        chiccomamaderas14a14 = (ImageView)findViewById(R.id.chiccomamaderas14a14);
        Picasso.with(this).load(urlchiccomamaderas14).into(chiccomamaderas14a14);

        txtchiccomamaderas14a14 = (TextView)findViewById(R.id.txtchiccomamaderas14a14);
        final String stconsultaa14 = txtchiccomamaderas14a14.getText().toString();
        btnconsultaa14 = (Button)findViewById(R.id.btnconsultaa14);
        btnconsultaa14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa14 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa14.putExtra("consulta", stconsultaa14);
                startActivity(btnconsultaa14);
            }
        });


        btncomprachiccomamaderas14 = (Button)findViewById(R.id.btncomprachiccomamaderas14);
        btncomprachiccomamaderas14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas14 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas14.putExtra("string", urlcomboa14);
                startActivity(btncomprachiccomamaderas14);
            }
        });

        lineara14 = (LinearLayout)findViewById(R.id.lineara14);

        switch14 = (Switch)findViewById(R.id.switch14);
        switch14.setChecked(false);
        switch14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch14.isChecked()) {
                    lineara14.setVisibility(View.VISIBLE);
                } else {
                    lineara14.setVisibility(View.GONE);
                }

            }
        });

        /* chicco mamaderas 15 */

        chiccomamaderas15a15 = (ImageView)findViewById(R.id.chiccomamaderas15a15);
        Picasso.with(this).load(urlchiccomamaderas15).into(chiccomamaderas15a15);

        txtchiccomamaderas15a15 = (TextView)findViewById(R.id.txtchiccomamaderas15a15);
        final String stconsultaa15 = txtchiccomamaderas15a15.getText().toString();
        btnconsultaa15 = (Button)findViewById(R.id.btnconsultaa15);
        btnconsultaa15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa15 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa15.putExtra("consulta", stconsultaa15);
                startActivity(btnconsultaa15);
            }
        });


        btncomprachiccomamaderas15 = (Button)findViewById(R.id.btncomprachiccomamaderas15);
        btncomprachiccomamaderas15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas15 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas15.putExtra("string", urlcomboa15);
                startActivity(btncomprachiccomamaderas15);
            }
        });

        lineara15 = (LinearLayout)findViewById(R.id.lineara15);

        switch15 = (Switch)findViewById(R.id.switch15);
        switch15.setChecked(false);
        switch15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch15.isChecked()) {
                    lineara15.setVisibility(View.VISIBLE);
                } else {
                    lineara15.setVisibility(View.GONE);
                }

            }
        });

        /* chicco mamaderas 16 */

        chiccomamaderas16a16 = (ImageView)findViewById(R.id.chiccomamaderas16a16);
        Picasso.with(this).load(urlchiccomamaderas16).into(chiccomamaderas16a16);

        txtchiccomamaderas16a16 = (TextView)findViewById(R.id.txtchiccomamaderas16a16);
        final String stconsultaa16 = txtchiccomamaderas16a16.getText().toString();
        btnconsultaa16 = (Button)findViewById(R.id.btnconsultaa16);
        btnconsultaa16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa16 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa16.putExtra("consulta", stconsultaa16);
                startActivity(btnconsultaa16);
            }
        });


        btncomprachiccomamaderas16 = (Button)findViewById(R.id.btncomprachiccomamaderas16);
        btncomprachiccomamaderas16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas16 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas16.putExtra("string", urlcomboa16);
                startActivity(btncomprachiccomamaderas16);
            }
        });

        lineara16 = (LinearLayout)findViewById(R.id.lineara16);

        switch16 = (Switch)findViewById(R.id.switch16);
        switch16.setChecked(false);
        switch16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch16.isChecked()) {
                    lineara16.setVisibility(View.VISIBLE);
                } else {
                    lineara16.setVisibility(View.GONE);
                }

            }
        });

        /* chicco mamaderas 17 */

        chiccomamaderas17a17 = (ImageView)findViewById(R.id.chiccomamaderas17a17);
        Picasso.with(this).load(urlchiccomamaderas17).into(chiccomamaderas17a17);

        txtchiccomamaderas17a17 = (TextView)findViewById(R.id.txtchiccomamaderas17a17);
        final String stconsultaa17 = txtchiccomamaderas17a17.getText().toString();
        btnconsultaa17 = (Button)findViewById(R.id.btnconsultaa17);
        btnconsultaa17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa17 = new Intent(chiccomamaderas.this,contacto.class);
                btnconsultaa17.putExtra("consulta", stconsultaa17);
                startActivity(btnconsultaa17);
            }
        });


        btncomprachiccomamaderas17 = (Button)findViewById(R.id.btncomprachiccomamaderas17);
        btncomprachiccomamaderas17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas17 = new Intent(chiccomamaderas.this,webview.class);
                btncomprachiccomamaderas17.putExtra("string", urlcomboa17);
                startActivity(btncomprachiccomamaderas17);
            }
        });

        lineara17 = (LinearLayout)findViewById(R.id.lineara17);

        switch17 = (Switch)findViewById(R.id.switch17);
        switch17.setChecked(false);
        switch17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch17.isChecked()) {
                    lineara17.setVisibility(View.VISIBLE);
                } else {
                    lineara17.setVisibility(View.GONE);
                }

            }
        });


        preciochiccomamaderas1 = (TextView)findViewById(R.id.preciochiccomamaderas1);
        preciochiccomamaderas2 = (TextView)findViewById(R.id.preciochiccomamaderas2);
        preciochiccomamaderas3 = (TextView)findViewById(R.id.preciochiccomamaderas3);
        preciochiccomamaderas4 = (TextView)findViewById(R.id.preciochiccomamaderas4);
        preciochiccomamaderas5 = (TextView)findViewById(R.id.preciochiccomamaderas5);
        preciochiccomamaderas6 = (TextView)findViewById(R.id.preciochiccomamaderas6);
        preciochiccomamaderas7 = (TextView)findViewById(R.id.preciochiccomamaderas7);
        preciochiccomamaderas8 = (TextView)findViewById(R.id.preciochiccomamaderas8);
        preciochiccomamaderas9 = (TextView)findViewById(R.id.preciochiccomamaderas9);
        preciochiccomamaderas10 = (TextView)findViewById(R.id.preciochiccomamaderas10);
        preciochiccomamaderas11 = (TextView)findViewById(R.id.preciochiccomamaderas11);
        preciochiccomamaderas12 = (TextView)findViewById(R.id.preciochiccomamaderas12);
        preciochiccomamaderas13 = (TextView)findViewById(R.id.preciochiccomamaderas13);
        preciochiccomamaderas14 = (TextView)findViewById(R.id.preciochiccomamaderas14);
        preciochiccomamaderas15 = (TextView)findViewById(R.id.preciochiccomamaderas15);
        preciochiccomamaderas16 = (TextView)findViewById(R.id.preciochiccomamaderas16);
        preciochiccomamaderas17 = (TextView)findViewById(R.id.preciochiccomamaderas17);

        chiccomamaderas1 = (ImageView)findViewById(R.id.chiccomamaderas1);
        Picasso.with(this).load(urlchiccomamaderas1).into(chiccomamaderas1);

        chiccomamaderas2 = (ImageView)findViewById(R.id.chiccomamaderas2);
        Picasso.with(this).load(urlchiccomamaderas2).into(chiccomamaderas2);

        chiccomamaderas3 = (ImageView)findViewById(R.id.chiccomamaderas3);
        Picasso.with(this).load(urlchiccomamaderas3).into(chiccomamaderas3);

        chiccomamaderas4 = (ImageView)findViewById(R.id.chiccomamaderas4);
        Picasso.with(this).load(urlchiccomamaderas4).into(chiccomamaderas4);

        chiccomamaderas5 = (ImageView)findViewById(R.id.chiccomamaderas5);
        Picasso.with(this).load(urlchiccomamaderas5).into(chiccomamaderas5);

        chiccomamaderas6 = (ImageView)findViewById(R.id.chiccomamaderas6);
        Picasso.with(this).load(urlchiccomamaderas6).into(chiccomamaderas6);

        chiccomamaderas7 = (ImageView)findViewById(R.id.chiccomamaderas7);
        Picasso.with(this).load(urlchiccomamaderas7).into(chiccomamaderas7);

        chiccomamaderas8 = (ImageView)findViewById(R.id.chiccomamaderas8);
        Picasso.with(this).load(urlchiccomamaderas8).into(chiccomamaderas8);

        chiccomamaderas9 = (ImageView)findViewById(R.id.chiccomamaderas9);
        Picasso.with(this).load(urlchiccomamaderas9).into(chiccomamaderas9);

        chiccomamaderas10 = (ImageView)findViewById(R.id.chiccomamaderas10);
        Picasso.with(this).load(urlchiccomamaderas10).into(chiccomamaderas10);

        chiccomamaderas11 = (ImageView)findViewById(R.id.chiccomamaderas11);
        Picasso.with(this).load(urlchiccomamaderas11).into(chiccomamaderas11);

        chiccomamaderas12 = (ImageView)findViewById(R.id.chiccomamaderas12);
        Picasso.with(this).load(urlchiccomamaderas12).into(chiccomamaderas12);

        chiccomamaderas13 = (ImageView)findViewById(R.id.chiccomamaderas13);
        Picasso.with(this).load(urlchiccomamaderas13).into(chiccomamaderas13);

        chiccomamaderas14 = (ImageView)findViewById(R.id.chiccomamaderas14);
        Picasso.with(this).load(urlchiccomamaderas14).into(chiccomamaderas14);

        chiccomamaderas15 = (ImageView)findViewById(R.id.chiccomamaderas15);
        Picasso.with(this).load(urlchiccomamaderas15).into(chiccomamaderas15);

        chiccomamaderas16 = (ImageView)findViewById(R.id.chiccomamaderas16);
        Picasso.with(this).load(urlchiccomamaderas16).into(chiccomamaderas16);

        chiccomamaderas17 = (ImageView)findViewById(R.id.chiccomamaderas17);
        Picasso.with(this).load(urlchiccomamaderas17).into(chiccomamaderas17);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciochiccomamaderasAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=42aa73e7d9cacea2cd18b1a7c7ed1fca";
        String preciochiccomamaderas1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=921d15ee20f0dddeeeed71e06b22557a";
        String preciochiccomamaderas2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de5886502a538d82275e2532ecd73251";
        String preciochiccomamaderas3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5d1ef7650e22b6e463cdfb812acf7de0";
        String preciochiccomamaderas4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=a05008652603ccfad9666eb8dcd0a133";
        String preciochiccomamaderas5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=962569427313ba6d0d9902effbc4a31c";
        String preciochiccomamaderas6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3f176ccb8cc4972cd9de23dd503fbf01";
        String preciochiccomamaderas7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b2ba59fda2d26dc6d00f7c0bfa80885b";
        String preciochiccomamaderas8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0bd393d865ec9e08e6e570c802cc93e6";
        String preciochiccomamaderas9st;
        String urlprecio10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=647d80235744dd9fa0e7323d55d66712";
        String preciochiccomamaderas10st;
        String urlprecio11 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=da99acd0caf73566da3f17e1a7119dbf";
        String preciochiccomamaderas11st;
        String urlprecio12 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c130da95e53441caa3e7456ef0685890";
        String preciochiccomamaderas12st;
        String urlprecio13 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4c766fa4aa1cffe3fca07f848d12a0b8";
        String preciochiccomamaderas13st;
        String urlprecio14 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8bf0b3d4d7d04fd871c93fb71dbb57a4";
        String preciochiccomamaderas14st;
        String urlprecio15 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=77dba17f306b92bb6731a83216973346";
        String preciochiccomamaderas15st;
        String urlprecio16 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=343fa9458fa3bcd510b11288fa7129c8";
        String preciochiccomamaderas16st;
        String urlprecio17 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d05b32fd707e18e374fe785c7c7b126e";
        String preciochiccomamaderas17st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciochiccomamaderas1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciochiccomamaderas2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciochiccomamaderas3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciochiccomamaderas4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciochiccomamaderas5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciochiccomamaderas6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                preciochiccomamaderas7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                preciochiccomamaderas8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                preciochiccomamaderas9st = metapropoerty9.attr("content");

                Document doc10 = Jsoup.connect(urlprecio10).get();
                Elements metapropoerty10 = doc10.select("meta[property=\"og:description\"]");
                preciochiccomamaderas10st = metapropoerty10.attr("content");

                Document doc11 = Jsoup.connect(urlprecio11).get();
                Elements metapropoerty11 = doc11.select("meta[property=\"og:description\"]");
                preciochiccomamaderas11st = metapropoerty11.attr("content");

                Document doc12 = Jsoup.connect(urlprecio12).get();
                Elements metapropoerty12 = doc12.select("meta[property=\"og:description\"]");
                preciochiccomamaderas12st = metapropoerty12.attr("content");

                Document doc13 = Jsoup.connect(urlprecio13).get();
                Elements metapropoerty13 = doc13.select("meta[property=\"og:description\"]");
                preciochiccomamaderas13st = metapropoerty13.attr("content");

                Document doc14 = Jsoup.connect(urlprecio14).get();
                Elements metapropoerty14 = doc14.select("meta[property=\"og:description\"]");
                preciochiccomamaderas14st = metapropoerty14.attr("content");

                Document doc15 = Jsoup.connect(urlprecio15).get();
                Elements metapropoerty15 = doc15.select("meta[property=\"og:description\"]");
                preciochiccomamaderas15st = metapropoerty15.attr("content");

                Document doc16 = Jsoup.connect(urlprecio16).get();
                Elements metapropoerty16 = doc16.select("meta[property=\"og:description\"]");
                preciochiccomamaderas16st = metapropoerty16.attr("content");

                Document doc17 = Jsoup.connect(urlprecio17).get();
                Elements metapropoerty17 = doc17.select("meta[property=\"og:description\"]");
                preciochiccomamaderas17st = metapropoerty17.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciochiccomamaderas1.setText(preciochiccomamaderas1st);
            preciochiccomamaderas2.setText(preciochiccomamaderas2st);
            preciochiccomamaderas3.setText(preciochiccomamaderas3st);
            preciochiccomamaderas4.setText(preciochiccomamaderas4st);
            preciochiccomamaderas5.setText(preciochiccomamaderas5st);
            preciochiccomamaderas6.setText(preciochiccomamaderas6st);
            preciochiccomamaderas7.setText(preciochiccomamaderas7st);
            preciochiccomamaderas8.setText(preciochiccomamaderas8st);
            preciochiccomamaderas9.setText(preciochiccomamaderas9st);
            preciochiccomamaderas10.setText(preciochiccomamaderas10st);
            preciochiccomamaderas11.setText(preciochiccomamaderas11st);
            preciochiccomamaderas12.setText(preciochiccomamaderas12st);
            preciochiccomamaderas13.setText(preciochiccomamaderas13st);
            preciochiccomamaderas14.setText(preciochiccomamaderas14st);
            preciochiccomamaderas15.setText(preciochiccomamaderas15st);
            preciochiccomamaderas16.setText(preciochiccomamaderas16st);
            preciochiccomamaderas17.setText(preciochiccomamaderas17st);
        }

    }
}
