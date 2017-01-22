package com.abigail05.Abigail;

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

public class almohadones extends AppCompatActivity {

    Button home;
    TextView preciocombo1;
    TextView preciocombo2;
    TextView preciocombo3;
    TextView preciocombo4;
    Button marca;
    ImageView combo1img;
    String urlcombo1img = "https://lh3.googleusercontent.com/0PZVM2KAiLotF7nrs-MHjo0F7IAtdclqVzPegR1Hva2PXoQn4mJaH1zoykpqTtF5Wqqw2eaFz41VhGp63-SLObi1U3IxKntfhGxsCeNqul_s37yDLQ-VNhCHrdPvZ1ceQNHCRxqNpx67XLvoSN4H8aMUjqrPF5o41PvdQ5jgYu_97WAruYnzWcHx_P6kUWfdISZKWvFgdAthWrJ4NDr89vhDTarqtYD6l4O91uw1DzbxVgoJAG3iFEYI00Oenixfa7Bx8Yl4EydMmzxk0-EwTqUbm8Tife0gTajaYHPQa-NVBrFbv8qGEXv4H29Xdj8-DeA4cgquQCOsv_xzPMOh6EEp48DbLu2n6mL7MLNeZnAhobXxkiClvjxDcQ9oJ328QxZ7ncKzQO6sjWgl2YKAeGFq9HWApNa1X6_9bYafPVMyXu-M7DdfRcyyE8ALDdbYlJAa1Ys5OT97LfNQK1IVCdkd5nFYM8MpPf1UuctiBGkJEtewdOLzlNg5QP_mPsF1ZgWOhUeaJmhYWIgEXo4yj0QjCSgLCvfAkuwYrrm5GV0knm3YYthDMyyw12yLw2_woZbfadGRGmKmYkP-cOI0dEyur5rxZu7x2cP7fA61ElKk5MLwYg=w571-h591-no";
    ImageView combo2img;
    String urlcombo2img = "https://lh3.googleusercontent.com/D_GoJNNtYDbBuxU1MqKfOuKqgyLM926OPcW5vX546gtR6VfEAHpwhTgSn9e_7h1mOpiOkf_vOVQWcBtkp2tgbfOLU7vnQgexbx1UX-ABlnEaGcwBC6rVdK4BFtCMnEBfahQvrwMQoCyTT-MLV0iK3QK3BljBqzEw7arV0nKvSnnJH9uVORSg-Bj-q56LNRwPqF9gJ75rZy-NA774pCr_Zoefwwg8GIAxPzpD-RcnIlEEp6UhYjwBmVVm8XN3UNZr47w8yDF4X640TpMwKB7hyLaKY2f54wpULBTYohHYC9XxbTgXjdggz6kFqWvRsqzVxnL9GKaHEJJjldXa9sewthMryYKHzg5g1KYVC5CLYeY5pzfa-ncmBl9_rKMM30o_jXONtPxuRBTZIuui8-cgKEGJRzuso971GPRsM3aaIV3Mg6dgMMytnliT3MiLSwPjZkHkgWoE5BepInEcNPKikkf9j90RJs-VqQUmVDnI_xT2hjSEOav6NDsImHRoPtef3l7N88PId1i-h6u7PCnOwDuuWNi173svPILdtw1SQbC7S4NWnvPBeFTCDto3yEe6fBXn_2-BWaE_jB4JomhrQfcqtDodgn8HJmumZYlupfKsPgtl6Q=w570-h535-no";
    ImageView combo3img;
    String urlcombo3img = "https://lh3.googleusercontent.com/uDxHLIcbIlmS1Tsqn2fCJrhoT8Z6rUrUa0J4_sLTRikToAhXaIqrZw-VLeiUBo9w5z8D-DBkxEoc4FaY7sNZIgDKs79dTJvsz0T58ccJv2ErGZY-zj0Fy98KRJj-r7R9q2bCMAp4ic8MxIZI3BZgNix-ZEaisvTpxdUsEf2ZMMX6E5MebLw54KvVfa-ndgOsKS6vN7v_IW7e6EBulqJfU2EAF7OTlWDLYtxJ14zhpMMXaeYzrEEbWrdiFvDzVmUzknwJz6qaW5T53_Hgvj8uMz0YdC9CF7TSZYixqxKb5rDj06eG9yYE61SsYGnj8bKlfMuAdW5HvfQ-ObCAg7hPjBhwdneiz2AsGk3xRba1u0jFZYDNihnQAfwrV-VbcwAl4G669Z0lusC1bpDhO_LXq1n55wuP8uqNI6O7ICIMQ6u_BkTcfdHY9mNWsN0vAlam1byKR4TmbNVSQHbz5jZGNkRUsWoPMNd2y3ckm6FhB_XukZXdEADX43iXvfClx7WHFzF1iWyh1979ncXiLWkq5pMvDflHdrnDY0U0Y5fywFpxBeZQv-juvenO3YFvI4oaAko7urOQZ-tSgy5NlYRC4qmgxCBsyMpV7pD3FizrXf6Og85kYA=w294-h328-no";
    ImageView combo4img;
    String urlcombo4img = "https://lh3.googleusercontent.com/TNP66LtKXbcgW-VXfLQasJeZWjL5LfHBlmZda1Tp7BX0tuzzX8XQaTHTnOr4P_ifEIKrwFYXzrYvJ4mvCkmg5js-KrlfC38RMU-67DWUDLj0usJcR932eV6FKb2KG-n5U7Do7GailUFHLq5FgN3DBl4xKSVO8XZsaxAWAvVggoOgR5Pdu6JQCpaExWi5qdVjZGtpxwOVEmYz_LdS2tptyxqmHKvtVpcIW6q50pmFNBJEo9tRljXjGplUwaPEm_FG_JBZRwYsJa-zLUjcy497EAhA-54aEyewAjWvTxWxk390q8mS02QcoEvFLnZgYVqF1T_Eyk5IhN5a4UJubY96n5rSCG48msWsFQ8R83fLf43EhrC6zqIRBuvKAX2N8x9AG3pMOkPZMWJS_XbZrp0lQzGaq9q1UvtP-TmxMMWCd2WJpEgJJC7VOQ7VQItkCEhZRFAdVPc7e0rccddo4z9qnMXskJthqBVoVm1Qp3lSKGTLQEcTgYE8rAKhtVhCxfg9NvVdX88g2tajMd3pes3BuJLKyLUzHSqioWkSGasvb_NZAkR8SsoKs3SbeOGe1LMA42OUAIbWsVFT6U2SK5mX2SX_APFPmxcchjvYC9CVc_HrRSZ7Ww=w460-h284-no";
    LinearLayout linearcombo1;
    Switch switch1;
    Button btnconsultacombo1;
    Button comprarcombo1;
    String urlcombo1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e68ff9a9f087a16157f80793fc0ca56f";
    ImageView combo1imgrojo;
    ImageView combo1imgnaranja;
    ImageView combo1imglila;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView combo1txtdesc;
    String urlcombo1imgrojo = "https://lh3.googleusercontent.com/0PZVM2KAiLotF7nrs-MHjo0F7IAtdclqVzPegR1Hva2PXoQn4mJaH1zoykpqTtF5Wqqw2eaFz41VhGp63-SLObi1U3IxKntfhGxsCeNqul_s37yDLQ-VNhCHrdPvZ1ceQNHCRxqNpx67XLvoSN4H8aMUjqrPF5o41PvdQ5jgYu_97WAruYnzWcHx_P6kUWfdISZKWvFgdAthWrJ4NDr89vhDTarqtYD6l4O91uw1DzbxVgoJAG3iFEYI00Oenixfa7Bx8Yl4EydMmzxk0-EwTqUbm8Tife0gTajaYHPQa-NVBrFbv8qGEXv4H29Xdj8-DeA4cgquQCOsv_xzPMOh6EEp48DbLu2n6mL7MLNeZnAhobXxkiClvjxDcQ9oJ328QxZ7ncKzQO6sjWgl2YKAeGFq9HWApNa1X6_9bYafPVMyXu-M7DdfRcyyE8ALDdbYlJAa1Ys5OT97LfNQK1IVCdkd5nFYM8MpPf1UuctiBGkJEtewdOLzlNg5QP_mPsF1ZgWOhUeaJmhYWIgEXo4yj0QjCSgLCvfAkuwYrrm5GV0knm3YYthDMyyw12yLw2_woZbfadGRGmKmYkP-cOI0dEyur5rxZu7x2cP7fA61ElKk5MLwYg=w571-h591-no";
    String urlcombo1imgnaranja = "https://lh3.googleusercontent.com/t9SKzzOjsfzTwdtb65gARgW023MPjI5JJqnwnyU0-a7MaSWbbKbv8-UG6XqmF_Nvv4tjJIT9-lxIGjbzVWzU10z0UNHuEHGetAoSMHvKiYefPzy0EG6lbi1dWDOEpWzzsLOxaSS12TyZGYfXGFsXfLQ5Zs3610R2WSJ4epteskQZncd3xuXcJs-RWqCtFMQZSNcKgFeylTGV5Yggm5EG_Z0WB7o4RsrFdMzrbzbqq6wIfGAFCICIuOtMzevYdFqgFE-HKdUm-6DPEi3No2lMeXU37BVQYT_VlVH_FC-Xn8SlmFtVN4P2eGyXxeI4J9Lsz-okFMMSYRhYtp8JuMfbel6grbbuogI19ZGns4RLMzZa0QafCw3SmwcUL1mh61HdKfqG7kuXf59H2ynTxtpRw2EoMw9kZK3FJ3gsW8GfInEwAH2jy59KY-a4OC53zeEEXw3GCpBGT-dJTQ5nnRbQbe_OMlPakx7fo3npMoRC7LggOZNcJYdHq1FeeZ8RIuoqFH1LEnHvexGfRzbf7sdw64tJtW1_R7jaNJo1ip7koH48XZ0Z9SYbpFXOaDWl_87xpf-yrgGkaGpHjxS98OB0zW2kSQD2oF6Swr53zcZojW0cT_Juqg=w606-h591-no";
    String urlcombo2imglila = "https://lh3.googleusercontent.com/QLj2X3etHckSNk40eF8xOs3STirem3mxf-t2g07fV01_e63Vib9m3KIlPYW1ZFbETYbeIrHf1ZZaDQQ26CHcREO7T2h7LnBDqY-lWHKvkNeiX1F5e1bR2zo1RYc5EDtwdmNekjG4IYFuYkZjVuLYLr_bwjvgMy1aQEsocjW5K52TxneyMAG0v_IPhNgC1XL3A7HUyS4_zV-T0bVA7j8khu0eLM-4zMcfEiObL768Nv-uH9bzFVFen4X_d1lNagna-cOQaH0LDELQLn8IOZ8vQFP8gL6HzieCkvtA1-gM_gTWo6JA5pFuEvtu6rcI3l_qGbbNzkwsER7FJVdGnkDvn3kR755pgYAK_ZMXvCROl_GVFEpi25K_7DlJNj8QMiD6BPRO5NESsIZN9vQVMHDvpkbCMhvJZvS35tkBihmXalh53fo1rRH71ZHVOEhMHOAcCCJoxNgv34UJ5myaR03l2dhwhpdg2ZyYZsIDCFkpXq8zSlY6zt8UNTgpoh6QVrB8wZH71dGqeNfjz4YwRngDHdfLH-p5aRgesI_gsO7Q6Ksyu37jaqZxFXTHPV6m35bBnA168gxSkvjrjpZUe13l-TIzUGr2eIgRcG2gupun7ducMTmoww=w594-h591-no";
    Button comprarcombo2;
    Button btnconsultacombo2;
    TextView combo2txtdesc;
    String urlcombo2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cf7f1d016665bcbe9255dc04fdb2265f";
    ImageView combo2imgcombo2;
    Switch switch2;
    LinearLayout linearcombo2;
    Switch switch3;
    LinearLayout linearcombo3;
    Button comprarcombo3;
    Button btnconsultacombo3;
    TextView txtmodelo1combo3;
    TextView txtmodelo2combo3;
    TextView txtmodelo3combo3;
    TextView txtmodelo4combo3;
    TextView txtmodelo5combo3;
    TextView txtmodelo6combo3;
    TextView combo3txtdesc;
    ImageView imgmodelo1combo3;
    ImageView imgmodelo2combo3;
    ImageView imgmodelo3combo3;
    ImageView imgmodelo4combo3;
    ImageView imgmodelo5combo3;
    ImageView imgmodelo6combo3;
    String urlcombo3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ba4b284e837aef9bb6c4cc1dee59c775";
    String urlcombo3modelo2 = "https://lh3.googleusercontent.com/FBrJfY72C9tneNWoLzKI9YDyF7eEfqTY69Xe2MjFlEdiz7FpSIbZEZe5E386LRsa90k-8XDkshgHhghGgsinHOLBLDsbKFffIArAY2PmJGZi6nuZLmKosb16CpG-CYocgQxtPDfs0Qk_Y3ZkFn7WTiTuPKws3rjb67kJePjWj4OBae32or_5w4LmecNwD0vjA_mLbj5tgy5UuGGK9VLyysu9zSydhZvC_iuouh7fevdVH_FZweyy0y9QowX5D-7_knJrw7GlStdnUpHCD1Vf0rljGJhE-6s1gc6BY0snJr0Vdjp-RTG05g2E78RiX_ORxtcJZpsFtjXqnJzjNjG8FCNwZ39fwGVVlUmBEhxFRLdypaUSun0uN-Nxfou5SGznynL9mDYbL7Iuj8zVL7FofE6ta2MoXZY7bYAiXAkH4W7GuOWXvgkYWPnwQeKWFVP_f4I8elSfJd7wCd_Dq5AA7z-EWQwBU4-gLkgpA6zmsy1J659K0ZMJMpeT9BSRQ6Ff09tkde0anSgUBbGZ5ilCOQwPqbhJ_cnmHRcZq4kePpNeYVXRy8UtjHEomXU4M4wVRjbFOBTESft67EYrMocUdFChbErqEgrndFwFWC3iIv9jqdnLBA=w290-h333-no";
    String urlcombo3modelo3 = "https://lh3.googleusercontent.com/pupS76EspIV7Ki-84nhKEvfS54uN-p2f3QqpvsKp9FSAwH5BuJOhvVbsaWVh8ukLliEus2lAcguiBqWS2zkAI21iI__SAE_3aaeeMpsxbyGr0LWFOmZwNySDuo72gg3H1nZ5czohePVlQ2VxSlXi-ePwFfFDH9gq8mR3Vl-lYqFRCxzv8G1GVd7_GgqluQ-wZ6nAEeBGW2FSEhzoTJbF4w9opo0foVfoh2aU3_HIMMe91WLBbfSuRK146U7nEDQ1xP-Y_PPt7LJjTF6G6qef4JH79WTNErWtyE21a4p7Tn5WSIvZnaE6Wkm2LYgPfd9ER2qtm8k7wNbmLMZ-9oJnRHte3frd5ELw2dUlYRf-Fmzo7UT46Iu3I4xnQcn7yVxmN-_pRysEE0SH83oySI5BHaIjSvIxdORYWdnmmTlpsn88XRxiqNWGj8DOOcXRS3z5odnBTTt7XRM25EoEdHNWTDqaFriO2aGRCyK2yXhrC-ie1y-AMn-jT6c3itTFMTexLUZqkm3q5iC1eEqAmY0NQr5YtLdcphM36vu70pHI0UPmSrA36oujMR6dgLG3JguKqjldykc1cidAYaEyzMi2B2hf_L_P-xJlseHJx31YoKMDYeReNA=w298-h342-no";
    String urlcombo3modelo4 = "https://lh3.googleusercontent.com/y1OwexU_EQ_2UHt_R6poyAMvbIF64fKBltiqPQDQTniyuG0fXrabOciLDSfpGP-M2_eerLvhuc9UH6Im0yvqiBgqWS1aGka--dcOqcgkyZfvnD9STMXzdoV6Ow_cRsHVrIRkvXgMc-opSRGJrMWbNqtqIs1llI9OAXPZNHB8-puwt-liB_R8mIl9NAIThRSX_OuGlE0W7e16_pnzNvGFQ3pZFJjRpu4D0jRRwebkXufUcvLXR_dRZUEIY9mrctRJY0S62AM_RC7X5Z1gAuhrJH6OjhUNuMZVDSUsyY4Dh5qAyH5qUgTy0YCvRCI9BXvZ4A2Q9J4AFr0tROPAjgwFdrT_gpR7gHiLdiweR91OQud9-mZq-NFEyxhLyXU3bp6dHrQwT9A6lCdcnT9cr1MKqpgULAVJsyLEOpzFXwWUiDDwuCCjgJTnf3otAyVa3viiOVITP8oZvb9usIZ2RvBFoUPNt3pZyp9aFemB7GIsQkNEGhDw5l1BA6VOFSXz8gaYhsTQhvCFudw27otrZbYRAOiNs_Ajkpgq6lf4khL92qL1q75euj0tkjNTvMVvB_ylLuOO1abr7HlfdpQ2Z0_PehjNKBVJC2Kvzbr5GKTazeAzCpFWFg=w304-h317-no";
    String urlcombo3modelo5 = "https://lh3.googleusercontent.com/ZrktwwZTA9eoE7p25pVOPAIiwhN6FrBBE8cmrB16gl6oiP4NLx2V1HDgBQuf82HVEhxWqVICbAIOAsIOE9XrWbEUbXsb_wMUGmF1Yx0rkjjt9DPrPJmKpbZ3xnhDxJxxtVZYoAjxYZvoj7tWNYdKR6oM7fGISwQmIRM2Y6qDOEhGlpVe6By44RCTle7SX9DfzOQAQgJzMr6f4_a_ha7fWs4ZoKZerSmAG0_IhkwIzkl0UmyqeVzQj91BsPK2SIUxy7nVyENJfUSBU7wGGqFEbMfCaxwSnMFTHAPThxeMBCyGjJqeumIFdTYfmX6YITcIEYpfsQrE7BBqHbhUE0f4yduh47PVBRmdr82qm0HFVnmj6h7zYdBlKhk6goyyd5CWq1-SeJhQv9T-5Q23dACDNQUCTlhBkSVk0riQeaRZEXfnjg4GMgKQW9q8Zl6CZcb0JpSPy4u0_sHs8rE-I68AtZeORWZT384Ee_BNwpVlNKOD4wKXsuxmUQiKTchAZKkqgJa-7kiV0m_2JIj1KUD2dqvn0QkF2XDc2Yjv5lGV7944fkqVaXdI4OOKSGCzUEujvBfiToAgcnf2exR-N7Wqwi-CEDIphH3o-JJXbP-NyHSfMODt4Q=w304-h320-no";
    String urlcombo3modelo6 = "https://lh3.googleusercontent.com/vk1L1h8TMqrgyYjhK0sn4FGPPY9Q7yaAhPODEulMihBN8rt5MhkkyGvBXNo6_YP0SAIGZb-oRsv5uxy9x2CT36J10D8-8yoLbmC1iBg9h59A2KUfvJ8v7lAgRQCTv4shKT7a9_ZYwjnzpN8T_TB9jDAr2MU5zoxkd3gkih-7JzQ8suq7apgA9k8qJRwVqN2YdAOsH3Wcqwqceofznb3EVT7dZtCKRIjtE7ucMFa-C_WzTFTJr24-cG0wxlGGO3agXiXrAJFQbg2RPfyFtsfkO2ML7qvKoWqKLEVfdXMDRbvDxUyOWh3EVaIVDFqiSQvEd9AePvQwV-ggp5w1Ucig202veDARY2y4SbKZCajcg1TPyLFLUxbn9gkAgQkptCiN6SRwFChY0FZgSkV30-RafgV7231I60ItL4dYQOT3EvUYP2KDElSK-jSespRdM9thT6RVZie3R4RX0aJwmhukAw4YM3WXt-zLA-orOpiKCxxge00RVNt1GHRYvKdjPTmhdyI30EDRL-FJwPKE-FqGXX-eyGKLUVNhmjHHUScLtF2DkSHHjixeLouR8moeCtGz2dCQl4_t0PKiJtaBMvuXVkwfl6MyFZEmL8YHp1B5rgL7JE4TuQ=w299-h313-no";
    Switch switch4;
    LinearLayout linearcombo4;
    Button comprarcombo4;
    Button btnconsultacombo4;
    TextView combo4txtdesc;
    String urlcombo4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=14b2978d8fe35ce2ea4157a8652e48e8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almohadones);

        new preciocombo1Async().execute();

        /* combo 1 */

        combo1txtdesc = (TextView)findViewById(R.id.combo1txtdesccard);
        final String stconsulta1 = combo1txtdesc.getText().toString();
        btnconsultacombo1 = (Button)findViewById(R.id.btnconsultacombo1);
        btnconsultacombo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta1 = new Intent(almohadones.this,contacto.class);
                btnconsulta1.putExtra("consulta", stconsulta1);
                startActivity(btnconsulta1);
            }
        });

        comprarcombo1 = (Button)findViewById(R.id.btncompracombo1);
        comprarcombo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo1 = new Intent(almohadones.this, webview.class);
                comprarcombo1.putExtra("string", urlcombo1);
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

        linearcombo1 = (LinearLayout)findViewById(R.id.linearcombo1);

        switch1 = (Switch)findViewById(R.id.switch1);
        switch1.setChecked(false);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch1.isChecked()) {
                    linearcombo1.setVisibility(View.VISIBLE);
                } else {
                    linearcombo1.setVisibility(View.GONE);
                }

            }
        });

        /* combo 2*/

        combo2imgcombo2 = (ImageView) findViewById(R.id.combo2imgcombo2);
        Picasso.with(this).load(urlcombo2img).into(combo2imgcombo2);

        combo2txtdesc = (TextView)findViewById(R.id.combo1txtdesccombo2);
        final String stconsulta2 = combo2txtdesc.getText().toString();
        btnconsultacombo2 = (Button)findViewById(R.id.btnconsultacombo2);
        btnconsultacombo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta2 = new Intent(almohadones.this,contacto.class);
                btnconsulta2.putExtra("consulta", stconsulta2);
                startActivity(btnconsulta2);
            }
        });

        comprarcombo2 = (Button)findViewById(R.id.btncompracombo2);
        comprarcombo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo2 = new Intent(almohadones.this, webview.class);
                comprarcombo2.putExtra("string", urlcombo2);
                startActivity(comprarcombo2);
            }
        });


        linearcombo2 = (LinearLayout)findViewById(R.id.linearcombo2);

        switch2 = (Switch)findViewById(R.id.switch2);
        switch2.setChecked(false);
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch2.isChecked()) {
                    linearcombo2.setVisibility(View.VISIBLE);
                } else {
                    linearcombo2.setVisibility(View.GONE);
                }

            }
        });

        /* combo 3*/

        combo3txtdesc = (TextView)findViewById(R.id.combo3txtdesccombo3);
        final String stconsulta3 = combo3txtdesc.getText().toString();
        btnconsultacombo3 = (Button)findViewById(R.id.btnconsultacombo3);
        btnconsultacombo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultacombo3 = new Intent(almohadones.this,contacto.class);
                btnconsultacombo3.putExtra("consulta", stconsulta3);
                startActivity(btnconsultacombo3);
            }
        });


        comprarcombo3 = (Button)findViewById(R.id.btncompracombo3);
        comprarcombo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo3 = new Intent(almohadones.this, webview.class);
                comprarcombo3.putExtra("string", urlcombo3);
                startActivity(comprarcombo3);
            }
        });

        txtmodelo1combo3 = (TextView)findViewById(R.id.modelo1combo3);
        txtmodelo2combo3 = (TextView)findViewById(R.id.modelo2combo3);
        txtmodelo3combo3 = (TextView)findViewById(R.id.modelo3combo3);
        txtmodelo4combo3 = (TextView)findViewById(R.id.modelo4combo3);
        txtmodelo5combo3 = (TextView)findViewById(R.id.modelo5combo3);
        txtmodelo6combo3 = (TextView)findViewById(R.id.modelo6combo3);
        imgmodelo1combo3 = (ImageView)findViewById(R.id.combomodelo1);
        Picasso.with(this).load(urlcombo3img).into(imgmodelo1combo3);
        imgmodelo2combo3 = (ImageView)findViewById(R.id.combomodelo2);
        Picasso.with(this).load(urlcombo3modelo2).into(imgmodelo2combo3);
        imgmodelo3combo3 = (ImageView)findViewById(R.id.combomodelo3);
        Picasso.with(this).load(urlcombo3modelo3).into(imgmodelo3combo3);
        imgmodelo4combo3 = (ImageView)findViewById(R.id.combomodelo4);
        Picasso.with(this).load(urlcombo3modelo4).into(imgmodelo4combo3);
        imgmodelo5combo3 = (ImageView)findViewById(R.id.combomodelo5);
        Picasso.with(this).load(urlcombo3modelo5).into(imgmodelo5combo3);
        imgmodelo6combo3 = (ImageView)findViewById(R.id.combomodelo6);
        Picasso.with(this).load(urlcombo3modelo6).into(imgmodelo6combo3);

        txtmodelo1combo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1combo3.setVisibility(View.VISIBLE);
                imgmodelo2combo3.setVisibility(View.GONE);
                imgmodelo3combo3.setVisibility(View.GONE);
                imgmodelo4combo3.setVisibility(View.GONE);
                imgmodelo5combo3.setVisibility(View.GONE);
                imgmodelo6combo3.setVisibility(View.GONE);
            }
        });

        txtmodelo2combo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1combo3.setVisibility(View.INVISIBLE);
                imgmodelo2combo3.setVisibility(View.VISIBLE);
                imgmodelo3combo3.setVisibility(View.GONE);
                imgmodelo4combo3.setVisibility(View.GONE);
                imgmodelo5combo3.setVisibility(View.GONE);
                imgmodelo6combo3.setVisibility(View.GONE);
            }
        });

        txtmodelo3combo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1combo3.setVisibility(View.INVISIBLE);
                imgmodelo2combo3.setVisibility(View.GONE);
                imgmodelo3combo3.setVisibility(View.VISIBLE);
                imgmodelo4combo3.setVisibility(View.GONE);
                imgmodelo5combo3.setVisibility(View.GONE);
                imgmodelo6combo3.setVisibility(View.GONE);
            }
        });

        txtmodelo4combo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1combo3.setVisibility(View.INVISIBLE);
                imgmodelo2combo3.setVisibility(View.GONE);
                imgmodelo3combo3.setVisibility(View.GONE);
                imgmodelo4combo3.setVisibility(View.VISIBLE);
                imgmodelo5combo3.setVisibility(View.GONE);
                imgmodelo6combo3.setVisibility(View.GONE);
            }
        });

        txtmodelo5combo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1combo3.setVisibility(View.INVISIBLE);
                imgmodelo2combo3.setVisibility(View.GONE);
                imgmodelo3combo3.setVisibility(View.GONE);
                imgmodelo4combo3.setVisibility(View.GONE);
                imgmodelo5combo3.setVisibility(View.VISIBLE);
                imgmodelo6combo3.setVisibility(View.GONE);
            }
        });

        txtmodelo6combo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1combo3.setVisibility(View.INVISIBLE);
                imgmodelo2combo3.setVisibility(View.GONE);
                imgmodelo3combo3.setVisibility(View.GONE);
                imgmodelo4combo3.setVisibility(View.GONE);
                imgmodelo5combo3.setVisibility(View.GONE);
                imgmodelo6combo3.setVisibility(View.VISIBLE);
            }
        });

        linearcombo3 = (LinearLayout)findViewById(R.id.linearcombo3);

        switch3 = (Switch)findViewById(R.id.switch3);
        switch3.setChecked(false);
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch3.isChecked()) {
                    linearcombo3.setVisibility(View.VISIBLE);
                } else {
                    linearcombo3.setVisibility(View.GONE);
                }

            }
        });

        /* combo4 */

        combo4img = (ImageView)findViewById(R.id.combo4imgcombo4);
        Picasso.with(this).load(urlcombo4img).into(combo4img);

        combo4txtdesc = (TextView)findViewById(R.id.combo4txtdesccombo4);
        final String stconsulta4 = combo4txtdesc.getText().toString();
        btnconsultacombo4 = (Button)findViewById(R.id.btnconsultacombo4);
        btnconsultacombo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta4 = new Intent(almohadones.this,contacto.class);
                btnconsulta4.putExtra("consulta", stconsulta4);
                startActivity(btnconsulta4);
            }
        });

        comprarcombo4 = (Button)findViewById(R.id.btncompracombo4);
        comprarcombo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo4 = new Intent(almohadones.this, webview.class);
                comprarcombo4.putExtra("string", urlcombo4);
                startActivity(comprarcombo4);
            }
        });

        linearcombo4 = (LinearLayout)findViewById(R.id.linearcombo4);

        switch4 = (Switch)findViewById(R.id.switch4);
        switch4.setChecked(false);
        switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch4.isChecked()) {
                    linearcombo4.setVisibility(View.VISIBLE);
                } else {
                    linearcombo4.setVisibility(View.GONE);
                }

            }
        });


        /* RESTO CÓDIGO */

        preciocombo1 = (TextView)findViewById(R.id.preciocombo1);
        preciocombo2 = (TextView)findViewById(R.id.preciocombo2);
        preciocombo3 = (TextView)findViewById(R.id.preciocombo3);
        preciocombo4 = (TextView)findViewById(R.id.preciocombo4);

        combo1img = (ImageView)findViewById(R.id.combo1img);
        Picasso.with(this).load(urlcombo1img).into(combo1img);

        combo2img = (ImageView)findViewById(R.id.combo2img);
        Picasso.with(this).load(urlcombo2img).into(combo2img);

        combo3img = (ImageView)findViewById(R.id.combo3img);
        Picasso.with(this).load(urlcombo3img).into(combo3img);

        combo4img = (ImageView)findViewById(R.id.combo4img);
        Picasso.with(this).load(urlcombo4img).into(combo4img);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(almohadones.this,marcas.class);
                startActivity(marca);
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

    public class preciocombo1Async extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e68ff9a9f087a16157f80793fc0ca56f";
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cf7f1d016665bcbe9255dc04fdb2265f";
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ba4b284e837aef9bb6c4cc1dee59c775";
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=14b2978d8fe35ce2ea4157a8652e48e8";
        String preciocombo1st;
        String preciocombo2st;
        String preciocombo3st;
        String preciocombo4st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciocombo1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciocombo2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciocombo3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciocombo4st = metapropoerty4.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciocombo1.setText(preciocombo1st);
            preciocombo2.setText(preciocombo2st);
            preciocombo3.setText(preciocombo3st);
            preciocombo4.setText(preciocombo4st);
        }

    }

}