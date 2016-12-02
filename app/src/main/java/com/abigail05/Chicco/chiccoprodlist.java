package com.abigail05.Chicco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.R;
import com.squareup.picasso.Picasso;

public class chiccoprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnchiccomamaderas;
    ImageView chiccomamaderas;
    String urlchiccomamaderas = "https://lh3.googleusercontent.com/6v3Wo6gv__psB2pWhyVcBn-y0DO3RYhmgCRCsUyzb7zAwXBXaipEo9bB3zB6jPt-FlFddppHCy4ZWbNrN0NgRJqM7QuIgfxaJbYQQoiQGgL_CBCceE_fytLRb1m4Qf6J_ZHn43swazGB9maeBfZPFpf00-fIYGDpDO-VPglsnRTR9mB-gpM2ySj4VwvkwF2WyISE18m5nsp7GmTqbYRjUfQJkuiuR9p_JXFoXtWL_nVQzSAKhc213dmlh3OBsymqXRMAAutdRMOkOTx3MdnhLBPDiXZHJC0k122z3G0y8dKVebDum9aJAiYo8sQU2u71ea3BzHnjVBghnkYqGhzh7lP2byHLT8gC3oroveGSfgSHbEqhiEzrCQ4QsKIr7_z36a7fYeqdi8do2fhSmHBQ1jj5dHOAGuOEbhntrZ8Yg7wGdi6Bs9y0Sh2u7p5CYPQXBRnwwQyR35TusUezLZToygu-ehHWz5Zfl9d8BVHjoiz0g6B9eD_-WVX6y2cHSCspn24sS_6w67zYS-MGKMuAqVZ5pKmyQk7XAfDjIPutyBL2yRabtCBk4YKNBypLfKP58nTGPhQ0eAUmVLGvmtt3iV1CPCFGD1N9gHQpGHjpOOokPdhnDg=w400-h399-no";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoprodlist);

        chiccomamaderas = (ImageView)findViewById(R.id.chiccomamaderas);
        Picasso.with(this).load(urlchiccomamaderas).into(chiccomamaderas);

        btnchiccomamaderas = (Button)findViewById(R.id.btnchiccomamaderas);
        btnchiccomamaderas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccomamaderas = new Intent(chiccoprodlist.this, chiccomamaderas.class);
                startActivity(btnchiccomamaderas);
            }
        });
    }
}
