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

public class chiccobutacas extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsultaa1;
    String urlchiccobutacasa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=a9e3a888118947ca397d2761376e8010";
    Button comprarchiccobutacas1;
    TextView chiccobutacas1txtdesccarda1;
    ImageView chiccobutacas1carda1;
    ImageView chiccobutacas2carda1;
    ImageView chiccobutacas3carda1;
    ImageView chiccobutacas4carda1;
    ImageView chiccobutacas5carda1;
    ImageView chiccobutacas6carda1;
    ImageView chiccobutacas7carda1;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtmodelo5;
    TextView txtmodelo6;
    TextView txtmodelo7;
    String urlchiccobutacas1carda1 = "https://lh3.googleusercontent.com/lcadj4raCW8tpzz3MjJglrAiv7rrFR1htf6KFtoqJMKPcSZvp9NGvpafBXLfOzhpmZIyh83sa6M6fbHbRrCZ00iGSs7p5qO5cHa93XBJ_jmYp83A7jx_VuRlcNXn-10xX_1d6K3NespIJ6TdqjOHa-vrmlsqvkUkpkEUXMkozpv4p_B132OPlrnYXbSGRGs4EwbZFo4Z01ZPsZZL1Cd8yQEOWSwgzuZAJcNv0IdQmj_kq0S3A1R4s3mCkFrz_zzx8h-Y6kqPBvLvB-oCjV8571BM2x9UfbZzfSKMjP2LJ5c-T88x8BEmNf8h1y1SBpHhDqtok9v79PZPXmAA3jbEACKlhh5ZbrIGIC6upPDitCAmApnwU_TBYQ2n9JUSXqhxuTV0lE-sVKC_YxVuv9RB63yUgpxu2Xbe4IxJWmH8x8IENusQIJomc4ZxQaKgwg1Wn5lxf_RoLQ3ThrfOj_hTbNIxRReUaRWLOkjOeRwPIT7oACRzlzyQCE2tQJa4ZY21RY2iLXsHPSPuYR734jLcTWb30wWphx0Ba8UBN3QoDm4Cw-LI5MalceonDpt7WSYE16OGss-6lRKwkR00NcCfsuu-0KWyHsOE-MbRppbulynWfPCrzTOQy4kH2nTTDs5X8aTS31vMBP5vA81cBVyMwxjTOyU5DmMwXW4PXq6B_eU=s725-no";
    String urlchiccobutacas2carda1 = "https://lh3.googleusercontent.com/Be8ObLbUQy1CdmFOCvG6zEAOyHa_QauB2igNMvzEhp7ya1iR_QXt62Lu2zFryJ2EhhmLnlUx0P9u8KVX5TXuKhRAYpjOER58RpMYLGc3DBGt9FYUm9na2QtK1n8E6QWUY7QHlqV1KqxanjsuvTja0HtjKg-H-13jIVyk-Ysc4nzHP7COJbFcKOb1mal1rB_1lhh0YEwmVH-0KXnuGILdkC03JbIM5_GO4kwrog2ufnLgGrfs2qOgzq394k3lcKBR3hj3EEizHSCbgjs3jcOubiKZGdGHzTPpL33pRWtUWxT0aB8J2wdDfov3O_IuOCJT8ibKrTSgHOpcCjD-xBNll-T8qt2r7O3N_-aqCDPzqHeKTHektUq_3xrOsuUa519PsqU27XQGwywIhJiT_GLyzdD1Lagg0x9GT5VRMO8OBKL5bgjrgjpHXq9v6tQByQrvSxWL6b3Al3qwYKJVdW2sT7OPX74z3ytf1DnwCbQomq_Vtq10SL7fPgyUvUbSrMAwNb6lEeMqXBgYfFxYZFGHKVOwgDkxPUcaZ2BwMcZV87VIfImc0e5_tMqy6xeZWB1jMwmBWS-vzhqXdxJBQTcR5yARs77YH_cOeUdad0lbmDuAlhT0BEYKap5q2z1_3eQInjHpsIMpyWHT9GhnaI2oSAPMIieKbtemb-ucq-kN6Rg=s725-no";
    String urlchiccobutacas3carda1 = "https://lh3.googleusercontent.com/LoltLjhpuI4ablrV8Rd-gPWAe7rSS-860AgFg_FgQlRiLerzdyl8ugRhfd7r7LbPD96NZ5nW9mcZWRYPJMhSBju9NTlAC0QBhtm_WhPcY6Zsw90fwPbvzLazavPThL407bktfG9qIu7rmpxOPsPCMloX6etC66QdrPVUoNY52CqVv21QMeeBDDyHIocM6ykCwneLh3OutkaUtHrRH8uBiu-xepYkmEhmt66Pl_nNr_QMHDxSXMe-pSweTKVx3ExjTBTQuDrRQuwQMT6HA14k_FrpHpfkn3nBJRsKL3jgpf38TAAsaQ2aQ0R1saEN_nyqZA2cmUoGDzeCNbHoXooK1S5sIo4VYu7vpqdLXLNgDe-yA-9ljJYqAKUEiSB6c2u69xi_Mf2whD0zmCJlpeUeSYGyWixf9w0oyDs-L65H01dtmVu-dg5z6DyF_cd49LIfYL-rbmeYd-blg3jz_Sz0WIcgV4wq7rmIeFz1hbGgY2Fk6rxIKP7jNKniIfTvF8qxgRJolVDpRNSUMxFlZmj1T5cm2n7Z_dtAp6QODu0--MJAHun6fFjk_sWxJh3i2fbG-cEha6hK-QYLFqfV3tLy8qpI6vILz74I_567e1kpCmuZJH4zEqOIA3zAqsDkp_v50MpU_nFtPoCloWvrY5W57JG4Dbk_3ZctdWdfhKcyy_o=s725-no";
    String urlchiccobutacas4carda1 = "https://lh3.googleusercontent.com/t_dNvtrQAuC0EB9--3evS94SLhTl-DrhJYVwwtuAGRr7ETGFBE32IZ096X8skU8MkSFQ_0CuYA-6uneOa3d4osKyVyQjOVeglR2Hwh8rRrYtXMoyVkt8aSSN7Y5vL7LT1fugDq00Kf0hgIjjQhUFp7FiUxfhJjqPB9iORCYGvTd5_5i0B-sSqZsFKOAktx5csx3QQSMTQQnMEQiy-aMXGWuFgg3lFkhX8A75kQBAdMeG32QSHdmCmkfr9x6RvNIUzC6V2eGnp-ftuWfIUmwdZcPnihUjPqw1hS67pYqxfDXP_l5tgou7Temiqrft-0VESqoHZoQOiDKDsYa3wzNQ5iHbig51c79Cn2FXuMn6UGB1Y6AL0rwO2XtxueujbwGJw6KMw1QzIMGMqMs_z9op-ODK-ORM7fsJxP8DP5ZV8wr8Y15RaPkvHOLODhOh--SXdiqh2e7QepjPJ1iO6f8cp7-PGPpnYM5jLSZppjycKAhDL9ZQgRpIrItWTdZMRpuxUzhajybWWVtpZYF5oD2wnSeTj323JyRz3hIuUhFBtAB_Wa1kkmjCS_egsGmLvL_Thh9V1mt5qBmUUEBt1N6CRG1nNg3auDvk4O5GLegWdgMJrHaq13dcZTV4_tvq-UTr8o2Zh2RfD6Gck65QmQxGDbvv3uAvkETcHQt0kkmtGlE=w740-h400-no";
    String urlchiccobutacas5carda1 = "https://lh3.googleusercontent.com/tv_eGYKUUY57RH2_LPdpRuRui44EkZyc_3KEDYtQX1-aAUIBQye5J9XAeytNUA6UdTSi0rWV7lt4KJ-YKyEyXbJnVfm3InBinee6FNMRm2iB0qvqa4aXB7qiYnT8f8AFAOhdKGG0opvulmzETqqhMgR15dbANAVH8YETPv00D3Ee-ah_R09wbeYDfW4tSZ2THiVjTG5_lRwUbDrBrazo0dByB6_dtc2wXdldfTHixk9ThdAAjMKLEvkFdSZbXXFslv6v5Bg-1P5tehyAKWUInAJbMwtqX05kh2ROa_7NoYfGKclRpsyFmbIhu00HMlSaFFNzkO4f3Xo0UDi_nW4y7xWGW8y9dnRnLUb0mKuNjH2ovbZvfW6VJuo63FjOlva-K3OS3ZPw-Eh7mvhAqpizfL084SDv0X3jgu47AAsEJS0PnMBt5jWpip1FZF9bb5y8hRYrjOcJI7FBqrYNmMoTnbTqKfvBEKvNuC8-aooCzfeCLKzLs_Pb07HXkny8cDfUVQYD_AEkteBrjaYKsS7WWniMgtUf2Sw-CSWfB8C8nSxJxNxze6rHAgleArZD9cnD44GNi0HIXwzAHRY8oQ88u8OuOpPOJbPvdjGGEFaDMjjqu-8WAWZJV4FN5d0Bg0w0YpJUkVCnpH-6nflmfHQRdnbpEA-4B9DbXCnsLOaF70I=w740-h400-no";
    String urlchiccobutacas6carda1 = "https://lh3.googleusercontent.com/j_OzpgtTz__fW9ftdhc6IswGNs26_0sXvRrtxF4m70t4jOg5_Y_3cTlY3w5yUkMaDCcOkdGoS2c07dFLGgzacLAto-kRKJgHKYlNNy4rQeJp4EI38l0e5LqhMXHlsgHWg7_46YN2-9fWK0mBE_J4WktJ3-SqySZ-9NoRmCPLjiYKLMq8J2JYPGS6x9sNyZA0TYnhKb0gqvdMY2FG3TsfFMOQ-1lD9JvY3pfxg2T6uXEc9EggclwT0wenaEyGHl16cqy_6YPJDJPRFVYBu8xgw2M531-uQUoi-1hQ4iSffBWZPuNX_O1HtEgQGvDrJ92by0nGkGQkVPxv9Bqa6ULubrfDTqt5btZMKfCO7y3Y_EXX1zcQGC1iZV6_rmEIALghIpCymH7lMzS-oppE9ZwTfACTuMUhjlIue1HdcUQNClsIs1yynLaM-4Wsl-ezM7sTDkLuxJY7DAzUNouBRq9Q5tsxviusj_5gKEsKr4FF_wMaHe6wZ7Js0J876QBpJRORPbHFZtyUvYFX88QvIdQ-2VC7Q8yCNuqeOMkQf3LPEaiP8jQBDc-MkEC_NUVOj7aLWnAZsDRyE8R6HKpIiXrDCnIZlPUpLpucD5Q-5EQwh3ZX9neKZZGkMt26KXRcZKB7pn7Cbl65Vu4EhHUo8I4iyiIi5wXZ8iSlIJeZPC6-6Ls=w740-h400-no";
    String urlchiccobutacas7carda1 = "https://lh3.googleusercontent.com/1GZYixSGPJ-qQSo0zrWbQWgBd2MZi4oLSLl9gf53XrkavfZfRoAJwtC_5-nZdD1Z2SrOCB7LDgBNVcao5za7hoR8DoS5cdoUQ9N-H8KX6YNr5uajMA9qN86c9catQsQY8n5yV9HHO7tI-kFfwz_8HmSyLlN6c9otqTJvoSTwo1jgSwmoEUl4YWWZSK80DYmjgGFUbZdOjiu-JGvKsz8pd_BYC69xs4c1jHa9_EKJ0Z9uttzbc49N3u1LXgSLoD_foiOlgHkuEjAFH0o72gZWguL_yypcS_7lKqAKZUHkwqCm7yz6OJ44b9L-lxEm9ZSa3LU0oh0BceIpnjrk3yxwleviyM-3DOWXgBmBpBqQY5bR_r5wMIwR-aNLsR0CRsQ1pJLG9o1zCaSCxJXrEQhRAaOZk1jKw_sfO84vDMIIZOEV5L3546nbnRiQLZorjc5f8j9SMzdG1Z6Od8f49b0OQPbBClXRrxPofuG1-9y3zvL0QwPcOdQsgG9bGOi2UztjKdzrxdl-g2tpTRKdW4HFtZ0DLjhjfbD2PBlwQAZQf1SLlqfP15qr02Y_DthYoJjUy0keb4gfn0fQH9Fg7GfzVGRIKjn_0cx1dWR4_V-W1zhLe30FUO_rK8P4oPkeC-eLzFFy7SgkL8N5QxckqX_4JoeBh6hdJP0MPtp23-Ive4A=w740-h400-no";
    Button btnconsultaa2;
    String urlchiccobutacasa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0a4daa1ab465e5e976d52e082e36beb9";
    Button comprarchiccobutacas2;
    TextView chiccobutacas2txtdesca2;
    ImageView chiccobutacas1a2;
    ImageView chiccobutacas2a2;
    ImageView chiccobutacas3a2;
    ImageView chiccobutacas4a2;
    ImageView chiccobutacas5a2;
    ImageView chiccobutacas6a2;
    TextView txtmodelo1a2;
    TextView txtmodelo2a2;
    TextView txtmodelo3a2;
    TextView txtmodelo4a2;
    TextView txtmodelo5a2;
    TextView txtmodelo6a2;
    String urlchiccobutacas1a2 = "https://lh3.googleusercontent.com/1rrPX2OD2rjyci90_GF5LpJHNJvNddx47C90kifhiWO6kGcyC2ZTE2N0sgFoZAxLoq1I4hYNRFDgmMhPXJTZVicQfnC8k4ZzzEasQb-GupCJ5vZZdt23lOj_r2iFYx9vPd3QVUxKf9E14PG0AYPO0Df9NeD-b12K7v_0naR1i1ix3Udw1gnaxWMJXi3TZJcH4txLkkLmLv1brm8g5DCYwdaV_adRWmvlcBX_2jlRIW-wdzw_XsYtZSQdkhujbx9OB6R7_RDr94k_u9ZGWuFcncyZhBJ9daaSMAYPnKb7Znb96sp5HDG1XSPgPHzzvJObgekqBxj9xiy8TQQKEYohE4vYE-Fs1II38FUgNw4RjQxVJVZ1EZd9vDsxk6WbcUv2PKdzFwY-bskT3FD4X4FuQqd-ASFvpy9eoMcmpbFPk7tKHZZcHYwf79_g6TNQ3U5meK54kvO_2XpVbRnwTa4L4pnDJmCzdaK3OKYGvdmT2dpjHu-dBxqFvQc07zrZ6mHvm1alHYwR3WbrtARO3ILApcdeZxCBNVmPyg-B2dHhEKociylOUeox1Np20t28BynW-QJkRrGQzjGmUhMAZVKPR2g5XAnt134OUzip_1TZ4vbPU5S1sp3QeM9E1XlmAGfTtxZFtIqQhDKMAS4aYK3PEuve91dI4s6q0jf2_SrHYyk=s725-no";
    String urlchiccobutacas2a2 = "https://lh3.googleusercontent.com/Q--stX_mlO_rwp0ENfGoqyaci5MEmc4OE11-pNCbcjaW8a9JHmQetTScwKXiSOeXIhhRUou1IwP_0hvV4dpQ3y8XoCemAid8ORpDWiObcIAOmhkAmWpyGhiP-GaPud5E5IkyEU5_PsGTfWKLWNRL3YvzmAqlCMBWPuo7qUHXa4hehMIXoI1mof6XarBvuuCYYadxWozM7EaQ8DGVC7laKjdsgLC9MZXHdlBFNi41oMmwCzR44KPG94yE4YwJgD-Yb-IepLF9BiWPCqq6NVR5459CdieCD-DP0pQwMGFWM6f5UppxS4cPKPOe2ng-fy8_gpxIJ-5Ko5UpSPny9nQfE3q6aCnAJpUydh7TppgX3wZvy1CEaLhC9uAwcDDETZaTS_aFVbit0ICHXx-4zIGtOBsZ9QV3GdvYZxyQ6gm6UFefldXe475S-OqSB52m0mCHB1iyxV3Iiz3n4EcTajyu01HpJu66gy_bkCuW_05h1cIK8bl9dUkCVPFBdr4DEjbiWoDyI2IZi3jhKPeek2zGhM5mTlhsa76SpNWY21K-kw3oQz15fz8CO9mJo4teXrC7ZXDSI9RVYfcZq9b2Cpua-JDJxUIIvSZipzVfxBdSwJCCszxe_VPw0R8jcbXzSucLfApyMgpE_aoGg5Zj8FM-ZdU3VlO92VjH7P4PuQHXgcE=w740-h400-no";
    String urlchiccobutacas3a2 = "https://lh3.googleusercontent.com/YCljMiDs8IgGP7nJ6zCfFf8iXHC4ani90wE76I79PuUobXKaKBzinzRb7qPS99R7QXmFx4wIuT9vMvKJXXAEBr5bKffwVH7BGbxBjLb7W8V2GbRBIiI_DtaAzYdmjGWNJOBKIDDwZSfR54keW9OZX7C7JefIb3Fb-g0rmHIl4IURRPabgKMQ9hAVr5MHu4tPCbCaOF8QgOyUl7nMhmFW_0OtOWeTsBO-55UDzgpCsa74xSAnE7iTaYOh1-zhktUM3BY8hQKUqhkyGwiE-nWvN9xk3o11_tc0DdjQvWuSGjGdE6SZIQ_e4MdlbuhLhI7ukQfx_pDF2qkDG82JOEn12zD3NF2DwYB1Sx4OhjXNF7-6CCKx5s1QVIF1fHMLzIHbHJb9hQffDjt3yZAdRdywAcq_DnE_JjsA7kIuOFH2CpzoTANx79obh8wTM6YPG34KrDq_6envEvNEbHSBFMZcmJY1UmZ960Hom0KKNq5A5l_Jk8VRQYYK217b4JzDjIKuOi3Rm0bH9eLmw8PxCGj4LVBQ7vCilqH7z6XIFsxV6B_5Wuvyf7PwjWMx4ARwv_bGkPUq2VThrEkviAXLvALmbtuWiPMzUdd4QoglsABZ_cZaxHLsRcKYlZdM0mAea0WvV-ZZY-yfugSrYHmW9JrUWkhaHreo17-Le071b9HAWYs=w740-h400-no";
    String urlchiccobutacas4a2 = "https://lh3.googleusercontent.com/JFsSvtScyoZuvfPX8WyXVElGPpTvjL_wqJaAfJh7Fb7w6aKPqSxqv9T497ZmlhPUVlBWKYNU0IwtazF---xqTG-PYEVOLQhksQ_8PsqWW_9td-o4p5PTXjK5zCfWky8JhBfR3PuqPO4va28QmwE8utTLd705bByavKeIGJEqEHjqWTObWdSBkwvkR2_1P_q7o9P6rO8p84UomtsdPijwDsamp8_cTxoHmYr_fJ6hsHiLZlAVPXHcwm-ZwE_azzazme0Ta8ghfSlv9BMo2perHMEIteEXE2oKSrdCAVoEB3i1xmLlmgX9UtM-KSg5PT2SABNRbF5UBLI8VeyzAnrAAsjBSoHSifzbAj7lmbWrCyGJrJydZWGb4Ok1PQxd6cP8BcUvrkDfjdH_5ewCUc-mmvwtt3qvTEwUGLcgrDDXPUTWuudsPPSp3awNAI4WQLOFMpo_4ogwVoq0kHBEf5BgR5a9aJX9CKj1UR-SETJhHi6auId4OrSGjqYkNCVc2nFfFHyzCtcUHPIg_Jmj_thXzkWmkG6RX7OwUePUnJidCp7CR3XeG4m_DHCygea1vzqRm-TqZ3RYLqI-qQtUpPjKuiOSaHH0Mf5soKYpMWJ8kuv8Im3n__OHu2FQL5A3u7hU8Rkn7geFkeZtHPgSKJatYGTDwbIr3cAwoKLEC_Hrpzc=w740-h400-no";
    String urlchiccobutacas5a2 = "https://lh3.googleusercontent.com/SklEcQx1jj8f-G4OnMGz-5dotRUmx6_T0xpUIb6Y8TyrpHpxyoncH8NVL6sF9zTUHtAtDH1ZrBB9H-UezaLSJVaIRLTd3rXEpSOmhxS0Eny-0aJLJP2tvidsv0CEYLJkgOJiYIbezOhAFEohCCsCebf77eWjJ8H4gLVV9YA3fVoRF9NEDaAI_INRdejU_Os3oz6FB-C2MZadTB2Slp4O3rojgD1iVbaCDrwpI2JpsT0EgN9xOS9y7ztNuMFLdC8CzFylSQXVuQYAPlCwjF1VY_TdLQMIqQjCJ8mdguGH_jeC8xRivbuB9nY1Q36i_BjpVCiyu4vjJmAE6C1dDGdgt4boOfNNCuzMD6Cxy1IBwvSqfn-x8bq9emlEYAgkb33qlVV5NnutQtcQxldiE2KgWKYjk16DRm-B-vtUEsUb18jDI8PJDDX615nlVN39FHhHL_jlxLXnrk3-GBDZSojusoLOzCkifeOSD5NhBiJGqaViqhUb4H_ExZeliQXxswtOXmV3zXODWOCCcalB4LNFfgQTn2Zlu4Mik05N7Bp2c7A65uQHPtXst-fXWgwb1iZoF0CiWZ7raREDLYfX-g_2UDW23PCE7KP8z7O8MjpprtLh2tn9QAOcQ8qQIYz-zPxyvUTFYo6TBUINOgq9qogas4LklyV0XC3_3aZdsLbbPqE=w740-h400-no";
    String urlchiccobutacas6a2 = "https://lh3.googleusercontent.com/kDVMY1ca1ttDYosdFyZGeFrG__5XYRs5FIVlT3dx8MiurSkitnevuQVGMYr-Q7jpKWfrOxkGn4xDPOFPHrcvQrmDomeH0_Q070tW91PBySv-ktvrqoOFCjKvmuJTvnqwoRUhXC5Bot3QBRiyPTMn5M2nuUa5eXJzsv3-b1jkvJikbAXWBRG38Drje3l5gC5ItB-o97Jwdj3awlP3FwzjgcdWfz5B-BPG9I6bDo6VhBlc-4gPbM53m7nKPanZIU-eVz1NcINIgUz4usFk1xBgCfHNnAPboNADBEIA_HTph1Z8_5Xw4J3nt0ZrjBY9Siu7-ZMXhXcyPEEXi-oEfKjJ0Gp7ntYg7NULZ_aPZaZfpi4Ze5yuzBWDgAjGrvRs4k7pcCKzgizZwrBJZsutAk6Zc3Wkb7rbIiG6C4_M6jLE7D0TbYvGzzQbvc8PVJZM6__Zq8-fHpsBybJ2oovn2kFRS9WLrjrgKZWbrvbPc6AUoLwFvWxwKV_Gv0FDZMpk67ug0D5mIqmrAgkFfoLZmoittU1nU_r1_P62Y7RlUswihLKHx0O0Gte1AT2ofMASj_4TyHfjJOccIP-sn3CLob-LTp4ma5Jg1hVw8U4oFq-vetyVqUNeeWqaeoTGpGgmJkhjnlEkhHJG4t0LRLbZM0m5-QdEcUR-6NRHF24RxvpNk-M=w740-h400-no";
    Button btnconsultaa3;
    String urlchiccobutacasa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8a82f2675d46912b84ff29d50e816c47";
    Button comprarchiccobutacas3;
    TextView chiccobutacas3txtdesca3;
    ImageView chiccobutacas1a3;
    ImageView chiccobutacas2a3;
    ImageView chiccobutacas3a3;
    ImageView chiccobutacas4a3;
    ImageView chiccobutacas5a3;
    TextView txtmodelo1a3;
    TextView txtmodelo2a3;
    TextView txtmodelo3a3;
    TextView txtmodelo4a3;
    TextView txtmodelo5a3;
    String urlchiccobutacas1a3 = "https://lh3.googleusercontent.com/6FW-ae2iaDy6ssl43Z109SZ3hvjcdU7Cv_DtvBx49bT1f17YzAsQ9XrIt5lRfDlD5TrbwMzsLRXU0JfpxW8DJRWJ9Zui7OzdL-H8JVlNjQA2ywJ290Sag7FltWNQpSp9zUzSo_95v6yNuBVvrHKwuo-RGlc7E7xWsnGUrAj8fgBHLY5ywm9WH4RlUBBRagOkVISN4Vmf0VM2Zfsigt709ifCjYF56NatXYQuBvVjRwusKP4ZO4I79-YvOXbM3n5TK5oQHyj03QvLaTIrZC7HaTxCw35WyDGHX_k9lR2jVNLuQjZmO7hWWeDbmC9Cl_VlMMm0JeGsln8HMLDZ36RAfmPLYdJQOxnL-fihyeGvvmv5wFOX4UGhXGI_OJ45bYEaniNzkO8-_Y6Q9qB1rEh4O_-dEHFc2O3wiKODAPH99grTG5I9xQ5lDfyBsn5bfm13z8BugSXVumfU4hVDA1LAK-9xOwUumx_UPD65fHo1IdeR5UFM92zWObcPUd3303GW809k9XUI4-q_KsT9mGwI2LcT24t2kM7Q5pdHz9QCfH-luckDeA13NgVJupFpnkH2HYopyZEK4THAKl-A9yAxdIJCxFjJErrAfc56C0_StEIEckU7xV_bbhtd3pOagSG4SwG6TPC5I-DHX8nAgKSxA4wdel7PbTH2-Ww7C_iCwgk=s725-no";
    String urlchiccobutacas2a3 = "https://lh3.googleusercontent.com/1YKwtyHgQqQgtVIf-TeE7tHR-2iEb_2B5hPZNSa23dI3cEir72bDguXL8YSsa-VHzZycCmuZ4lvx34Z0ZIDSogfeBgNTZNN0FBFju7sXPYoD_r0GO4LJ7H4J0NLjoIYbcWIwuhgtaqnr31MyhxAxfEEGA5029g63WAjW6WTIhYbPbSKCceAtUR3y_n_U52QzkZ19m8xMMhNRFsl2sQKK9amc7jGJX4e4SHxKrZJjzIOr7XCKdQdacmYF8WTZkr7EmxqpaS39vqyP5N_ldmUEtJIPHMhC_EIwUkJbVzoAYQZKGASoOgMUiHWl8U-eAzxj6znHG2GEpP83HdtVTWPUImOX1jYJylCGstVxbXsGSeicgeL5SnjBX8FU0GOnoKtWx3R7Vd18rL5_floJ1BEDlJy-zWrCdCUZC4YvfBcnXvJ06wWGao4jwPDylrYMvCEVnsUYyIJdH3CEOSFI-6rlwWLeLwrLQCL4YKb_xEXDfB7EyviHGzKz5WF0nnx-gQDvSIThigOxOAmcFw7CB2jC_xVmig9Spln-sa-QyMQT72IxG-9trpZ1enWbrF63OCNMB9l1YkVy_xFGu2sp42mJH_cvdwaYU4vOs_zy6omF240jNSBRKzEYnNBKrzTEuINVsNudR6vjLB1SVpSiy0G-eIjYhPzFOzeYS0HJ9fTwUaw=w740-h400-no";
    String urlchiccobutacas3a3 = "https://lh3.googleusercontent.com/qfiu2jhkinWLWIF_6aRplbjFwhPX6vGMH2bOaQ8IbfKaj0lpSDLAGyALHVLZCVuqaj08YqQz64qE00gdfGCqqdLoksKsw4pEqZuI8GjZkkBpbsh5iseHv1wqFqEnYtggeL1vWzjBb63RBa0HFJlKbVw5KLvSmuo1fkm9dyHIKKq4JKiul-RECBJHiqTAUKRyRfQi1gYjRvSqpthxrd-ykBchcv_2HpAxxhsB60lB6GKTkDRqARQoGxn9imEUcCrSBB8BuknhD3ZGL--e_94AZj6cmYMY7Azn8ziBdbHQdAQpTmn9Ht4GtM94V3rCdiob6w8q_9bw8mTsoUsL3aj85X26M6mqx0muu_Am_6yCLGJzYMyD8Qe-q5kbIOJK5p9c0U_Wgc8fMNjuAptuxMcxrc-lwUoHqL6Hvz_iKr-LbBAPC9HVAyVTGtAVgXqJ3KeGNnrajg1LlGA2HL9O8l8pMGIF_nHQ07H4U6dpgK1ElDmOgO-1M-RhogmwZoIpEV34epEFAv4MXwIlclcK1mpcJepsUO3TVvvPzNIgXiiM8sdsZi0UFZ6mehBYt8VMkYsYKKntrtHddzsyKOJnLd8Rv2V1w_okUmt68DlR0PkzSdgJoxUOsFRtCFhclG_pPED7o78i5wlj3sbscSYff1rFj0x0rp_rra_CPqQQv1VMTZE=w740-h400-no";
    String urlchiccobutacas4a3 = "https://lh3.googleusercontent.com/CrsmxKkg6YNAC5O7MR_uH9eoDO3RKKOYSexjPJvx4zQm57uDiBGswXUDiaGf3SdwmetbVzTg7FCSRyYgt2hoQF25YzbiflDwcm5TmR3ZdYUmwBAr_W6e9lSeWH1cNmjl5ICrgAGsF2Qmiz8U-cOs9Bbnc1NjFhoeHfEjReU1Ne7xAb65le21gz3ts2Lt3iX4hpX4wZntPIsLdwDGnte0gfa2_lgpNQGS8bIcZ_qipYWnJ1hbGbQp3bIvExJBl03QG7M8qHy5CRK1slC_gJUwOZ2l5lAvaB2SG2WXA-V4a1Nz9ZPLZPECZ2z4c2ewkvXJHpzeC5EZmc0XjwyWuLhVuKBADJpC3axFL_CCbt4sorYs3d5aslFq7iZiP_JH6nrWL8pdiaaWbZ3ERQc3S1FPZ6ZiHQRbdBImp2A3AMA0FRGDPD0kqYCg0IX6w1VUyn8YHIBgBhoMdI12rDUECLWvuiqwBS7P0YXyejpGIX_eV2nj238bZ6HAkmMeuZGYyAYN6NeLG379r2p49c7Zd07JuRrQzl0jZGNEVp4yvwFpsm_t_Pi_L2OAstDKpsIc79SdnsHO-RDYfsVlNF4zXys3WNm1vH-weK6VbOyztaZuZMYp181wUpcMH3o2V4JMcbCxofuTC0Cn17WBVIPgHzFet0T3H5M3NmlTjjrbqjPqUcI=w740-h400-no";
    String urlchiccobutacas5a3 = "https://lh3.googleusercontent.com/C0uY0J48cqnZ06KPgAEzSqvwiTV5aRxx-k_p1G6AXwoBQwTi--IramUdUcwcfYQHpuQ6IYn1LlYClMu0LTet_U1jMVkIBZqzZ18QGAeKPcMbDqM2nXs9kDwmRD7FdapyxoWF1ovip8muwt6qHvs3luefRKmn1lquVASq8cMZ4epp5u7i3M1JnT5xqOs0e_MYUiAdOUrqguDpO_RasDPxuPJeUgC-RoCcKMuDa_Co6LXMPjVzvxQt1igyiCTTjQ15v3cW407V2my72wLT2MLZT0lp0TAAtiGyZLn7ynrTLVeLrFqubWbS7wdwajJGzv5izHyyz6rYzRGm23iZzTUxhYDcB1_EnaNCPszdr3F1UB6mq1xNalTwBJf5CkLRtdfqzVwF1fLnIUhD6z7l1kSc_e2mx5Dt5GHCG9zHyIH2KBhL81aGDyHfDv4nga_2q7EELL96smkJMxwJIKObNb-Fx9WlaAP-QZErRiY7Z1mJgktilwSTIiB49j1NbkNBnIEIBxDcaTyIFqEEPnB7QgKnIaw5EO2n-D7Rw9qn87zKkOwghxrwNZSbc2hZAhyHPDurjIH_v-zcQ_p4bDaQKsWgxMPz0yPNq3cRSP7tDvn_KUH_E4BT7a25h8lxtzHSplA5aVulCdDj9NgGjbl4dPsNX7jZoGHiT6HKY6AnQ2TbY8k=w740-h400-no";
    Button btnconsultaa4;
    String urlchiccobutacasa4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=608b3bdbba70716515651525bd449a4f";
    Button comprarchiccobutacas4;
    TextView chiccobutacas4txtdesca4;
    ImageView chiccobutacas1a4;
    ImageView chiccobutacas2a4;
    ImageView chiccobutacas3a4;
    ImageView chiccobutacas4a4;
    ImageView chiccobutacas5a4;
    TextView txtmodelo1a4;
    TextView txtmodelo2a4;
    TextView txtmodelo3a4;
    TextView txtmodelo4a4;
    TextView txtmodelo5a4;
    String urlchiccobutacas1a4 = "https://lh3.googleusercontent.com/pk3igtBDJ7fIWz2havoYmvVvOI6KfZSIK3RVsQuTEBCgCe_joYyzoKbcL27g3Mnj-ml_1FPvYR41bgZdaDMaFHm_ItbyCb2RYCviIvw-zhevIOgcT0N0aGCVjhSI-HjyHFQuPwAoy-yhTmyTJfrxAVMLeGUdOKpc9ahi2tmfBu4_XVAqt_-0kWNWR-GvfhFkQUXwShnGwncAr3HorNhy8SmpDi--vbvNd2VCawz_nu2hULIK8XE7SC7W6jRhKRsE_GRlHk7KgxVxbpKBvNjQvpwvKPwhLw-LmYLDBQW_7_UJsQaRwBaepofkg_AuVphkbtQG9eiskMSZJ22MSG3_V0X9OAAFV6ci7DSgrB9Ty1Ihfo5A30dMgvnk4MOJ73-CytR-h_jKWs7eYQMcL-jrfWbxWuUV_Y-76Z5yh_u0srrpxU3mrB9c2_aDf_WL8d_CGRXPe7F8uOEDkGzs7KngTYET6w0MNqjFZd8XQroa6P7ghoT1krPh6paitt0thMl0JkegPHm2eHN0RzS5KUI2dqqWYedYrTsZW2ot0qMbPmcOmI6dc0F79rpub_-V_gJdjiNeUfvVWxJBdWSgsnBPPU60Zm-MZ1_rYor8NmTQSsBCiUyslEQIKO9COFpVyJXe90_A1SVCJPIwxpjoDArbiqTMvlg-4Uu62QCLtgDXv60=s725-no";
    String urlchiccobutacas2a4 = "https://lh3.googleusercontent.com/fS-Q26kTMFqPfRB7myXerQowqRiAnjYwjWH4T-8v5aCttewcmRiLAfwb6-B62vLshpjBd4V4EvlFfs03Wpzp525sjEtB1_Eai_oTom8iyTzmbgsCLz0iFa5XE1bcW7czNXUVGHkRgGsa13Rd1BqlqEqbKnTL-pBnBxU5rLvXvwbWHVbvBmrO9fJ7Oizb--sHi2Xc1FfItlsApUeBLaLiaXg-GJ-74Kfcqfj-mpmuXcbjeRnucTTswP0En6UP7DFTSROqqYo7mOKPQ-PLyjwthcEp9mJT_ooUWo-xK-3IA2BBtXjZiHNSQ_W96586V6hjmd9qwSI8_KcZFI_-W0EqeGZq0d5EtySh31-nEjC8ePCOQx6u7M1BETq4Zt6NL6zwjaWo8xc_cOW68SN9c1nvKl1spqjv0Y14EwC1STXHMBzhp1qbco3Td0hNVFggkn_4_u-lm8g5ICYiqJAAaz63LJL5E8rFUmVvmq810-BZV_5l9wlGStBWUuvjZHW5_36NVKWjERNODH5gIQ07LSnoLShYYt5C8CIRlW5y2O3e8JSwmHdE564THKAt6elEN6diz43iC__7_bBPhqAxl_V646UNL9R2ELMVdiNwgYR9LTyno84qEvZhrui4zMIyY7ozgXVKjcZypBQAg0d7ZVv-iQNpQMIugVilg3MdB0DqcW4=s725-no";
    String urlchiccobutacas3a4 = "https://lh3.googleusercontent.com/vkx28BwSk9sF2Hq3IAM0K-mvyKYQzQY-v6TME9u0SuBvWUBmirCA1A598dOvdvH1LpFIRGXaocKXdN-3uBChj1zLWCYaXTQ13G8bd5GdRnkelxyR2VjMuNb2A5yKFy939WFe_Pgv8fPL-Z-UJK0sueW7TkeQjvEjDp8wH3UZDwmKll5sD0vezdvZwWIfHeA5oQjiyQBb-4P9HRID6pzBa4LPivOZO7CjEV1In5Ch9ZOa2IbFNE_yL8ul1gVua28Gg5Z7nlu1lvnQ-DopLG99Y5gWWAjf5idXqaoOFKzynPj2dW4Seo91OV3PprA7px2SGj3To9o6k6lmo8IMxNJrFKfSjTaPfN1nQZ5m4EMyaWH5bInAI6jbSC9ixyfvSU-odoKMk2m1t2lUTLKJmvkvEo4Mhnfo8IEVvcBF8hHmcD95Eiy03VKMSnUAF1njbTbQARPyq1n4ZL2UPp18Z7t5XBTrx0KKKn03o7vHd7-DhdPFOm02XVwqCUKgY0W24rqOcCfbUfC1gHCCBhKc9-xcJVvR3YUJJarhjaSNF4hLMklrSgmoprAPAmdBZXK7qgMC68lf4xCbesytvttLfZTmA_Xd6aGdaHV-yZCCnFczxtFMsHMRZ-DL7P36LN2qZhenxSBfF8gBi6TNl8oPITjFs_MUkGdoBJGr-C1oFh_l1RU=s725-no";
    String urlchiccobutacas4a4 = "https://lh3.googleusercontent.com/TmOyuD6wsQACBWM6SXKiH8DBo9tmGYL-CnilP4LsrK95cm6m96-HCpqd9mUQCtPLv3jCuTa0HBJrPqjboHh-hAj5SkGyBHRqECRvVxDc2KUTWKVf9rtP5Co2JoSWUV61-TPXIy8JC4vS_RENPLpJiWnOAS7G9n4453R9iXd_oqH4iqrYPiOtogPVe1pdJqPWBrfdZKCENum_0eG5ODkS3IhtN4K90Yql58OL7hLwMRUzf0yVeXSvlYt_6mYL9MCG83moiUHERhsVDwJTJdShiryIM8e3e1_TJemyisNGnOPQAD2x7ZOqVDHATPU25WaE29A4DW-a6VJRYdEwT61NFIGQBUDodVYUbrmR8-ovcXxJU9GevPcyVkdp8qXQ0ZIgJyrxBfmjHrn3ProxAK8H_6C2R2xjK1XnI7LJUnvDMASpwVmhVUKGKn8bEqiCQ0bSZy5JlDjkpEckVcufFy9Wdi1B8hDYt_pIY_wI48HCdxu_NZCy6YakTnVSrKNHGgb5u-pgswhRRiWoJWnCCRg1_-Cr7dNOE7rW0W8iYz0J2b-eON63mwgi-FXhYNW0sfFVM3ngjFyd3j4o5XrSBsBxvmU2t18gHUfR6qvXtIOh8mVAw2CfIm2zI7LRVn09PfApEVvqbsYUU8Dhk4E2gMf31F7FDjQMZ5fHzxQe8_yo9yE=s725-no";
    String urlchiccobutacas5a4 = "https://lh3.googleusercontent.com/Thq8MTEPe17O5m0gHWmwthMjfTDSJmKkTqXsMPeftZa15kI2eLtdk8CETSza5KVNobZgE4jD6DEfD5bfYEtDIrRckZP-h5wLsAgEh_rKBWDJFS6QFkYUi50d2G9-FL5anpKYF0GuHRCgZd6vTckUAN7vwxdx7PngKfQ_wWAD9rWJJHfJJD7RU-kByxlu3cWsFEtDQNAtkHJOySKaqGibj8mDfdpSQAnP6Hwo6NjTbEbgMFAW8UMelAIryvyVugkw6VlCykmq3erUbE98yc4cJbiyxdM54w7qbPictFaWsGThoGLrFw5sBTcT-5cK02n4X2ZfNMTtY03oos0Upo7j-TUdqk1x7rwMt8Dqk4Q8aznUdqWq6Yr_oRVAoYD5vBZzBEuFLGTg65QGwx47Kt7B5P8vS9JnUW2NkbZ_7E8lavP1o2LwzmfW2_z-1Q09aJOLYrfcurFu7WS3Pngibxaffq1PRVGMqWL6RUxFEPTG-evylwXU03zMqMei2_iz5PjJxgYPf_DtNqB-TgfTPGo3QH2CYRS47VnNZItV0w0zVTLGMZ8yCiGR0P3P0NQ1CsT4oaj91nwaglmT0_fD7VOcOmEU7B_qZdq0gjQ9FNWa34O1jGDquIf2wvq2wQp0d4sB-_Z3sOCVh-ctEOHQH3FOsBQ4aEjwPQyYY6As3-1ycCs=w741-h401-no";
    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    LinearLayout lineara1;
    LinearLayout lineara2;
    LinearLayout lineara3;
    LinearLayout lineara4;
    TextView preciochiccobutacas1;
    TextView preciochiccobutacas2;
    TextView preciochiccobutacas3;
    TextView preciochiccobutacas4;
    ImageView chiccobutacas1;
    String urlchiccobutacas1 = "https://lh3.googleusercontent.com/lcadj4raCW8tpzz3MjJglrAiv7rrFR1htf6KFtoqJMKPcSZvp9NGvpafBXLfOzhpmZIyh83sa6M6fbHbRrCZ00iGSs7p5qO5cHa93XBJ_jmYp83A7jx_VuRlcNXn-10xX_1d6K3NespIJ6TdqjOHa-vrmlsqvkUkpkEUXMkozpv4p_B132OPlrnYXbSGRGs4EwbZFo4Z01ZPsZZL1Cd8yQEOWSwgzuZAJcNv0IdQmj_kq0S3A1R4s3mCkFrz_zzx8h-Y6kqPBvLvB-oCjV8571BM2x9UfbZzfSKMjP2LJ5c-T88x8BEmNf8h1y1SBpHhDqtok9v79PZPXmAA3jbEACKlhh5ZbrIGIC6upPDitCAmApnwU_TBYQ2n9JUSXqhxuTV0lE-sVKC_YxVuv9RB63yUgpxu2Xbe4IxJWmH8x8IENusQIJomc4ZxQaKgwg1Wn5lxf_RoLQ3ThrfOj_hTbNIxRReUaRWLOkjOeRwPIT7oACRzlzyQCE2tQJa4ZY21RY2iLXsHPSPuYR734jLcTWb30wWphx0Ba8UBN3QoDm4Cw-LI5MalceonDpt7WSYE16OGss-6lRKwkR00NcCfsuu-0KWyHsOE-MbRppbulynWfPCrzTOQy4kH2nTTDs5X8aTS31vMBP5vA81cBVyMwxjTOyU5DmMwXW4PXq6B_eU=s725-no";
    ImageView chiccobutacas2;
    String urlchiccobutacas2 = "https://lh3.googleusercontent.com/1rrPX2OD2rjyci90_GF5LpJHNJvNddx47C90kifhiWO6kGcyC2ZTE2N0sgFoZAxLoq1I4hYNRFDgmMhPXJTZVicQfnC8k4ZzzEasQb-GupCJ5vZZdt23lOj_r2iFYx9vPd3QVUxKf9E14PG0AYPO0Df9NeD-b12K7v_0naR1i1ix3Udw1gnaxWMJXi3TZJcH4txLkkLmLv1brm8g5DCYwdaV_adRWmvlcBX_2jlRIW-wdzw_XsYtZSQdkhujbx9OB6R7_RDr94k_u9ZGWuFcncyZhBJ9daaSMAYPnKb7Znb96sp5HDG1XSPgPHzzvJObgekqBxj9xiy8TQQKEYohE4vYE-Fs1II38FUgNw4RjQxVJVZ1EZd9vDsxk6WbcUv2PKdzFwY-bskT3FD4X4FuQqd-ASFvpy9eoMcmpbFPk7tKHZZcHYwf79_g6TNQ3U5meK54kvO_2XpVbRnwTa4L4pnDJmCzdaK3OKYGvdmT2dpjHu-dBxqFvQc07zrZ6mHvm1alHYwR3WbrtARO3ILApcdeZxCBNVmPyg-B2dHhEKociylOUeox1Np20t28BynW-QJkRrGQzjGmUhMAZVKPR2g5XAnt134OUzip_1TZ4vbPU5S1sp3QeM9E1XlmAGfTtxZFtIqQhDKMAS4aYK3PEuve91dI4s6q0jf2_SrHYyk=s725-no";
    ImageView chiccobutacas3;
    String urlchiccobutacas3 = "https://lh3.googleusercontent.com/6FW-ae2iaDy6ssl43Z109SZ3hvjcdU7Cv_DtvBx49bT1f17YzAsQ9XrIt5lRfDlD5TrbwMzsLRXU0JfpxW8DJRWJ9Zui7OzdL-H8JVlNjQA2ywJ290Sag7FltWNQpSp9zUzSo_95v6yNuBVvrHKwuo-RGlc7E7xWsnGUrAj8fgBHLY5ywm9WH4RlUBBRagOkVISN4Vmf0VM2Zfsigt709ifCjYF56NatXYQuBvVjRwusKP4ZO4I79-YvOXbM3n5TK5oQHyj03QvLaTIrZC7HaTxCw35WyDGHX_k9lR2jVNLuQjZmO7hWWeDbmC9Cl_VlMMm0JeGsln8HMLDZ36RAfmPLYdJQOxnL-fihyeGvvmv5wFOX4UGhXGI_OJ45bYEaniNzkO8-_Y6Q9qB1rEh4O_-dEHFc2O3wiKODAPH99grTG5I9xQ5lDfyBsn5bfm13z8BugSXVumfU4hVDA1LAK-9xOwUumx_UPD65fHo1IdeR5UFM92zWObcPUd3303GW809k9XUI4-q_KsT9mGwI2LcT24t2kM7Q5pdHz9QCfH-luckDeA13NgVJupFpnkH2HYopyZEK4THAKl-A9yAxdIJCxFjJErrAfc56C0_StEIEckU7xV_bbhtd3pOagSG4SwG6TPC5I-DHX8nAgKSxA4wdel7PbTH2-Ww7C_iCwgk=s725-no";
    ImageView chiccobutacas4;
    String urlchiccobutacas4 = "https://lh3.googleusercontent.com/pk3igtBDJ7fIWz2havoYmvVvOI6KfZSIK3RVsQuTEBCgCe_joYyzoKbcL27g3Mnj-ml_1FPvYR41bgZdaDMaFHm_ItbyCb2RYCviIvw-zhevIOgcT0N0aGCVjhSI-HjyHFQuPwAoy-yhTmyTJfrxAVMLeGUdOKpc9ahi2tmfBu4_XVAqt_-0kWNWR-GvfhFkQUXwShnGwncAr3HorNhy8SmpDi--vbvNd2VCawz_nu2hULIK8XE7SC7W6jRhKRsE_GRlHk7KgxVxbpKBvNjQvpwvKPwhLw-LmYLDBQW_7_UJsQaRwBaepofkg_AuVphkbtQG9eiskMSZJ22MSG3_V0X9OAAFV6ci7DSgrB9Ty1Ihfo5A30dMgvnk4MOJ73-CytR-h_jKWs7eYQMcL-jrfWbxWuUV_Y-76Z5yh_u0srrpxU3mrB9c2_aDf_WL8d_CGRXPe7F8uOEDkGzs7KngTYET6w0MNqjFZd8XQroa6P7ghoT1krPh6paitt0thMl0JkegPHm2eHN0RzS5KUI2dqqWYedYrTsZW2ot0qMbPmcOmI6dc0F79rpub_-V_gJdjiNeUfvVWxJBdWSgsnBPPU60Zm-MZ1_rYor8NmTQSsBCiUyslEQIKO9COFpVyJXe90_A1SVCJPIwxpjoDArbiqTMvlg-4Uu62QCLtgDXv60=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccobutacas);

        new chiccobutacas.preciochiccobutacasAsync().execute();

        /* chicco butacas 1*/

        chiccobutacas1txtdesccarda1 = (TextView)findViewById(R.id.txtchiccobutacas1card);
        final String stconsultaa1 = chiccobutacas1txtdesccarda1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(chiccobutacas.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });

        comprarchiccobutacas1 = (Button)findViewById(R.id.btncomprachiccobutacas1);
        comprarchiccobutacas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccobutacas1 = new Intent(chiccobutacas.this, webview.class);
                comprarchiccobutacas1.putExtra("string", urlchiccobutacasa1);
                startActivity(comprarchiccobutacas1);
            }
        });

        chiccobutacas1carda1 = (ImageView)findViewById(R.id.chiccobutacas1carda1);
        Picasso.with(this).load(urlchiccobutacas1carda1).into(chiccobutacas1carda1);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1carda1.setVisibility(View.VISIBLE);
                chiccobutacas2carda1.setVisibility(View.GONE);
                chiccobutacas3carda1.setVisibility(View.GONE);
                chiccobutacas4carda1.setVisibility(View.GONE);
                chiccobutacas5carda1.setVisibility(View.GONE);
                chiccobutacas6carda1.setVisibility(View.GONE);
                chiccobutacas7carda1.setVisibility(View.GONE);
            }
        });

        chiccobutacas2carda1 = (ImageView)findViewById(R.id.chiccobutacas2carda1);
        Picasso.with(this).load(urlchiccobutacas2carda1).into(chiccobutacas2carda1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1carda1.setVisibility(View.INVISIBLE);
                chiccobutacas2carda1.setVisibility(View.VISIBLE);
                chiccobutacas3carda1.setVisibility(View.GONE);
                chiccobutacas4carda1.setVisibility(View.GONE);
                chiccobutacas5carda1.setVisibility(View.GONE);
                chiccobutacas6carda1.setVisibility(View.GONE);
                chiccobutacas7carda1.setVisibility(View.GONE);
            }
        });

        chiccobutacas3carda1 = (ImageView)findViewById(R.id.chiccobutacas3carda1);
        Picasso.with(this).load(urlchiccobutacas3carda1).into(chiccobutacas3carda1);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1carda1.setVisibility(View.INVISIBLE);
                chiccobutacas2carda1.setVisibility(View.GONE);
                chiccobutacas3carda1.setVisibility(View.VISIBLE);
                chiccobutacas4carda1.setVisibility(View.GONE);
                chiccobutacas5carda1.setVisibility(View.GONE);
                chiccobutacas6carda1.setVisibility(View.GONE);
                chiccobutacas7carda1.setVisibility(View.GONE);
            }
        });

        chiccobutacas4carda1 = (ImageView)findViewById(R.id.chiccobutacas4carda1);
        Picasso.with(this).load(urlchiccobutacas4carda1).into(chiccobutacas4carda1);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1carda1.setVisibility(View.INVISIBLE);
                chiccobutacas2carda1.setVisibility(View.GONE);
                chiccobutacas3carda1.setVisibility(View.GONE);
                chiccobutacas4carda1.setVisibility(View.VISIBLE);
                chiccobutacas5carda1.setVisibility(View.GONE);
                chiccobutacas6carda1.setVisibility(View.GONE);
                chiccobutacas7carda1.setVisibility(View.GONE);
            }
        });

        chiccobutacas5carda1 = (ImageView)findViewById(R.id.chiccobutacas5carda1);
        Picasso.with(this).load(urlchiccobutacas5carda1).into(chiccobutacas5carda1);
        txtmodelo5 = (TextView)findViewById(R.id.modelo5);
        txtmodelo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1carda1.setVisibility(View.INVISIBLE);
                chiccobutacas2carda1.setVisibility(View.GONE);
                chiccobutacas3carda1.setVisibility(View.GONE);
                chiccobutacas4carda1.setVisibility(View.GONE);
                chiccobutacas5carda1.setVisibility(View.VISIBLE);
                chiccobutacas6carda1.setVisibility(View.GONE);
                chiccobutacas7carda1.setVisibility(View.GONE);
            }
        });

        chiccobutacas6carda1 = (ImageView)findViewById(R.id.chiccobutacas6carda1);
        Picasso.with(this).load(urlchiccobutacas6carda1).into(chiccobutacas6carda1);
        txtmodelo6 = (TextView)findViewById(R.id.modelo6);
        txtmodelo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1carda1.setVisibility(View.INVISIBLE);
                chiccobutacas2carda1.setVisibility(View.GONE);
                chiccobutacas3carda1.setVisibility(View.GONE);
                chiccobutacas4carda1.setVisibility(View.GONE);
                chiccobutacas5carda1.setVisibility(View.GONE);
                chiccobutacas6carda1.setVisibility(View.VISIBLE);
                chiccobutacas7carda1.setVisibility(View.GONE);
            }
        });

        chiccobutacas7carda1 = (ImageView)findViewById(R.id.chiccobutacas7carda1);
        Picasso.with(this).load(urlchiccobutacas7carda1).into(chiccobutacas7carda1);
        txtmodelo7 = (TextView)findViewById(R.id.modelo7);
        txtmodelo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1carda1.setVisibility(View.INVISIBLE);
                chiccobutacas2carda1.setVisibility(View.GONE);
                chiccobutacas3carda1.setVisibility(View.GONE);
                chiccobutacas4carda1.setVisibility(View.GONE);
                chiccobutacas5carda1.setVisibility(View.GONE);
                chiccobutacas6carda1.setVisibility(View.GONE);
                chiccobutacas7carda1.setVisibility(View.VISIBLE);
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

        /* chicco butacas 2 */

        chiccobutacas2txtdesca2 = (TextView)findViewById(R.id.txtchiccobutacas2a2);
        final String stconsultaa2 = chiccobutacas2txtdesca2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(chiccobutacas.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });

        comprarchiccobutacas2 = (Button)findViewById(R.id.btncomprachiccobutacas2);
        comprarchiccobutacas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccobutacas2 = new Intent(chiccobutacas.this, webview.class);
                comprarchiccobutacas2.putExtra("string", urlchiccobutacasa2);
                startActivity(comprarchiccobutacas2);
            }
        });

        chiccobutacas1a2 = (ImageView)findViewById(R.id.chiccobutacas1a2);
        Picasso.with(this).load(urlchiccobutacas1a2).into(chiccobutacas1a2);
        txtmodelo1a2 = (TextView)findViewById(R.id.modelo1a2);
        txtmodelo1a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a2.setVisibility(View.VISIBLE);
                chiccobutacas2a2.setVisibility(View.GONE);
                chiccobutacas3a2.setVisibility(View.GONE);
                chiccobutacas4a2.setVisibility(View.GONE);
                chiccobutacas5a2.setVisibility(View.GONE);
                chiccobutacas6a2.setVisibility(View.GONE);
            }
        });

        chiccobutacas2a2 = (ImageView)findViewById(R.id.chiccobutacas2a2);
        Picasso.with(this).load(urlchiccobutacas2a2).into(chiccobutacas2a2);
        txtmodelo2a2 = (TextView)findViewById(R.id.modelo2a2);
        txtmodelo2a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a2.setVisibility(View.INVISIBLE);
                chiccobutacas2a2.setVisibility(View.VISIBLE);
                chiccobutacas3a2.setVisibility(View.GONE);
                chiccobutacas4a2.setVisibility(View.GONE);
                chiccobutacas5a2.setVisibility(View.GONE);
                chiccobutacas6a2.setVisibility(View.GONE);
            }
        });

        chiccobutacas3a2 = (ImageView)findViewById(R.id.chiccobutacas3a2);
        Picasso.with(this).load(urlchiccobutacas3a2).into(chiccobutacas3a2);
        txtmodelo3a2 = (TextView)findViewById(R.id.modelo3a2);
        txtmodelo3a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a2.setVisibility(View.INVISIBLE);
                chiccobutacas2a2.setVisibility(View.GONE);
                chiccobutacas3a2.setVisibility(View.VISIBLE);
                chiccobutacas4a2.setVisibility(View.GONE);
                chiccobutacas5a2.setVisibility(View.GONE);
                chiccobutacas6a2.setVisibility(View.GONE);
            }
        });

        chiccobutacas4a2 = (ImageView)findViewById(R.id.chiccobutacas4a2);
        Picasso.with(this).load(urlchiccobutacas4a2).into(chiccobutacas4a2);
        txtmodelo4a2 = (TextView)findViewById(R.id.modelo4a2);
        txtmodelo4a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a2.setVisibility(View.INVISIBLE);
                chiccobutacas2a2.setVisibility(View.GONE);
                chiccobutacas3a2.setVisibility(View.GONE);
                chiccobutacas4a2.setVisibility(View.VISIBLE);
                chiccobutacas5a2.setVisibility(View.GONE);
                chiccobutacas6a2.setVisibility(View.GONE);
            }
        });

        chiccobutacas5a2 = (ImageView)findViewById(R.id.chiccobutacas5a2);
        Picasso.with(this).load(urlchiccobutacas5a2).into(chiccobutacas5a2);
        txtmodelo5a2 = (TextView)findViewById(R.id.modelo5a2);
        txtmodelo5a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a2.setVisibility(View.INVISIBLE);
                chiccobutacas2a2.setVisibility(View.GONE);
                chiccobutacas3a2.setVisibility(View.GONE);
                chiccobutacas4a2.setVisibility(View.GONE);
                chiccobutacas5a2.setVisibility(View.VISIBLE);
                chiccobutacas6a2.setVisibility(View.GONE);
            }
        });

        chiccobutacas6a2 = (ImageView)findViewById(R.id.chiccobutacas6a2);
        Picasso.with(this).load(urlchiccobutacas6a2).into(chiccobutacas6a2);
        txtmodelo6a2 = (TextView)findViewById(R.id.modelo6a2);
        txtmodelo6a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a2.setVisibility(View.INVISIBLE);
                chiccobutacas2a2.setVisibility(View.GONE);
                chiccobutacas3a2.setVisibility(View.GONE);
                chiccobutacas4a2.setVisibility(View.GONE);
                chiccobutacas5a2.setVisibility(View.GONE);
                chiccobutacas6a2.setVisibility(View.VISIBLE);
            }
        });        chiccobutacas2txtdesca2 = (TextView)findViewById(R.id.txtchiccobutacas2a2);

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

        /* chicco butacas 3 */

        chiccobutacas3txtdesca3 = (TextView)findViewById(R.id.txtchiccobutacas3a3);
        final String stconsultaa3 = chiccobutacas3txtdesca3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(chiccobutacas.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });

        comprarchiccobutacas3 = (Button)findViewById(R.id.btncomprachiccobutacas3);
        comprarchiccobutacas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccobutacas3 = new Intent(chiccobutacas.this, webview.class);
                comprarchiccobutacas3.putExtra("string", urlchiccobutacasa3);
                startActivity(comprarchiccobutacas3);
            }
        });

        chiccobutacas1a3 = (ImageView)findViewById(R.id.chiccobutacas1a3);
        Picasso.with(this).load(urlchiccobutacas1a3).into(chiccobutacas1a3);
        txtmodelo1a3 = (TextView)findViewById(R.id.modelo1a3);
        txtmodelo1a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a3.setVisibility(View.VISIBLE);
                chiccobutacas2a3.setVisibility(View.GONE);
                chiccobutacas3a3.setVisibility(View.GONE);
                chiccobutacas4a3.setVisibility(View.GONE);
                chiccobutacas5a3.setVisibility(View.GONE);
            }
        });

        chiccobutacas2a3 = (ImageView)findViewById(R.id.chiccobutacas2a3);
        Picasso.with(this).load(urlchiccobutacas2a3).into(chiccobutacas2a3);
        txtmodelo2a3 = (TextView)findViewById(R.id.modelo2a3);
        txtmodelo2a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a3.setVisibility(View.INVISIBLE);
                chiccobutacas2a3.setVisibility(View.VISIBLE);
                chiccobutacas3a3.setVisibility(View.GONE);
                chiccobutacas4a3.setVisibility(View.GONE);
                chiccobutacas5a3.setVisibility(View.GONE);
            }
        });

        chiccobutacas3a3 = (ImageView)findViewById(R.id.chiccobutacas3a3);
        Picasso.with(this).load(urlchiccobutacas3a3).into(chiccobutacas3a3);
        txtmodelo3a3 = (TextView)findViewById(R.id.modelo3a3);
        txtmodelo3a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a3.setVisibility(View.INVISIBLE);
                chiccobutacas2a3.setVisibility(View.GONE);
                chiccobutacas3a3.setVisibility(View.VISIBLE);
                chiccobutacas4a3.setVisibility(View.GONE);
                chiccobutacas5a3.setVisibility(View.GONE);
            }
        });

        chiccobutacas4a3 = (ImageView)findViewById(R.id.chiccobutacas4a3);
        Picasso.with(this).load(urlchiccobutacas4a3).into(chiccobutacas4a3);
        txtmodelo4a3 = (TextView)findViewById(R.id.modelo4a3);
        txtmodelo4a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a3.setVisibility(View.INVISIBLE);
                chiccobutacas2a3.setVisibility(View.GONE);
                chiccobutacas3a3.setVisibility(View.GONE);
                chiccobutacas4a3.setVisibility(View.VISIBLE);
                chiccobutacas5a3.setVisibility(View.GONE);
            }
        });

        chiccobutacas5a3 = (ImageView)findViewById(R.id.chiccobutacas5a3);
        Picasso.with(this).load(urlchiccobutacas5a3).into(chiccobutacas5a3);
        txtmodelo5a3 = (TextView)findViewById(R.id.modelo5a3);
        txtmodelo5a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a3.setVisibility(View.INVISIBLE);
                chiccobutacas2a3.setVisibility(View.GONE);
                chiccobutacas3a3.setVisibility(View.GONE);
                chiccobutacas4a3.setVisibility(View.GONE);
                chiccobutacas5a3.setVisibility(View.VISIBLE);
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

        /* chicco butacas 4 */

        chiccobutacas4txtdesca4 = (TextView)findViewById(R.id.txtchiccobutacas4a4);
        final String stconsultaa4 = chiccobutacas4txtdesca4.getText().toString();
        btnconsultaa4 = (Button)findViewById(R.id.btnconsultaa4);
        btnconsultaa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa4 = new Intent(chiccobutacas.this,contacto.class);
                btnconsultaa4.putExtra("consulta", stconsultaa4);
                startActivity(btnconsultaa4);
            }
        });

        comprarchiccobutacas4 = (Button)findViewById(R.id.btncomprachiccobutacas4);
        comprarchiccobutacas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccobutacas4 = new Intent(chiccobutacas.this, webview.class);
                comprarchiccobutacas4.putExtra("string", urlchiccobutacasa4);
                startActivity(comprarchiccobutacas4);
            }
        });

        chiccobutacas1a4 = (ImageView)findViewById(R.id.chiccobutacas1a4);
        Picasso.with(this).load(urlchiccobutacas1a4).into(chiccobutacas1a4);
        txtmodelo1a4 = (TextView)findViewById(R.id.modelo1a4);
        txtmodelo1a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a4.setVisibility(View.VISIBLE);
                chiccobutacas2a4.setVisibility(View.GONE);
                chiccobutacas3a4.setVisibility(View.GONE);
                chiccobutacas4a4.setVisibility(View.GONE);
                chiccobutacas5a4.setVisibility(View.GONE);
            }
        });

        chiccobutacas2a4 = (ImageView)findViewById(R.id.chiccobutacas2a4);
        Picasso.with(this).load(urlchiccobutacas2a4).into(chiccobutacas2a4);
        txtmodelo2a4 = (TextView)findViewById(R.id.modelo2a4);
        txtmodelo2a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a4.setVisibility(View.INVISIBLE);
                chiccobutacas2a4.setVisibility(View.VISIBLE);
                chiccobutacas3a4.setVisibility(View.GONE);
                chiccobutacas4a4.setVisibility(View.GONE);
                chiccobutacas5a4.setVisibility(View.GONE);
            }
        });

        chiccobutacas3a4 = (ImageView)findViewById(R.id.chiccobutacas3a4);
        Picasso.with(this).load(urlchiccobutacas3a4).into(chiccobutacas3a4);
        txtmodelo3a4 = (TextView)findViewById(R.id.modelo3a4);
        txtmodelo3a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a4.setVisibility(View.INVISIBLE);
                chiccobutacas2a4.setVisibility(View.GONE);
                chiccobutacas3a4.setVisibility(View.VISIBLE);
                chiccobutacas4a4.setVisibility(View.GONE);
                chiccobutacas5a4.setVisibility(View.GONE);
            }
        });

        chiccobutacas4a4 = (ImageView)findViewById(R.id.chiccobutacas4a4);
        Picasso.with(this).load(urlchiccobutacas4a4).into(chiccobutacas4a4);
        txtmodelo4a4 = (TextView)findViewById(R.id.modelo4a4);
        txtmodelo4a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a4.setVisibility(View.INVISIBLE);
                chiccobutacas2a4.setVisibility(View.GONE);
                chiccobutacas3a4.setVisibility(View.GONE);
                chiccobutacas4a4.setVisibility(View.VISIBLE);
                chiccobutacas5a4.setVisibility(View.GONE);
            }
        });

        chiccobutacas5a4 = (ImageView)findViewById(R.id.chiccobutacas5a4);
        Picasso.with(this).load(urlchiccobutacas5a4).into(chiccobutacas5a4);
        txtmodelo5a4 = (TextView)findViewById(R.id.modelo5a4);
        txtmodelo5a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1a4.setVisibility(View.INVISIBLE);
                chiccobutacas2a4.setVisibility(View.GONE);
                chiccobutacas3a4.setVisibility(View.GONE);
                chiccobutacas4a4.setVisibility(View.GONE);
                chiccobutacas5a4.setVisibility(View.VISIBLE);
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

        preciochiccobutacas1 = (TextView)findViewById(R.id.preciochiccobutacas1);
        preciochiccobutacas2 = (TextView)findViewById(R.id.preciochiccobutacas2);
        preciochiccobutacas3 = (TextView)findViewById(R.id.preciochiccobutacas3);
        preciochiccobutacas4 = (TextView)findViewById(R.id.preciochiccobutacas4);

        chiccobutacas1 = (ImageView)findViewById(R.id.chiccobutacas1);
        Picasso.with(this).load(urlchiccobutacas1).into(chiccobutacas1);

        chiccobutacas2 = (ImageView)findViewById(R.id.chiccobutacas2);
        Picasso.with(this).load(urlchiccobutacas2).into(chiccobutacas2);

        chiccobutacas3 = (ImageView)findViewById(R.id.chiccobutacas3);
        Picasso.with(this).load(urlchiccobutacas3).into(chiccobutacas3);

        chiccobutacas4 = (ImageView)findViewById(R.id.chiccobutacas4);
        Picasso.with(this).load(urlchiccobutacas4).into(chiccobutacas4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccobutacas.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccobutacas.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciochiccobutacasAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=a9e3a888118947ca397d2761376e8010";
        String preciochiccobutacas1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0a4daa1ab465e5e976d52e082e36beb9";
        String preciochiccobutacas2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8a82f2675d46912b84ff29d50e816c47";
        String preciochiccobutacas3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=608b3bdbba70716515651525bd449a4f";
        String preciochiccobutacas4st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciochiccobutacas1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciochiccobutacas2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciochiccobutacas3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciochiccobutacas4st = metapropoerty4.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciochiccobutacas1.setText(preciochiccobutacas1st);
            preciochiccobutacas2.setText(preciochiccobutacas2st);
            preciochiccobutacas3.setText(preciochiccobutacas3st);
            preciochiccobutacas4.setText(preciochiccobutacas4st);
        }

    }
}
