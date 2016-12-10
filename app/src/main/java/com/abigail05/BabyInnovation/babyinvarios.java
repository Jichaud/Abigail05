package com.abigail05.BabyInnovation;

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

public class babyinvarios extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnbabyinvarios1;
    Button btnbabyinvarios2;
    Button btnbabyinvarios3;
    Button btnbabyinvarios4;
    Button btnbabyinvarios5;
    Button btnbabyinvarios6;
    Button btnbabyinvarios7;
    Button btnbabyinvarios8;
    Button btnbabyinvarios9;
    Button btnbabyinvarios10;
    Button btnbabyinvarios11;
    Button btnbabyinvarios12;
    Button btnbabyinvarios13;
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

        btnbabyinvarios1 = (Button)findViewById(R.id.btnbabyinvarios1);
        btnbabyinvarios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios1 = new Intent(babyinvarios.this, babyinvarios1.class);
                startActivity(btnbabyinvarios1);
            }
        });

        btnbabyinvarios2 = (Button)findViewById(R.id.btnbabyinvarios2);
        btnbabyinvarios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios2 = new Intent(babyinvarios.this, babyinvarios2.class);
                startActivity(btnbabyinvarios2);
            }
        });

        btnbabyinvarios3 = (Button)findViewById(R.id.btnbabyinvarios3);
        btnbabyinvarios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios3 = new Intent(babyinvarios.this, babyinvarios3.class);
                startActivity(btnbabyinvarios3);
            }
        });

        btnbabyinvarios4 = (Button)findViewById(R.id.btnbabyinvarios4);
        btnbabyinvarios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios4 = new Intent(babyinvarios.this, babyinvarios4.class);
                startActivity(btnbabyinvarios4);
            }
        });

        btnbabyinvarios5 = (Button)findViewById(R.id.btnbabyinvarios5);
        btnbabyinvarios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios5 = new Intent(babyinvarios.this, babyinvarios5.class);
                startActivity(btnbabyinvarios5);
            }
        });

        btnbabyinvarios6 = (Button)findViewById(R.id.btnbabyinvarios6);
        btnbabyinvarios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios6 = new Intent(babyinvarios.this, babyinvarios6.class);
                startActivity(btnbabyinvarios6);
            }
        });

        btnbabyinvarios7 = (Button)findViewById(R.id.btnbabyinvarios7);
        btnbabyinvarios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios7 = new Intent(babyinvarios.this, babyinvarios7.class);
                startActivity(btnbabyinvarios7);
            }
        });

        btnbabyinvarios8 = (Button)findViewById(R.id.btnbabyinvarios8);
        btnbabyinvarios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios8 = new Intent(babyinvarios.this, babyinvarios8.class);
                startActivity(btnbabyinvarios8);
            }
        });

        btnbabyinvarios9 = (Button)findViewById(R.id.btnbabyinvarios9);
        btnbabyinvarios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios9 = new Intent(babyinvarios.this, babyinvarios9.class);
                startActivity(btnbabyinvarios9);
            }
        });

        btnbabyinvarios10 = (Button)findViewById(R.id.btnbabyinvarios10);
        btnbabyinvarios10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios10 = new Intent(babyinvarios.this, babyinvarios10.class);
                startActivity(btnbabyinvarios10);
            }
        });

        btnbabyinvarios11 = (Button)findViewById(R.id.btnbabyinvarios11);
        btnbabyinvarios11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios11 = new Intent(babyinvarios.this, babyinvarios11.class);
                startActivity(btnbabyinvarios11);
            }
        });

        btnbabyinvarios12 = (Button)findViewById(R.id.btnbabyinvarios12);
        btnbabyinvarios12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios12 = new Intent(babyinvarios.this, babyinvarios12.class);
                startActivity(btnbabyinvarios12);
            }
        });

        btnbabyinvarios13 = (Button)findViewById(R.id.btnbabyinvarios13);
        btnbabyinvarios13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios13 = new Intent(babyinvarios.this, babyinvarios13.class);
                startActivity(btnbabyinvarios13);
            }
        });

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
