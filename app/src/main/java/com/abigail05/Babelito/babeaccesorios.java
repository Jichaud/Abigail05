package com.abigail05.Babelito;

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

public class babeaccesorios extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios1;
    Button btnconsultaa1;
    TextView txtbabeaccesorios1a1;
    String urlcomboa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8fc6ec9f5e5f9efa1492b41ac624a9c0";
    ImageView babeaccesorios1a1;
    Button btncomprababeaccesorios2;
    Button btnconsultaa2;
    TextView txtbabeaccesorios2a2;
    String urlcomboa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=786af8f59094171e8d52126369df8079";
    ImageView babeaccesorios2a2;
    Button btncomprababeaccesorios3;
    Button btnconsultaa3;
    TextView txtbabeaccesorios3a3;
    String urlcomboa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=49514b0fc75de6793a49c165e72d3b40";
    ImageView babeaccesorios3a3;
    Button btncomprababeaccesorios4;
    Button btnconsultaa4;
    TextView txtbabeaccesorios4a4;
    String urlcomboa4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d556e76110204c98b7424bc5aeb74133";
    ImageView babeaccesorios4a4;
    Button btncomprababeaccesorios5;
    Button btnconsultaa5;
    TextView txtbabeaccesorios5a5;
    String urlcomboa5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d7626a3d6971a76a56635b059a6bc947";
    ImageView babeaccesorios5a5;
    Button btncomprababeaccesorios6;
    Button btnconsultaa6;
    TextView txtbabeaccesorios6a6;
    String urlcomboa6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=55242dd644b38a8e866802c2ae121ed0";
    ImageView babeaccesorios6a6;
    Button btncomprababeaccesorios7;
    Button btnconsultaa7;
    TextView txtbabeaccesorios7a7;
    String urlcomboa7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0e8d69de8e3b6dee2c8c3727c50d83b8";
    ImageView babeaccesorios7a7;
    Button btncomprababeaccesorios8;
    Button btnconsultaa8;
    TextView txtbabeaccesorios8a8;
    String urlcomboa8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ee7172fc894c202e23314fd7eff0da12";
    ImageView babeaccesorios8a8;
    Button btncomprababeaccesorios9;
    Button btnconsultaa9;
    TextView txtbabeaccesorios9a9;
    String urlcomboa9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e94b61e4be49ae26ecacb27644048385";
    ImageView babeaccesorios9a9;
    Button btncomprababeaccesorios10;
    Button btnconsultaa10;
    TextView txtbabeaccesorios10a10;
    String urlcomboa10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e45c861c8a62d3f6d22f4575f2d80c07";
    ImageView babeaccesorios10a10;
    Button btncomprababeaccesorios11;
    Button btnconsultaa11;
    TextView txtbabeaccesorios11a11;
    String urlcomboa11 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b6f2559e744b229ffad469e9b24915a1";
    ImageView babeaccesorios11a11;
    Button btncomprababeaccesorios12;
    Button btnconsultaa12;
    TextView txtbabeaccesorios12a12;
    String urlcomboa12 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ad2b8ecf10bf707c58c8f89db981b863";
    ImageView babeaccesorios12a12;
    Button btncomprababeaccesorios13;
    Button btnconsultaa13;
    TextView txtbabeaccesorios13a13;
    String urlcomboa13 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=672a422109c29bd86c3c06f6598f5f53";
    ImageView babeaccesorios13a13;
    Button btncomprababeaccesorios14;
    Button btnconsultaa14;
    TextView txtbabeaccesorios14a14;
    String urlcomboa14 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9eac7e55abdf17c8545e99d6ef1691c2";
    ImageView babeaccesorios14a14;
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
    TextView preciobabeaccesorios1;
    TextView preciobabeaccesorios2;
    TextView preciobabeaccesorios3;
    TextView preciobabeaccesorios4;
    TextView preciobabeaccesorios5;
    TextView preciobabeaccesorios6;
    TextView preciobabeaccesorios7;
    TextView preciobabeaccesorios8;
    TextView preciobabeaccesorios9;
    TextView preciobabeaccesorios10;
    TextView preciobabeaccesorios11;
    TextView preciobabeaccesorios12;
    TextView preciobabeaccesorios13;
    TextView preciobabeaccesorios14;
    ImageView babeaccesorios1;
    String urlbabeaccesorios1 = "https://lh3.googleusercontent.com/uZ65Oqfhq_f5fAjabsZW195OelLjUYRNoBQ8FZt8T7bOVom7PxK_lGKPS8PkcoU4QDeucnWjoGd5E46-atE9bpDoBH7mcZLF1UO8iNoyveXD1zs4fisGAu7lpJa66ZNEKscF4jmSmxsd8oHNLGqrYCdXDlr9stJVjwlJwnveHOZ8bc0NRC8DKncCoUxJ073RMnRQn8djwYbETJ2qSGcKO3orphbWnc7ytmNBTQNdrvPHkoKymfXG7qygiKKftHFEdCuZghc6o0ubn1ed7r9GL4Es6kWnjvc8A9KRYQB-AXkI9R30sBxXjAuwx_gxR3-XB0oCH9nv0RJ6qsvb5YeIL6P3lfxQNua_RM6PCgZYien_QlfPONF8ocSqZTDrdLIbNpJfv2BSzGDIo9HR3Z_ISQFa8BSkIKg0qrOZXGlejO2pAag9HlngC8N52W9qJE8wEVvj_IV3Wxn8yApoKVgjdgHjT0iftmjDQ7MxXKI1SsEKMv7rndNnSsX-CcTMOLbF0iXNiZJaMoAkZFDnRk0NYleXEzPiVd7dr1ReDX6LPNnE6Knslr7430xhq_4eu15GegPrHSFCfQp7lb8Xo7T75SboUxo4TywnWSXtVICUwXceLcySkg=w360-h356-no";
    ImageView babeaccesorios2;
    String urlbabeaccesorios2 = "https://lh3.googleusercontent.com/ww0v8XAWCcL9BC4cZmljMJcBmbx2ZhI3eIOUIy6V81YctmOYJfGunZBl4DxegrfOo1mqRwpG6KVbkavznxI-rL_W6Qp6-30zGT-hYmmTH9qbxAOlRoYrX5ct7lGiMEORmo_JiYIziQ46OLyS9ukY63qmbBdRNaeH4UuCsG7Y7ZkXBB2jDCZtAvl6iGDheY4FD2YIQVuA2Y_OOSTTZZtYnJ4SyBJAmjCY_IW1yS1fet_cVnYiSbOip-jUs-1e4sSWBEz8C-XugIwhDwhgNGkqmFkNspTC0HNTHv4NUZnH8t2jCppSMhRZHdX2Rx1_GIenqi3OO68cqW_pn5klpui1y9h67jqin65V37aa9w44q8RxGfgiwPTgosS3UnVv2koAlxOC3dMomiohHwp116s1BOH0FmEZT0ouLCaYSiWmVNUT5bNbEgNd6dYdc3V06wUfmbCq9FRpip9uBaw7WWwkryAMBl6yNYB43YlQ_BXU1yrXv-misbUj9th5x6k8YpDC7Y_h2Wt4YPKIHjwvDu5Wu6ncO6jRL5haptrprVTgobAb6hJMA91uY3t3l9qW7mhY4TQ1OAg8zR2CRg9pG7zpIdF903MuTg5AGodiW6Ci_h8dZ2U0Ow=w360-h356-no";
    ImageView babeaccesorios3;
    String urlbabeaccesorios3 = "https://lh3.googleusercontent.com/DFxbG88Omg7oxOxZpgDFkuU9NFLlCuv9-jzUJ9hr-ADoGKI36YnYOp8in4-3b2LIXJgR-ExHVAvA61PeE2ieIuF4_5Ttu6e3pQ3pGgUWfUJjZzo520cFWyTEe_enTmSmSuMaCJackT04ikAtYwkjf3ceF0kOwy9_KlPr5Ms-SeuViCFYMPWGVAiWKjgshJ1jUJ9RI1LTrfr6WPsbmm_Tu-twZTAprE73x3TOMBcVjxzlEqPSpArFj0-5iGjFu-FTPenpdnAO1409PdBslx_atfDLkpM0pED-ptR5tI4GUQdpBnN1OTUT7xusrQriR7uPU1BE-tGLCAPhgF4Cr7RMqWr875r2ug9djBl7VugmDtPg7scyi1XncF9QuaAwLvpes8857TqMZJJ8PZco3idRkNprVjd8jEfNgeGab_twQperJ0Pjkhfj1Q0rhUKkSYY-SWQ2DpVkmb6UMMk36tBfHxWISAgw2vUTQEDX1YHIMf3k-ysOl2Y0XQP9j_UNzBOlniyxSNrUvKc--EkgqpTGMYbnaUBXvia1aaF0kuKMb8Om9r_ots8ZZ9jQAytMAxDaZl1Vo5Bjiqvsxlcd2a9sflegs0U1MOAwtCVWQSrNvdVw12IgOg=w368-h364-no";
    ImageView babeaccesorios4;
    String urlbabeaccesorios4 = "https://lh3.googleusercontent.com/1f20AcztR9tzpgNlyw8zuqQPpSc0iHGMpQlA85Fpl8knP3helHUjyKCLtcf8tV6c8TzeaA8YldddkgVQr1GJIsECwxI8beSeN0Y6QD2ChweWxISDVsWlPqZboqS8yCusydjHJZK4Iax2lLUtJh6D385QzkYcsH3jM6tj8gK3DfW1oz_tIah3Uvuqdr5Yylk-bXANCajuG91TthrOQ7werkunpNwXGACyc8gC0JFLDc467739xq8ICi5KYWMistlKjSMzTEVKKRxhK5sH9NNNIYgZJtkPNG-0Q2yDA3kWqgD7n0Zqg0hJ6_d_-pFeNzVsd3aWEr93BAEqFYj761dGS6ghv-eeBaHqzwO1isBkD8j3HdWlOc5oCAWa0siH34U_1slEI4t8Im67H-LeYe65YpvKFr647jFJIixlo9adFiWSLH80KyixDFXhYO-cifpwVE0ex3ZRHjzYKHYixp3tFcR94Ql4QAdkVgrPNYhr1d8NwcOk94yAwbYYGMdDCQh5hCmw8iiXdo7R7bl8BB8hB9rYS4aZvztB0JI28Y_BtR4z-nPVeMy8d4t82wqtjcCu-f2WGYpmV_BVER1ge2wbMri-7VrWIi589cPgvbcyoKHf45UTIw=s364-no";
    ImageView babeaccesorios5;
    String urlbabeaccesorios5 = "https://lh3.googleusercontent.com/VVvfm9i8IKiTKACVVYcRcGsQgKwRweeAj5_pSh3qLh5Uvo02EVjh57-dW3Hk3QL04syls5KYJPNB0i_PD5N1Oj6c4AfKsRKvMK2rwmDqDfcndroxwCQUj6a_qRRP4f8B1EBzprEWgs-cz4hBwGQrQTR-ZD08dYFQnX-bfLAj-unEI5aCeLXs5kVyv8gCtfRnoc-lNU4_w2XzAgLbwkgcIwMh7MsauNBx-mmd98cirBHR__bU4XLTympIaNu3z7TXHkc4pPBFT4XJqW83F4cqUEQEvLWJuD_T95Pc-3JUZpoRDBuUkLqk6wOLJZ_gT5SVOM8GmbO1qX3ufBvBIjygg64DTPyTtIPHVNx3BWrto9W6OY24kRXWtGqRv8So8lAukyN4CAgDVmxPXB80VEt8N3JA_8wVyuMYc1mvamzCWkN4QkJdwhIqyJbluYobE7cVu3N28yudJT-7I-26uQRTLnKPJk7PKg6j7T21tAPPBbm9yNnnIkbkjR8whBUCilSOouHQAxj2fKglxgGrcSElVTwkTKRdTHZvKkWjiR8s6rCV0t7KIxRRzwb7O2Yt3efbxR90GcKUNY0X9xxVAt1JULQjIjiUYpHy1BHBKV8s29p4KXWnpA=s376-no";
    ImageView babeaccesorios6;
    String urlbabeaccesorios6 = "https://lh3.googleusercontent.com/2vBjrFNLR-P2RcO-iJJGgJVRxyWhSXg7lDWASoJxhZa-rdQ1pW-heXGEpGYtWlY8MXll1W7Gd-05-uPe1ROJK7OuZIc2-VWq5-FWwiWeg7a1TOpGSrqrhu9elaNsFMN67m56AECdZS99Rv95SaAQUgKS50BziRfChVnf5zqaHWMA85Rc-JdNpT9xbvqBAkPjCT9qRc-uxWl0h7WngkOL2rCv-aM-FUE3gCTEjPL6Qatqaa4RaOUa0mxwbF2Q8X_vZvvD6u4JtsLDeoBpmvKkdjNd8GQ_lXalnkY0aGZ-ALd0ceAgZU6SGOVT2ILfcWRcRJK5ROaOFN1S9Z6tKmxlr7GegIeLY2Y72kX_bEOiu94xAK6zWNtbCD7kHV8vEqLEDq5G_c1W07Ii4bunjOd4re5esiSjwXHzT1AkHuM5DZBMTGVwhzmeXMwbWhZ54ONmG28hPeudCcsmy9PjpWB5eiRcgCo6NASkAa2o0cdj1RNoowxY24_TrXWgnPf8e5guV9pAAZLGCj2ytNmG3WKxbBwF_DTA95CaaRvtkIb6OeIhNTDbzPp99KNm8HfrLNK0Wb8MMeqcHfP2Dzq59oaPk_vpDF16Ks8kjAaw0J5BmmeVTPI_oQ=s299-no";
    ImageView babeaccesorios7;
    String urlbabeaccesorios7 = "https://lh3.googleusercontent.com/aZtCTM7vVhCE3F3C75dwU73FOEPGADD8upBqrvz3gWNz4uzj7cOSCjjWh9cVZGAF5VvbDhFu0qITWn-r_9OaQea3180QcAZ5VMaX0dJMma25SOqb97DGyNGvQ6c2ecE75d9w4TtixAFLZernaczk0ZrBYGKFrC-v8fcmWxginurE-jfaG8QxZFrz3tftt41ymZ4XTvU1o6tK2EPbL6vx0oPhUj0ONoWyG_x4V39iaW8NDzBn89RIEb70nFH9mtqSquDFFQtHvg04RyUimFeFd2TZif0tlQJjHBPwoN02n597wewaAVj7Q1c4VvmYJZoDgm9QcxY2s8Yx-tsIQrS2qciSpbwWMxzTJ4fgtCy1TaQEMnM1LGYDPw8K3XVk2GQ1D4wIOLNlhTblibh1s_irWwKaAbAu_4VaP0xE0aAvdeZu8IpurlbZwXdk2SjSlKQMpzYp7nxLIe4GFkpaOkjURy9pvYFSwv0WC2adhcvBFD9dQqPOBhEgGuoyXkhp7-E35xXdStBplF6LintLlac4OSHTRlJuDe1OeaIynB4YbJU6b3Arxf_QTxBx9V2F1AOwekwnPPqtlj2erAanljL_OTnJ5CQ8pNrWkAOQQig0iCTZ17OwTQ=s299-no";
    ImageView babeaccesorios8;
    String urlbabeaccesorios8 = "https://lh3.googleusercontent.com/xtO-_I2IlIfLatzzbkIlVLsI5uLp9ROsME5LsPWdnHVJy_oPQg4mQt9ti47u3_HqorNDae6d_KOWJ4dp-cBL1t1mnsiMaQSLXbGmFDseCqPMlWUdOorAPeEpBUv7hCbQuVAoxYAajGCscPbCCRJuwmP_-acSRgxtddevORq1rXDAVwrNnVjLaVhz4ReWqm7ewr6M920aBfSpfHkK3bMkolWe_3PFk3GfSndl5KwYLjVAF83JZ3QVMexXkMKcX9m6qwvtPYYvT8leQSD2MXp49OhgoBvdkIfoPAbG80hYl2uvAdkLlyYF1UOhBnP18xzLl1obh324YlG38T-i7WAB4wHfq6kseMf8Lh5Y7LJ_mPeXmmnie0QpA_oW-WLMJZp-6wqAHXXpn6uK2P6u-5fQuot-a0jGaW8rSUeONF_VjYklnPAwNnfNJoX3QG1SULm5PwpXHbma7xbpGd-0agvy4SHOPuGPRZK86SoBFUqqTxpnm2OZZLjneAG_nscjFUijWqZy56Ezb31S_sQcy_ZWSXYG-FQK5qOJnE13vP9YPxt5Y2w6VZf_P8EJweJy46BYki8ftmUqD5nKxDl4smgCLy8PqxVG5n0WLcsAseNY_sUTTmTokA=s299-no";
    ImageView babeaccesorios9;
    String urlbabeaccesorios9 = "https://lh3.googleusercontent.com/niursT_mMDMdDKILJZGj0EycUm-ghg4NMy-fF05gV9fZsdtBVGHSQoLMogr6kcUAVOcfiTzNsDb6qO2jT3QafK045XOL7jsJ2y-righ6A66V91DrUsweiVzhZOvjteom3i_tTTmx_AtyWA2lMY9MZG7VTFYuZZOdPNOgPu5XsoZR2CB0yOM6_sPWkhLuYE5UCVVuDW1IzcfxPYAWVN6rH0ErzUnNAx-lmvOqJR1c-6cWot7LaisrK84bVXTNDVMa1we-f5UngmIoRal-GvorksV3UdLXRfJHoPw8fpqHjGJbO7LkWsXS5flZKJWPaDKj55WxkXuJregm_Zom6vvjI5o6KL8gykLcSrUxd8wpZCqQmdmWIy_UozlwNFxUpsG9a2OXGS3PWyQRt5bt4w5tJMop_sP_W3ioFczslgPAOX_nya6wRTFjnObdBwxliYFwaWfjFMW5E3ExdojmyGPdJNrmLe9EsvhW5RsSHAUL2G9wATuALmVrLi1Ppc1sb3mRfTF4RlxZYKXFvSToilcBBd586cuiZkfB4mIkrpqPIMi-21eawJUs6G51862UdiXesUG70i3ga-a-DAxGKw3OZnG8GsENfwvoymfBTp4UkwRwFXKBHA=s299-no";
    ImageView babeaccesorios10;
    String urlbabeaccesorios10 = "https://lh3.googleusercontent.com/-Cc_g4ybHAEaeqV6InStoIdlDrV9VQM9EXJhUi6_J3emiQnEqRRI0ytlHEw4MsfG2VoE-xyPMWCH0D3SVgvb2bRwOZuQQhxtdyX5i-S8BdksL1LUQ4eQ3OSmk68_fZgZF3kj1_IypYndodbcWVTlrUINX-kxjhEQgjT_VwDFa2jydbJC3YXmNZFzTXJ4ckTxEMlz9H40bYTivvuwm1wCs55kVUsWA2TRo04qUETuPJ37r-b2tGBGHNZVTdEvKjQmBIIlJfE2XDLVMsU30c7vxVB1p2JWA5EkMEJ9u1EoscBttusZExTAWtw0yL4TX2lk9FDT9erJAP-bTn_LiKTsWSYk_NJEGruf56rA9rk_lQC6hqv6yfXJSwkkZLWY4xPQ1UHzpvDTw_fa-7cSx2A00oG42YGXWs8sV9FphMtUmVBUOhvAk0sl0-taPWJBL24f8fju1uW9tZ3Zxurw6j30Rsb3FDD8jM0z6KJxIDtgwIqhAy55qcblsvyGeKSSsgI34prERMeCDPrZvWw_lmVHkTJGFDGC1wp-iwju89d8I_lBZ5hSsBxhz5U_kjtN0HAlJjUK6W8trVv9jY_sbjjKjofakrWpy1GZS5o5T50Kj51LTX9aBg=s299-no";
    ImageView babeaccesorios11;
    String urlbabeaccesorios11 = "https://lh3.googleusercontent.com/tPD5mTrcfAKlFNjn8S-0KS3NDIkqUTWnEYcrNTkGKWk44NiXGZlAfuz_eM-zkHfZ-m-aA_4XDNSSKTuU0Y0W69dIYN4af9e-Lcw37r9S8OHG3RInld9bqPFeIGf-5h36DLSO7_5PQyIlSsoiCrkqnZVJ012IbglGDUaXI1RHDmaOMnR7gML7J50JJMzWTsWsgfAIohn2gCB6-BMYRALbzEKSNVBVoypvKX1O0pNIUbZC7JmAyekYRTuTT3pnwrPPeQHLrivGaLU_YD-vIdh62Eq5ZeKlJiDqX5o9mEYdvt3Rho83g7Gn072qEALyG8p_ke76wTeH4P8O-lu3LNoDLWFuVRAUPawPH7HNhKo8RSkuzcXDKOwfDk-hk76S_LY1XlEBHuSUCwOCGlIzSQo3rlIkd9Mw52nh3-9-Um4SqhF3QuKQMwnzN1ypSOJwL3lbwrMK0da4v6A1PGv2wzJrAxVPmKs0qLLNZiVW0u2XYmvOCxySPg8GhCkMd2B4iqopzOgV_-V60EN6zdQfPOPktI_oXcz8kdwzD5hSu_qP7-Ab66mGAtI-vPXja71EG-t8KkXqpJ5rrIIo1o8YB5FB48yJgumDUQGTatoE5by0R9HHV0v5kQ=s299-no";
    ImageView babeaccesorios12;
    String urlbabeaccesorios12 = "https://lh3.googleusercontent.com/y_kgecswZzLDHn-zaJWR_-yYtCeZDAKJCpurIYAej-z_r31nhxjvwkfae3ClHUqdZtP0RDYp3cEaYGgK_LkwxG_6W7G_3Gt0naWbrxrs48nbV6cbhSXoR0nfnrM__HWHiJxv8-LwfkpJvPEBtDMPcP76OzU2Wynn-pEYyIJ9WOREKkPfG59FTqH0qRntfF0OJjuKzL8ZN68LmtlVsLJSz-2qi8_vp1O-50wKp1NEEYLpJUjaBD_XcP5Nu67OIwFevjzUN8GbmLthEcbBut7208cU1U3h-CphfT62JMZXU_w_tzOYlHo-d_V-tpC2tBSasDr_6HGCSIEGBANTTCurmnaOWvXG2GiQP6ljzpZR6IVjRDajmI4CBSeWf6SY8rmqNGb8H7_Mmice6aF5qadxS3AUh2yx5ACJeI_UGa1iRrKpvtALk_44uPPYasPU8Y77VprBbDbM3raEHfrmq5ettvYXO8c7QbqPiUtFHVhLWlFCreB8hkpGZyw1zYdTs7kLtVuMQiF5fWbKNlwy0OWgHkYToQzWT7Of2ZQd0G-ESDeXOrwkn47Jr0ic3YG9bHTDVshQ4R2N-01XbaKjRS9RdFxe_wbtk8gc_nFB7BwPn7yKJdxTAw=s299-no";
    ImageView babeaccesorios13;
    String urlbabeaccesorios13 = "https://lh3.googleusercontent.com/gN8v0-SYp0aHxwPqGGPfBPP9jfdTsLX3fu4v7pnRL1WaqJ1-FQqPB4NPoeDDl45SK_YVqfhG_WlMUgHDqYsuR6qjhboeAi5vSWqo8eJQZrZ3oyeim357lhUptS6x_0YhUlQFYvnV2MhhBzb-uEpkvvREsnkd1zK16WBNxokF43VoSPcanfZLbGq2qpN-xZPG0_agImx9cYGy1y13ox0_P3z8Rod3e_dIwDHd9ylc767pqgWoYD9Kj04tpoEf53hrWN6PGRdhWsUSodJLXwgK9yxtLS7DtDF1XDf-Jw-3h9Z9ioFOUcUes7LEsyhGhDtl0EiT5wiqyW4jn3TemFlBchBWVV55zvGv574q816BESfvBtAX42HfGNXlVTtUN2RFim3RVbwdcg5cEiGq9A4OzFNTCeuMsSjn_-howRjnvXyYT_CvlNi9xMr7AmVXeATy0S_nGjsQuPo40iCRSYnPv5Y_zv0ATsN3HTDYSV8pjOWA7TJA87Lc54a8ypvMswG40v8kdG_f_0GEbmT9IcAzfghwMBeq8R49RHLoF45RCSHkVxq7d67GScWF1ZS_g7U8iwApe4UMf2DI_ZZzrfTH3jGfMmXd35RUCS-u0SwCV3aH2ms2eA=s299-no";
    ImageView babeaccesorios14;
    String urlbabeaccesorios14 = "https://lh3.googleusercontent.com/MF4K88XLyQCZrSwScVcpqyCC--59Yfm7YTOXN092IrCDS2qwb04aU3VWFGglL1Y8WjxUu4Fm8kINMHt2h_G9rdWu6XksV7JEpYcjIN3CQsyJa-zEnYgkAnREDGZablOJdWYtFr8eUuUKsuKbE8WcjPfNuGmGuQ3tMvtMAvcwZMrvaidWH_LxCbYo1MVFUd6-hqxLPonlINV77ACP5RZ_3pLNzjxBNuk9MHi5CeVKLo0PiyGIx0YV_p6B2NAvuDk0qVr3Cke3I-6Mhr7PRVRgESXstwrfI2qPCt1TeGYZcPRn9mte5TDk-MmZIiUHGL2GUfStCGWUML1ocviyKk2LciwCH5E0UGq63e_2c8yGrAzHz0lpVNjdQ1eW95HE9ogVPi_N6nOsMj8R1WYMV5623_TUI8hE_gYV3gGAmhQah5lg5VOuNLQ5v77y6ecLYMsHRgoL6imgG3YTS7nZplosS7oKFdhYKHR36q0SIkzSw3y5PlOuShvoSB9QEVAT0_Q0dBSpom9ixTEVVpbmuV2kYJSlW6EZhfefxNVtWqE5XSLLLVxwefyWYsclDjBEaFQshgM4cjXAVn9aUVcfQGA1X5bRjQbtyg26B2468Bwc-Q0hQ03HmQ=s210-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios);

        new preciobabeaccesoriosAsync().execute();

        /* babeaccesorios1 */

        babeaccesorios1a1 = (ImageView)findViewById(R.id.babeaccesorios1a1);
        Picasso.with(this).load(urlbabeaccesorios1).into(babeaccesorios1a1);

        txtbabeaccesorios1a1 = (TextView)findViewById(R.id.txtbabeaccesorios1a1);
        final String stconsultaa1 = txtbabeaccesorios1a1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });


        btncomprababeaccesorios1 = (Button)findViewById(R.id.btncomprababeaccesorios1);
        btncomprababeaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios1 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios1.putExtra("string", urlcomboa1);
                startActivity(btncomprababeaccesorios1);
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

        /* babeaccesorios2 */

        babeaccesorios2a2 = (ImageView)findViewById(R.id.babeaccesorios2a2);
        Picasso.with(this).load(urlbabeaccesorios2).into(babeaccesorios2a2);

        txtbabeaccesorios2a2 = (TextView)findViewById(R.id.txtbabeaccesorios2a2);
        final String stconsultaa2 = txtbabeaccesorios2a2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });


        btncomprababeaccesorios2 = (Button)findViewById(R.id.btncomprababeaccesorios2);
        btncomprababeaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios2 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios2.putExtra("string", urlcomboa2);
                startActivity(btncomprababeaccesorios2);
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

        /* babeaccesorios3 */

        babeaccesorios3a3 = (ImageView)findViewById(R.id.babeaccesorios3a3);
        Picasso.with(this).load(urlbabeaccesorios3).into(babeaccesorios3a3);

        txtbabeaccesorios3a3 = (TextView)findViewById(R.id.txtbabeaccesorios3a3);
        final String stconsultaa3 = txtbabeaccesorios3a3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });


        btncomprababeaccesorios3 = (Button)findViewById(R.id.btncomprababeaccesorios3);
        btncomprababeaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios3 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios3.putExtra("string", urlcomboa3);
                startActivity(btncomprababeaccesorios3);
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

        /* babeaccesorios4 */

        babeaccesorios4a4 = (ImageView)findViewById(R.id.babeaccesorios4a4);
        Picasso.with(this).load(urlbabeaccesorios4).into(babeaccesorios4a4);

        txtbabeaccesorios4a4 = (TextView)findViewById(R.id.txtbabeaccesorios4a4);
        final String stconsultaa4 = txtbabeaccesorios4a4.getText().toString();
        btnconsultaa4 = (Button)findViewById(R.id.btnconsultaa4);
        btnconsultaa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa4 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa4.putExtra("consulta", stconsultaa4);
                startActivity(btnconsultaa4);
            }
        });


        btncomprababeaccesorios4 = (Button)findViewById(R.id.btncomprababeaccesorios4);
        btncomprababeaccesorios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios4 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios4.putExtra("string", urlcomboa4);
                startActivity(btncomprababeaccesorios4);
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

        /* babeaccesorios 5 */

        babeaccesorios5a5 = (ImageView)findViewById(R.id.babeaccesorios5a5);
        Picasso.with(this).load(urlbabeaccesorios5).into(babeaccesorios5a5);

        txtbabeaccesorios5a5 = (TextView)findViewById(R.id.txtbabeaccesorios5a5);
        final String stconsultaa5 = txtbabeaccesorios5a5.getText().toString();
        btnconsultaa5 = (Button)findViewById(R.id.btnconsultaa5);
        btnconsultaa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa5 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa5.putExtra("consulta", stconsultaa5);
                startActivity(btnconsultaa5);
            }
        });


        btncomprababeaccesorios5 = (Button)findViewById(R.id.btncomprababeaccesorios5);
        btncomprababeaccesorios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios5 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios5.putExtra("string", urlcomboa5);
                startActivity(btncomprababeaccesorios5);
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

        /* babeaccesorios 6 */

        babeaccesorios6a6 = (ImageView)findViewById(R.id.babeaccesorios6a6);
        Picasso.with(this).load(urlbabeaccesorios6).into(babeaccesorios6a6);

        txtbabeaccesorios6a6 = (TextView)findViewById(R.id.txtbabeaccesorios6a6);
        final String stconsultaa6 = txtbabeaccesorios6a6.getText().toString();
        btnconsultaa6 = (Button)findViewById(R.id.btnconsultaa6);
        btnconsultaa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa6 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa6.putExtra("consulta", stconsultaa6);
                startActivity(btnconsultaa6);
            }
        });


        btncomprababeaccesorios6 = (Button)findViewById(R.id.btncomprababeaccesorios6);
        btncomprababeaccesorios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios6 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios6.putExtra("string", urlcomboa6);
                startActivity(btncomprababeaccesorios6);
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

        /* babeaccesorios 7 */

        babeaccesorios7a7 = (ImageView)findViewById(R.id.babeaccesorios7a7);
        Picasso.with(this).load(urlbabeaccesorios7).into(babeaccesorios7a7);

        txtbabeaccesorios7a7 = (TextView)findViewById(R.id.txtbabeaccesorios7a7);
        final String stconsultaa7 = txtbabeaccesorios7a7.getText().toString();
        btnconsultaa7 = (Button)findViewById(R.id.btnconsultaa7);
        btnconsultaa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa7 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa7.putExtra("consulta", stconsultaa7);
                startActivity(btnconsultaa7);
            }
        });


        btncomprababeaccesorios7 = (Button)findViewById(R.id.btncomprababeaccesorios7);
        btncomprababeaccesorios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios7 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios7.putExtra("string", urlcomboa7);
                startActivity(btncomprababeaccesorios7);
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

        /* babeaccesorios 8 */

        babeaccesorios8a8 = (ImageView)findViewById(R.id.babeaccesorios8a8);
        Picasso.with(this).load(urlbabeaccesorios8).into(babeaccesorios8a8);

        txtbabeaccesorios8a8 = (TextView)findViewById(R.id.txtbabeaccesorios8a8);
        final String stconsultaa8 = txtbabeaccesorios8a8.getText().toString();
        btnconsultaa8 = (Button)findViewById(R.id.btnconsultaa8);
        btnconsultaa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa8 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa8.putExtra("consulta", stconsultaa8);
                startActivity(btnconsultaa8);
            }
        });


        btncomprababeaccesorios8 = (Button)findViewById(R.id.btncomprababeaccesorios8);
        btncomprababeaccesorios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios8 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios8.putExtra("string", urlcomboa8);
                startActivity(btncomprababeaccesorios8);
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
        
        /* babeaccesorios 9 */

        babeaccesorios9a9 = (ImageView)findViewById(R.id.babeaccesorios9a9);
        Picasso.with(this).load(urlbabeaccesorios9).into(babeaccesorios9a9);

        txtbabeaccesorios9a9 = (TextView)findViewById(R.id.txtbabeaccesorios9a9);
        final String stconsultaa9 = txtbabeaccesorios9a9.getText().toString();
        btnconsultaa9 = (Button)findViewById(R.id.btnconsultaa9);
        btnconsultaa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa9 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa9.putExtra("consulta", stconsultaa9);
                startActivity(btnconsultaa9);
            }
        });


        btncomprababeaccesorios9 = (Button)findViewById(R.id.btncomprababeaccesorios9);
        btncomprababeaccesorios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios9 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios9.putExtra("string", urlcomboa9);
                startActivity(btncomprababeaccesorios9);
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

        /* babeaccesorios 10 */

        babeaccesorios10a10 = (ImageView)findViewById(R.id.babeaccesorios10a10);
        Picasso.with(this).load(urlbabeaccesorios10).into(babeaccesorios10a10);

        txtbabeaccesorios10a10 = (TextView)findViewById(R.id.txtbabeaccesorios10a10);
        final String stconsultaa10 = txtbabeaccesorios10a10.getText().toString();
        btnconsultaa10 = (Button)findViewById(R.id.btnconsultaa10);
        btnconsultaa10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa10 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa10.putExtra("consulta", stconsultaa10);
                startActivity(btnconsultaa10);
            }
        });


        btncomprababeaccesorios10 = (Button)findViewById(R.id.btncomprababeaccesorios10);
        btncomprababeaccesorios10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios10 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios10.putExtra("string", urlcomboa10);
                startActivity(btncomprababeaccesorios10);
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

        /* babeaccesorios 11 */

        babeaccesorios11a11 = (ImageView)findViewById(R.id.babeaccesorios11a11);
        Picasso.with(this).load(urlbabeaccesorios11).into(babeaccesorios11a11);

        txtbabeaccesorios11a11 = (TextView)findViewById(R.id.txtbabeaccesorios11a11);
        final String stconsultaa11 = txtbabeaccesorios11a11.getText().toString();
        btnconsultaa11 = (Button)findViewById(R.id.btnconsultaa11);
        btnconsultaa11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa11 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa11.putExtra("consulta", stconsultaa11);
                startActivity(btnconsultaa11);
            }
        });


        btncomprababeaccesorios11 = (Button)findViewById(R.id.btncomprababeaccesorios11);
        btncomprababeaccesorios11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios11 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios11.putExtra("string", urlcomboa11);
                startActivity(btncomprababeaccesorios11);
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

        /* babeaccesorios 12 */

        babeaccesorios12a12 = (ImageView)findViewById(R.id.babeaccesorios12a12);
        Picasso.with(this).load(urlbabeaccesorios12).into(babeaccesorios12a12);

        txtbabeaccesorios12a12 = (TextView)findViewById(R.id.txtbabeaccesorios12a12);
        final String stconsultaa12 = txtbabeaccesorios12a12.getText().toString();
        btnconsultaa12 = (Button)findViewById(R.id.btnconsultaa12);
        btnconsultaa12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa12 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa12.putExtra("consulta", stconsultaa12);
                startActivity(btnconsultaa12);
            }
        });


        btncomprababeaccesorios12 = (Button)findViewById(R.id.btncomprababeaccesorios12);
        btncomprababeaccesorios12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios12 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios12.putExtra("string", urlcomboa12);
                startActivity(btncomprababeaccesorios12);
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

        /* babeaccesorios 13 */

        babeaccesorios13a13 = (ImageView)findViewById(R.id.babeaccesorios13a13);
        Picasso.with(this).load(urlbabeaccesorios13).into(babeaccesorios13a13);

        txtbabeaccesorios13a13 = (TextView)findViewById(R.id.txtbabeaccesorios13a13);
        final String stconsultaa13 = txtbabeaccesorios13a13.getText().toString();
        btnconsultaa13 = (Button)findViewById(R.id.btnconsultaa13);
        btnconsultaa13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa13 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa13.putExtra("consulta", stconsultaa13);
                startActivity(btnconsultaa13);
            }
        });


        btncomprababeaccesorios13 = (Button)findViewById(R.id.btncomprababeaccesorios13);
        btncomprababeaccesorios13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios13 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios13.putExtra("string", urlcomboa13);
                startActivity(btncomprababeaccesorios13);
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

        /* babeaccesorios 14 */

        babeaccesorios14a14 = (ImageView)findViewById(R.id.babeaccesorios14a14);
        Picasso.with(this).load(urlbabeaccesorios14).into(babeaccesorios14a14);

        txtbabeaccesorios14a14 = (TextView)findViewById(R.id.txtbabeaccesorios14a14);
        final String stconsultaa14 = txtbabeaccesorios14a14.getText().toString();
        btnconsultaa14 = (Button)findViewById(R.id.btnconsultaa14);
        btnconsultaa14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa14 = new Intent(babeaccesorios.this,contacto.class);
                btnconsultaa14.putExtra("consulta", stconsultaa14);
                startActivity(btnconsultaa14);
            }
        });


        btncomprababeaccesorios14 = (Button)findViewById(R.id.btncomprababeaccesorios14);
        btncomprababeaccesorios14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios14 = new Intent(babeaccesorios.this,webview.class);
                btncomprababeaccesorios14.putExtra("string", urlcomboa14);
                startActivity(btncomprababeaccesorios14);
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

        preciobabeaccesorios1 = (TextView)findViewById(R.id.preciobabeaccesorios1);
        preciobabeaccesorios2 = (TextView)findViewById(R.id.preciobabeaccesorios2);
        preciobabeaccesorios3 = (TextView)findViewById(R.id.preciobabeaccesorios3);
        preciobabeaccesorios4 = (TextView)findViewById(R.id.preciobabeaccesorios4);
        preciobabeaccesorios5 = (TextView)findViewById(R.id.preciobabeaccesorios5);
        preciobabeaccesorios6 = (TextView)findViewById(R.id.preciobabeaccesorios6);
        preciobabeaccesorios7 = (TextView)findViewById(R.id.preciobabeaccesorios7);
        preciobabeaccesorios8 = (TextView)findViewById(R.id.preciobabeaccesorios8);
        preciobabeaccesorios9 = (TextView)findViewById(R.id.preciobabeaccesorios9);
        preciobabeaccesorios10 = (TextView)findViewById(R.id.preciobabeaccesorios10);
        preciobabeaccesorios11 = (TextView)findViewById(R.id.preciobabeaccesorios11);
        preciobabeaccesorios12 = (TextView)findViewById(R.id.preciobabeaccesorios12);
        preciobabeaccesorios13 = (TextView)findViewById(R.id.preciobabeaccesorios13);
        preciobabeaccesorios14 = (TextView)findViewById(R.id.preciobabeaccesorios14);

        babeaccesorios1 = (ImageView)findViewById(R.id.babeaccesorios1);
        Picasso.with(this).load(urlbabeaccesorios1).into(babeaccesorios1);

        babeaccesorios2 = (ImageView)findViewById(R.id.babeaccesorios2);
        Picasso.with(this).load(urlbabeaccesorios2).into(babeaccesorios2);

        babeaccesorios3 = (ImageView)findViewById(R.id.babeaccesorios3);
        Picasso.with(this).load(urlbabeaccesorios3).into(babeaccesorios3);

        babeaccesorios4 = (ImageView)findViewById(R.id.babeaccesorios4);
        Picasso.with(this).load(urlbabeaccesorios4).into(babeaccesorios4);

        babeaccesorios5 = (ImageView)findViewById(R.id.babeaccesorios5);
        Picasso.with(this).load(urlbabeaccesorios5).into(babeaccesorios5);

        babeaccesorios6 = (ImageView)findViewById(R.id.babeaccesorios6);
        Picasso.with(this).load(urlbabeaccesorios6).into(babeaccesorios6);

        babeaccesorios7 = (ImageView)findViewById(R.id.babeaccesorios7);
        Picasso.with(this).load(urlbabeaccesorios7).into(babeaccesorios7);

        babeaccesorios8 = (ImageView)findViewById(R.id.babeaccesorios8);
        Picasso.with(this).load(urlbabeaccesorios8).into(babeaccesorios8);

        babeaccesorios9 = (ImageView)findViewById(R.id.babeaccesorios9);
        Picasso.with(this).load(urlbabeaccesorios9).into(babeaccesorios9);

        babeaccesorios10 = (ImageView)findViewById(R.id.babeaccesorios10);
        Picasso.with(this).load(urlbabeaccesorios10).into(babeaccesorios10);

        babeaccesorios11 = (ImageView)findViewById(R.id.babeaccesorios11);
        Picasso.with(this).load(urlbabeaccesorios11).into(babeaccesorios11);

        babeaccesorios12 = (ImageView)findViewById(R.id.babeaccesorios12);
        Picasso.with(this).load(urlbabeaccesorios12).into(babeaccesorios12);

        babeaccesorios13 = (ImageView)findViewById(R.id.babeaccesorios13);
        Picasso.with(this).load(urlbabeaccesorios13).into(babeaccesorios13);

        babeaccesorios14 = (ImageView)findViewById(R.id.babeaccesorios14);
        Picasso.with(this).load(urlbabeaccesorios14).into(babeaccesorios14);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciobabeaccesoriosAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8fc6ec9f5e5f9efa1492b41ac624a9c0";
        String preciobabeaccesorios1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=786af8f59094171e8d52126369df8079";
        String preciobabeaccesorios2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=49514b0fc75de6793a49c165e72d3b40";
        String preciobabeaccesorios3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d556e76110204c98b7424bc5aeb74133";
        String preciobabeaccesorios4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d7626a3d6971a76a56635b059a6bc947";
        String preciobabeaccesorios5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=55242dd644b38a8e866802c2ae121ed0";
        String preciobabeaccesorios6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0e8d69de8e3b6dee2c8c3727c50d83b8";
        String preciobabeaccesorios7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ee7172fc894c202e23314fd7eff0da12";
        String preciobabeaccesorios8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e94b61e4be49ae26ecacb27644048385";
        String preciobabeaccesorios9st;
        String urlprecio10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e45c861c8a62d3f6d22f4575f2d80c07";
        String preciobabeaccesorios10st;
        String urlprecio11 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b6f2559e744b229ffad469e9b24915a1";
        String preciobabeaccesorios11st;
        String urlprecio12 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ad2b8ecf10bf707c58c8f89db981b863";
        String preciobabeaccesorios12st;
        String urlprecio13 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=672a422109c29bd86c3c06f6598f5f53";
        String preciobabeaccesorios13st;
        String urlprecio14 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9eac7e55abdf17c8545e99d6ef1691c2";
        String preciobabeaccesorios14st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciobabeaccesorios1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciobabeaccesorios2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciobabeaccesorios3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciobabeaccesorios4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciobabeaccesorios5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciobabeaccesorios6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                preciobabeaccesorios7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                preciobabeaccesorios8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                preciobabeaccesorios9st = metapropoerty9.attr("content");

                Document doc10 = Jsoup.connect(urlprecio10).get();
                Elements metapropoerty10 = doc10.select("meta[property=\"og:description\"]");
                preciobabeaccesorios10st = metapropoerty10.attr("content");

                Document doc11 = Jsoup.connect(urlprecio11).get();
                Elements metapropoerty11 = doc11.select("meta[property=\"og:description\"]");
                preciobabeaccesorios11st = metapropoerty11.attr("content");

                Document doc12 = Jsoup.connect(urlprecio12).get();
                Elements metapropoerty12 = doc12.select("meta[property=\"og:description\"]");
                preciobabeaccesorios12st = metapropoerty12.attr("content");

                Document doc13 = Jsoup.connect(urlprecio13).get();
                Elements metapropoerty13 = doc13.select("meta[property=\"og:description\"]");
                preciobabeaccesorios13st = metapropoerty13.attr("content");

                Document doc14 = Jsoup.connect(urlprecio14).get();
                Elements metapropoerty14 = doc14.select("meta[property=\"og:description\"]");
                preciobabeaccesorios14st = metapropoerty14.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciobabeaccesorios1.setText(preciobabeaccesorios1st);
            preciobabeaccesorios2.setText(preciobabeaccesorios2st);
            preciobabeaccesorios3.setText(preciobabeaccesorios3st);
            preciobabeaccesorios4.setText(preciobabeaccesorios4st);
            preciobabeaccesorios5.setText(preciobabeaccesorios5st);
            preciobabeaccesorios6.setText(preciobabeaccesorios6st);
            preciobabeaccesorios7.setText(preciobabeaccesorios7st);
            preciobabeaccesorios8.setText(preciobabeaccesorios8st);
            preciobabeaccesorios9.setText(preciobabeaccesorios9st);
            preciobabeaccesorios10.setText(preciobabeaccesorios10st);
            preciobabeaccesorios11.setText(preciobabeaccesorios11st);
            preciobabeaccesorios12.setText(preciobabeaccesorios12st);
            preciobabeaccesorios13.setText(preciobabeaccesorios13st);
            preciobabeaccesorios14.setText(preciobabeaccesorios14st);
        }

    }
}
