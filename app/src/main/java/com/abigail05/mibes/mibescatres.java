package com.abigail05.mibes;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class mibescatres extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnmibescatres1;
    Button btnmibescatres2;
    Button btnmibescatres3;
    Button btnmibescatres4;
    Button btnmibescatres5;
    Button btnmibescatres6;
    Button btnmibescatres7;
    Button btnmibescatres8;
    Button btnmibescatres9;
    Button btnmibescatres10;
    Button btnmibescatres11;
    TextView preciomibescatres1;
    TextView preciomibescatres2;
    TextView preciomibescatres3;
    TextView preciomibescatres4;
    TextView preciomibescatres5;
    TextView preciomibescatres6;
    TextView preciomibescatres7;
    TextView preciomibescatres8;
    TextView preciomibescatres9;
    TextView preciomibescatres10;
    TextView preciomibescatres11;
    ImageView mibescatres1;
    String urlmibescatres1 = "https://lh3.googleusercontent.com/ljxJfbT4alx4SHDV0hUe6u_chA3oukUkM31C_5nt0PifnKLn3DfAltRcDbOrvxWOQfcV-zf1Ul-1-zCyZWi8Aq-gQnktksKiY8GsrWM2aNIH6kxubd_WZpJcb6msd-2B2DmGEW6H0LYtWNq7Xq5la9lI1HSkAUiFKkbwvIaBRQ1LQzz0PS2vCWpMu5QJtfv-cUUJacPNpgjY-A3eWstbEhZuxfEswj8vw36jiAfMHOJ8PjzYZR_rcG00gIRX_oAZyg5GdiZTUmOfItHmh2NG89_DXwWIoGIKAW0XKso_jlj0mbn6DPQ9oUlwXLQrz1qXimyXD_7SGaFL4YERpUtZ5t-COsPZ7kpk5BPrItDicZxj1alBCpEqqGiHBEA-8SjjAnwkbcUyx0OS4oLD68VSDGRQ5u48DNO4R4mQ0FiSVKT8RFKwheB0jspyqzZnLqtHlXAEtRgY2qCeOz9k3xm4U1il-9TceTACJNd7rr8iniZ19yty_qaaCJC_PQFv8Dbln9DwlL_YpXr9ZjyOaeDCy8GApvoxbdh9dn_qokoknh320089TIySSNmsDcQNvsaOQmDN4mojjA6ax8FJS91kW-OEB4l8Hwl6ImuyhPoMefwk4tipz0Cag00b-1mi-W6UTA_2ek5AuHjJbEnRD5hMMnKuq3TWHP3neV70Do0nPsU=w967-h725-no";
    ImageView mibescatres2;
    String urlmibescatres2 = "https://lh3.googleusercontent.com/H8YWXoMDcufm-Mv2FVRcE2jShsxHXfU2FhdLPz-4LDShp5k4EQWXzfarNrV6qksIfex1sOF9xHDjDb4uzJhSYpl38gK-gQzVvOBPCf3eliAY60nPTncnpWv13lIi2n_D_6uUL2fwWl_ECxV0YEXv9FlwYuUL3IjURQt6PmCb0NIT4fWt1dBXbmEFmW77a7v7hkQBXp2AQc2ywhV3d3AH9rn0wfYYoOMOQpfYSVEHhBGGk_FYYecCMrY5hRhGWp0-JfMYp4_GueuOAw8YaexSYvlV0eqWyM8xKjwBHGwF9F4OeYCoepkn8Dqf-YjbDaafXCMsfENUjAjB27JJ68zQ-4qBdppp00SX09VDGdvBAYpn3JYMMBrS3UpukPm8DjFcpFJ_AuFqU1UVS1scA5jC8iaudiBOWn0QtDlAtIhM7usuBuGQjVJBlahCnGKFmOhnRo0yCbl5A0YVYiEmceTOrc3rEFzkp6qhcckmQfB50iIe1Xo4PFcjd5X7AALGcYbBf0uET0iTDGzkjLTIXf_mSrBN6dgcesBrVkEHaPu_BIHV_8u_jTi-iANOU4COC8P8Fw4pCrMzeQhfBoIdB8hw_G22VSfDy6pqei7KCJJlyu8UVh5Kgyjnt_O1AjXvb3Rqk5-1K5w0PUg2Usjzmsig-TlFSrgAwKyZr1n1ejWPBDw=w967-h725-no";
    ImageView mibescatres3;
    String urlmibescatres3 = "https://lh3.googleusercontent.com/sgN-o-6uxrXYSFQblxsb_DtbZOjqZ10E30bLK3IJqhUgJieIVosAJ2evlNUOKQWfsya2nEBkPIgJJuTDc8RBU4Oq3xAo2btk49p4MXMh_EdJX5CF_Bp-2CL3teC6FsvgLPxjA5CxUtiAejJwv1ICwOFlZbYKJiM6T0w8INf-ldYirObslO4uAEnLTkb0mFzFnLB6hIXcz4ftUFA3aLXc7D0gcwGzjKSuZ2pANSCfwumV_nk1fOShdnls_5sgFhUlCn9HhLje2dxxk0drkDOb-FsW-P8Z2T3hk_m3e8rePJ8lYEkkzlTHIydZoltgmjzM9BVi37Vu7ge23z2eSLYe9rwx_deTu0TUf-1CuCyG_RVVjs76Sur-xMU3Vbwwj1VZD1MdQoOUjuBoWC0KdUbj4ICyLDtqm_jXzQNu0Hz6RhicgyiUaRnwT0D--rcopzng0YJCQ5AJVP5EmP_RkK1GCJz0ymjXEniI9MQVpMOFIcN8GclxeqhGYTn5cfnei0430Dk_22pbRLsmmZUehpTGhfvCnZPQu9oAHb-2OloYH3TUHGpTRVfbZa9hFU41HuNYjYpwlDL3o7AV7nm-MYCw3qLBw1NpftaxWFiMCZvJkBcbtNi0B5NEqknMq_EIVdKr5uo7hfFi0PYjvbs1JY8wVLNuHmpwN_LO-CTqLO2WiDw=w967-h725-no";
    ImageView mibescatres4;
    String urlmibescatres4 = "https://lh3.googleusercontent.com/LjkPiAnbXWn60WFWgvN_pBfxpX9NSqENVq8xBqxSgvcTelPJ-DD2eoiOLOvkUOpQGHYtjN49xXczyalmqQoldAqbX_n8unj6DXEpfZKLLu7Pw_jdPkGd98wy1YdS51CexR1F_I_ek4rWc5D4zRd_gQtkp4OnuaO6Rg0zttI54AAPY5Lwx95ofGrxbXmcuTdF2lUuJwniX9TeOm5eraOQBhBBpW5kTdktxyu_Hfu0A1Y8UkzUno4504lTLl5p6CvvPN477W2YokyF2vTSlXi5Fe-MKYSWW-U223ONk7swin73mIRyfNHeLtl-cZipNXbkGSAOp8zOk_WU24-fbjFLU5L0KszI7yQax1p-KQHWK08ScX5fQtNV9sKXwfxAsbPV4rmirURcJZZZzdCRVSLBrQDwq0Sk4MvH5UlkWOBYhe3LJHbD64eyxLQxTXLtyR2A1m-cPN3DWf1JKacsZrLO8RloQkhHsRgnSSr8UxM4x4oGhditQQI6jAlyoygdNUVJD0KDxD5taJwkhNFWU7IOYzDG24UL9PziS_NO_HygX5cMjY1EaolBDPOceTjoCT6N4sdajTxxrruE0ZneHzZAj7VQ-ur0x2IOm7EA4I1Bh1D7EiFf_pw_b7tK_2CVj_J-OnTrVpM40SxDOv-BfOMIzHcWjJhXt9bwWW7m7TnjW24=w967-h725-no";
    ImageView mibescatres5;
    String urlmibescatres5 = "https://lh3.googleusercontent.com/OQtXOvUYyX85CwVfV4mkSiFqjTHJwEKjjuQEtaLl7ZKKuu6-6447QsuDZLFkqImzI2ISuA4kwaVuXKWb1THYYWyoKQQYxtncU8OUCucrRafEHe5ZnFbgyH5AR3j9jFaNMA0aI73sEEmOIY6WEr_g5JDVbzQd4XHbFIaXy4oCCaAQhBSroB8w364NxoSsnDOLDmEt0o8d_Yq7OyeXAkwoNLBejcLkNRgI7vs-F226v8UB0jW-JqEabysG9g_mO4FsKMsWKE34Qun1nhyUbJifSZq7pChD_A0ZfA6X1eX_wmGx99ga6yBgL-64b8NXNaQMp3YDArAN4UWTdsePpUaoPnN1rA_x8yz0Qlncdadj2BdE7zFKvlVuq0Xi350IoVfuGEeyo07EozGTU6u0Rejx1x3SZ8cJQSMzuI5vm58T5ZWftQDvUJFXrE5V6hiPLJ8julQ1YmIbHCvGK3Ffu3y2oBw7BT7XbHiYlsuE4kHtG-iJvxR76ea79_gM9_-GIppUvBeUthxgoCkdYqZZRtLeSoBiJjmciqT9QvEO3E_AVVl1jqeSgEzNBR0Q91_QWzo1y3MeuMEHxfKayQ1ZuLT02LbXTaqWw5sODanbynlLikVZ09zEFLoWMsurtaJRk5a-_fsS0b78y7QHDcW7unm2YsZ4atSYOA_S-h2GlVAq4k4=w967-h725-no";
    ImageView mibescatres6;
    String urlmibescatres6 = "https://lh3.googleusercontent.com/aAMkJ4lJi3EtKF2VNtGm6Di1rW0No7OoiCsHPJZybrPdFbnsGAUj1wfv_YtO5Ma7iAsY-ZtQiURBXUsb6yxoho89WWapu79eoHBEyRZXo5r3HtPjuwENGS5jklCaoMyDD5Tb_g9X6ZobuI5CvDpQEJ4mlrMdrsd7uCLnZnHQBTKfcrjvny3-McYehlcug4lpJyq2t35xbfNjS8ajXrKo-6_MyyrWD065ljrhN-ffVbUNJNVldrleAbq8usB6HyDbxce_SmcGUWuNBVDZ15iWsnpYwnacxSxCVLsWN4Y7HYTh9DWD5pCtZ4ffgSCE-_OwEE_PAdgg3uENJHTb94H5cc8zAfrCajeg8ajnun3DZggp-QN6ghZveo7SySTr8hhV3yVvI10Ahud_zqD4QvFoqNEVgEx2pQWCJ0Pzahz8qRVAfieVGACvu6LcMMcpqinekSnJfOWUE2Sb3nQ9i19V9lHQ_DIxKNKAsaQYJymcUqgEB8sQf_5BLvvaWeDM0r_X0nXRRg0WI1n44uudcHbEn27hXCy8iULFoUt_vFNAU2ys8RJ7b4x6XVW8GDkOQqoLFBZXbpwKg1CUzzCDYUr9MVtImlRnUqi937nSNcn3CUd0bu6HBzszw9qK7DcvPXgghXSoB_PIFqOKluUjgOnN4GnJwrsD2AG6Bf_MgvzRJDU=w967-h725-no";
    ImageView mibescatres7;
    String urlmibescatres7 = "https://lh3.googleusercontent.com/zirgXK8F9B1jm15R2HccBVw8EEoeqxEg9NIvUR2FjI_cu4amSYrUosZblZ2mmrwbopFiH7j2hCAw9MJCNba939iyf4vuUIdrqkIYOVjcI-5xEkc0NynDV-761TRvLksPzYmofVODmy7uVvP1BLXj5kLp7A_zadhdZMwFD0C-JcKfUeukJSF7_YeKeZQ7Zc9Z0SmuROWhHiyacdT8fwSKaGYWfu2fwBa6T-hn0Off_IuIRdF7W5SWbRspwYhRq6Px1GdDst540dekZW3nOounN2hPfq7wf3bfGv1Hj9OC2AsehypdNdrAGfDtnt5VP_CJIJwyd1Kbq5cRMOm70M24IOetuPFB2vJ8zD04lGAUiGQMCWxRsM-Q3aOnAUM4DcC9a_Bm5eUx1S86QGyDXuU8d3qVNori_G1oUg4rJDlnh29lkbzvW377FqlyELH_fbX1G3leo6Azu31KDHe3tKFymT7RBfT2u6DPwzlCOrjqc8OOcVups90dV333QCmnmIconMGszd82f91l9WV24FCunDcqJS4GRL2SlhtURt1-vIQ5blaJyugH5Ac5_Y3pKmUfy-y9ry9bGzYYJCiKVqPRgDnN0JfJTrOKaZkIX1fOQPhjHP5An_leT5jd7UXXqFgGoUs0ZPt8SWoBnD4XZILDoxhrzj8ZBY6INkFKcTA0xlA=w967-h725-no";
    ImageView mibescatres8;
    String urlmibescatres8 = "https://lh3.googleusercontent.com/4yap3tDF4uJp87DD8yZMoF5_tF4Iy4N0TbUM2WWeudNRVtamWpqFthuxBZT93WHDqJmQJonW2OSsEYrOIl33h21FJPYROjsREUneKinvEsjYsdy5-owNYxvQBVM5DkY_vFnPaFsoLLe5svruY9OvX2YXcnmE5RgdCtYulI73UoYYSVc8hkZtWLu8F0E9lI3mxBYBH97mGIJ7RO6KyrLqRqsyZPLH3s5ll1c4EuhSSq2gGCuHJX7NGmDILKY7Pt__yCXeGoLpj4FgCSCUt4ZRUpp0Kv0ass59keLbDrybj6uh3eedZ1bPjRPVcIjQ0Jqog4WxaZ9u7hGvxlABI6nv92EZ_V07GhnpQeCSS0IouL2ZxrX8rQkIFHLGbalywoJuCuXPY_Poyy5kh6lr-PcuogjW0dpxzCWHEJSCnj-Py3z0rynopnA0OT3fepXL4wxI_0VQv-YLD6XS04LZP6fXWw6TVvJeFPQguUJjDjhtr12adx0dPtV4NzDCWyBMSdD7HFPi9ZggtxUlxOuAtH2AZuBLAePtYedypE9xy4RqCAdc7Zi8SY27L-1m0RBiEVazgEikFYZFBAdH-V3lyiI4uQ0oLY3plz06dB3bVCRc_Ny3yUKQgMHs9kf11ttCwtYdLR_dnOm39VFUJ0WA3yI7h1nqtrHozlGQJImY4GtX7yI=w967-h725-no";
    ImageView mibescatres9;
    String urlmibescatres9 = "https://lh3.googleusercontent.com/w0kVgYV3v8ADpg6ngJlQF6SqA5tWaxAc1aBdevXP4DTXaaz6OufRt8kM1vfu2-oOsXtkAD86ToSrF0CN2nDD9Hedej52gvjyWpR6-IMyv1X3WwuCbAtbV_Yzc7MMHEAHAHuCx-6IxX33eRLEXmUEexK03uqUblwegMJ5octmXFrFxRuANHBmoj3ppkJjqzA4zWxZLGp_gI238lrwB0AEpdheTmmJEW-4hu0UhxQmleQqfJD89Hup6_s1JlfRIJkcXwLKbPpRrwcBYgxa3CrRphPfaNjhhkzugFfXfa92RcQpWPa-CuNC_-aVsTU3loyuPqOqya2fXd2TsL_wX0saDTgXwMJgjYjHxko6wPb39j49dowv5GXWQGpv79CHWeYW_RrApBzpJc20CpbAJLsp9B36EVnEOo0pWOQFqwvt-Dm_nBKnghfjiXRlVpUQ6meXc4HxFaYjJiKZ-IT4HHWtH6MRPt-xtWhHX-MTYEOtjBG55UdXk3fUZmCL4XZvfCK1mXk5VzEljDwuDsPd2RS9bwA4Yd6kWVT5POsoQ08GB5eJ-FxSCpnjWvBdKnnVIKWctVODUI9WbZrIIXT3nlt27nA3j6WaS42GU72Ez9aE96k4DWlKFlOudGZVQBuC7vV7pI862vNBaQCPApD6Bc59kpqyE4aNqWDk66PtlwIR6hw=w967-h725-no";
    ImageView mibescatres10;
    String urlmibescatres10 = "https://lh3.googleusercontent.com/_ppj3EKjESH40zzOBWkGQJNDwxvb2zXjZDR__cQo15dfqKzBfPFOg5larGdMbtDQgMo85t5EZYehJrcmDZR_AgXWjYM_I98GIr5FuGMQgg_6Qm9ciNKsGuZGtfvfWMEv-xlaPgwAeFItNgcDwao9TMb84Jna2FJxQD5BE_WLCSomlxTM-2MEgOnOIUAhtZYlUQRud2sCXcAMmKhshzQuoar2TNpzIUG9RdzcdZpTHayZSiUvb4uMfc7G657Aj5V8dJ96jRPHW1U3CMqKHl16LLqsw9NEpOmnMij6wJqouT0fgF_GmGa7qsQtoq-Sjw6B2h0lAT9OVeLdZ9RhS1sxhZCx3tmlcT_GHn1JtjzAnm6ZSpUaxxvSOZX7VE3tcfVLOjoOvtTLGzyBriZXtNs-m5bnABX3LekMQRr8peo1YrlR5-GDQ9-hXRZ7dfQvzIuOZ7bFbtzeI4Mo7p8HmwFCXuY_q8oMs0uoiCnT4tybLozPDOHm3N2ZL2-Ied1fyLT-wEd0mb66wS8bwgsSPSJuS7tYRR0YwL5tX4kqcdn7ehhf26xCHL933jc5HdpbJDtKKdpfqRDbFFEnmp5ENrkLackTRhaT0KuQLS92Uwtmkri5owU48L4FdprnJLwL_fMqoqmUwiycdgs2l7NF_rREaqtb-Ks8QDwqdF66zH6I5sw=w967-h725-no";
    ImageView mibescatres11;
    String urlmibescatres11 = "https://lh3.googleusercontent.com/T0MycqnE848JoFTQHErJFPfusQNkyoHNr-lQSCmLbkSVNtr5rPVmCs0Y4g6PqGdESOsDqNCcEcKwhxTx3rFyh6fMX0mcGJVJTSLPpJu-8EWng347ww-nstiv_EqcCahNN1717GmBC0BB96wWa3r0e9REBhcwi2rXHXcAVZZdNfSZ8y00cx13-cPxfwRKbJ7YTcAy5ASzRZzeJk6znTOPB_nIo6cyQ5xca_ScNSRaWvrEC0m2hoKGIukZYf3OX1JZ9BZKzbVPi3ioBqR7MMcnTGP__3bcNET1OCQ-Q3dCyKhsMY3KqvPtMV68aOCmYTIAvjsgHE8ztWJ1jD2PsKAEODzMZcxQfhUqmER3BWrJQidkrGGpJjhwO3a8BdrMA7mBFjXATRkZCB1YB_ezghVDpg0TYRJ3hORglcgvUP-1CCwiIsmr-2pdu4SoDUFqcqelolpHjg3F-ZQDBk0mQp5meHZdUkcO7nElNK17OukV33Zg1ltJHCfnlpX1blEp1O1bbxMSrR4S2NPoPJkLVlA0xhmXPkbD2tufeHULBlABNRMvUYEUYikCUB6zpoZMpH17x6yBqrSGisFcIMFY-0rqqPitvnIgzk3_g_8cKSZz-_gsUu0bqb4u8Lzapj3fwgkt6IRRhetOkzXpRx5SQNtUbzrV_9Df5bzPhNtw5SFmsv0=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres);

        new mibescatres.preciomibescatresAsync().execute();

        preciomibescatres1 = (TextView)findViewById(R.id.preciomibescatres1);
        preciomibescatres2 = (TextView)findViewById(R.id.preciomibescatres2);
        preciomibescatres3 = (TextView)findViewById(R.id.preciomibescatres3);
        preciomibescatres4 = (TextView)findViewById(R.id.preciomibescatres4);
        preciomibescatres5 = (TextView)findViewById(R.id.preciomibescatres5);
        preciomibescatres6 = (TextView)findViewById(R.id.preciomibescatres6);
        preciomibescatres7 = (TextView)findViewById(R.id.preciomibescatres7);
        preciomibescatres8 = (TextView)findViewById(R.id.preciomibescatres8);
        preciomibescatres9 = (TextView)findViewById(R.id.preciomibescatres9);
        preciomibescatres10 = (TextView)findViewById(R.id.preciomibescatres10);
        preciomibescatres11 = (TextView)findViewById(R.id.preciomibescatres11);

        mibescatres1 = (ImageView)findViewById(R.id.mibescatres1);
        Picasso.with(this).load(urlmibescatres1).into(mibescatres1);

        mibescatres2 = (ImageView)findViewById(R.id.mibescatres2);
        Picasso.with(this).load(urlmibescatres2).into(mibescatres2);

        mibescatres3 = (ImageView)findViewById(R.id.mibescatres3);
        Picasso.with(this).load(urlmibescatres3).into(mibescatres3);

        mibescatres4 = (ImageView)findViewById(R.id.mibescatres4);
        Picasso.with(this).load(urlmibescatres4).into(mibescatres4);

        mibescatres5 = (ImageView)findViewById(R.id.mibescatres5);
        Picasso.with(this).load(urlmibescatres5).into(mibescatres5);

        mibescatres6 = (ImageView)findViewById(R.id.mibescatres6);
        Picasso.with(this).load(urlmibescatres6).into(mibescatres6);

        mibescatres7 = (ImageView)findViewById(R.id.mibescatres7);
        Picasso.with(this).load(urlmibescatres7).into(mibescatres7);

        mibescatres8 = (ImageView)findViewById(R.id.mibescatres8);
        Picasso.with(this).load(urlmibescatres8).into(mibescatres8);

        mibescatres9 = (ImageView)findViewById(R.id.mibescatres9);
        Picasso.with(this).load(urlmibescatres9).into(mibescatres9);

        mibescatres10 = (ImageView)findViewById(R.id.mibescatres10);
        Picasso.with(this).load(urlmibescatres10).into(mibescatres10);

        mibescatres11 = (ImageView)findViewById(R.id.mibescatres11);
        Picasso.with(this).load(urlmibescatres11).into(mibescatres11);

        btnmibescatres1 = (Button)findViewById(R.id.btnmibescatres1);
        btnmibescatres1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibescatres1 = new Intent(mibescatres.this, mibescatres1.class);
                startActivity(btnmibescatres1);
            }
        });

        btnmibescatres2 = (Button)findViewById(R.id.btnmibescatres2);
        btnmibescatres2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibescatres2 = new Intent(mibescatres.this, mibescatres2.class);
                startActivity(btnmibescatres2);
            }
        });

        btnmibescatres3 = (Button)findViewById(R.id.btnmibescatres3);
        btnmibescatres3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibescatres3 = new Intent(mibescatres.this, mibescatres3.class);
                startActivity(btnmibescatres3);
            }
        });

        btnmibescatres4 = (Button)findViewById(R.id.btnmibescatres4);
        btnmibescatres4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibescatres4 = new Intent(mibescatres.this, mibescatres4.class);
                startActivity(btnmibescatres4);
            }
        });

        btnmibescatres5 = (Button)findViewById(R.id.btnmibescatres5);
        btnmibescatres5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibescatres5 = new Intent(mibescatres.this, mibescatres5.class);
                startActivity(btnmibescatres5);
            }
        });

        btnmibescatres6 = (Button)findViewById(R.id.btnmibescatres6);
        btnmibescatres6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibescatres6 = new Intent(mibescatres.this, mibescatres6.class);
                startActivity(btnmibescatres6);
            }
        });

        btnmibescatres7 = (Button)findViewById(R.id.btnmibescatres7);
        btnmibescatres7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibescatres7 = new Intent(mibescatres.this, mibescatres7.class);
                startActivity(btnmibescatres7);
            }
        });

        btnmibescatres8 = (Button)findViewById(R.id.btnmibescatres8);
        btnmibescatres8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibescatres8 = new Intent(mibescatres.this, mibescatres8.class);
                startActivity(btnmibescatres8);
            }
        });

        btnmibescatres9 = (Button)findViewById(R.id.btnmibescatres9);
        btnmibescatres9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibescatres9 = new Intent(mibescatres.this, mibescatres9.class);
                startActivity(btnmibescatres9);
            }
        });

        btnmibescatres10 = (Button)findViewById(R.id.btnmibescatres10);
        btnmibescatres10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibescatres10 = new Intent(mibescatres.this, mibescatres10.class);
                startActivity(btnmibescatres10);
            }
        });

        btnmibescatres11 = (Button)findViewById(R.id.btnmibescatres11);
        btnmibescatres11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibescatres11 = new Intent(mibescatres.this, mibescatres11.class);
                startActivity(btnmibescatres11);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciomibescatresAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=49a6235e3e8b7e572318b4ba0c3b42de#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomibescatres1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e82c9245bcb4cb22ebe293a7aec29015#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomibescatres2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f44f4aca1f401fff47913ce71efff5a0#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomibescatres3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=884b6c52704d5bad3e78531bac9b2d52#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomibescatres4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7acf3d00edfefecfe3aa9e2806b67b24#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomibescatres5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f69e2789641775d6dc4eda1359e2eab8#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomibescatres6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8bd801d78b4a57f6137e70d9f52ad545#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomibescatres7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1266dc5e3187b4b8af7975f693feb129#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomibescatres8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ebc905f519d4dcde4bea6ef69e4464e7#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomibescatres9st;
        String urlprecio10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9acc8ac0a53aec1f0f0f2b853a40b5ab#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomibescatres10st;
        String urlprecio11 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1c01411ac287902bf2c1885590ef4625#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomibescatres11st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciomibescatres1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciomibescatres2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciomibescatres3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciomibescatres4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciomibescatres5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciomibescatres6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                preciomibescatres7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                preciomibescatres8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                preciomibescatres9st = metapropoerty9.attr("content");

                Document doc10 = Jsoup.connect(urlprecio10).get();
                Elements metapropoerty10 = doc10.select("meta[property=\"og:description\"]");
                preciomibescatres10st = metapropoerty10.attr("content");

                Document doc11 = Jsoup.connect(urlprecio11).get();
                Elements metapropoerty11 = doc11.select("meta[property=\"og:description\"]");
                preciomibescatres11st = metapropoerty11.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciomibescatres1.setText(preciomibescatres1st);
            preciomibescatres2.setText(preciomibescatres2st);
            preciomibescatres3.setText(preciomibescatres3st);
            preciomibescatres4.setText(preciomibescatres4st);
            preciomibescatres5.setText(preciomibescatres5st);
            preciomibescatres6.setText(preciomibescatres6st);
            preciomibescatres7.setText(preciomibescatres7st);
            preciomibescatres8.setText(preciomibescatres8st);
            preciomibescatres9.setText(preciomibescatres9st);
            preciomibescatres10.setText(preciomibescatres10st);
            preciomibescatres11.setText(preciomibescatres11st);
        }

    }
 
}
