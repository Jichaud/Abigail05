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

public class chiccoultra extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsultaa1;
    Button comprarchiccoultra1;
    String urlchiccoultraa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b3dd1cba02a91c7df8020c934fc6969f";
    ImageView chiccoultra1imgrojoa1;
    ImageView chiccoultra1imgnaranjaa1;
    ImageView chiccoultra1imglilaa1;
    TextView txtmodelo1a1;
    TextView txtmodelo2a1;
    TextView txtmodelo3a1;
    TextView chiccoultra1txtdesca1;
    String urlchiccoultra1imgrojoa1 = "https://lh3.googleusercontent.com/1JPNzcdcWhNlRquVDIkIDTQrpFjO2y9SCfuuhF33UeBwVnPm-m9E3opwwMw_OToWHIyvtELD5K2Xphdx1_nJg0W_mkxsg361Yqb_p7977SLW3TXG_vRhZpSoCp1tEDQfVdDKYF1gVlLRAq_Ncv5eHI2xL5g8RMnuycXi42voFR-cKaNnu1rKm7DitMuV638bpWcarICmHKcDLPO3dMWJTVC4sidj8JijCvlxJtx3MuwBUvqy6F4RwqtIXYl7s_utIdCfNj1gkLiidMjiTrB9i9VqRdCukfllWJo-5I8xtxe4OwhId3D4boc2_QdXUGSTePyZEW3dP5NmQd6jWE4BbZNBMElUytqWMjRlvO1zhRW-TLUxYrjcp77AKl2osZI7ULBQiWWfuDfWD4EjOiB2WuGKhqOnjEAuv9_hYyrkWJRf6gHopIr9JQBpzc8qKlOubV3XF_CutPjo2rI3X51RUeIAi-fFVwMiNGqLol6PvWI51hXM6bDvDSfNqjxB7ACwqd7SFNP4fDb0D4bZl1kyLaOX4u__ZM6OoCfp-xBwftj-HY_BJXJ4ewfbExzhFxFQut2hyb_FsUmhqx7Nnuv_fXM0YIQtcrWkuIaJURQeIkcF6dtqLc1CtogCSplGQO5AmtSo-3cgHLhZ2iXVoeNFEsWDecJ3p3mk_myXs_-JNVg=s725-no";
    String urlchiccoultra1imgnaranjaa1 = "https://lh3.googleusercontent.com/iTTxg2vOjZ4FwipC3kbPlz1ulibGQkDjUT626plPvLb-6lWRLsparSvcMe1DS8NiaVlQO55hQfhCmbGCld7gxvXcyMXsU683tyiTfjvIHWhSBH79JYLmXFYXDWQgVskJt42z-BLxQaxKkdsQwWeO6bVFIbnCnYi9v_9LU7CpuZ9CYYQByy1EfF-Ul5bIEbHWRMrmBo0rJsgVALyClydx_9yNhXxCIdMxnMj_eavBG9-pg4zgtFBirdhA2vAerAjuQtT_2Gf48B-7ZjmDYBQj12VjtrlvYMBFjZXfpNjlhYAK13BIaL3klj0DdMZU7TdpTDTn_9jKiwZDZmp1Oexn-3KXJ1swSsShUMPC_S_-1zNoJO6z6srY_wmhoGaAqRHXvrbzKganQiATaaXo8MoaGk4chWZRG0uxPRTRNmsimumilXcVkmGEWTCkUVPN3ThxR92-UmzzQcrVceGCJRTXzTtLtWVe2hK9g4GkUnEwA_OUu0jZ6r6fR54upES5_E6p-Btorr5a0fqZfy0hiNhC_g4OfKP1Eczi7YMRfAWF4J8KxDwy7MILG7gX7D6joyHrMLdXXLWW4RhurYpQ1oUnELevrQd7nbl_01lyQ0Gfs6K_-rmADZqqOFr_xU5FGExgGd74G-Z3CNX3wxLsQFwAwEKd6JltBZ14zzKHAtVplBw=s725-no";
    String urlchiccoultra2imglilaa1 = "https://lh3.googleusercontent.com/KvDJL1AQ7vnjDswVO_BVnvRwaEMK039J6HyzcLqhsdBoaw1QsQLgaI8MQblJYOCkvCtwAO2Sob4JNANJT-GcuAx_LrGvjUBdl6igMSQCMKH8j-Bo_UxAl9ifU5PqBYsgq1PPz_D_CI_AHKu_APKE-MJnK1DEu9yJ2OZWUKLlBFCdOu3FmdKnYtUMDI8Jw8XLM_ydHZYnEAJihJ8vULn_nrM-E7fO1kcWs7UhvlG4is5kyNRJ21wddnZMHIFMF-DfoPQ44rsxFIBTNn6-py2diFiqh3k-uaES6Z1PqhjviK_uzpV7F-QDT7idw0IecXNYCGYYdA_HcQ0QNxKqpZI44z13ccOQgUmQYOraLu7heOHgBfpNssyiDP0KqdMybSdI-y47rZo56AKkjeC_N6ryzLc19UGVOh7CZM_WIVMUdPX7d50afsnru_IViKpW4ZY52hXYIgB8B_3ulm7kGafsvB7UbmdRCZ7VrqtHD0vy3oGYsD76C_ixgAbkuKt0cokN1pFIydXsJYrR3vKr85XnQXfGgrnn31mkuIjw27DhjuSHopT7YqzwotbV2vbnytsoTjAvTmlnOMkiMaotTitQBQVxEOCZYjoBGPPIdCs5gEMcA5V5QLZfLjhYDvL6hcWEhu8Lsg5pps-8ktKOQinh5OoY3RaCZ9TweQakOGUfD3M=s725-no";
    Button btnconsultaa2;
    Button btncomprachiccoultra2;
    TextView txtmodelo1a2;
    TextView txtmodelo2a2;
    TextView txtmodelo3a2;
    TextView txtmodelo4a2;
    TextView txtchiccoultra2desca2;
    String urlcomboa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=985d6f4af3f8f49a10beb4d8aeecaae5";
    ImageView chiccoultra2a2;
    String urlchiccoultra2a2 = "https://lh3.googleusercontent.com/orQ3WoU8N4EWplAhpCwhMbhERe05DVaxvzoavvp2eTXh_r21CHyT5oJhuiTFX7FSnQ3H_hWIG-ZD6ZU3dkxbjzdrYaYGuBetqjpTAh-0ly0ByHG7EolpQMbKhFK7n5pAlEJcQ5AkmnqktvtLPs0glshO-qBrMFf-rzRMEPz3OQDPl_39iX1TtfANQbYUmU6crW0fBEyseWDS8OzPOUYr4ytxbag3WIMggJOyaZIqKCwOMMapcXrtchnG6nGjzqU1rB2zOaZMenni_ynHTkqpHfQDaJMNGnQuM3idNcONrHW80Rp8MA8AzljQ-EYhHa7vm-i4WGLv37eF3ZFxMM_paLuJN3l_mKt0DcZr42d7gtys4W6FAZ_lbr_qnCqhnWHYEQevUcBIH2sGpt6wF1ugzQ4zlkphTRxu_ivR88Y3Hx7klr4bP-_z9QZaQWGhDwJLZnejKAbotjq54MnLIzF3fawL7Q9ZCMJir2sPpmQmeIFtaqraliwiPxQK0tmgq3HYNpDTwS5J-ViDcCKv37Cja3SNVd-8eNEXnd6StO6kiCzGO4OKKsmfR27wBon1vb-JkyPccIvuPhtANh3aQIb1a1fTLyJhsaH2FLc13LBpNSbBGj1s7kgj27TJn18ULJXCoS6ry4Aq_cX-eQS_sFH_4ksjvuc8OCUvZXiO3xNoO2I=s725-no";
    ImageView chiccoultra3a2;
    String urlchiccoultra3a2 = "https://lh3.googleusercontent.com/3bICK-mAPPbZanuRabUbQkH2X82avPByXyDFpljEP4DAsi2QDWZgGIz06mJDkY-biGUrBIq1Aj1S62DQyGAeRGcrHAYC78THKZRAJNGkml7bpIAPSg91qNnWC0M2EVMu5bVrVOGkHuWM_-9pZt592CyTcODGNwLMER4KmpRNQGOpxFt3NSw1t1yja9MISzRWOCJD3guhihIM2F-hAt9_VvCrQH930KiS-4kQkGyoD8dJ6Wt6AP7kgV69G6ULJTwj10sIdFzv0ofjjxVTC54a-RcVx2-tpt078c-Wt5BZ1w46Efy-tR4jtqouN4aXUan2CjThyiBRySqiDJWNsx0KJbBh3fGVicMdf2IHklFrGuy36cD7nl7a-FfFYxjjEew5TEKtDwI9OpSGNNPFrrJXkg2ZCoDaCY8cbXK4ynI8pcOGrC2uW7jDQau_Agx62kvyuBcxXxXucDzNZBbgG4ggNs-YsaSLuGdh7H6b3EygElQ-UmFtlBBS1o3uoF3WY-yq76AM-au2tyNSHfxq9GcTZ2FSRyLWobD_aOG9h0WeyKFo8IYFKSq175L6-wPCp_2JgPsz4tRllVft8Yyw05JU8NY74Ytc2MaxSEaam9_18zp1P_3OeQ0darMDLOPrzyrXuWIAlGjetRrDHStnHBcLsAo7LhcwLs2cCLYAUbXvy8g=s725-no";
    ImageView chiccoultra4a2;
    String urlchiccoultra4a2 = "https://lh3.googleusercontent.com/53cZcH2B1x1B-KgwWluJfleGryzND2KtyN_6hfB3AWkfoeRBL4Q-mWjt1GFM03tV01QLZO-GpODc5B4Y-qfgKnSAhATNwdukotaMdLWwcGVynKZp7NCMYTSEg-yB5CtJwD28ZThlFamKwKkId57SqjmBDmTvgoN3gcNr6Yhe9O2SblKbTs6N6VMXpNmI_GRpfYrr2bvofriBihdBPxoEdQ0fWGrQOITBIH7H5IW0tDWlyom3cXKb1Wcxz6uMztEYiYnd8VH_kl1zMZQMBkcAjGNg0Bz3RSPbVs-zZdnBWclDB2vmV9fefeZbbgLOPFX2_WxShzqCq9MhxjR8kMdWDg1S-KjhZ4QC_O6fKiXOmiKIVpn3-vGfuQk2lIMNIIUth0eUQ_5dmQbqBVLx9cgmTeQL2a6FJxpjPyxn2tXnh2bnVE-poUcyK5cHWnwEjHO8qrf6A3vU_5YxojBsfRw0H5c8iyrK6CJN4ZZ2hDri64osUBEqIKOlYeQawZtQ1m5NtVSGqXKkFbZp6Nw8IT8Dt5eNjw_TjNNaT3ueiDeMMM2gkjqIshOeWS8K80pc9TRTCKZd0D5g9cugYzE0bXz6Tk6UzHs685SvbrSrcqESBOoHZFeOzCy45Y_0bOzKcC3asddCaXg7Zhw4aA2nTXIfDpy2lB6UDQQvAcicY1brwSk=s725-no";
    ImageView chiccoultra5a2;
    String urlchiccoultra5a2 = "https://lh3.googleusercontent.com/uKml7y5IVRffvTuNUE5tQnnfytS29KKTJkLzSw3G5EIC_MuGBMV0C8_tN0KjG4RyT0Exr1e40XNdspjOV5RtAkE8YLbQ3CO8_83-WNWIbCjbOUgMcNP_FnSF07lXd7HswWSpLB4rTj3ZTpbuC_6lzeBMvsmXWzM4DjPxWvIV-VLc0RfP0ibqLMRyItlkoYLSY73WI6hUgNNXWLiBBQvpHpoKs-kl0QSYPVZX0AKQaW1_y9M9WWk1n0jl4BiRkqnWO1VxzyYNZq1tPqxKS8nqT-FGQtKv6u_PR6TgN1lqC1kkjH6mJcPQ66XeOEhy17z1tP7xtNiHjQisBI5Jopy2NHsFoQOiweu_DAyRKSilj_EfTextDI4YC5RHSSGAgrLcG9zU3McIYcH3UZwJ1yVHkXJ_ZZDMk6obk-waYDVa3sb4cCorOJA5HEecWuMF4OO0_vTA8GvuI5F2cmuN9JI-nbEKjOhNIqPydG1fppu1J8guQqPqN52ATGKQz1YG3Y9Pztp5LXXFC_cW4MB9chi0ekNdkHYF08DKJKWfj0VyxEiyGi_TyMVyT7S4wQpbubR3vgF3SZ--nTfRjwuvjv3j7nmMc_k0lufRnTPIS8tK_74fhUq5_U6l4eLuYLiK34aLDMzTFXzVoVms8R1qNq7twAT6ff8ns7GAwywAU_GmmVU=s725-no";
    Button btnconsultaa3;
    Button comprarchiccoultra3;
    String urlchiccoultraa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=2778911a16c68c7289b613913db8f9af";
    ImageView chiccoultra3imgrojoa3;
    ImageView chiccoultra3imgnaranjaa3;
    ImageView chiccoultra3imglilaa3;
    TextView txtmodelo1a3;
    TextView txtmodelo2a3;
    TextView txtmodelo3a3;
    TextView chiccoultra3txtdesca3;
    String urlchiccoultra3imgrojoa3 = "https://lh3.googleusercontent.com/3rQAzvvG6FaM5Ofc1mPLuvckTxIITACNQ7ybbUaf_BFZcZmp2tCVXmH8ulbSIh5SW2OJSG-llpc3Xtpq08Dd5v6nUNW1UJkvx5FbLxeK7kM1HB4aqKJ13MsO84xSH2MeD_H3FQmwmp734hgjTe_sSj2iIdKmLRfnHUm6FvTgUerTSDNl6dCryTWMFSn81ye70-l9ou26LkipkufI5N5ZdbcHrzUFTsciZ1uSkWhW94nbr41u8gGXbd2K9DDBDmmv2JKuSZCg04QjKAnfN_-OHZqp1ewj1KxpU6L2fyzrsqlKoKVnbSFws-v4pP38PltzyeMzPUILUrBzI9e1snnd8FZv3G6kEx3xJcHHMo_HKygWWlO5y9W4Svib1JKmA_NeyMSCKYPF3rsQIwq9QtIwhN2U4_4BqpgnQ9B6NNWul52n_gItGDsX2ABLYo86aYyN46-Y3l7rF9-vNCa_kdrGgFEr32_ONBOuekVgskMUYSYn3zJOfvVkmGZLrkYPb-kl5Mncsk4pURVlEPJF1kwip-uU6pOGLexyoTAwIDdBmvm8VsvYVAX7HgU4idcCsVD6mrqjfRGgCjam0bHOAVqBodjXV5zjkv0G2l1MfWey7jhHtrOCIPpjblU27cFzQJZ1qJLlRVZeoxcB2HlskCPscs3diqKn4YWL70WQZgNWFrQ=w393-h578-no";
    String urlchiccoultra3imgnaranjaa3 = "https://lh3.googleusercontent.com/fCnipi3yUF8CUTr4pTJpclLQ0Magyteyur9rYe0Id80B1t9xCZNvNaBHgtchJ7693M5UZ21URt1mXL29RZg6t-cq8XggnpYNsET1Q6glGSneqWzPwVWMh8MfWMVmsB4mB0JH2AHs2tn2By7tb1ClMwBFBO8c-3ejBsTWvkiKhc5fMHoxlE7s58asQg1xU60XonoI6sVFiSGpmxOlEKXwv2Ic_Zw25r3dUnXs51Y6pu80QMQWnWPQyPgNchDTub3dmZFI0IJeFlqKrvBxt4NlsXGOReb2QavEnQgPwClimAu4XuQD1CfVrAnuVm-zc_vsxY1Xv8DhdtRJT_xrggIkLhc9X5uqyIkPNnbZWAfNzGlIY21IvXrsDdEMXBnXhUVc7gLAmIxbC9ErN-esIND3AxGZECze-95buWRyUcp9uDLWt6LKA1-GtqOwwYZu0y0Wy24dlHztDG9NL3tfE9r14Bi72ZjVZJmvDroYzdf_-8uCOTnQzCU9i8EOgZ39uCr4FqQ6N7wzfD7PAVpT4CNSLu42C5-XFTbw4DOeUihGdh4HTk4MuZvkXq_uaYc-d-qFtigxSqZrisc9ReosOC6tK1lI6CA0P2NIA6LvAm_dcDPz0ND2wdF1pXi1cwdWajmzzev0ptRzr0rJdM4LuJUROsZqTSl59pXIWNcurOdv87s=s725-no";
    String urlchiccoultra2imglilaa3 = "https://lh3.googleusercontent.com/RFyyYzED3DSG6snWd7QQx5aSLfr2-PzAB5VLk0EO345qi0yB7WNGgqZW3X6_1_KHysE0DX-amiPDHnnZj1BxcLSBgnuXLu9pjr3-X2OxiKomJFFHRKHyROFwv7k7u-FybhOcE3E5DL2w70z7xE5heFcLForR_0CzhVoCQcSQV1-4BwibRTwMQISEKRr7_QHQqFBy5NDYa5vZgNAh5UVCwu90lEX79uDU4ZsjdRjfLFfgo-5SsK8q83T56xcY6FQOcZy6UYbFk3n91DAd8NS01e6zuwpzC_cGHwQyrQmcZu0noT93nY5Gh00CewmuxGll_6IACAz2Hu_sDpwX5USYVgOA37OaSkNnaX6UiW1VKYWYS9sTzemUBNh2nMaRozenomDwCf9AahUYJlr0XmgBHHp-TNz0vuTQQ872Us4LApcQhifVbA4F7faSc9hPGI8iUQ_sgKWsV4m_9J-NwmuaeobwN5huqfMwOd8S1HU8r_4yY2l4oqjXq5lw510eB3y6Y-b-LSEiA1PnYunXNwnTZeAj9noIEBAPXJXM9GPJ8O8ysss4eSf8OkiW3jJ52tCpVW1PQCUlH0tkWTuJP_jsDbyLtJ7zvtfMa0H_0yslR5LLVCchjJSYDVAWiWx3Y9WcL7OgIC_YLz0W4fLIdO__cmZ4sSy6ZHAANydI_zgxV3A=s650-no";
    Switch switch1;
    Switch switch2;
    Switch switch3;
    LinearLayout lineara1;
    LinearLayout lineara2;
    LinearLayout lineara3;
    TextView preciochiccoultra1;
    TextView preciochiccoultra2;
    TextView preciochiccoultra3;
    ImageView chiccoultra1;
    String urlchiccoultra1 = "https://lh3.googleusercontent.com/1JPNzcdcWhNlRquVDIkIDTQrpFjO2y9SCfuuhF33UeBwVnPm-m9E3opwwMw_OToWHIyvtELD5K2Xphdx1_nJg0W_mkxsg361Yqb_p7977SLW3TXG_vRhZpSoCp1tEDQfVdDKYF1gVlLRAq_Ncv5eHI2xL5g8RMnuycXi42voFR-cKaNnu1rKm7DitMuV638bpWcarICmHKcDLPO3dMWJTVC4sidj8JijCvlxJtx3MuwBUvqy6F4RwqtIXYl7s_utIdCfNj1gkLiidMjiTrB9i9VqRdCukfllWJo-5I8xtxe4OwhId3D4boc2_QdXUGSTePyZEW3dP5NmQd6jWE4BbZNBMElUytqWMjRlvO1zhRW-TLUxYrjcp77AKl2osZI7ULBQiWWfuDfWD4EjOiB2WuGKhqOnjEAuv9_hYyrkWJRf6gHopIr9JQBpzc8qKlOubV3XF_CutPjo2rI3X51RUeIAi-fFVwMiNGqLol6PvWI51hXM6bDvDSfNqjxB7ACwqd7SFNP4fDb0D4bZl1kyLaOX4u__ZM6OoCfp-xBwftj-HY_BJXJ4ewfbExzhFxFQut2hyb_FsUmhqx7Nnuv_fXM0YIQtcrWkuIaJURQeIkcF6dtqLc1CtogCSplGQO5AmtSo-3cgHLhZ2iXVoeNFEsWDecJ3p3mk_myXs_-JNVg=s725-no";
    ImageView chiccoultra2;
    String urlchiccoultra2 = "https://lh3.googleusercontent.com/orQ3WoU8N4EWplAhpCwhMbhERe05DVaxvzoavvp2eTXh_r21CHyT5oJhuiTFX7FSnQ3H_hWIG-ZD6ZU3dkxbjzdrYaYGuBetqjpTAh-0ly0ByHG7EolpQMbKhFK7n5pAlEJcQ5AkmnqktvtLPs0glshO-qBrMFf-rzRMEPz3OQDPl_39iX1TtfANQbYUmU6crW0fBEyseWDS8OzPOUYr4ytxbag3WIMggJOyaZIqKCwOMMapcXrtchnG6nGjzqU1rB2zOaZMenni_ynHTkqpHfQDaJMNGnQuM3idNcONrHW80Rp8MA8AzljQ-EYhHa7vm-i4WGLv37eF3ZFxMM_paLuJN3l_mKt0DcZr42d7gtys4W6FAZ_lbr_qnCqhnWHYEQevUcBIH2sGpt6wF1ugzQ4zlkphTRxu_ivR88Y3Hx7klr4bP-_z9QZaQWGhDwJLZnejKAbotjq54MnLIzF3fawL7Q9ZCMJir2sPpmQmeIFtaqraliwiPxQK0tmgq3HYNpDTwS5J-ViDcCKv37Cja3SNVd-8eNEXnd6StO6kiCzGO4OKKsmfR27wBon1vb-JkyPccIvuPhtANh3aQIb1a1fTLyJhsaH2FLc13LBpNSbBGj1s7kgj27TJn18ULJXCoS6ry4Aq_cX-eQS_sFH_4ksjvuc8OCUvZXiO3xNoO2I=s725-no";
    ImageView chiccoultra3;
    String urlchiccoultra3 = "https://lh3.googleusercontent.com/3rQAzvvG6FaM5Ofc1mPLuvckTxIITACNQ7ybbUaf_BFZcZmp2tCVXmH8ulbSIh5SW2OJSG-llpc3Xtpq08Dd5v6nUNW1UJkvx5FbLxeK7kM1HB4aqKJ13MsO84xSH2MeD_H3FQmwmp734hgjTe_sSj2iIdKmLRfnHUm6FvTgUerTSDNl6dCryTWMFSn81ye70-l9ou26LkipkufI5N5ZdbcHrzUFTsciZ1uSkWhW94nbr41u8gGXbd2K9DDBDmmv2JKuSZCg04QjKAnfN_-OHZqp1ewj1KxpU6L2fyzrsqlKoKVnbSFws-v4pP38PltzyeMzPUILUrBzI9e1snnd8FZv3G6kEx3xJcHHMo_HKygWWlO5y9W4Svib1JKmA_NeyMSCKYPF3rsQIwq9QtIwhN2U4_4BqpgnQ9B6NNWul52n_gItGDsX2ABLYo86aYyN46-Y3l7rF9-vNCa_kdrGgFEr32_ONBOuekVgskMUYSYn3zJOfvVkmGZLrkYPb-kl5Mncsk4pURVlEPJF1kwip-uU6pOGLexyoTAwIDdBmvm8VsvYVAX7HgU4idcCsVD6mrqjfRGgCjam0bHOAVqBodjXV5zjkv0G2l1MfWey7jhHtrOCIPpjblU27cFzQJZ1qJLlRVZeoxcB2HlskCPscs3diqKn4YWL70WQZgNWFrQ=w393-h578-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoultra);

        new chiccoultra.preciochiccoultraAsync().execute();

        /* chicco ultra 1 */

        chiccoultra1txtdesca1 = (TextView)findViewById(R.id.chiccoultra1txtdesca1);
        final String stconsultaa1 = chiccoultra1txtdesca1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(chiccoultra.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });

        comprarchiccoultra1 = (Button)findViewById(R.id.btncomprachiccoultra1);
        comprarchiccoultra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccoultra1 = new Intent(chiccoultra.this, webview.class);
                comprarchiccoultra1.putExtra("string", urlchiccoultraa1);
                startActivity(comprarchiccoultra1);
            }
        });

        chiccoultra1imgrojoa1 = (ImageView)findViewById(R.id.chiccoultra1imgrojoa1);
        Picasso.with(this).load(urlchiccoultra1imgrojoa1).into(chiccoultra1imgrojoa1);
        txtmodelo1a1 = (TextView)findViewById(R.id.modelo1a1);
        txtmodelo1a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra1imgrojoa1.setVisibility(View.VISIBLE);
                chiccoultra1imgnaranjaa1.setVisibility(View.GONE);
                chiccoultra1imglilaa1.setVisibility(View.INVISIBLE);
            }
        });

        chiccoultra1imgnaranjaa1 = (ImageView)findViewById(R.id.chiccoultra1imgnaranjaa1);
        Picasso.with(this).load(urlchiccoultra1imgnaranjaa1).into(chiccoultra1imgnaranjaa1);
        txtmodelo2a1 = (TextView)findViewById(R.id.modelo2a1);
        txtmodelo2a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra1imgnaranjaa1.setVisibility(View.VISIBLE);
                chiccoultra1imgrojoa1.setVisibility(View.INVISIBLE);
                chiccoultra1imglilaa1.setVisibility(View.INVISIBLE);
            }
        });

        chiccoultra1imglilaa1 = (ImageView)findViewById(R.id.chiccoultra1imglilaa1);
        Picasso.with(this).load(urlchiccoultra2imglilaa1).into(chiccoultra1imglilaa1);
        txtmodelo3a1 = (TextView)findViewById(R.id.modelo3a1);
        txtmodelo3a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra1imglilaa1.setVisibility(View.VISIBLE);
                chiccoultra1imgnaranjaa1.setVisibility(View.INVISIBLE);
                chiccoultra1imgrojoa1.setVisibility(View.INVISIBLE);
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

        /* chicco ultra 2 */

        chiccoultra2a2 = (ImageView)findViewById(R.id.chiccoultra2a2);
        Picasso.with(this).load(urlchiccoultra2a2).into(chiccoultra2a2);
        txtmodelo1a2 = (TextView)findViewById(R.id.modelo1a2);
        txtmodelo1a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra2a2.setVisibility(View.VISIBLE);
                chiccoultra3a2.setVisibility(View.GONE);
                chiccoultra4a2.setVisibility(View.GONE);
                chiccoultra5a2.setVisibility(View.GONE);
            }
        });

        chiccoultra3a2 = (ImageView)findViewById(R.id.chiccoultra3a2);
        Picasso.with(this).load(urlchiccoultra3a2).into(chiccoultra3a2);
        txtmodelo2a2 = (TextView)findViewById(R.id.modelo2a2);
        txtmodelo2a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra2a2.setVisibility(View.INVISIBLE);
                chiccoultra3a2.setVisibility(View.VISIBLE);
                chiccoultra4a2.setVisibility(View.GONE);
                chiccoultra5a2.setVisibility(View.GONE);
            }
        });

        chiccoultra4a2 = (ImageView)findViewById(R.id.chiccoultra4a2);
        Picasso.with(this).load(urlchiccoultra4a2).into(chiccoultra4a2);
        txtmodelo3a2 = (TextView)findViewById(R.id.modelo3a2);
        txtmodelo3a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra2a2.setVisibility(View.INVISIBLE);
                chiccoultra3a2.setVisibility(View.GONE);
                chiccoultra4a2.setVisibility(View.VISIBLE);
                chiccoultra5a2.setVisibility(View.GONE);
            }
        });

        chiccoultra5a2 = (ImageView)findViewById(R.id.chiccoultra5a2);
        Picasso.with(this).load(urlchiccoultra5a2).into(chiccoultra5a2);
        txtmodelo4a2 = (TextView)findViewById(R.id.modelo4a2);
        txtmodelo4a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra2a2.setVisibility(View.INVISIBLE);
                chiccoultra3a2.setVisibility(View.GONE);
                chiccoultra4a2.setVisibility(View.GONE);
                chiccoultra5a2.setVisibility(View.VISIBLE);
            }
        });

        txtchiccoultra2desca2 = (TextView)findViewById(R.id.txtchiccoultra2desca2);
        final String stconsultaa2 = txtchiccoultra2desca2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(chiccoultra.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });


        btncomprachiccoultra2 = (Button)findViewById(R.id.btncomprachiccoultra2);
        btncomprachiccoultra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccoultra2 = new Intent(chiccoultra.this,webview.class);
                btncomprachiccoultra2.putExtra("string", urlcomboa2);
                startActivity(btncomprachiccoultra2);
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

        /* chicco ultra 3 */

        chiccoultra3txtdesca3 = (TextView)findViewById(R.id.chiccoultra3txtdesca3);
        final String stconsultaa3 = chiccoultra3txtdesca3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(chiccoultra.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });

        comprarchiccoultra3 = (Button)findViewById(R.id.btncomprachiccoultra3);
        comprarchiccoultra3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccoultra3 = new Intent(chiccoultra.this, webview.class);
                comprarchiccoultra3.putExtra("string", urlchiccoultraa3);
                startActivity(comprarchiccoultra3);
            }
        });

        chiccoultra3imgrojoa3 = (ImageView)findViewById(R.id.chiccoultra3imgrojoa3);
        Picasso.with(this).load(urlchiccoultra3imgrojoa3).into(chiccoultra3imgrojoa3);
        txtmodelo1a3 = (TextView)findViewById(R.id.modelo1a3);
        txtmodelo1a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra3imgrojoa3.setVisibility(View.VISIBLE);
                chiccoultra3imgnaranjaa3.setVisibility(View.GONE);
                chiccoultra3imglilaa3.setVisibility(View.INVISIBLE);
            }
        });

        chiccoultra3imgnaranjaa3 = (ImageView)findViewById(R.id.chiccoultra3imgnaranjaa3);
        Picasso.with(this).load(urlchiccoultra3imgnaranjaa3).into(chiccoultra3imgnaranjaa3);
        txtmodelo2a3 = (TextView)findViewById(R.id.modelo2a3);
        txtmodelo2a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra3imgnaranjaa3.setVisibility(View.VISIBLE);
                chiccoultra3imgrojoa3.setVisibility(View.INVISIBLE);
                chiccoultra3imglilaa3.setVisibility(View.INVISIBLE);
            }
        });

        chiccoultra3imglilaa3 = (ImageView)findViewById(R.id.chiccoultra3imglilaa3);
        Picasso.with(this).load(urlchiccoultra2imglilaa3).into(chiccoultra3imglilaa3);
        txtmodelo3a3 = (TextView)findViewById(R.id.modelo3a3);
        txtmodelo3a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra3imglilaa3.setVisibility(View.VISIBLE);
                chiccoultra3imgnaranjaa3.setVisibility(View.INVISIBLE);
                chiccoultra3imgrojoa3.setVisibility(View.INVISIBLE);
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

        preciochiccoultra1 = (TextView)findViewById(R.id.preciochiccoultra1);
        preciochiccoultra2 = (TextView)findViewById(R.id.preciochiccoultra2);
        preciochiccoultra3 = (TextView)findViewById(R.id.preciochiccoultra3);

        chiccoultra1 = (ImageView)findViewById(R.id.chiccoultra1);
        Picasso.with(this).load(urlchiccoultra1).into(chiccoultra1);

        chiccoultra2 = (ImageView)findViewById(R.id.chiccoultra2);
        Picasso.with(this).load(urlchiccoultra2).into(chiccoultra2);

        chiccoultra3 = (ImageView)findViewById(R.id.chiccoultra3);
        Picasso.with(this).load(urlchiccoultra3).into(chiccoultra3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoultra.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoultra.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciochiccoultraAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b3dd1cba02a91c7df8020c934fc6969f";
        String preciochiccoultra1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=985d6f4af3f8f49a10beb4d8aeecaae5";
        String preciochiccoultra2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=2778911a16c68c7289b613913db8f9af";
        String preciochiccoultra3st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciochiccoultra1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciochiccoultra2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciochiccoultra3st = metapropoerty3.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciochiccoultra1.setText(preciochiccoultra1st);
            preciochiccoultra2.setText(preciochiccoultra2st);
            preciochiccoultra3.setText(preciochiccoultra3st);
        }


    }
}
