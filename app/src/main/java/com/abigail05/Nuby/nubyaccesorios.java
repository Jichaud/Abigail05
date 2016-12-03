package com.abigail05.Nuby;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Avent.aventclassic;
import com.abigail05.Avent.aventclassic1;
import com.abigail05.Avent.aventclassic10;
import com.abigail05.Avent.aventclassic2;
import com.abigail05.Avent.aventclassic3;
import com.abigail05.Avent.aventclassic4;
import com.abigail05.Avent.aventclassic5;
import com.abigail05.Avent.aventclassic6;
import com.abigail05.Avent.aventclassic7;
import com.abigail05.Avent.aventclassic8;
import com.abigail05.Avent.aventclassic9;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class nubyaccesorios extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnubyaccesorios1;
    Button btnnubyaccesorios2;
    Button btnnubyaccesorios3;
    Button btnnubyaccesorios4;
    Button btnnubyaccesorios5;
    Button btnnubyaccesorios6;
    Button btnnubyaccesorios7;
    Button btnnubyaccesorios8;
    Button btnnubyaccesorios9;
    Button btnnubyaccesorios10;
    TextView precionubyaccesorios1;
    TextView precionubyaccesorios2;
    TextView precionubyaccesorios3;
    TextView precionubyaccesorios4;
    TextView precionubyaccesorios5;
    TextView precionubyaccesorios6;
    TextView precionubyaccesorios7;
    TextView precionubyaccesorios8;
    TextView precionubyaccesorios9;
    TextView precionubyaccesorios10;
    ImageView nubyaccesorios1;
    String urlnubyaccesorios1 = "https://lh3.googleusercontent.com/8QerJG3e2L19I7uct47MRFzFmH36FtJH77N1SGvtcOCU89coZal47-3I5nDBjI3vboQu8617K5Ow7LohoZnQ2J9xuTq74z3FRRKqTAffzVzCAFDLsiXovOfwXDpk1L80JgZernMzyz1KsK9tHrfnMv1IQ8SjFGkOFljNVhDG17zd3Ep1eBw9iRPltyJrDc5mihwJVbcYBaGa1mVIh2yW5eYJCbNVwfwNYvQnCa_1zYA7zEe7PAK--zOTiKuyz2SDDON0ICBoXda8W_LyvZQYSFHgBI06Et2O1XhvoreNZC53uGXML_dSyb-wrSJ6tkp2esr_7v7IvSurLxYJRif22MumXcAiZfGR0ZPYHdsND-Hp1dYZg4Wj7W2GtXEqPRe_w3f8tjdpzVU_z0uaB0FP6eHXJ7jsY2nqydIDw5jAFjeKVJW1K6YsqV9Mtmzi1II-_QFGsXM_D_rFPrr3g7F3XE9p8WDBxfP9yZtJ3_SYJx1ZOMNi1vdobkBY5C53YSjivov1hrirjWrUQDW7b42lbgtDIT0HBycbCppyq2ZpaREoxJyrOHpgem-Zjrmvd8EBgK5BticwwJK-hqQtc3c2LPWRgjy7Y5OoItrwv27R9mXCbkr9YA=w500-h320-no";
    ImageView nubyaccesorios2;
    String urlnubyaccesorios2 = "https://lh3.googleusercontent.com/jELiSa0a6Okac7ou6zoCTs1jHdaMLbNGK-rAn7Z5EKAOdpiLRxqOg8OvqvZooDnZ2DPY2tpcbg368IgzVwd9SQH88pi3AhkFk3ffVV21wJSpacCm4a8YvkWEknblF0fulxwexQaIO_r6N2rqNSgTRkFcFngUu5pjuqOdx4dQjaXUTob3jr10Ks5ktV4Gc0XRW6rsGZw6tomLmhz1Z4ovfdCaUVDVpxJUmRNc4PrjdJBThLE4NcSTEGparLF0TuykxujoJ-Y61-dpYqZB-GU6irHZ6UgzxZbfq9TIHuQ0cZFl8KZjuLX4zlInSKeSGW2HR7XVUKxISLVjchCchMaGfVEtZMmH2CpCqgiugPRoURxcXDdk3XazVAN_-sqwzooHg3oUlZ6pCTY2aeeiGoUE5FXWJlUFjEfybhkGK8htAng39ojs-k00XmFzY6ADyMhpqBh0zUGNx0xneFXxs804_t5Y5h62N3aG7nbfmEqXLJx6YZkFiFAOzbZvFQw7Tg9dvefGqwPAlqZBJh4qEsqYhPFNf3AP5ot3UGN24wiKbonRcl0dHKIOM8d_pkLSLS34vFIrF4F5dUK-kU7fJ-xfgU4uwqgr6y8NwtT_MXrDu7vs68gIPQ=w500-h320-no";
    ImageView nubyaccesorios3;
    String urlnubyaccesorios3 = "https://lh3.googleusercontent.com/EWea6oAo24XgoBSdbawlnXAoRvUQNJy8LhanxsLibU3ubdEW8AS6bcxxYfHtSZyhXqAzASXkeyzNcNjfiYFiIi4MbJt8hYfRsofLzVtJJViU2dCQrJw7y9CdR6kZnk4v9cK62Pnt8kUpARtWn9eTzVqXPFNQc7xdzBWBvbIJmhGfjxRJPlTDs1ATi-4r8JmdofqYAQpYBo2JP_bmlT89ioFUTeGlwzgcu8ZR_soGaNqpYnFTvc-BKjQ98lc0zNVba8Eys_YCrwGGUiRZydxmJZBCibhCysaygbf5s6fXArD3jIFupAKbSwZhHUHdGgc_BgXxfHxGA6fuBhn36GNfeYfqybN-yGJqT-VxYGsc2pb-DvCHp6rjRcNISKE1dafDf-wqh5gH3wlv3PScuac6LnrQ8W7YMPCJa5FtFi1xBYPTfHFmI87ABSIGT4_4LDG4FgUI6wShhvl1YnbURBPg7YKNftZq9i-tXNiH3EggbzUiYM_Fw379xk9pAjX-PJMexwZ55wm_pxPWPAZlbCIKhnbwqRg-PZoSmXpxkvCTFOWvRSGfOjvIS7OjswB0OtKWPXP-lNit1RsEk8GjT2gf0l7_-yx6yZ1hO3HnVefSLQMk_4IceA=w500-h320-no";
    ImageView nubyaccesorios4;
    String urlnubyaccesorios4 = "https://lh3.googleusercontent.com/9X0onEomHrIrsnS1F2nJ5xlelvMFsyOwxQQzY6hKjkb8fiw2ftbNPHLZyIo6r6DUrB65WKKCg79b_IophRyXxYc1mkB8qBnEKHf9fcXDgCFOzSuuyimTPTzbN-_vxknlZi83BcJhftZpC0j1cibKU5Q16A_lMIuXSuKIgdt3yEUZRdBEBZ4N78dBTD9cGVlYeTdfHGK25-bql0O_gC4KoJr5syXlcOQe4sm54WqcWpJzWMxiVJi1tTrUHClHhVXSHmCjKO2hM0fZhSEBlXB-Y3IWvFaqitiKLLe9t1MOzVNBbgqyTujbSM7ZRHWXzUxt8TGOCjgsZDfSmrSvnQYAK1vAhz3yfd0LLALGvahG_mxqoV_t5AjUNrFPanz-NTOxasxS6WLgWoNtkoEvT0-IrLFm-Abk0JEDfbfL-KpTFFOPixW0YA3Xphr3S-UnlEQwt6Z588QIAM74A7frCZKvgrCojJw4oYvZf2H2H3skwVlQYlYDe_81TpMHQRK_9FGQdJzKR3zzPlkzfseHCkpU6eJ4rIbQYvVCRfxSNJ3N0F4TRTvlpa61WLMHt9d1RBGWgO_bku7Qr4vHntf3COYIKmPNlBJAYPPTOVOAo-s5jEF4S1wsRg=w500-h320-no";
    ImageView nubyaccesorios5;
    String urlnubyaccesorios5 = "https://lh3.googleusercontent.com/Vi6glieTEMFS8APwtFSlxgEBUhHcEcFwyCYzKYCBYC1ZAelQfLRhhzKY-pIibB9ossezACl0s73xoYg4tTZTT9_utLKNxrTPsii80aVj960J6TG9T619nSw_F15FZzfdSwJWnftP-VYAk6KsXLfH_u8kpRPCN26Ea0uZtycnnkz08laFmzJtftKUF48yTzTW2KjRtS5152Jvtx8J61ax7OEWjg66ln7i7O5glJucPjwXc_-EWrntZIqEpjUPMmUB7nfp1hiFMwuVM-1zyMXvgWO9qZcnuRVGh5nKpUzHx4RMYnGAjrVLjpjxARqaG2qyU7A1Tx0I1vE97laetfODfROElfbSYMzNEYGeBkq9b7k8YO7di5yowTj_Ok73wzxQ-1vj0zuGb5ZEy__L-VDAdEcSfiD_-Xwwj4K71EI4GgEQXV7Sv9kubR9mgWZkaDToNeEwoUlG9TaTCsnC7aEUQ9iWeOJ848czhDPJ72yj4HNagktxFJ16JLmSuOv9w0D10E9cd6UCAUWaep4OjbOXGiG13gZxbIcOLi51X0v_Yo6ecUdEG0tDGBlzcBH0ByKjeubzFylNI4yWm3ANtzLHfHLHthlqE9atgJmY2cHbKuDyZcyBLw=w500-h320-no";
    ImageView nubyaccesorios6;
    String urlnubyaccesorios6 = "https://lh3.googleusercontent.com/O_bpoc7qXRQX0v5TQqzlLYw3U-50YcZzfdgq5PM1oYhWxH0cN-ZgiXxR8A02bGC7YD3onTsfKe2mGNED_lc6cfO7frt395knmecEEd9Jon61p8VevwW2ocXTUudIlerzrghCd5-1QDwBvQQqmCI2KcJg-2FywGjZtG21aOzU-zR9CDll3T1Ktc-y0RZEDXHae2v1PxOWW7TMhedZD2R_KsIVp5b2Lb4_LKcEMaQEUtOHloUyO4fobfbdnd7TDfCiYPt1MQiqrlwNtObSI2VxjTfzABnB2G_6wqZbvDqLyL0R1M1CN6KT1IpHRrvLhbpVyB04xTQ4LkFWjUwDEBGnc_UH3XnR-6bhyzOR-htzfm053Yl2wgnCVtPdVWL3mMK3TgbsMjYPfBjD7VGlaYGwFjlC15siZOSZki5LmEYIaCA3m9NTXXonFVD6c5cvEHx0bUeX3oSWKK05M2-yjfOVIuckaOhe-MlzRXorrNtq1ESpzYcr1fs-b0FcqpSfrPMS6y_GfvwitAifEuNVp5O5zqpGUzYQ_OzoUE1pOynuncFioyAlktGPJjtT-FYBxUoPrNbvw2I1-eRypeauCgpXMOZTpWqZmYEGlxW9bnYWgR5qnGXc0w=w500-h320-no";
    ImageView nubyaccesorios7;
    String urlnubyaccesorios7 = "https://lh3.googleusercontent.com/k3-Ur1BDUP6YeP1ZovXTwh_8UwPp_140vk_ACLtdOVzw3BpgTY4xbDazo5ZnDbQmm_INvokGvbIVXV8rTgJnVY50w9oFvi0p21smN9_qsBMWwipmMC2djYWpxZ-UzaqZDC5LhnKoMG4qP1YG4SeaCD8Lr4FbyFNUpi6YpW2XzlpgsARrayvijITPWK9cZ7HiYukjMBLZ1lIZ_0A5cTyvsml9_BROboFP9FRkMUjSBt41V8s96u-gh2-GejsC52WkFPxv-x_4-4lOTBFXDymlaQHTCQVP9xISqoNZSvyqnhhYoVKR8rdwmWid-LwMd1gmSd2bGNFfiotjjG6zCltc9h_zQjbuE0XKCvRtYR3nKirdR1W3byHnKQgRzBvNSn_CU7W-peym6XTAjDnNpR7814SJlcOsYksqHdnxTsrTzMDidn4sNXPqOF6-LpVrdCL-bWJ5_gegCe_zmALt8obx8IbYY_ZPYsu_X9JScFoMmBNshT_I7E4SvMZSX7_YofEdjRfj_9iM1XwPzp2itr6FhSPeeS6Zx4sxam0M33cQ6qhGLPIEcdaJPn_ufm1dPuR39e6pi7rJwfGZJWOtY5H8Zz6pGRizzBkx8Ov-j6vD3OEGoaRVCg=w500-h320-no";
    ImageView nubyaccesorios8;
    String urlnubyaccesorios8 = "https://lh3.googleusercontent.com/vjK-YwV9-GTSM4BHNeqafBSjpJJ5-ek9okowQoPBKmS-03Y0B4OrFmhK6f9iw38dYmDHNkQeCUePG-5-dXFCdyNkOzRZ795qEDEBafw_kpASO7VrL6w343NyVVAsUUmcSoNfqbaVxm1mNUCAndFAcOU8sFoy_QIwNrJ6mUl7hzqHb6h8WWGNkF1dPd51o4UcLmMju_kd5RZ_EzVBZmZ3X3nB4WS6xF4B6cJF2J4mdeGj9y9epJb2wTL2X17qvkvf32xov5t1Sdxs-YU7b9UQgOxMsBS1NJ4JKu7jJHGKc4AxV7SsLDShAls3QvI9D3f7FbBGTnHZGZgqfIrezkso203G29TGAlcYYUJ5rTpscI8VMZpPpWUJ1TOhQ9XBH1lE5KozXOh9zgYihT21W4oFia7HB4GagyQ20gMTUevKMf8e1FLaSUnETLMuaWQugbK8yr39XWPAySxTUoBq8ml6JGDQVaLjX7nupWGcMefocmCFoadWcSyrmOClLhk3dTJ2W0vKU8E0xWy8VBfhky8LuQyq5zud8ij7NjJgFQ7NMo_Qq97CuAaUZnuljxWpAEGxVTNoJE_Dc17jlDW43VcQfyDgXkzKbeJM6Spqg-wATnpEHLB2MA=w500-h320-no";
    ImageView nubyaccesorios9;
    String urlnubyaccesorios9 = "https://lh3.googleusercontent.com/7EUwTPe55dOVZL-fQP3xFHk8py_5qy0LHusVVtnLG69teMkBCZ-68ZQEiAdBQ9r6EiIYK-qRuMxoOaA17Z0HB5-oB0zGzRsyQMhhQdI2Wi3ypT4CeLcYJhxl2DUL9HNj5DBNApKSgCVEHrp8w_-MeusqRblJObD-eBfEjJkFXbeP9_bPzgtm0Tx5a4djVOVDh4tO_1s9y2cw9c3XNqBVpmiwKIpxAYF3GSJOGdUz9Q4884B3Mfoe2qdwIv1SYFheGsoFtsQF2erWfcDs-uUuLk60BDQs8lB7SzPUx5IuPP2ERWq0GRhjEdgFPS0PLa1Enu6dzUQNzhsxHvOyEdOSEu1zm8hGbVbFTj1Ad3pDDbhb8Vk-9gKGWoanQ9qQvVJpgFzpHeuYWzaU4EeVN8RJdHReCZ0cK7eA8uEcf43_0GcTWqw4M3oPuTpUog8_sz94vBSr4FMhRjbnTEGI9R6nb8JWD43_WY38u149cExGykWOyLgxgu1P6rEvXAnE252heAS7WgMH2uhtWDmyGW6DDtcFHHpTasxT7dOOmY7R3VX0oMrxTJDUpmBf-IAxNp6tLehlxjzZPdaOYK4IICkqT2vs4rmmsOaP2EpguVnBZouDn4xErA=s500-no";
    ImageView nubyaccesorios10;
    String urlnubyaccesorios10 = "https://lh3.googleusercontent.com/z54V1MTY1uQUIBU9Njql066gDJZD9AcN4NSnNR1PMSKnIAZ75xU_V-UY8lq9w4I8sW6y-AitjQkyptVNlipA5nBcmCMOW8i0a_JuOIHoa1TFRK52p0fDcqwtmRxpTXp0WR0cJ8zHzBwsP3B6g3PAq0TbS9wx33yUZVe9ozoplyDe_vEtz0OOAlIXS-QImgCFE4Dx-B8EuBQ7MS_vhKIPGklibiwkXdlVOq4fAqmUZbwmTWGUlODepJSbP3-iEd0EXCC1M8qJFq-xMMZuWjc8CvYDi0ieQCbGoeRc9S9aUcxnMUj3rDhrwKCSWh6jt-eQnKxqIh9DuGRTTK8pB8IjCmPqBCL3yboQeJsblBHk8_dyia-ZhRHhVLFF914Y_Zkog81v-1xwzNpTHmEl-RpH9LnhYJSwRD82Un6fmlCa8Sio93NvLq_zM2FK-HM9XkxW8AIl_siW2eC_qDGU-qY7pO6HUUQGKjrZ7SKohqgRy-dCx_Qj4UvvhrfOGF0QfwN0uIpGSZtmaIRpJ6E2otN-Soxe8Mblh31A1Meti0Kef59Nv6o191j5Xjzw9_8x3WqAo1Mi9rdrISi0PsiKTYoIqprWxzL_C14adjCahokh5KXQPleZkQ=w544-h676-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyaccesorios);

        new precionubyaccesoriosAsync().execute();

        precionubyaccesorios1 = (TextView)findViewById(R.id.precionubyaccesorios1);
        precionubyaccesorios2 = (TextView)findViewById(R.id.precionubyaccesorios2);
        precionubyaccesorios3 = (TextView)findViewById(R.id.precionubyaccesorios3);
        precionubyaccesorios4 = (TextView)findViewById(R.id.precionubyaccesorios4);
        precionubyaccesorios5 = (TextView)findViewById(R.id.precionubyaccesorios5);
        precionubyaccesorios6 = (TextView)findViewById(R.id.precionubyaccesorios6);
        precionubyaccesorios7 = (TextView)findViewById(R.id.precionubyaccesorios7);
        precionubyaccesorios8 = (TextView)findViewById(R.id.precionubyaccesorios8);
        precionubyaccesorios9 = (TextView)findViewById(R.id.precionubyaccesorios9);
        precionubyaccesorios10 = (TextView)findViewById(R.id.precionubyaccesorios10);

        nubyaccesorios1 = (ImageView)findViewById(R.id.nubyaccesorios1);
        Picasso.with(this).load(urlnubyaccesorios1).into(nubyaccesorios1);

        nubyaccesorios2 = (ImageView)findViewById(R.id.nubyaccesorios2);
        Picasso.with(this).load(urlnubyaccesorios2).into(nubyaccesorios2);

        nubyaccesorios3 = (ImageView)findViewById(R.id.nubyaccesorios3);
        Picasso.with(this).load(urlnubyaccesorios3).into(nubyaccesorios3);

        nubyaccesorios4 = (ImageView)findViewById(R.id.nubyaccesorios4);
        Picasso.with(this).load(urlnubyaccesorios4).into(nubyaccesorios4);

        nubyaccesorios5 = (ImageView)findViewById(R.id.nubyaccesorios5);
        Picasso.with(this).load(urlnubyaccesorios5).into(nubyaccesorios5);

        nubyaccesorios6 = (ImageView)findViewById(R.id.nubyaccesorios6);
        Picasso.with(this).load(urlnubyaccesorios6).into(nubyaccesorios6);

        nubyaccesorios7 = (ImageView)findViewById(R.id.nubyaccesorios7);
        Picasso.with(this).load(urlnubyaccesorios7).into(nubyaccesorios7);

        nubyaccesorios8 = (ImageView)findViewById(R.id.nubyaccesorios8);
        Picasso.with(this).load(urlnubyaccesorios8).into(nubyaccesorios8);

        nubyaccesorios9 = (ImageView)findViewById(R.id.nubyaccesorios9);
        Picasso.with(this).load(urlnubyaccesorios9).into(nubyaccesorios9);

        nubyaccesorios10 = (ImageView)findViewById(R.id.nubyaccesorios10);
        Picasso.with(this).load(urlnubyaccesorios10).into(nubyaccesorios10);

        btnnubyaccesorios1 = (Button)findViewById(R.id.btnnubyaccesorios1);
        btnnubyaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyaccesorios1 = new Intent(nubyaccesorios.this, nubyaccesorios1.class);
                startActivity(btnnubyaccesorios1);
            }
        });

        btnnubyaccesorios2 = (Button)findViewById(R.id.btnnubyaccesorios2);
        btnnubyaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyaccesorios2 = new Intent(nubyaccesorios.this, nubyaccesorios2.class);
                startActivity(btnnubyaccesorios2);
            }
        });

        btnnubyaccesorios3 = (Button)findViewById(R.id.btnnubyaccesorios3);
        btnnubyaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyaccesorios3 = new Intent(nubyaccesorios.this, nubyaccesorios3.class);
                startActivity(btnnubyaccesorios3);
            }
        });

        btnnubyaccesorios4 = (Button)findViewById(R.id.btnnubyaccesorios4);
        btnnubyaccesorios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyaccesorios4 = new Intent(nubyaccesorios.this, nubyaccesorios4.class);
                startActivity(btnnubyaccesorios4);
            }
        });

        btnnubyaccesorios5 = (Button)findViewById(R.id.btnnubyaccesorios5);
        btnnubyaccesorios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyaccesorios5 = new Intent(nubyaccesorios.this, nubyaccesorios5.class);
                startActivity(btnnubyaccesorios5);
            }
        });

        btnnubyaccesorios6 = (Button)findViewById(R.id.btnnubyaccesorios6);
        btnnubyaccesorios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyaccesorios6 = new Intent(nubyaccesorios.this, nubyaccesorios6.class);
                startActivity(btnnubyaccesorios6);
            }
        });

        btnnubyaccesorios7 = (Button)findViewById(R.id.btnnubyaccesorios7);
        btnnubyaccesorios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyaccesorios7 = new Intent(nubyaccesorios.this, nubyaccesorios7.class);
                startActivity(btnnubyaccesorios7);
            }
        });

        btnnubyaccesorios8 = (Button)findViewById(R.id.btnnubyaccesorios8);
        btnnubyaccesorios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyaccesorios8 = new Intent(nubyaccesorios.this, nubyaccesorios8.class);
                startActivity(btnnubyaccesorios8);
            }
        });

        btnnubyaccesorios9 = (Button)findViewById(R.id.btnnubyaccesorios9);
        btnnubyaccesorios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyaccesorios9 = new Intent(nubyaccesorios.this, nubyaccesorios9.class);
                startActivity(btnnubyaccesorios9);
            }
        });

        btnnubyaccesorios10 = (Button)findViewById(R.id.btnnubyaccesorios10);
        btnnubyaccesorios10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyaccesorios10 = new Intent(nubyaccesorios.this, nubyaccesorios10.class);
                startActivity(btnnubyaccesorios10);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyaccesorios.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyaccesorios.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionubyaccesoriosAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ac05296357c9d76bf6b0cc6dd0ec063e";
        String precionubyaccesorios1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e97f44bfe4dd2005d076086be1ab5182";
        String precionubyaccesorios2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3750122915013bb5c688a57cfce01cc0";
        String precionubyaccesorios3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=33699074e8be3d4aac726e417e720ddc";
        String precionubyaccesorios4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=117761131e7d06d8f5920b7bb1ff8e60";
        String precionubyaccesorios5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=edb0a769253636167e9708b8bf234043";
        String precionubyaccesorios6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7ce09ab96694f7e6d8fb76ca7418846c";
        String precionubyaccesorios7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7d71006b25a088eec5c8efa57005351b";
        String precionubyaccesorios8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6d38d6c1a0dca109b5a1eb07aeaa640c";
        String precionubyaccesorios9st;
        String urlprecio10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=49f1f7827da103b66eef200c3ebf9857";
        String precionubyaccesorios10st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionubyaccesorios1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionubyaccesorios2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precionubyaccesorios3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                precionubyaccesorios4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                precionubyaccesorios5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                precionubyaccesorios6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                precionubyaccesorios7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                precionubyaccesorios8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                precionubyaccesorios9st = metapropoerty9.attr("content");

                Document doc10 = Jsoup.connect(urlprecio10).get();
                Elements metapropoerty10 = doc10.select("meta[property=\"og:description\"]");
                precionubyaccesorios10st = metapropoerty10.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionubyaccesorios1.setText(precionubyaccesorios1st);
            precionubyaccesorios2.setText(precionubyaccesorios2st);
            precionubyaccesorios3.setText(precionubyaccesorios3st);
            precionubyaccesorios4.setText(precionubyaccesorios4st);
            precionubyaccesorios5.setText(precionubyaccesorios5st);
            precionubyaccesorios6.setText(precionubyaccesorios6st);
            precionubyaccesorios7.setText(precionubyaccesorios7st);
            precionubyaccesorios8.setText(precionubyaccesorios8st);
            precionubyaccesorios9.setText(precionubyaccesorios9st);
            precionubyaccesorios10.setText(precionubyaccesorios10st);
        }

    }
}
